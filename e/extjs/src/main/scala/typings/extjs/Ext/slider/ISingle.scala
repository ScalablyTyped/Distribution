package typings.extjs.Ext.slider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISingle extends IMulti {
  /** [Method] Returns the current value of the slider
    * @returns any The current value of the slider
    */
  @JSName("getValue")
  var getValue_ISingle: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Programmatically sets the value of the Slider
    * @param value Number The value to set the slider to. (This will be constrained within minValue and maxValue)
    * @param animate Boolean Turn on or off animation
    */
  @JSName("setValue")
  var setValue_ISingle: js.UndefOr[
    js.Function2[/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean], Unit]
  ] = js.native
}

object ISingle {
  @scala.inline
  def apply(): ISingle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISingle]
  }
  @scala.inline
  implicit class ISingleOps[Self <: ISingle] (val x: Self) extends AnyVal {
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
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setSetValue(value: (/* value */ js.UndefOr[Double], /* animate */ js.UndefOr[Boolean]) => Unit): Self = this.set("setValue", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
  }
  
}

