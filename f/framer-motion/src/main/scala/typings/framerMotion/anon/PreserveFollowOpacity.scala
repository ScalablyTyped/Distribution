package typings.framerMotion.anon

import typings.framerMotion.distThreeEntryMod.Transition1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveFollowOpacity extends StObject {
  
  var needsReset: js.UndefOr[Boolean] = js.undefined
  
  var preserveFollowOpacity: js.UndefOr[Boolean] = js.undefined
  
  var transition: js.UndefOr[Transition1] = js.undefined
}
object PreserveFollowOpacity {
  
  inline def apply(): PreserveFollowOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveFollowOpacity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreserveFollowOpacity] (val x: Self) extends AnyVal {
    
    inline def setNeedsReset(value: Boolean): Self = StObject.set(x, "needsReset", value.asInstanceOf[js.Any])
    
    inline def setNeedsResetUndefined: Self = StObject.set(x, "needsReset", js.undefined)
    
    inline def setPreserveFollowOpacity(value: Boolean): Self = StObject.set(x, "preserveFollowOpacity", value.asInstanceOf[js.Any])
    
    inline def setPreserveFollowOpacityUndefined: Self = StObject.set(x, "preserveFollowOpacity", js.undefined)
    
    inline def setTransition(value: Transition1): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
