package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.RunAggregationQueryRequest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasMapRecord extends StObject {
  
  var aliasMap: Record[String, String]
  
  var request: RunAggregationQueryRequest
}
object AliasMapRecord {
  
  inline def apply(aliasMap: Record[String, String], request: RunAggregationQueryRequest): AliasMapRecord = {
    val __obj = js.Dynamic.literal(aliasMap = aliasMap.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasMapRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AliasMapRecord] (val x: Self) extends AnyVal {
    
    inline def setAliasMap(value: Record[String, String]): Self = StObject.set(x, "aliasMap", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RunAggregationQueryRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
