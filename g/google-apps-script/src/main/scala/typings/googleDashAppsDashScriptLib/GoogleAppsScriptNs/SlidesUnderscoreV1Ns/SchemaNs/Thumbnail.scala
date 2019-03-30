package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(
    contentUrl: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

