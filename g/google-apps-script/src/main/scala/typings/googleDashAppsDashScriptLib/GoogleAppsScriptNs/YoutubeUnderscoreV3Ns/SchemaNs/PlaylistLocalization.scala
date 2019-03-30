package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistLocalization extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistLocalization {
  @scala.inline
  def apply(description: java.lang.String = null, title: java.lang.String = null): PlaylistLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlaylistLocalization]
  }
}

