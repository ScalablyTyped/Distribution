package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layersummaries extends js.Object {
  /** A list of layer summary items. */
  var items: js.UndefOr[js.Array[Layersummary]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** The total number of layer summaries found. */
  var totalItems: js.UndefOr[Double] = js.undefined
}

object Layersummaries {
  @scala.inline
  def apply(
    items: js.Array[Layersummary] = null,
    kind: String = null,
    totalItems: js.UndefOr[Double] = js.undefined
  ): Layersummaries = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItems)) __obj.updateDynamic("totalItems")(totalItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layersummaries]
  }
}

