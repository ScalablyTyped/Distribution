package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OneofDescriptorProto. */
trait IOneofDescriptorProto extends StObject {
  
  /** OneofDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** OneofDescriptorProto options */
  var options: js.UndefOr[IOneofOptions | Null] = js.undefined
}
object IOneofDescriptorProto {
  
  inline def apply(): IOneofDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOneofDescriptorProto]
  }
  
  extension [Self <: IOneofDescriptorProto](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: IOneofOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
