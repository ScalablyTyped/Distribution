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
    getLinkType: js.Function0[LinkType],
    getLinkedSlide: js.Function0[Slide],
    getSlideId: js.Function0[java.lang.String],
    getSlideIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getSlidePosition: js.Function0[SlidePosition],
    getUrl: js.Function0[java.lang.String]
  ): Link = {
    val __obj = js.Dynamic.literal(getLinkType = getLinkType, getLinkedSlide = getLinkedSlide, getSlideId = getSlideId, getSlideIndex = getSlideIndex, getSlidePosition = getSlidePosition, getUrl = getUrl)
  
    __obj.asInstanceOf[Link]
  }
}

