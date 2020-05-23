package typings.easyApiRequest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: Cookies
  var name: js.Any
}

object Config {
  @scala.inline
  def apply(config: Cookies, name: js.Any): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

