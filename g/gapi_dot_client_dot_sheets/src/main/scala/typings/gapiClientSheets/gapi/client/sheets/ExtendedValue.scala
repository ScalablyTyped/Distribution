package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedValue extends js.Object {
  /** Represents a boolean value. */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * Represents an error.
    * This field is read-only.
    */
  var errorValue: js.UndefOr[ErrorValue] = js.native
  /** Represents a formula. */
  var formulaValue: js.UndefOr[String] = js.native
  /**
    * Represents a double value.
    * Note: Dates, Times and DateTimes are represented as doubles in
    * "serial number" format.
    */
  var numberValue: js.UndefOr[Double] = js.native
  /**
    * Represents a string value.
    * Leading single quotes are not included. For example, if the user typed
    * `'123` into the UI, this would be represented as a `stringValue` of
    * `"123"`.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object ExtendedValue {
  @scala.inline
  def apply(): ExtendedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedValue]
  }
  @scala.inline
  implicit class ExtendedValueOps[Self <: ExtendedValue] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setErrorValue(value: ErrorValue): Self = this.set("errorValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorValue: Self = this.set("errorValue", js.undefined)
    @scala.inline
    def setFormulaValue(value: String): Self = this.set("formulaValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormulaValue: Self = this.set("formulaValue", js.undefined)
    @scala.inline
    def setNumberValue(value: Double): Self = this.set("numberValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberValue: Self = this.set("numberValue", js.undefined)
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
  
}

