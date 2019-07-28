package typings.googleDashAppsDashScript.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BigtableColumnFamily extends js.Object {
  var columns: js.UndefOr[js.Array[BigtableColumn]] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var familyId: js.UndefOr[String] = js.undefined
  var onlyReadLatest: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object BigtableColumnFamily {
  @scala.inline
  def apply(
    columns: js.Array[BigtableColumn] = null,
    encoding: String = null,
    familyId: String = null,
    onlyReadLatest: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): BigtableColumnFamily = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (familyId != null) __obj.updateDynamic("familyId")(familyId)
    if (!js.isUndefined(onlyReadLatest)) __obj.updateDynamic("onlyReadLatest")(onlyReadLatest)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BigtableColumnFamily]
  }
}

