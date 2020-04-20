package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLSearch extends js.Object {
  /** This method is used to find and replace all data by workbook in the Spreadsheet.
    * @param {string} Pass the search data.
    * @param {string} Pass the replace data.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
    * @returns {void}
    */
  def replaceAllByBook(findData: String, replaceData: String, isCSen: Boolean, isEMatch: Boolean): Unit
  /** This method is used to find and replace all data by sheet in Spreadsheet.
    * @param {string} Pass the search data.
    * @param {string} Pass the replace data.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
    * @returns {void}
    */
  def replaceAllBySheet(findData: String, replaceData: String, isCSen: Boolean, isEMatch: Boolean): Unit
}

object XLSearch {
  @scala.inline
  def apply(
    replaceAllByBook: (String, String, Boolean, Boolean) => Unit,
    replaceAllBySheet: (String, String, Boolean, Boolean) => Unit
  ): XLSearch = {
    val __obj = js.Dynamic.literal(replaceAllByBook = js.Any.fromFunction4(replaceAllByBook), replaceAllBySheet = js.Any.fromFunction4(replaceAllBySheet))
    __obj.asInstanceOf[XLSearch]
  }
}

