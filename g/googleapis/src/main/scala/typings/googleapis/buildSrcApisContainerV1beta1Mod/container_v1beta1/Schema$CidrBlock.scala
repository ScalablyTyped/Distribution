package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CidrBlock contains an optional name and one CIDR block.
  */
@js.native
trait Schema$CidrBlock extends js.Object {
  /**
    * cidr_block must be specified in CIDR notation.
    */
  var cidrBlock: js.UndefOr[String] = js.native
  /**
    * display_name is an optional field for users to identify CIDR blocks.
    */
  var displayName: js.UndefOr[String] = js.native
}

object Schema$CidrBlock {
  @scala.inline
  def apply(cidrBlock: String = null, displayName: String = null): Schema$CidrBlock = {
    val __obj = js.Dynamic.literal()
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CidrBlock]
  }
}

