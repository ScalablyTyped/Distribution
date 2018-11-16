package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait XLDragFill extends js.Object {
  /** This method is used to perform auto fill in Spreadsheet.
               * @param {any} Pass the options to perform auto fill in Spreadsheet.
               * @returns {void}
               */
  def autoFill(options: js.Any): scala.Unit
  /** This method is used to hide the auto fill element in the Spreadsheet.
               * @returns {void}
               */
  def hideAutoFillElement(): scala.Unit
  /** This method is used to hide the auto fill options in the Spreadsheet.
               * @returns {void}
               */
  def hideAutoFillOptions(): scala.Unit
  /** This method is used to set position of the auto fill element in the Spreadsheet.
               * @param {boolean} Pass the isDragFill option as {{'`boolean`' | markdownify}} value to show auto fill options in Spreadsheet.
               * @returns {void}
               */
  def positionAutoFillElement(isDragFill: scala.Boolean): scala.Unit
}

