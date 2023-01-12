package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedAt extends StObject {
  
  var createdAt: String
  
  var deletedAt: Any
  
  var getpaidTransactionId: Double
  
  var id: Double
  
  var metaname: String
  
  var metavalue: String
  
  var updatedAt: String
}
object CreatedAt {
  
  inline def apply(
    createdAt: String,
    deletedAt: Any,
    getpaidTransactionId: Double,
    id: Double,
    metaname: String,
    metavalue: String,
    updatedAt: String
  ): CreatedAt = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], deletedAt = deletedAt.asInstanceOf[js.Any], getpaidTransactionId = getpaidTransactionId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metaname = metaname.asInstanceOf[js.Any], metavalue = metavalue.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedAt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatedAt] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDeletedAt(value: Any): Self = StObject.set(x, "deletedAt", value.asInstanceOf[js.Any])
    
    inline def setGetpaidTransactionId(value: Double): Self = StObject.set(x, "getpaidTransactionId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMetaname(value: String): Self = StObject.set(x, "metaname", value.asInstanceOf[js.Any])
    
    inline def setMetavalue(value: String): Self = StObject.set(x, "metavalue", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
