package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var Config: js.Any
  var Type: String
}

object AnonConfig {
  @scala.inline
  def apply(Config: js.Any, Type: String): AnonConfig = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

