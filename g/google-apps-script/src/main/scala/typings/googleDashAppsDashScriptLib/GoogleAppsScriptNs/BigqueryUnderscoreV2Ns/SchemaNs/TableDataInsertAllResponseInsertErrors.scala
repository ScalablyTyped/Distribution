package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataInsertAllResponseInsertErrors extends js.Object {
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
}

object TableDataInsertAllResponseInsertErrors {
  @scala.inline
  def apply(errors: js.Array[ErrorProto] = null, index: scala.Int | scala.Double = null): TableDataInsertAllResponseInsertErrors = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableDataInsertAllResponseInsertErrors]
  }
}

