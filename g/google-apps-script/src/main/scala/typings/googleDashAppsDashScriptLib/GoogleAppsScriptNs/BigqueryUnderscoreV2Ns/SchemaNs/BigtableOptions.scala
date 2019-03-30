package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigtableOptions extends js.Object {
  var columnFamilies: js.UndefOr[js.Array[BigtableColumnFamily]] = js.undefined
  var ignoreUnspecifiedColumnFamilies: js.UndefOr[scala.Boolean] = js.undefined
  var readRowkeyAsString: js.UndefOr[scala.Boolean] = js.undefined
}

object BigtableOptions {
  @scala.inline
  def apply(
    columnFamilies: js.Array[BigtableColumnFamily] = null,
    ignoreUnspecifiedColumnFamilies: js.UndefOr[scala.Boolean] = js.undefined,
    readRowkeyAsString: js.UndefOr[scala.Boolean] = js.undefined
  ): BigtableOptions = {
    val __obj = js.Dynamic.literal()
    if (columnFamilies != null) __obj.updateDynamic("columnFamilies")(columnFamilies)
    if (!js.isUndefined(ignoreUnspecifiedColumnFamilies)) __obj.updateDynamic("ignoreUnspecifiedColumnFamilies")(ignoreUnspecifiedColumnFamilies)
    if (!js.isUndefined(readRowkeyAsString)) __obj.updateDynamic("readRowkeyAsString")(readRowkeyAsString)
    __obj.asInstanceOf[BigtableOptions]
  }
}

