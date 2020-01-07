package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderReturn extends js.Object {
  /**
    * The actor that created the refund.
    */
  var actor: js.UndefOr[String] = js.native
  /**
    * Date on which the item has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.native
  /**
    * Quantity that is returned.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The reason for the return.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}

object Schema$OrderReturn {
  @scala.inline
  def apply(
    actor: String = null,
    creationDate: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
  ): Schema$OrderReturn = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderReturn]
  }
}

