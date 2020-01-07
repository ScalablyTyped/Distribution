package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ProductStatusDestinationStatus extends js.Object {
  /**
    * Whether the approval status might change due to further processing.
    */
  var approvalPending: js.UndefOr[Boolean] = js.native
  /**
    * The destination&#39;s approval status.
    */
  var approvalStatus: js.UndefOr[String] = js.native
  /**
    * The name of the destination
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Provided for backward compatibility only. Always set to
    * &quot;required&quot;.
    */
  var intention: js.UndefOr[String] = js.native
}

object Schema$ProductStatusDestinationStatus {
  @scala.inline
  def apply(
    approvalPending: js.UndefOr[Boolean] = js.undefined,
    approvalStatus: String = null,
    destination: String = null,
    intention: String = null
  ): Schema$ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(approvalPending)) __obj.updateDynamic("approvalPending")(approvalPending.asInstanceOf[js.Any])
    if (approvalStatus != null) __obj.updateDynamic("approvalStatus")(approvalStatus.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (intention != null) __obj.updateDynamic("intention")(intention.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ProductStatusDestinationStatus]
  }
}

