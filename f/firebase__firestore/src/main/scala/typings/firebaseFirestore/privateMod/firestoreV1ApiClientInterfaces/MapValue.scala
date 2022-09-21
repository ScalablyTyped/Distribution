package typings.firebaseFirestore.privateMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.privateMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapValue extends StObject {
  
  var fields: js.UndefOr[ApiClientObjectMap[Value]] = js.undefined
}
object MapValue {
  
  inline def apply(): MapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapValue]
  }
  
  extension [Self <: MapValue](x: Self) {
    
    inline def setFields(value: ApiClientObjectMap[Value]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
  }
}
