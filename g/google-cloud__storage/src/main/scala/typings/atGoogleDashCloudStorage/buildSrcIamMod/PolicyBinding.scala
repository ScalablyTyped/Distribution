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
    val __obj = js.Dynamic.literal(members = members, role = role)
  
    __obj.asInstanceOf[PolicyBinding]
  }
}

