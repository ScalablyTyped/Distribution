package typings.firebaseFirestore.distLitePrivateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sum extends StObject {
  
  var field: js.UndefOr[FieldReference] = js.undefined
}
object Sum {
  
  inline def apply(): Sum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sum] (val x: Self) extends AnyVal {
    
    inline def setField(value: FieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
