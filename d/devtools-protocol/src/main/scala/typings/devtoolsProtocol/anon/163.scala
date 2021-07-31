package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.AddCompilationCacheRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  var paramsType: js.Array[AddCompilationCacheRequest]
  
  var returnType: Unit
}
object `163` {
  
  @scala.inline
  def apply(paramsType: js.Array[AddCompilationCacheRequest], returnType: Unit): `163` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`163`]
  }
  
  @scala.inline
  implicit class `163MutableBuilder`[Self <: `163`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[AddCompilationCacheRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: AddCompilationCacheRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
