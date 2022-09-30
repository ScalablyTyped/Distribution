package typings.googleCloudFirestore.firestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StringValue. */
trait IStringValue extends StObject {
  
  /** StringValue value */
  var value: js.UndefOr[String | Null] = js.undefined
}
object IStringValue {
  
  inline def apply(): IStringValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStringValue]
  }
  
  extension [Self <: IStringValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
