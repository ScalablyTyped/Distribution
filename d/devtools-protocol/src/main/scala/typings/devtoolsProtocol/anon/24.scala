package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.ReleaseAnimationsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `24` extends StObject {
  
  var paramsType: js.Array[ReleaseAnimationsRequest] = js.native
  
  var returnType: Unit = js.native
}
object `24` {
  
  @scala.inline
  def apply(paramsType: js.Array[ReleaseAnimationsRequest], returnType: Unit): `24` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit class `24MutableBuilder`[Self <: `24`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ReleaseAnimationsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ReleaseAnimationsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
