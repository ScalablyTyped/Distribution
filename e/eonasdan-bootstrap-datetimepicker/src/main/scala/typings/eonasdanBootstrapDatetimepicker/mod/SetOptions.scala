package typings.eonasdanBootstrapDatetimepicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptions extends OptionsBase {
  
  /**
    * Disables selection of dates in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * disabledDates = ["2010-10-10"]; -> disabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var disabledDates: js.UndefOr[js.Array[DateComparable] | Boolean] = js.native
  
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * disabledHours = [0, 1]; -> disabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var disabledHours: js.UndefOr[js.Array[Double] | Boolean] = js.native
  
  /**
    * Enables selection of dates NOT in the array, e.g. holidays
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the dates, values being true.
    * For example:
    * enabledDates = ["2010-10-10"]; -> enabledDated will be { "2010-01-01": true }
    * Default: false
    */
  var enabledDates: js.UndefOr[js.Array[DateComparable] | Boolean] = js.native
  
  /**
    * Will allow or disallow hour selections (much like disabledTimeIntervals) but will affect all days.
    * IMPORTANT! The getter returns an Object NOT an Array, with keys being the hours, values being true.
    * For example:
    * enabledHours = [0, 1]; -> enabledHours will be { "0": true, "1": true }
    * Default: false
    */
  var enabledHours: js.UndefOr[js.Array[Double] | Boolean] = js.native
}
object SetOptions {
  
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
    
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
    def setDisabledDatesVarargs(value: DateComparable*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDates(value: js.Array[DateComparable] | Boolean): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setDisabledHoursVarargs(value: Double*): Self = this.set("disabledHours", js.Array(value :_*))
    
    @scala.inline
    def setDisabledHours(value: js.Array[Double] | Boolean): Self = this.set("disabledHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledHours: Self = this.set("disabledHours", js.undefined)
    
    @scala.inline
    def setEnabledDatesVarargs(value: DateComparable*): Self = this.set("enabledDates", js.Array(value :_*))
    
    @scala.inline
    def setEnabledDates(value: js.Array[DateComparable] | Boolean): Self = this.set("enabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledDates: Self = this.set("enabledDates", js.undefined)
    
    @scala.inline
    def setEnabledHoursVarargs(value: Double*): Self = this.set("enabledHours", js.Array(value :_*))
    
    @scala.inline
    def setEnabledHours(value: js.Array[Double] | Boolean): Self = this.set("enabledHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledHours: Self = this.set("enabledHours", js.undefined)
  }
}
