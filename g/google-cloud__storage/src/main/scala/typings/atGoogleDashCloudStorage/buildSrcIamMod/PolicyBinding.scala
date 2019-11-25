package typings.atGoogleDashCloudStorage.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyBinding extends js.Object {
  var members: js.Array[String]
  var role: String
}

object PolicyBinding {
  @scala.inline
  def apply(members: js.Array[String], role: String): PolicyBinding = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyBinding]
  }
}

