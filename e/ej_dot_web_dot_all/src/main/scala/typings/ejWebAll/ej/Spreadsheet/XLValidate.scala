package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLValidate extends js.Object {
  /** This method is used to apply data validation rules in a selected range of cells based on the defined condition in the Spreadsheet.
    * @param {string|any[]} If range is specified, it will apply rules for the specified range else it will use the current selected range.
    * @param {any[]} Pass the validation condition, value1 and value2.
    * @param {string} Pass the data type.
    * @param {boolean} Pass {{'`true`' | markdownify}} if you ignore blank values.
    * @param {boolean} Pass {{'`true`' | markdownify}} if you want to show an error alert.
    * @returns {void}
    */
  def applyDVRules(range: String, values: js.Array[_], `type`: String, required: Boolean, showErrorAlert: Boolean): Unit = js.native
  def applyDVRules(
    range: js.Array[_],
    values: js.Array[_],
    `type`: String,
    required: Boolean,
    showErrorAlert: Boolean
  ): Unit = js.native
  /** This method is used to clear the applied validation rules in a specified range of cells in the Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, it will clear rules for the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearDV(range: String): Unit = js.native
  def clearDV(range: js.Array[_]): Unit = js.native
  /** This method is used to highlight invalid data in a specified range of cells in the Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, it will clear rules for the specified range else it will use the current selected range.
    * @returns {void}
    */
  def highlightInvalidData(range: String): Unit = js.native
  def highlightInvalidData(range: js.Array[_]): Unit = js.native
}

