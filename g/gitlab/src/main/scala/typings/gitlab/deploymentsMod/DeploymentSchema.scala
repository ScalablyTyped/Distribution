package typings.gitlab.deploymentsMod

import typings.gitlab.usersMod.UserSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentSchema extends js.Object {
  var id: Double
  var iid: Double
  var ref: String
  var sha: String
  var user: UserSchema
}

object DeploymentSchema {
  @scala.inline
  def apply(id: Double, iid: Double, ref: String, sha: String, user: UserSchema): DeploymentSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], iid = iid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentSchema]
  }
}

