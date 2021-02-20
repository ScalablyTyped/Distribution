package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an EnumValueDescriptorProto. */
@js.native
trait IEnumValueDescriptorProto extends StObject {
  
  /** EnumValueDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** EnumValueDescriptorProto number */
  var number: js.UndefOr[Double | Null] = js.native
  
  /** EnumValueDescriptorProto options */
  var options: js.UndefOr[IEnumValueOptions | Null] = js.native
}
object IEnumValueDescriptorProto {
  
  @scala.inline
  def apply(): IEnumValueDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEnumValueDescriptorProto]
  }
  
  @scala.inline
  implicit class IEnumValueDescriptorProtoMutableBuilder[Self <: IEnumValueDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberNull: Self = StObject.set(x, "number", null)
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setOptions(value: IEnumValueOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
