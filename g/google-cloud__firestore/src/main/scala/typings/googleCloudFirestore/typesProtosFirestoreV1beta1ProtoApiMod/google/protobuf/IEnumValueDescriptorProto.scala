package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EnumValueDescriptorProto. */
trait IEnumValueDescriptorProto extends StObject {
  
  /** EnumValueDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** EnumValueDescriptorProto number */
  var number: js.UndefOr[Double | Null] = js.undefined
  
  /** EnumValueDescriptorProto options */
  var options: js.UndefOr[IEnumValueOptions | Null] = js.undefined
}
object IEnumValueDescriptorProto {
  
  inline def apply(): IEnumValueDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumValueDescriptorProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEnumValueDescriptorProto] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberNull: Self = StObject.set(x, "number", null)
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOptions(value: IEnumValueOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
