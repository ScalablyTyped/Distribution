package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var thumbnailUrl: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    thumbnailUrl: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Link]
  }
}

