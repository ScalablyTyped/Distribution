package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubeUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nRegionSnippet extends js.Object {
  var gl: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object I18nRegionSnippet {
  @scala.inline
  def apply(gl: java.lang.String = null, name: java.lang.String = null): I18nRegionSnippet = {
    val __obj = js.Dynamic.literal()
    if (gl != null) __obj.updateDynamic("gl")(gl)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[I18nRegionSnippet]
  }
}

