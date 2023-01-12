package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Struct. */
trait IStruct extends StObject {
  
  /** Struct fields */
  var fields: js.UndefOr[StringDictionary[IValue] | Null] = js.undefined
}
object IStruct {
  
  inline def apply(): IStruct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStruct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStruct] (val x: Self) extends AnyVal {
    
    inline def setFields(value: StringDictionary[IValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
