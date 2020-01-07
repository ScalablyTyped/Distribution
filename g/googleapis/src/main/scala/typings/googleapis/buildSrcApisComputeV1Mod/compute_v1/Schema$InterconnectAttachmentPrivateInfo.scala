package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information for an interconnect attachment when this belongs to an
  * interconnect of type DEDICATED.
  */
@js.native
trait Schema$InterconnectAttachmentPrivateInfo extends js.Object {
  /**
    * [Output Only] 802.1q encapsulation tag to be used for traffic between
    * Google and the customer, going to and from this network and region.
    */
  var tag8021q: js.UndefOr[Double] = js.native
}

object Schema$InterconnectAttachmentPrivateInfo {
  @scala.inline
  def apply(tag8021q: Int | Double = null): Schema$InterconnectAttachmentPrivateInfo = {
    val __obj = js.Dynamic.literal()
    if (tag8021q != null) __obj.updateDynamic("tag8021q")(tag8021q.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InterconnectAttachmentPrivateInfo]
  }
}

