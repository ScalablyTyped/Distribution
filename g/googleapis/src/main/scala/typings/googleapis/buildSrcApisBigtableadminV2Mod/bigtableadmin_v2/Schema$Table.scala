package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of user data indexed by row, column, and timestamp. Each table
  * is served using the resources of its parent cluster.
  */
@js.native
trait Schema$Table extends js.Object {
  /**
    * Output only. Map from cluster ID to per-cluster table state. If it could
    * not be determined whether or not the table has data in a particular
    * cluster (for example, if its zone is unavailable), then there will be an
    * entry for the cluster with UNKNOWN `replication_status`. Views:
    * `REPLICATION_VIEW`, `FULL`
    */
  var clusterStates: js.UndefOr[StringDictionary[Schema$ClusterState]] = js.native
  /**
    * (`CreationOnly`) The column families configured for this table, mapped by
    * column family ID. Views: `SCHEMA_VIEW`, `FULL`
    */
  var columnFamilies: js.UndefOr[StringDictionary[Schema$ColumnFamily]] = js.native
  /**
    * (`CreationOnly`) The granularity (i.e. `MILLIS`) at which timestamps are
    * stored in this table. Timestamps not matching the granularity will be
    * rejected. If unspecified at creation time, the value will be set to
    * `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
    */
  var granularity: js.UndefOr[String] = js.native
  /**
    * Output only. The unique name of the table. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/_a-zA-Z0-9*`.
    * Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Table {
  @scala.inline
  def apply(
    clusterStates: StringDictionary[Schema$ClusterState] = null,
    columnFamilies: StringDictionary[Schema$ColumnFamily] = null,
    granularity: String = null,
    name: String = null
  ): Schema$Table = {
    val __obj = js.Dynamic.literal()
    if (clusterStates != null) __obj.updateDynamic("clusterStates")(clusterStates.asInstanceOf[js.Any])
    if (columnFamilies != null) __obj.updateDynamic("columnFamilies")(columnFamilies.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Table]
  }
}

