package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IAnimateOps[Self <: IAnimate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setGetActiveAnimation(value: () => _): Self = this.set("getActiveAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetActiveAnimation: Self = this.set("getActiveAnimation", js.undefined)
    @scala.inline
    def setHasActiveFx(value: () => _): Self = this.set("hasActiveFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHasActiveFx: Self = this.set("hasActiveFx", js.undefined)
    @scala.inline
    def setSequenceFx(value: () => _): Self = this.set("sequenceFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSequenceFx: Self = this.set("sequenceFx", js.undefined)
    @scala.inline
    def setStopAnimation(value: () => IElement): Self = this.set("stopAnimation", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopAnimation: Self = this.set("stopAnimation", js.undefined)
    @scala.inline
    def setStopFx(value: () => IElement): Self = this.set("stopFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteStopFx: Self = this.set("stopFx", js.undefined)
    @scala.inline
    def setSyncFx(value: () => _): Self = this.set("syncFx", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSyncFx: Self = this.set("syncFx", js.undefined)
  }
  
}

