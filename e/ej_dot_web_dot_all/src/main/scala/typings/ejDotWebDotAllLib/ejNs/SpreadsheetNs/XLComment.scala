package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLComment extends js.Object {
  /** This method is used to delete the comment in the specified range in Spreadsheet.
               * @param {any[]|string} Optional. If range is specified, it will delete comments for the specified range else it will use the current selected range.
               * @param {number} Optional. If sheetIdx is specified, it will delete comment in specified sheet else it will use active sheet.
               * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows data.
               * @returns {void}
               */
  def deleteComment(range: java.lang.String, sheetIdx: scala.Double, skipHiddenRow: scala.Boolean): scala.Unit = js.native
  /** This method is used to delete the comment in the specified range in Spreadsheet.
               * @param {any[]|string} Optional. If range is specified, it will delete comments for the specified range else it will use the current selected range.
               * @param {number} Optional. If sheetIdx is specified, it will delete comment in specified sheet else it will use active sheet.
               * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows data.
               * @returns {void}
               */
  def deleteComment(range: js.Array[_], sheetIdx: scala.Double, skipHiddenRow: scala.Boolean): scala.Unit = js.native
  /** This method is used to edit the comment in the target Cell in Spreadsheet.
               * @param {any} Optional. Pass the row index and column index of the cell which contains comment.
               * @returns {void}
               */
  def editComment(targetCell: js.Any): scala.Unit = js.native
  /** This method is used to find the next comment from the active cell in Spreadsheet.
               * @returns {boolean}
               */
  def findNextComment(): scala.Boolean = js.native
  /** This method is used to find the previous comment from the active cell in Spreadsheet.
               * @returns {boolean}
               */
  def findPrevComment(): scala.Boolean = js.native
  /** This method is used to get comment data for the specified cell.
               * @param {HTMLElement} Pass the DOM element to get comment data as object.
               * @returns {any}
               */
  def getComment(cell: stdLib.HTMLElement): js.Any = js.native
  /** This method is used to set new comment in Spreadsheet.
               * @param {string|any[]} Optional. If we pass the range comment will set in the range otherwise it will set with selected cells.
               * @param {string} Optional. Pass the comment data.
               * @param {boolean} Optional. Pass {{'`true`' | markdownify}} to show comment in edit mode
               * @param {boolean} Optional. Pass {{'`true`' | markdownify}} to show the user name
               * @returns {void}
               */
  def setComment(
    range: java.lang.String,
    data: java.lang.String,
    showEditPanel: scala.Boolean,
    showUserName: scala.Boolean
  ): scala.Unit = js.native
  /** This method is used to set new comment in Spreadsheet.
               * @param {string|any[]} Optional. If we pass the range comment will set in the range otherwise it will set with selected cells.
               * @param {string} Optional. Pass the comment data.
               * @param {boolean} Optional. Pass {{'`true`' | markdownify}} to show comment in edit mode
               * @param {boolean} Optional. Pass {{'`true`' | markdownify}} to show the user name
               * @returns {void}
               */
  def setComment(
    range: js.Array[_],
    data: java.lang.String,
    showEditPanel: scala.Boolean,
    showUserName: scala.Boolean
  ): scala.Unit = js.native
  /** This method is used to show all the comments in the Spreadsheet.
               * @returns {void}
               */
  def showAllComments(): scala.Unit = js.native
  /** This method is used to show or hide the specific comment in the Spreadsheet.
               * @param {HTMLElement} Optional. Pass the cell DOM element to show or hide its comment. If pass empty argument active cell will processed.
               * @returns {void}
               */
  def showHideComment(targetCell: stdLib.HTMLElement): scala.Unit = js.native
}

