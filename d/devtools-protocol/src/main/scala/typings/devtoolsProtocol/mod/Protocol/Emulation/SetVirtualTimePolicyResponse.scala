package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetVirtualTimePolicyResponse extends StObject {
  
  /**
    * Absolute timestamp at which virtual time was first enabled (up time in milliseconds).
    */
  var virtualTimeTicksBase: Double
}
object SetVirtualTimePolicyResponse {
  
  @scala.inline
  def apply(virtualTimeTicksBase: Double): SetVirtualTimePolicyResponse = {
    val __obj = js.Dynamic.literal(virtualTimeTicksBase = virtualTimeTicksBase.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVirtualTimePolicyResponse]
  }
  
  @scala.inline
  implicit class SetVirtualTimePolicyResponseMutableBuilder[Self <: SetVirtualTimePolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualTimeTicksBase(value: Double): Self = StObject.set(x, "virtualTimeTicksBase", value.asInstanceOf[js.Any])
  }
}
