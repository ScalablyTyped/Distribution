package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avg extends StObject {
  
  var field: js.UndefOr[FieldReference] = js.undefined
}
object Avg {
  
  inline def apply(): Avg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Avg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Avg] (val x: Self) extends AnyVal {
    
    inline def setField(value: FieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
