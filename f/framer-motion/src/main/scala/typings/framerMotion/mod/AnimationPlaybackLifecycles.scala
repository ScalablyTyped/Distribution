package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPlaybackLifecycles[V] extends StObject {
  
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onRepeat: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onUpdate: js.UndefOr[js.Function1[/* latest */ V, Unit]] = js.undefined
}
object AnimationPlaybackLifecycles {
  
  inline def apply[V](): AnimationPlaybackLifecycles[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationPlaybackLifecycles[V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationPlaybackLifecycles[?], V] (val x: Self & AnimationPlaybackLifecycles[V]) extends AnyVal {
    
    inline def setOnComplete(value: () => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnPlay(value: () => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction0(value))
    
    inline def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
    
    inline def setOnRepeat(value: () => Unit): Self = StObject.set(x, "onRepeat", js.Any.fromFunction0(value))
    
    inline def setOnRepeatUndefined: Self = StObject.set(x, "onRepeat", js.undefined)
    
    inline def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
    
    inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
    
    inline def setOnUpdate(value: /* latest */ V => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
  }
}
