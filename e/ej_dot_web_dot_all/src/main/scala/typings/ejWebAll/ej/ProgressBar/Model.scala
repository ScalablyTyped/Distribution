package typings.ejWebAll.ej.ProgressBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Event triggers when the progress value changed
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  /** Event triggers when the process completes (at 100%)
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, Unit]] = js.native
  /** Event triggers when the progressbar are created
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Sets the root CSS class for ProgressBar theme, which is used customize.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Event triggers when the progressbar are destroyed
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Save current model value to browser cookies for state maintains. While refresh the progressBar control page retains the model value apply from browser cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Sets the ProgressBar direction as right to left alignment.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** When this property sets to false, it disables the ProgressBar control
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /** Defines the height of the ProgressBar.
    * @Default {null}
    */
  var height: js.UndefOr[Double | String] = js.native
  /** It allows to define the characteristics of the progressBar control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  /** Sets the maximum value of the ProgressBar.
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.native
  /** Sets the minimum value of the ProgressBar.
    * @Default {0}
    */
  var minValue: js.UndefOr[Double] = js.native
  /** Sets the ProgressBar value in percentage. The value should be in between 0 to 100.
    * @Default {0}
    */
  var percentage: js.UndefOr[Double] = js.native
  /** Displays rounded corner borders on the progressBar control.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** Event triggers when the process starts (from 0%)
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.native
  /** Sets the custom text for the ProgressBar. The text placed in the middle of the ProgressBar and it can be customizable using the class 'e-progress-text'.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.native
  /** Sets the ProgressBar value. The value should be in between min and max values.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.native
  /** Defines the width of the ProgressBar.
    * @Default {null}
    */
  var width: js.UndefOr[Double | String] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setComplete(value: /* e */ CompleteEventArgs => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    @scala.inline
    def setStart(value: /* e */ StartEventArgs => Unit): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

