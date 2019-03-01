package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CidrBlock extends js.Object {
  /** cidr_block must be specified in CIDR notation. */
  var cidrBlock: js.UndefOr[java.lang.String] = js.undefined
  /** display_name is an optional field for users to identify CIDR blocks. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
}

object CidrBlock {
  @scala.inline
  def apply(cidrBlock: java.lang.String = null, displayName: java.lang.String = null): CidrBlock = {
    val __obj = js.Dynamic.literal()
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[CidrBlock]
  }
}

