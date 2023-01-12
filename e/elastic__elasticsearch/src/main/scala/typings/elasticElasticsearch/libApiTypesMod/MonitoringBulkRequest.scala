package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringBulkRequest[TDocument, TPartialDocument]
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var interval: Duration
  
  var operations: js.UndefOr[
    js.Array[
      BulkOperationContainer | (BulkUpdateAction[TDocument, TPartialDocument]) | TDocument
    ]
  ] = js.undefined
  
  var system_api_version: String
  
  var system_id: String
  
  var `type`: js.UndefOr[String] = js.undefined
}
object MonitoringBulkRequest {
  
  inline def apply[TDocument, TPartialDocument](interval: Duration, system_api_version: String, system_id: String): MonitoringBulkRequest[TDocument, TPartialDocument] = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], system_api_version = system_api_version.asInstanceOf[js.Any], system_id = system_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringBulkRequest[TDocument, TPartialDocument]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitoringBulkRequest[?, ?], TDocument, TPartialDocument] (val x: Self & (MonitoringBulkRequest[TDocument, TPartialDocument])) extends AnyVal {
    
    inline def setInterval(value: Duration): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setOperations(
      value: js.Array[
          BulkOperationContainer | (BulkUpdateAction[TDocument, TPartialDocument]) | TDocument
        ]
    ): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: (BulkOperationContainer | (BulkUpdateAction[TDocument, TPartialDocument]) | TDocument)*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setSystem_api_version(value: String): Self = StObject.set(x, "system_api_version", value.asInstanceOf[js.Any])
    
    inline def setSystem_id(value: String): Self = StObject.set(x, "system_id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
