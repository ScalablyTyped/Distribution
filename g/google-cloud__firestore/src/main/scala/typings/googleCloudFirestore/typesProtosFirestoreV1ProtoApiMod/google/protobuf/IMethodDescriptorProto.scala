package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a MethodDescriptorProto. */
trait IMethodDescriptorProto extends StObject {
  
  /** MethodDescriptorProto clientStreaming */
  var clientStreaming: js.UndefOr[Boolean | Null] = js.undefined
  
  /** MethodDescriptorProto inputType */
  var inputType: js.UndefOr[String | Null] = js.undefined
  
  /** MethodDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** MethodDescriptorProto options */
  var options: js.UndefOr[IMethodOptions | Null] = js.undefined
  
  /** MethodDescriptorProto outputType */
  var outputType: js.UndefOr[String | Null] = js.undefined
  
  /** MethodDescriptorProto serverStreaming */
  var serverStreaming: js.UndefOr[Boolean | Null] = js.undefined
}
object IMethodDescriptorProto {
  
  inline def apply(): IMethodDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMethodDescriptorProto]
  }
  
  extension [Self <: IMethodDescriptorProto](x: Self) {
    
    inline def setClientStreaming(value: Boolean): Self = StObject.set(x, "clientStreaming", value.asInstanceOf[js.Any])
    
    inline def setClientStreamingNull: Self = StObject.set(x, "clientStreaming", null)
    
    inline def setClientStreamingUndefined: Self = StObject.set(x, "clientStreaming", js.undefined)
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setInputTypeNull: Self = StObject.set(x, "inputType", null)
    
    inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: IMethodOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOutputType(value: String): Self = StObject.set(x, "outputType", value.asInstanceOf[js.Any])
    
    inline def setOutputTypeNull: Self = StObject.set(x, "outputType", null)
    
    inline def setOutputTypeUndefined: Self = StObject.set(x, "outputType", js.undefined)
    
    inline def setServerStreaming(value: Boolean): Self = StObject.set(x, "serverStreaming", value.asInstanceOf[js.Any])
    
    inline def setServerStreamingNull: Self = StObject.set(x, "serverStreaming", null)
    
    inline def setServerStreamingUndefined: Self = StObject.set(x, "serverStreaming", js.undefined)
  }
}
