package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Approver extends StObject {
  
  var approver: String
  
  var date_created: String
  
  var id: Double
  
  var uuid: Double
}
object Approver {
  
  inline def apply(approver: String, date_created: String, id: Double, uuid: Double): Approver = {
    val __obj = js.Dynamic.literal(approver = approver.asInstanceOf[js.Any], date_created = date_created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Approver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Approver] (val x: Self) extends AnyVal {
    
    inline def setApprover(value: String): Self = StObject.set(x, "approver", value.asInstanceOf[js.Any])
    
    inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: Double): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
