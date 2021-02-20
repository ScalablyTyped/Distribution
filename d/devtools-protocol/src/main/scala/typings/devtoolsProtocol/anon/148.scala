package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.ScreencastFrameAckRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `148` extends StObject {
  
  var paramsType: js.Array[ScreencastFrameAckRequest] = js.native
  
  var returnType: Unit = js.native
}
object `148` {
  
  @scala.inline
  def apply(paramsType: js.Array[ScreencastFrameAckRequest], returnType: Unit): `148` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`148`]
  }
  
  @scala.inline
  implicit class `148MutableBuilder`[Self <: `148`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[ScreencastFrameAckRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: ScreencastFrameAckRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
