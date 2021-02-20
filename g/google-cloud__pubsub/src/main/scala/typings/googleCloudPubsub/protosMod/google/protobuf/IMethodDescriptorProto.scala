package typings.googleCloudPubsub.protosMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a MethodDescriptorProto. */
@js.native
trait IMethodDescriptorProto extends StObject {
  
  /** MethodDescriptorProto clientStreaming */
  var clientStreaming: js.UndefOr[Boolean | Null] = js.native
  
  /** MethodDescriptorProto inputType */
  var inputType: js.UndefOr[String | Null] = js.native
  
  /** MethodDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** MethodDescriptorProto options */
  var options: js.UndefOr[IMethodOptions | Null] = js.native
  
  /** MethodDescriptorProto outputType */
  var outputType: js.UndefOr[String | Null] = js.native
  
  /** MethodDescriptorProto serverStreaming */
  var serverStreaming: js.UndefOr[Boolean | Null] = js.native
}
object IMethodDescriptorProto {
  
  @scala.inline
  def apply(): IMethodDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodDescriptorProto]
  }
  
  @scala.inline
  implicit class IMethodDescriptorProtoMutableBuilder[Self <: IMethodDescriptorProto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientStreaming(value: Boolean): Self = StObject.set(x, "clientStreaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientStreamingNull: Self = StObject.set(x, "clientStreaming", null)
    
    @scala.inline
    def setClientStreamingUndefined: Self = StObject.set(x, "clientStreaming", js.undefined)
    
    @scala.inline
    def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTypeNull: Self = StObject.set(x, "inputType", null)
    
    @scala.inline
    def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: IMethodOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOutputType(value: String): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputTypeNull: Self = StObject.set(x, "outputType", null)
    
    @scala.inline
    def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
    
    @scala.inline
    def setServerStreaming(value: Boolean): Self = StObject.set(x, "serverStreaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerStreamingNull: Self = StObject.set(x, "serverStreaming", null)
    
    @scala.inline
    def setServerStreamingUndefined: Self = StObject.set(x, "serverStreaming", js.undefined)
  }
}
