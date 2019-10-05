package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventorySetResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "content#inventorySetResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object InventorySetResponse {
  @scala.inline
  def apply(kind: String = null): InventorySetResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[InventorySetResponse]
  }
}

