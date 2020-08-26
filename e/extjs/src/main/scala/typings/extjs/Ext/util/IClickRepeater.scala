package typings.extjs.Ext.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClickRepeater extends IObservable {
  /** [Config Option] (Boolean) */
  var accelerate: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var delay: js.UndefOr[Double] = js.native
  /** [Method] Disables the repeater and stops events from firing
    * @param force Object
    */
  var disable: js.UndefOr[js.Function1[/* force */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var el: js.UndefOr[js.Any] = js.native
  /** [Method] Enables the repeater and allows events to fire  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Number) */
  var interval: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var pressedCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var preventDefault: js.UndefOr[Boolean] = js.native
  /** [Method] Convenience function for setting disabled enabled by boolean
    * @param disabled Boolean
    */
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var stopDefault: js.UndefOr[Boolean] = js.native
}

object IClickRepeater {
  @scala.inline
  def apply(): IClickRepeater = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClickRepeater]
  }
  @scala.inline
  implicit class IClickRepeaterOps[Self <: IClickRepeater] (val x: Self) extends AnyVal {
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
    def setAccelerate(value: Boolean): Self = this.set("accelerate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerate: Self = this.set("accelerate", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDisable(value: /* force */ js.UndefOr[js.Any] => Unit): Self = this.set("disable", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setEl(value: js.Any): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setEnable(value: () => Unit): Self = this.set("enable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setPressedCls(value: String): Self = this.set("pressedCls", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressedCls: Self = this.set("pressedCls", js.undefined)
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    @scala.inline
    def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Unit): Self = this.set("setDisabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDisabled: Self = this.set("setDisabled", js.undefined)
    @scala.inline
    def setStopDefault(value: Boolean): Self = this.set("stopDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopDefault: Self = this.set("stopDefault", js.undefined)
  }
  
}

