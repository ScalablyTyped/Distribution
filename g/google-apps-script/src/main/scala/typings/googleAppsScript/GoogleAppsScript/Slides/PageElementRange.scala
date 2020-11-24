package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of one or more PageElement instances.
  */
@js.native
trait PageElementRange extends js.Object {
  
  def getPageElements(): js.Array[PageElement] = js.native
}
object PageElementRange {
  
  @scala.inline
  def apply(getPageElements: () => js.Array[PageElement]): PageElementRange = {
    val __obj = js.Dynamic.literal(getPageElements = js.Any.fromFunction0(getPageElements))
    __obj.asInstanceOf[PageElementRange]
  }
  
  @scala.inline
  implicit class PageElementRangeOps[Self <: PageElementRange] (val x: Self) extends AnyVal {
    
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
    def setGetPageElements(value: () => js.Array[PageElement]): Self = this.set("getPageElements", js.Any.fromFunction0(value))
  }
}
