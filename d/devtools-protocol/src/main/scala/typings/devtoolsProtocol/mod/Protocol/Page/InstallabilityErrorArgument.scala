package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallabilityErrorArgument extends js.Object {
  /**
    * Argument name (e.g. name:'minimum-icon-size-in-pixels').
    */
  var name: String = js.native
  /**
    * Argument value (e.g. value:'64').
    */
  var value: String = js.native
}

object InstallabilityErrorArgument {
  @scala.inline
  def apply(name: String, value: String): InstallabilityErrorArgument = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallabilityErrorArgument]
  }
  @scala.inline
  implicit class InstallabilityErrorArgumentOps[Self <: InstallabilityErrorArgument] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

