package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.RunAggregationQueryRequest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var aliasMap: Record[String, String]
  
  var request: RunAggregationQueryRequest
}
object Request {
  
  inline def apply(aliasMap: Record[String, String], request: RunAggregationQueryRequest): Request = {
    val __obj = js.Dynamic.literal(aliasMap = aliasMap.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    inline def setAliasMap(value: Record[String, String]): Self = StObject.set(x, "aliasMap", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: RunAggregationQueryRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
