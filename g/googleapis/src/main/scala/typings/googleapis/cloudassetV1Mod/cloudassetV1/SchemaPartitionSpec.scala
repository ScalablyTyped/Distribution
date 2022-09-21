package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartitionSpec extends StObject {
  
  /**
    * The partition key for BigQuery partitioned table.
    */
  var partitionKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartitionSpec {
  
  inline def apply(): SchemaPartitionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartitionSpec]
  }
  
  extension [Self <: SchemaPartitionSpec](x: Self) {
    
    inline def setPartitionKey(value: String): Self = StObject.set(x, "partitionKey", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeyNull: Self = StObject.set(x, "partitionKey", null)
    
    inline def setPartitionKeyUndefined: Self = StObject.set(x, "partitionKey", js.undefined)
  }
}
