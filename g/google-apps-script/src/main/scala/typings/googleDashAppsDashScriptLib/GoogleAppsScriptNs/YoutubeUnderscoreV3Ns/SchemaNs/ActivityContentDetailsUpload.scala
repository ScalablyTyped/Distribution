package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetailsUpload extends js.Object {
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityContentDetailsUpload {
  @scala.inline
  def apply(videoId: java.lang.String = null): ActivityContentDetailsUpload = {
    val __obj = js.Dynamic.literal()
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[ActivityContentDetailsUpload]
  }
}

