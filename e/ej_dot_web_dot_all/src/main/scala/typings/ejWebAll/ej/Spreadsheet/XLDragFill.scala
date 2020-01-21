package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLDragFill extends js.Object {
  /** This method is used to perform auto fill in Spreadsheet.
    * @param {Spreadsheet.AutoFillObject} Pass Object AutoFillObject.
    * @returns {void}
    */
  def autoFill(options: AutoFillObject): Unit
  /** This method is used to hide the auto fill element in the Spreadsheet.
    * @returns {void}
    */
  def hideAutoFillElement(): Unit
  /** This method is used to hide the auto fill options in the Spreadsheet.
    * @returns {void}
    */
  def hideAutoFillOptions(): Unit
  /** This method is used to set position of the auto fill element in the Spreadsheet.
    * @param {boolean} Pass the isDragFill option as {{'`boolean`' | markdownify}} value to show auto fill options in Spreadsheet.
    * @returns {void}
    */
  def positionAutoFillElement(isDragFill: Boolean): Unit
}

object XLDragFill {
  @scala.inline
  def apply(
    autoFill: AutoFillObject => Unit,
    hideAutoFillElement: () => Unit,
    hideAutoFillOptions: () => Unit,
    positionAutoFillElement: Boolean => Unit
  ): XLDragFill = {
    val __obj = js.Dynamic.literal(autoFill = js.Any.fromFunction1(autoFill), hideAutoFillElement = js.Any.fromFunction0(hideAutoFillElement), hideAutoFillOptions = js.Any.fromFunction0(hideAutoFillOptions), positionAutoFillElement = js.Any.fromFunction1(positionAutoFillElement))
  
    __obj.asInstanceOf[XLDragFill]
  }
}

