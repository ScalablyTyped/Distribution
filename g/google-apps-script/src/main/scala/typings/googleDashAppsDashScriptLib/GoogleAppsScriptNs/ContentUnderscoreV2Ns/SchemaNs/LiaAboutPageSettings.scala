package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiaAboutPageSettings extends js.Object {
  var status: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object LiaAboutPageSettings {
  @scala.inline
  def apply(status: java.lang.String = null, url: java.lang.String = null): LiaAboutPageSettings = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LiaAboutPageSettings]
  }
}

