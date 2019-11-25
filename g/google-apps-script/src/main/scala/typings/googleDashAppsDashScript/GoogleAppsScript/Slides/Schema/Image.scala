package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var contentUrl: js.UndefOr[String] = js.undefined
  var imageProperties: js.UndefOr[ImageProperties] = js.undefined
  var sourceUrl: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(contentUrl: String = null, imageProperties: ImageProperties = null, sourceUrl: String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties.asInstanceOf[js.Any])
    if (sourceUrl != null) __obj.updateDynamic("sourceUrl")(sourceUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

