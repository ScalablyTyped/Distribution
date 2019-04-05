package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUrls extends js.Object {
  var apiUrl: js.UndefOr[java.lang.String] = js.undefined
  var browserUrl: js.UndefOr[java.lang.String] = js.undefined
}

object FileUrls {
  @scala.inline
  def apply(apiUrl: java.lang.String = null, browserUrl: java.lang.String = null): FileUrls = {
    val __obj = js.Dynamic.literal()
    if (apiUrl != null) __obj.updateDynamic("apiUrl")(apiUrl)
    if (browserUrl != null) __obj.updateDynamic("browserUrl")(browserUrl)
    __obj.asInstanceOf[FileUrls]
  }
}

