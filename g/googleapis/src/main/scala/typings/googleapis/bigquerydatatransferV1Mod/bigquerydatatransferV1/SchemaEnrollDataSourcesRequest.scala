package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEnrollDataSourcesRequest extends StObject {
  
  /**
    * Data sources that are enrolled. It is required to provide at least one data source id.
    */
  var dataSourceIds: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaEnrollDataSourcesRequest {
  
  inline def apply(): SchemaEnrollDataSourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnrollDataSourcesRequest]
  }
  
  extension [Self <: SchemaEnrollDataSourcesRequest](x: Self) {
    
    inline def setDataSourceIds(value: js.Array[String]): Self = StObject.set(x, "dataSourceIds", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdsNull: Self = StObject.set(x, "dataSourceIds", null)
    
    inline def setDataSourceIdsUndefined: Self = StObject.set(x, "dataSourceIds", js.undefined)
    
    inline def setDataSourceIdsVarargs(value: String*): Self = StObject.set(x, "dataSourceIds", js.Array(value*))
  }
}
