package typings.googleGax.iamServiceMod.google.protobuf

import typings.googleGax.iamServiceMod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EnumDescriptorProto. */
trait IEnumDescriptorProto extends StObject {
  
  /** EnumDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** EnumDescriptorProto options */
  var options: js.UndefOr[IEnumOptions | Null] = js.undefined
  
  /** EnumDescriptorProto reservedName */
  var reservedName: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** EnumDescriptorProto reservedRange */
  var reservedRange: js.UndefOr[js.Array[IEnumReservedRange] | Null] = js.undefined
  
  /** EnumDescriptorProto value */
  var value: js.UndefOr[js.Array[IEnumValueDescriptorProto] | Null] = js.undefined
}
object IEnumDescriptorProto {
  
  inline def apply(): IEnumDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumDescriptorProto]
  }
  
  extension [Self <: IEnumDescriptorProto](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: IEnumOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setReservedName(value: js.Array[String]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    inline def setReservedNameNull: Self = StObject.set(x, "reservedName", null)
    
    inline def setReservedNameUndefined: Self = StObject.set(x, "reservedName", js.undefined)
    
    inline def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value*))
    
    inline def setReservedRange(value: js.Array[IEnumReservedRange]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    inline def setReservedRangeNull: Self = StObject.set(x, "reservedRange", null)
    
    inline def setReservedRangeUndefined: Self = StObject.set(x, "reservedRange", js.undefined)
    
    inline def setReservedRangeVarargs(value: IEnumReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value*))
    
    inline def setValue(value: js.Array[IEnumValueDescriptorProto]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: IEnumValueDescriptorProto*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
