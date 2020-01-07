package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies a contiguous range of text.
  */
@js.native
trait Schema$Range extends js.Object {
  /**
    * The zero-based end index of this range, exclusive, in UTF-16 code units.
    * In all current uses, an end index must be provided. This field is an
    * Int32Value in order to accommodate future use cases with open-ended
    * ranges.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The ID of the header, footer or footnote that this range is contained in.
    * An empty segment ID signifies the document&#39;s body.
    */
  var segmentId: js.UndefOr[String] = js.native
  /**
    * The zero-based start index of this range, in UTF-16 code units.  In all
    * current uses, a start index must be provided. This field is an Int32Value
    * in order to accommodate future use cases with open-ended ranges.
    */
  var startIndex: js.UndefOr[Double] = js.native
}

object Schema$Range {
  @scala.inline
  def apply(endIndex: Int | Double = null, segmentId: String = null, startIndex: Int | Double = null): Schema$Range = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Range]
  }
}

