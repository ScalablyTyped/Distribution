package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  var imageProperties: js.UndefOr[ImageProperties] = js.undefined
  var sourceUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    contentUrl: java.lang.String = null,
    imageProperties: ImageProperties = null,
    sourceUrl: java.lang.String = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (imageProperties != null) __obj.updateDynamic("imageProperties")(imageProperties)
    if (sourceUrl != null) __obj.updateDynamic("sourceUrl")(sourceUrl)
    __obj.asInstanceOf[Image]
  }
}

