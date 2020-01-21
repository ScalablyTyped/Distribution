package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Array of guest attribute namespace/key/value tuples.
  */
@js.native
trait SchemaGuestAttributesValue extends js.Object {
  var items: js.UndefOr[js.Array[SchemaGuestAttributesEntry]] = js.native
}

object SchemaGuestAttributesValue {
  @scala.inline
  def apply(items: js.Array[SchemaGuestAttributesEntry] = null): SchemaGuestAttributesValue = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGuestAttributesValue]
  }
}

