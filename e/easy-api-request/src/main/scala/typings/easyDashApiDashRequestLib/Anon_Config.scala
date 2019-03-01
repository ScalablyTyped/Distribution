package typings
package easyDashApiDashRequestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: Anon_Cookies
  var name: js.Any
}

object Anon_Config {
  @scala.inline
  def apply(config: Anon_Cookies, name: js.Any): Anon_Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Config]
  }
}

