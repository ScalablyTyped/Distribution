package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Array of guest attribute namespace/key/value tuples.
  */
@js.native
trait Schema$GuestAttributesValue extends js.Object {
  var items: js.UndefOr[js.Array[Schema$GuestAttributesEntry]] = js.native
}

object Schema$GuestAttributesValue {
  @scala.inline
  def apply(items: js.Array[Schema$GuestAttributesEntry] = null): Schema$GuestAttributesValue = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GuestAttributesValue]
  }
}

