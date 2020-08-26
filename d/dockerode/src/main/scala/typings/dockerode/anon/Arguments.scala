package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arguments extends js.Object {
  var arguments: js.Array[String] = js.native
  var entrypoint: String = js.native
  var privileged: Boolean = js.native
  var tty: Boolean = js.native
  var user: String = js.native
}

object Arguments {
  @scala.inline
  def apply(arguments: js.Array[String], entrypoint: String, privileged: Boolean, tty: Boolean, user: String): Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], entrypoint = entrypoint.asInstanceOf[js.Any], privileged = privileged.asInstanceOf[js.Any], tty = tty.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  @scala.inline
  implicit class ArgumentsOps[Self <: Arguments] (val x: Self) extends AnyVal {
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
    def setArgumentsVarargs(value: String*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[String]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntrypoint(value: String): Self = this.set("entrypoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivileged(value: Boolean): Self = this.set("privileged", value.asInstanceOf[js.Any])
    @scala.inline
    def setTty(value: Boolean): Self = this.set("tty", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

