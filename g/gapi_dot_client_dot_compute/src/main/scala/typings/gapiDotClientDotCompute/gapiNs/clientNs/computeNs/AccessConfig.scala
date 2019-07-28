package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessConfig extends js.Object {
  /** [Output Only] Type of the resource. Always compute#accessConfig for access configs. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The name of this access configuration. The default and recommended name is External NAT but you can use any arbitrary string you would like. For
    * example, My external IP or Network Access.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field
    * undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the
    * zone of the instance.
    */
  var natIP: js.UndefOr[String] = js.undefined
  /** The type of configuration. The default and only option is ONE_TO_ONE_NAT. */
  var `type`: js.UndefOr[String] = js.undefined
}

object AccessConfig {
  @scala.inline
  def apply(kind: String = null, name: String = null, natIP: String = null, `type`: String = null): AccessConfig = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (natIP != null) __obj.updateDynamic("natIP")(natIP)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AccessConfig]
  }
}

