package typings.gapiDotClientDotServicemanagement.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigRef extends js.Object {
  /**
    * Resource name of a service config. It must have the following
    * format: "services/{service name}/configs/{config id}".
    */
  var name: js.UndefOr[String] = js.undefined
}

object ConfigRef {
  @scala.inline
  def apply(name: String = null): ConfigRef = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ConfigRef]
  }
}

