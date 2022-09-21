package typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreSrcProtosFirestoreProtoApiMod.UnaryFilterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryFilter extends StObject {
  
  var field: js.UndefOr[FieldReference] = js.undefined
  
  var op: js.UndefOr[UnaryFilterOp] = js.undefined
}
object UnaryFilter {
  
  inline def apply(): UnaryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnaryFilter]
  }
  
  extension [Self <: UnaryFilter](x: Self) {
    
    inline def setField(value: FieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOp(value: UnaryFilterOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}
