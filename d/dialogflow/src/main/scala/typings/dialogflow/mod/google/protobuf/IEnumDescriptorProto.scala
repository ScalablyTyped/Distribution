package typings.dialogflow.mod.google.protobuf

import typings.dialogflow.mod.google.protobuf.EnumDescriptorProto.IEnumReservedRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EnumDescriptorProto. */
@js.native
trait IEnumDescriptorProto extends StObject {
  
  /** EnumDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** EnumDescriptorProto options */
  var options: js.UndefOr[IEnumOptions | Null] = js.native
  
  /** EnumDescriptorProto reservedName */
  var reservedName: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** EnumDescriptorProto reservedRange */
  var reservedRange: js.UndefOr[js.Array[IEnumReservedRange] | Null] = js.native
  
  /** EnumDescriptorProto value */
  var value: js.UndefOr[js.Array[IEnumValueDescriptorProto] | Null] = js.native
}
object IEnumDescriptorProto {
  
  @scala.inline
  def apply(): IEnumDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumDescriptorProto]
  }
  
  @scala.inline
  implicit class IEnumDescriptorProtoMutableBuilder[Self <: IEnumDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: IEnumOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setReservedName(value: js.Array[String]): Self = StObject.set(x, "reservedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedNameNull: Self = StObject.set(x, "reservedName", null)
    
    @scala.inline
    def setReservedNameUndefined: Self = StObject.set(x, "reservedName", js.undefined)
    
    @scala.inline
    def setReservedNameVarargs(value: String*): Self = StObject.set(x, "reservedName", js.Array(value :_*))
    
    @scala.inline
    def setReservedRange(value: js.Array[IEnumReservedRange]): Self = StObject.set(x, "reservedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedRangeNull: Self = StObject.set(x, "reservedRange", null)
    
    @scala.inline
    def setReservedRangeUndefined: Self = StObject.set(x, "reservedRange", js.undefined)
    
    @scala.inline
    def setReservedRangeVarargs(value: IEnumReservedRange*): Self = StObject.set(x, "reservedRange", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[IEnumValueDescriptorProto]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: IEnumValueDescriptorProto*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
