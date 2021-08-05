package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of user data indexed by row, column, and timestamp. Each table
  * is served using the resources of its parent cluster.
  */
trait SchemaTable extends StObject {
  
  /**
    * Output only. Map from cluster ID to per-cluster table state. If it could
    * not be determined whether or not the table has data in a particular
    * cluster (for example, if its zone is unavailable), then there will be an
    * entry for the cluster with UNKNOWN `replication_status`. Views:
    * `REPLICATION_VIEW`, `FULL`
    */
  var clusterStates: js.UndefOr[StringDictionary[SchemaClusterState]] = js.undefined
  
  /**
    * (`CreationOnly`) The column families configured for this table, mapped by
    * column family ID. Views: `SCHEMA_VIEW`, `FULL`
    */
  var columnFamilies: js.UndefOr[StringDictionary[SchemaColumnFamily]] = js.undefined
  
  /**
    * (`CreationOnly`) The granularity (i.e. `MILLIS`) at which timestamps are
    * stored in this table. Timestamps not matching the granularity will be
    * rejected. If unspecified at creation time, the value will be set to
    * `MILLIS`. Views: `SCHEMA_VIEW`, `FULL`.
    */
  var granularity: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The unique name of the table. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/_a-zA-Z0-9*`.
    * Views: `NAME_ONLY`, `SCHEMA_VIEW`, `REPLICATION_VIEW`, `FULL`
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaTable {
  
  inline def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  extension [Self <: SchemaTable](x: Self) {
    
    inline def setClusterStates(value: StringDictionary[SchemaClusterState]): Self = StObject.set(x, "clusterStates", value.asInstanceOf[js.Any])
    
    inline def setClusterStatesUndefined: Self = StObject.set(x, "clusterStates", js.undefined)
    
    inline def setColumnFamilies(value: StringDictionary[SchemaColumnFamily]): Self = StObject.set(x, "columnFamilies", value.asInstanceOf[js.Any])
    
    inline def setColumnFamiliesUndefined: Self = StObject.set(x, "columnFamilies", js.undefined)
    
    inline def setGranularity(value: String): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
