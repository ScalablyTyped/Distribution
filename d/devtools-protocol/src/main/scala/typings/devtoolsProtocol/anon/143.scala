package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.HandleJavaScriptDialogRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  var paramsType: js.Array[HandleJavaScriptDialogRequest]
  
  var returnType: Unit
}
object `143` {
  
  @scala.inline
  def apply(paramsType: js.Array[HandleJavaScriptDialogRequest], returnType: Unit): `143` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit class `143MutableBuilder`[Self <: `143`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[HandleJavaScriptDialogRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: HandleJavaScriptDialogRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
