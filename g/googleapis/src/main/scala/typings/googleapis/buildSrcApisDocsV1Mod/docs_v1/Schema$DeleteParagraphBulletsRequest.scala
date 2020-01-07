package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes bullets from all of the paragraphs that overlap with the given
  * range.  The nesting level of each paragraph will be visually preserved by
  * adding indent to the start of the corresponding paragraph.
  */
@js.native
trait Schema$DeleteParagraphBulletsRequest extends js.Object {
  /**
    * The range to delete bullets from.
    */
  var range: js.UndefOr[Schema$Range] = js.native
}

object Schema$DeleteParagraphBulletsRequest {
  @scala.inline
  def apply(range: Schema$Range = null): Schema$DeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeleteParagraphBulletsRequest]
  }
}

