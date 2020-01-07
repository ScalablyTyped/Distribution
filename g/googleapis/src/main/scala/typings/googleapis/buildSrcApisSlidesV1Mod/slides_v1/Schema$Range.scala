package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a contiguous range of an indexed collection, such as characters
  * in text.
  */
@js.native
trait Schema$Range extends js.Object {
  /**
    * The optional zero-based index of the end of the collection. Required for
    * `FIXED_RANGE` ranges.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The optional zero-based index of the beginning of the collection.
    * Required for `FIXED_RANGE` and `FROM_START_INDEX` ranges.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The type of range.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$Range {
  @scala.inline
  def apply(endIndex: Int | Double = null, startIndex: Int | Double = null, `type`: String = null): Schema$Range = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Range]
  }
}

