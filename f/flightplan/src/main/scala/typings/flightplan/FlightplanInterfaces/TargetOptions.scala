package typings.flightplan.FlightplanInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetOptions extends js.Object {
  
  var agent: String = js.native
  
  var failsafe: js.UndefOr[Boolean] = js.native
  
  var host: String = js.native
  
  var username: String = js.native
}
object TargetOptions {
  
  @scala.inline
  def apply(agent: String, host: String, username: String): TargetOptions = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetOptions]
  }
  
  @scala.inline
  implicit class TargetOptionsOps[Self <: TargetOptions] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: String): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailsafe(value: Boolean): Self = this.set("failsafe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailsafe: Self = this.set("failsafe", js.undefined)
  }
}
