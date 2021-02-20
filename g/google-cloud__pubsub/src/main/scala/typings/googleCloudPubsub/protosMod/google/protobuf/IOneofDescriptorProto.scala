package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an OneofDescriptorProto. */
@js.native
trait IOneofDescriptorProto extends StObject {
  
  /** OneofDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** OneofDescriptorProto options */
  var options: js.UndefOr[IOneofOptions | Null] = js.native
}
object IOneofDescriptorProto {
  
  @scala.inline
  def apply(): IOneofDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOneofDescriptorProto]
  }
  
  @scala.inline
  implicit class IOneofDescriptorProtoMutableBuilder[Self <: IOneofDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: IOneofOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
