package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /**
    * The optional zero-based index of the end of the collection.
    * Required for `FIXED_RANGE` ranges.
    */
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The optional zero-based index of the beginning of the collection.
    * Required for `FIXED_RANGE` and `FROM_START_INDEX` ranges.
    */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /** The type of range. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Range {
  @scala.inline
  def apply(
    endIndex: scala.Int | scala.Double = null,
    startIndex: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Range]
  }
}

