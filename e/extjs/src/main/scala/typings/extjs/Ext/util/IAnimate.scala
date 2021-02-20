package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnimate extends IBase {
  
  /** [Method] Performs custom animation on this object. ... */
  var animate: js.UndefOr[js.Any] = js.native
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var getActiveAnimation: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the current animation if this object has any effects actively running or queued else returns false
    * @returns Ext.fx.Anim/Boolean Anim if element has active effects, else false
    */
  var hasActiveFx: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Ensures that all effects queued after sequenceFx is called on this object are run in sequence
    * @returns Object this
    */
  var sequenceFx: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopAnimation: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Stops any running effects and clears this object s internal effects queue if it contains any additional effects that
    * @returns Ext.Element The Element
    */
  var stopFx: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Ensures that all effects queued after syncFx is called on this object are run concurrently
    * @returns Object this
    */
  var syncFx: js.UndefOr[js.Function0[_]] = js.native
}
object IAnimate {
  
  @scala.inline
  def apply(): IAnimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnimate]
  }
  
  @scala.inline
  implicit class IAnimateMutableBuilder[Self <: IAnimate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setGetActiveAnimation(value: () => _): Self = StObject.set(x, "getActiveAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveAnimationUndefined: Self = StObject.set(x, "getActiveAnimation", js.undefined)
    
    @scala.inline
    def setHasActiveFx(value: () => _): Self = StObject.set(x, "hasActiveFx", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasActiveFxUndefined: Self = StObject.set(x, "hasActiveFx", js.undefined)
    
    @scala.inline
    def setSequenceFx(value: () => _): Self = StObject.set(x, "sequenceFx", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSequenceFxUndefined: Self = StObject.set(x, "sequenceFx", js.undefined)
    
    @scala.inline
    def setStopAnimation(value: () => IElement): Self = StObject.set(x, "stopAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopAnimationUndefined: Self = StObject.set(x, "stopAnimation", js.undefined)
    
    @scala.inline
    def setStopFx(value: () => IElement): Self = StObject.set(x, "stopFx", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopFxUndefined: Self = StObject.set(x, "stopFx", js.undefined)
    
    @scala.inline
    def setSyncFx(value: () => _): Self = StObject.set(x, "syncFx", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSyncFxUndefined: Self = StObject.set(x, "syncFx", js.undefined)
  }
}
