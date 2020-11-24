package typings.dwt.addonOCRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageSet extends js.Object {
  
  /**
    * Return the content of the specified page.
    * @index Specify the page.
    */
  def GetPageContent(index: Double): Page = js.native
  
  /**
    * Return the number of pages in the pageset.
    */
  def GetPageCount(): Double = js.native
}
object PageSet {
  
  @scala.inline
  def apply(GetPageContent: Double => Page, GetPageCount: () => Double): PageSet = {
    val __obj = js.Dynamic.literal(GetPageContent = js.Any.fromFunction1(GetPageContent), GetPageCount = js.Any.fromFunction0(GetPageCount))
    __obj.asInstanceOf[PageSet]
  }
  
  @scala.inline
  implicit class PageSetOps[Self <: PageSet] (val x: Self) extends AnyVal {
    
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
    def setGetPageContent(value: Double => Page): Self = this.set("GetPageContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPageCount(value: () => Double): Self = this.set("GetPageCount", js.Any.fromFunction0(value))
  }
}
