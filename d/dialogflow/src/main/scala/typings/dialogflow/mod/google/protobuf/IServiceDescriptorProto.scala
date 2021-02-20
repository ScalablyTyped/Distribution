package typings.dialogflow.mod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ServiceDescriptorProto. */
@js.native
trait IServiceDescriptorProto extends StObject {
  
  /** ServiceDescriptorProto method */
  var method: js.UndefOr[js.Array[IMethodDescriptorProto] | Null] = js.native
  
  /** ServiceDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** ServiceDescriptorProto options */
  var options: js.UndefOr[IServiceOptions | Null] = js.native
}
object IServiceDescriptorProto {
  
  @scala.inline
  def apply(): IServiceDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServiceDescriptorProto]
  }
  
  @scala.inline
  implicit class IServiceDescriptorProtoMutableBuilder[Self <: IServiceDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: js.Array[IMethodDescriptorProto]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNull: Self = StObject.set(x, "method", null)
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMethodVarargs(value: IMethodDescriptorProto*): Self = StObject.set(x, "method", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: IServiceOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
