package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BoolValue. */
trait IBoolValue extends StObject {
  
  /** BoolValue value */
  var value: js.UndefOr[Boolean | Null] = js.undefined
}
object IBoolValue {
  
  inline def apply(): IBoolValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoolValue]
  }
  
  extension [Self <: IBoolValue](x: Self) {
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
