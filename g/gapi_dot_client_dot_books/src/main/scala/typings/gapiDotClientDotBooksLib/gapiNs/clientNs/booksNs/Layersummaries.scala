package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layersummaries extends js.Object {
  /** A list of layer summary items. */
  var items: js.UndefOr[js.Array[Layersummary]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The total number of layer summaries found. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

object Layersummaries {
  @scala.inline
  def apply(
    items: js.Array[Layersummary] = null,
    kind: java.lang.String = null,
    totalItems: scala.Int | scala.Double = null
  ): Layersummaries = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layersummaries]
  }
}

