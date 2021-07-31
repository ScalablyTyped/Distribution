package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.DisposeBrowserContextRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `193` extends StObject {
  
  var paramsType: js.Array[DisposeBrowserContextRequest]
  
  var returnType: Unit
}
object `193` {
  
  @scala.inline
  def apply(paramsType: js.Array[DisposeBrowserContextRequest], returnType: Unit): `193` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`193`]
  }
  
  @scala.inline
  implicit class `193MutableBuilder`[Self <: `193`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DisposeBrowserContextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DisposeBrowserContextRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
