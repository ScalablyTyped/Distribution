package typings.dwt.addonOCRProMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page extends js.Object {
  
  /**
    * Return the content of the specified letter.
    * @index Specify the letter.
    */
  def GetLetterContent(index: Double): Letter = js.native
  
  /**
    * Return the number of letters in the page.
    */
  def GetLetterCount(): Double = js.native
  
  /**
    * Return the base64-encoded content of the specified rectangle.
    * @index Specify the line.
    */
  def GetZoneContent(index: Double): String = js.native
  
  /**
    * Return the number of recognized rectangles in the page.
    */
  def GetZoneCount(): Double = js.native
}
object Page {
  
  @scala.inline
  def apply(
    GetLetterContent: Double => Letter,
    GetLetterCount: () => Double,
    GetZoneContent: Double => String,
    GetZoneCount: () => Double
  ): Page = {
    val __obj = js.Dynamic.literal(GetLetterContent = js.Any.fromFunction1(GetLetterContent), GetLetterCount = js.Any.fromFunction0(GetLetterCount), GetZoneContent = js.Any.fromFunction1(GetZoneContent), GetZoneCount = js.Any.fromFunction0(GetZoneCount))
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
    def setGetLetterContent(value: Double => Letter): Self = this.set("GetLetterContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLetterCount(value: () => Double): Self = this.set("GetLetterCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetZoneContent(value: Double => String): Self = this.set("GetZoneContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetZoneCount(value: () => Double): Self = this.set("GetZoneCount", js.Any.fromFunction0(value))
  }
}
