package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableListTables extends js.Object {
  var clustering: js.UndefOr[Clustering] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var expirationTime: js.UndefOr[java.lang.String] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var labels: js.UndefOr[js.Object] = js.undefined
  var tableReference: js.UndefOr[TableReference] = js.undefined
  var timePartitioning: js.UndefOr[TimePartitioning] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var view: js.UndefOr[TableListTablesView] = js.undefined
}

object TableListTables {
  @scala.inline
  def apply(
    clustering: Clustering = null,
    creationTime: java.lang.String = null,
    expirationTime: java.lang.String = null,
    friendlyName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    labels: js.Object = null,
    tableReference: TableReference = null,
    timePartitioning: TimePartitioning = null,
    `type`: java.lang.String = null,
    view: TableListTablesView = null
  ): TableListTables = {
    val __obj = js.Dynamic.literal()
    if (clustering != null) __obj.updateDynamic("clustering")(clustering)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (tableReference != null) __obj.updateDynamic("tableReference")(tableReference)
    if (timePartitioning != null) __obj.updateDynamic("timePartitioning")(timePartitioning)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[TableListTables]
  }
}

