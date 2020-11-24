package typings.gitlab.runnersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunnerSchema extends js.Object {
  
  var active: Boolean = js.native
  
  var description: String = js.native
  
  var id: Double = js.native
  
  var ip_address: String = js.native
  
  var is_shared: Boolean = js.native
  
  var name: String = js.native
  
  var online: Boolean = js.native
  
  var status: String = js.native
}
object RunnerSchema {
  
  @scala.inline
  def apply(
    active: Boolean,
    description: String,
    id: Double,
    ip_address: String,
    is_shared: Boolean,
    name: String,
    online: Boolean,
    status: String
  ): RunnerSchema = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], is_shared = is_shared.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerSchema]
  }
  
  @scala.inline
  implicit class RunnerSchemaOps[Self <: RunnerSchema] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp_address(value: String): Self = this.set("ip_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_shared(value: Boolean): Self = this.set("is_shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline(value: Boolean): Self = this.set("online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
