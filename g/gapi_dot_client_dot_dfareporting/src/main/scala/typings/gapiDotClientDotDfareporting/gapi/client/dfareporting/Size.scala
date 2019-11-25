package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  /** Height of this size. Acceptable values are 0 to 32767, inclusive. */
  var height: js.UndefOr[Double] = js.undefined
  /** IAB standard size. This is a read-only, auto-generated field. */
  var iab: js.UndefOr[Boolean] = js.undefined
  /** ID of this size. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#size". */
  var kind: js.UndefOr[String] = js.undefined
  /** Width of this size. Acceptable values are 0 to 32767, inclusive. */
  var width: js.UndefOr[Double] = js.undefined
}

object Size {
  @scala.inline
  def apply(
    height: Int | Double = null,
    iab: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    width: Int | Double = null
  ): Size = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(iab)) __obj.updateDynamic("iab")(iab.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

