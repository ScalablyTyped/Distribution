package typings.expoLocation.expoLocationWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionResult extends js.Object {
  var status: String
}

object PermissionResult {
  @scala.inline
  def apply(status: String): PermissionResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PermissionResult]
  }
}

