package typings.devtoolsProtocol.mod.Protocol.Performance

import typings.devtoolsProtocol.devtoolsProtocolStrings.threadTicks
import typings.devtoolsProtocol.devtoolsProtocolStrings.timeTicks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetTimeDomainRequest extends js.Object {
  
  /**
    * Time domain (SetTimeDomainRequestTimeDomain enum)
    */
  var timeDomain: timeTicks | threadTicks = js.native
}
object SetTimeDomainRequest {
  
  @scala.inline
  def apply(timeDomain: timeTicks | threadTicks): SetTimeDomainRequest = {
    val __obj = js.Dynamic.literal(timeDomain = timeDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimeDomainRequest]
  }
  
  @scala.inline
  implicit class SetTimeDomainRequestOps[Self <: SetTimeDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTimeDomain(value: timeTicks | threadTicks): Self = this.set("timeDomain", value.asInstanceOf[js.Any])
  }
}
