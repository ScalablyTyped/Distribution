package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var pageObjectId: js.UndefOr[String] = js.undefined
  var relativeLink: js.UndefOr[String] = js.undefined
  var slideIndex: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    pageObjectId: String = null,
    relativeLink: String = null,
    slideIndex: Int | Double = null,
    url: String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (pageObjectId != null) __obj.updateDynamic("pageObjectId")(pageObjectId)
    if (relativeLink != null) __obj.updateDynamic("relativeLink")(relativeLink)
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Link]
  }
}

