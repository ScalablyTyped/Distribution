package typings.ftp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilePermissions extends js.Object {
  /**
    * An empty string or any combination of 'r', 'w', 'x'.
    */
  var group: String = js.native
  /**
    * An empty string or any combination of 'r', 'w', 'x'.
    */
  var other: String = js.native
  /**
    * An empty string or any combination of 'r', 'w', 'x'.
    */
  var user: String = js.native
}

object FilePermissions {
  @scala.inline
  def apply(group: String, other: String, user: String): FilePermissions = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePermissions]
  }
  @scala.inline
  implicit class FilePermissionsOps[Self <: FilePermissions] (val x: Self) extends AnyVal {
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

