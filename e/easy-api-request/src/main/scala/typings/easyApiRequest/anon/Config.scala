package typings.easyApiRequest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var config: Cookies = js.native
  var name: js.Any = js.native
}

object Config {
  @scala.inline
  def apply(config: Cookies, name: js.Any): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setConfig(value: Cookies): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: js.Any): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

