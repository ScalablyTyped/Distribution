package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ServiceDescriptorProto. */
trait IServiceDescriptorProto extends StObject {
  
  /** ServiceDescriptorProto method */
  var method: js.UndefOr[js.Array[IMethodDescriptorProto] | Null] = js.undefined
  
  /** ServiceDescriptorProto name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** ServiceDescriptorProto options */
  var options: js.UndefOr[IServiceOptions | Null] = js.undefined
}
object IServiceDescriptorProto {
  
  inline def apply(): IServiceDescriptorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IServiceDescriptorProto]
  }
  
  extension [Self <: IServiceDescriptorProto](x: Self) {
    
    inline def setMethod(value: js.Array[IMethodDescriptorProto]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMethodVarargs(value: IMethodDescriptorProto*): Self = StObject.set(x, "method", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: IServiceOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
