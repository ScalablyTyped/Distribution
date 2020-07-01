package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVolumes extends js.Object {
  /**
    * A list of volumes.
    */
  var items: js.UndefOr[js.Array[SchemaVolume]] = js.native
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

object SchemaVolumes {
  @scala.inline
  def apply(
    items: js.Array[SchemaVolume] = null,
    kind: String = null,
    totalItems: js.UndefOr[Double] = js.undefined
  ): SchemaVolumes = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVolumes]
  }
}

