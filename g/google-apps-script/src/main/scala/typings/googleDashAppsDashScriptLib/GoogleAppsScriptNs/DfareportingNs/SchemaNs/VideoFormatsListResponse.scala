package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var videoFormats: js.UndefOr[js.Array[VideoFormat]] = js.undefined
}

object VideoFormatsListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, videoFormats: js.Array[VideoFormat] = null): VideoFormatsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (videoFormats != null) __obj.updateDynamic("videoFormats")(videoFormats)
    __obj.asInstanceOf[VideoFormatsListResponse]
  }
}

