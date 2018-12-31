package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessConfig extends js.Object {
  /** [Output Only] Type of the resource. Always compute#accessConfig for access configs. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of this access configuration. The default and recommended name is External NAT but you can use any arbitrary string you would like. For
    * example, My external IP or Network Access.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An external IP address associated with this instance. Specify an unused static external IP address available to the project or leave this field
    * undefined to use an IP from a shared ephemeral IP address pool. If you specify a static external IP address, it must live in the same region as the
    * zone of the instance.
    */
  var natIP: js.UndefOr[java.lang.String] = js.undefined
  /** The type of configuration. The default and only option is ONE_TO_ONE_NAT. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

