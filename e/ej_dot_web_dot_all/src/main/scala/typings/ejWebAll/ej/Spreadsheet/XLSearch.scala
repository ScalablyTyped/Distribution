package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLSearch extends js.Object {
  
  /** This method is used to find and replace all data by workbook in the Spreadsheet.
    * @param {string} Pass the search data.
    * @param {string} Pass the replace data.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
    * @returns {void}
    */
  def replaceAllByBook(findData: String, replaceData: String, isCSen: Boolean, isEMatch: Boolean): Unit = js.native
  
  /** This method is used to find and replace all data by sheet in Spreadsheet.
    * @param {string} Pass the search data.
    * @param {string} Pass the replace data.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
    * @returns {void}
    */
  def replaceAllBySheet(findData: String, replaceData: String, isCSen: Boolean, isEMatch: Boolean): Unit = js.native
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
  
  @scala.inline
  implicit class XLSearchOps[Self <: XLSearch] (val x: Self) extends AnyVal {
    
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
    def setReplaceAllByBook(value: (String, String, Boolean, Boolean) => Unit): Self = this.set("replaceAllByBook", js.Any.fromFunction4(value))
    
    @scala.inline
    def setReplaceAllBySheet(value: (String, String, Boolean, Boolean) => Unit): Self = this.set("replaceAllBySheet", js.Any.fromFunction4(value))
  }
}
