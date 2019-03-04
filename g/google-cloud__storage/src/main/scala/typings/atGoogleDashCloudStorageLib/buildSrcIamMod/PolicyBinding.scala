package typings
package atGoogleDashCloudStorageLib.buildSrcIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyBinding extends js.Object {
  var members: js.Array[java.lang.String]
  var role: java.lang.String
}

object PolicyBinding {
  @scala.inline
  def apply(members: js.Array[java.lang.String], role: java.lang.String): PolicyBinding = {
    val __obj = js.Dynamic.literal(members = members, role = role)
  
    __obj.asInstanceOf[PolicyBinding]
  }
}

