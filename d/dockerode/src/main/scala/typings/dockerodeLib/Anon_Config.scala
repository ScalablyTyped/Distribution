package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var Config: js.Any
  var Type: java.lang.String
}

object Anon_Config {
  @scala.inline
  def apply(Config: js.Any, Type: java.lang.String): Anon_Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Config")(Config)
    __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[Anon_Config]
  }
}

