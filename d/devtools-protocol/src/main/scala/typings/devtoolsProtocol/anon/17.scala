package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.ReleaseObjectRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var paramsType: js.Array[ReleaseObjectRequest]
  
  var returnType: Unit
}
object `17` {
  
  @scala.inline
  def apply(paramsType: js.Array[ReleaseObjectRequest], returnType: Unit): `17` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit class `17MutableBuilder`[Self <: `17`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ReleaseObjectRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ReleaseObjectRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
