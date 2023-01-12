package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimate
  extends StObject
     with IBase {
  
  /** [Method] Performs custom animation on this object. ... */
  var animate: js.UndefOr[Any] = js.undefined
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var getActiveAnimation: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var hasActiveFx: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
    * @returns Object this
    */
  var sequenceFx: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.undefined
  
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  var syncFx: js.UndefOr[js.Function0[Any]] = js.undefined
}
object IAnimate {
  
  inline def apply(): IAnimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAnimate] (val x: Self) extends AnyVal {
    
    inline def setAnimate(value: Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setGetActiveAnimation(value: () => Any): Self = StObject.set(x, "getActiveAnimation", js.Any.fromFunction0(value))
    
    inline def setGetActiveAnimationUndefined: Self = StObject.set(x, "getActiveAnimation", js.undefined)
    
    inline def setHasActiveFx(value: () => Any): Self = StObject.set(x, "hasActiveFx", js.Any.fromFunction0(value))
    
    inline def setHasActiveFxUndefined: Self = StObject.set(x, "hasActiveFx", js.undefined)
    
    inline def setSequenceFx(value: () => Any): Self = StObject.set(x, "sequenceFx", js.Any.fromFunction0(value))
    
    inline def setSequenceFxUndefined: Self = StObject.set(x, "sequenceFx", js.undefined)
    
    inline def setStopAnimation(value: () => IElement): Self = StObject.set(x, "stopAnimation", js.Any.fromFunction0(value))
    
    inline def setStopAnimationUndefined: Self = StObject.set(x, "stopAnimation", js.undefined)
    
    inline def setStopFx(value: () => IElement): Self = StObject.set(x, "stopFx", js.Any.fromFunction0(value))
    
    inline def setStopFxUndefined: Self = StObject.set(x, "stopFx", js.undefined)
    
    inline def setSyncFx(value: () => Any): Self = StObject.set(x, "syncFx", js.Any.fromFunction0(value))
    
    inline def setSyncFxUndefined: Self = StObject.set(x, "syncFx", js.undefined)
  }
}
