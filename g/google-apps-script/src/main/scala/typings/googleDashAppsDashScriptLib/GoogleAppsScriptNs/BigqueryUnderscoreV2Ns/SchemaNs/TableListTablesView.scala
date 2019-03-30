package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableListTablesView extends js.Object {
  var useLegacySql: js.UndefOr[scala.Boolean] = js.undefined
}

object TableListTablesView {
  @scala.inline
  def apply(useLegacySql: js.UndefOr[scala.Boolean] = js.undefined): TableListTablesView = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useLegacySql)) __obj.updateDynamic("useLegacySql")(useLegacySql)
    __obj.asInstanceOf[TableListTablesView]
  }
}

