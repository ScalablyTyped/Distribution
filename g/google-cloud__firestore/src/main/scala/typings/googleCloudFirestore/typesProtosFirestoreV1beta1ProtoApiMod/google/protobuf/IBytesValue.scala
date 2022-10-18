package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BytesValue. */
trait IBytesValue extends StObject {
  
  /** BytesValue value */
  var value: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IBytesValue {
  
  inline def apply(): IBytesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBytesValue]
  }
  
  extension [Self <: IBytesValue](x: Self) {
    
    inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
