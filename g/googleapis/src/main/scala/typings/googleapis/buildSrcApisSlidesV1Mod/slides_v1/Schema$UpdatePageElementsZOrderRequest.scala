package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the Z-order of page elements. Z-order is an ordering of the
  * elements on the page from back to front. The page element in the front may
  * cover the elements that are behind it.
  */
@js.native
trait Schema$UpdatePageElementsZOrderRequest extends js.Object {
  /**
    * The Z-order operation to apply on the page elements.  When applying the
    * operation on multiple page elements, the relative Z-orders within these
    * page elements before the operation is maintained.
    */
  var operation: js.UndefOr[String] = js.native
  /**
    * The object IDs of the page elements to update.  All the page elements
    * must be on the same page and must not be grouped.
    */
  var pageElementObjectIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$UpdatePageElementsZOrderRequest {
  @scala.inline
  def apply(operation: String = null, pageElementObjectIds: js.Array[String] = null): Schema$UpdatePageElementsZOrderRequest = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (pageElementObjectIds != null) __obj.updateDynamic("pageElementObjectIds")(pageElementObjectIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdatePageElementsZOrderRequest]
  }
}

