package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for the Operation returned by CreateCluster.
  */
trait SchemaCreateClusterMetadata extends StObject {
  
  /**
    * The time at which the operation failed or was completed successfully.
    */
  var finishTime: js.UndefOr[String] = js.undefined
  
  /**
    * The request that prompted the initiation of this CreateCluster operation.
    */
  var originalRequest: js.UndefOr[SchemaCreateClusterRequest] = js.undefined
  
  /**
    * The time at which the original request was received.
    */
  var requestTime: js.UndefOr[String] = js.undefined
  
  /**
    * Keys: the full `name` of each table that existed in the instance when
    * CreateCluster was first called, i.e.
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/tables/&lt;table&gt;`.
    * Any table added to the instance by a later API call will be created in
    * the new cluster by that API call, not this one.  Values: information on
    * how much of a table&#39;s data has been copied to the newly-created
    * cluster so far.
    */
  var tables: js.UndefOr[StringDictionary[SchemaTableProgress]] = js.undefined
}
object SchemaCreateClusterMetadata {
  
  inline def apply(): SchemaCreateClusterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateClusterMetadata]
  }
  
  extension [Self <: SchemaCreateClusterMetadata](x: Self) {
    
    inline def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    inline def setOriginalRequest(value: SchemaCreateClusterRequest): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    inline def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
    
    inline def setTables(value: StringDictionary[SchemaTableProgress]): Self = StObject.set(x, "tables", value.asInstanceOf[js.Any])
    
    inline def setTablesUndefined: Self = StObject.set(x, "tables", js.undefined)
  }
}
