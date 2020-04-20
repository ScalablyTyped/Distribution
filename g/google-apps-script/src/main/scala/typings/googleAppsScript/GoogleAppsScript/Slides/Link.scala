package typings.googleAppsScript.GoogleAppsScript.Slides

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hypertext link.
  */
trait Link extends js.Object {
  def getLinkType(): LinkType
  def getLinkedSlide(): Slide
  def getSlideId(): String
  def getSlideIndex(): Integer
  def getSlidePosition(): SlidePosition
  def getUrl(): String
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
}

