package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a MapValue. */
trait IMapValue extends StObject {
  
  /** MapValue fields */
  var fields: js.UndefOr[StringDictionary[IValue] | Null] = js.undefined
}
object IMapValue {
  
  inline def apply(): IMapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapValue]
  }
  
  extension [Self <: IMapValue](x: Self) {
    
    inline def setFields(value: StringDictionary[IValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
