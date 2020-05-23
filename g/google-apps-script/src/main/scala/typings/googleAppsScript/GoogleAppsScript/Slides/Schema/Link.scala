package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

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
    slideIndex: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (pageObjectId != null) __obj.updateDynamic("pageObjectId")(pageObjectId.asInstanceOf[js.Any])
    if (relativeLink != null) __obj.updateDynamic("relativeLink")(relativeLink.asInstanceOf[js.Any])
    if (!js.isUndefined(slideIndex)) __obj.updateDynamic("slideIndex")(slideIndex.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

