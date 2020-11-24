package typings.foreverAgent.mod

import typings.node.httpMod.AgentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForeverAgentOptions extends AgentOptions {
  
  var minSockets: js.UndefOr[Double] = js.native
}
object ForeverAgentOptions {
  
  @scala.inline
  def apply(): ForeverAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForeverAgentOptions]
  }
  
  @scala.inline
  implicit class ForeverAgentOptionsOps[Self <: ForeverAgentOptions] (val x: Self) extends AnyVal {
    
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
    def setMinSockets(value: Double): Self = this.set("minSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSockets: Self = this.set("minSockets", js.undefined)
  }
}
