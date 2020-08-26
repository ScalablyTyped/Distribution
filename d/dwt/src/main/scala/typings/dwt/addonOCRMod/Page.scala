package typings.dwt.addonOCRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  /**
    * Return the content of the specified line.
    * @index Specify the line.
    */
  def GetLineContent(index: Double): Line = js.native
  /**
    * Return the number of lines in the page.
    */
  def GetLineCount(): Double = js.native
}

object Page {
  @scala.inline
  def apply(GetLineContent: Double => Line, GetLineCount: () => Double): Page = {
    val __obj = js.Dynamic.literal(GetLineContent = js.Any.fromFunction1(GetLineContent), GetLineCount = js.Any.fromFunction0(GetLineCount))
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
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
    def setGetLineContent(value: Double => Line): Self = this.set("GetLineContent", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLineCount(value: () => Double): Self = this.set("GetLineCount", js.Any.fromFunction0(value))
  }
  
}

