package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetEmitTouchEventsForMouseRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `80` extends StObject {
  
  var paramsType: js.Array[SetEmitTouchEventsForMouseRequest] = js.native
  
  var returnType: Unit = js.native
}
object `80` {
  
  @scala.inline
  def apply(paramsType: js.Array[SetEmitTouchEventsForMouseRequest], returnType: Unit): `80` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`80`]
  }
  
  @scala.inline
  implicit class `80MutableBuilder`[Self <: `80`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[SetEmitTouchEventsForMouseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: SetEmitTouchEventsForMouseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
