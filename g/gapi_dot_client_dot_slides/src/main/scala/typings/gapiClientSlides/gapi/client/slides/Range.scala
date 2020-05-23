package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /**
    * The optional zero-based index of the end of the collection.
    * Required for `FIXED_RANGE` ranges.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  /**
    * The optional zero-based index of the beginning of the collection.
    * Required for `FIXED_RANGE` and `FROM_START_INDEX` ranges.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  /** The type of range. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Range {
  @scala.inline
  def apply(
    endIndex: js.UndefOr[Double] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

