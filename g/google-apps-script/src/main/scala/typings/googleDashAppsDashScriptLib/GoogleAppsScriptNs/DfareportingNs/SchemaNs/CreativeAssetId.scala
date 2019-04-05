package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetId extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeAssetId {
  @scala.inline
  def apply(name: java.lang.String = null, `type`: java.lang.String = null): CreativeAssetId = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreativeAssetId]
  }
}

