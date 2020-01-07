package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Volumes extends js.Object {
  /**
    * A list of volumes.
    */
  var items: js.UndefOr[js.Array[Schema$Volume]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Total number of volumes found. This might be greater than the number of
    * volumes returned in this response if results have been paginated.
    */
  var totalItems: js.UndefOr[Double] = js.native
}

object Schema$Volumes {
  @scala.inline
  def apply(items: js.Array[Schema$Volume] = null, kind: String = null, totalItems: Int | Double = null): Schema$Volumes = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Volumes]
  }
}

