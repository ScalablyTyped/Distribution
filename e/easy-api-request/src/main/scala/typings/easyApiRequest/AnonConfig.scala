package typings.easyApiRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: AnonCookies
  var name: js.Any
}

object AnonConfig {
  @scala.inline
  def apply(config: AnonCookies, name: js.Any): AnonConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

