package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  def getLinkType(): LinkType
  def getLinkedSlide(): Slide
  def getSlideId(): java.lang.String
  def getSlideIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getSlidePosition(): SlidePosition
  def getUrl(): java.lang.String
}

object Link {
  @scala.inline
  def apply(
    getLinkType: () => LinkType,
    getLinkedSlide: () => Slide,
    getSlideId: () => java.lang.String,
    getSlideIndex: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    getSlidePosition: () => SlidePosition,
    getUrl: () => java.lang.String
  ): Link = {
    val __obj = js.Dynamic.literal(getLinkType = js.Any.fromFunction0(getLinkType), getLinkedSlide = js.Any.fromFunction0(getLinkedSlide), getSlideId = js.Any.fromFunction0(getSlideId), getSlideIndex = js.Any.fromFunction0(getSlideIndex), getSlidePosition = js.Any.fromFunction0(getSlidePosition), getUrl = js.Any.fromFunction0(getUrl))
  
    __obj.asInstanceOf[Link]
  }
}

