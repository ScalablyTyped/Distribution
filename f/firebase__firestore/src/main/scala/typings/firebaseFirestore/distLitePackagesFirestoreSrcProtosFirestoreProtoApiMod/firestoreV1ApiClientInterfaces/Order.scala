package typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.OrderDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var direction: js.UndefOr[OrderDirection] = js.undefined
  
  var field: js.UndefOr[FieldReference] = js.undefined
}
object Order {
  
  inline def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  
  extension [Self <: Order](x: Self) {
    
    inline def setDirection(value: OrderDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setField(value: FieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
