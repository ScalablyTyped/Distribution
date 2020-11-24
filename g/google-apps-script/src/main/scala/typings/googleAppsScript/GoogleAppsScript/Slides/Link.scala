package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A hypertext link.
  */
@js.native
trait Link extends js.Object {
  
  def getLinkType(): LinkType = js.native
  
  def getLinkedSlide(): Slide = js.native
  
  def getSlideId(): String = js.native
  
  def getSlideIndex(): Integer = js.native
  
  def getSlidePosition(): SlidePosition = js.native
  
  def getUrl(): String = js.native
}
object Link {
  
  @scala.inline
  def apply(
    getLinkType: () => LinkType,
    getLinkedSlide: () => Slide,
    getSlideId: () => String,
    getSlideIndex: () => Integer,
    getSlidePosition: () => SlidePosition,
    getUrl: () => String
  ): Link = {
    val __obj = js.Dynamic.literal(getLinkType = js.Any.fromFunction0(getLinkType), getLinkedSlide = js.Any.fromFunction0(getLinkedSlide), getSlideId = js.Any.fromFunction0(getSlideId), getSlideIndex = js.Any.fromFunction0(getSlideIndex), getSlidePosition = js.Any.fromFunction0(getSlidePosition), getUrl = js.Any.fromFunction0(getUrl))
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
    
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
    def setGetLinkType(value: () => LinkType): Self = this.set("getLinkType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLinkedSlide(value: () => Slide): Self = this.set("getLinkedSlide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSlideId(value: () => String): Self = this.set("getSlideId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSlideIndex(value: () => Integer): Self = this.set("getSlideIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSlidePosition(value: () => SlidePosition): Self = this.set("getSlidePosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
  }
}
