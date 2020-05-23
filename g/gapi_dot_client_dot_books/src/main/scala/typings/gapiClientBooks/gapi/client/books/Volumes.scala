package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volumes extends js.Object {
  /** A list of volumes. */
  var items: js.UndefOr[js.Array[Volume]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** Total number of volumes found. This might be greater than the number of volumes returned in this response if results have been paginated. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object Volumes {
  @scala.inline
  def apply(items: js.Array[Volume] = null, kind: String = null, totalItems: js.UndefOr[Double] = js.undefined): Volumes = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volumes]
  }
}

