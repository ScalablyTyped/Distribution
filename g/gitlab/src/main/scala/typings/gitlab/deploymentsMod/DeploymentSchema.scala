package typings.gitlab.deploymentsMod

import typings.gitlab.usersMod.UserSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentSchema extends js.Object {
  
  var id: Double = js.native
  
  var iid: Double = js.native
  
  var ref: String = js.native
  
  var sha: String = js.native
  
  var user: UserSchema = js.native
}
object DeploymentSchema {
  
  @scala.inline
  def apply(id: Double, iid: Double, ref: String, sha: String, user: UserSchema): DeploymentSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], iid = iid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentSchema]
  }
  
  @scala.inline
  implicit class DeploymentSchemaOps[Self <: DeploymentSchema] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIid(value: Double): Self = this.set("iid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = this.set("sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: UserSchema): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
