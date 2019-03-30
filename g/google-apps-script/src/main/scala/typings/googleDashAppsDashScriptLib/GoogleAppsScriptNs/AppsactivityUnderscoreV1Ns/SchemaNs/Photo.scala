package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AppsactivityUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Photo {
  @scala.inline
  def apply(url: java.lang.String = null): Photo = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Photo]
  }
}

