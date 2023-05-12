package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.RunAggregationQueryRequest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasMap extends StObject {
  
  var aliasMap: Record[String, String]
  
  var request: RunAggregationQueryRequest
}
object AliasMap {
  
  inline def apply(aliasMap: Record[String, String], request: RunAggregationQueryRequest): AliasMap = {
    val __obj = js.Dynamic.literal(aliasMap = aliasMap.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AliasMap] (val x: Self) extends AnyVal {
    
    inline def setAliasMap(value: Record[String, String]): Self = StObject.set(x, "aliasMap", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RunAggregationQueryRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
