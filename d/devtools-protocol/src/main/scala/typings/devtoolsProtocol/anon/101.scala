package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Input.EmulateTouchFromMouseEventRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `101` extends StObject {
  
  var paramsType: js.Array[EmulateTouchFromMouseEventRequest] = js.native
  
  var returnType: Unit = js.native
}
object `101` {
  
  @scala.inline
  def apply(paramsType: js.Array[EmulateTouchFromMouseEventRequest], returnType: Unit): `101` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`101`]
  }
  
  @scala.inline
  implicit class `101MutableBuilder`[Self <: `101`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[EmulateTouchFromMouseEventRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: EmulateTouchFromMouseEventRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
