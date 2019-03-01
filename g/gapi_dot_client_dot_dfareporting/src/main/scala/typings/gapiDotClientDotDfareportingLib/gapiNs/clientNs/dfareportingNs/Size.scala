package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  /** Height of this size. Acceptable values are 0 to 32767, inclusive. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** IAB standard size. This is a read-only, auto-generated field. */
  var iab: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of this size. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#size". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Width of this size. Acceptable values are 0 to 32767, inclusive. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Size {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    iab: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(iab)) __obj.updateDynamic("iab")(iab)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

