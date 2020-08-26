package typings.eonasdanBootstrapDatetimepicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOptions extends OptionsBase {
  /**
    * Disables selection of dates in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var disabledDates: js.UndefOr[IndexedDates | Boolean] = js.native
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var disabledHours: js.UndefOr[IndexedHours | Boolean] = js.native
  /**
    * Enables selection of dates NOT in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var enabledDates: js.UndefOr[IndexedDates | Boolean] = js.native
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var enabledHours: js.UndefOr[IndexedHours | Boolean] = js.native
}

object GetOptions {
  @scala.inline
  def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  @scala.inline
  implicit class GetOptionsOps[Self <: GetOptions] (val x: Self) extends AnyVal {
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
    def setDisabledDates(value: IndexedDates | Boolean): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    @scala.inline
    def setDisabledHours(value: IndexedHours | Boolean): Self = this.set("disabledHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledHours: Self = this.set("disabledHours", js.undefined)
    @scala.inline
    def setEnabledDates(value: IndexedDates | Boolean): Self = this.set("enabledDates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledDates: Self = this.set("enabledDates", js.undefined)
    @scala.inline
    def setEnabledHours(value: IndexedHours | Boolean): Self = this.set("enabledHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledHours: Self = this.set("enabledHours", js.undefined)
  }
  
}

