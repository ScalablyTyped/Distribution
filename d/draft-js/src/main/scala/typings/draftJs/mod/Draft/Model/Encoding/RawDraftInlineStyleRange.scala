package typings.draftJs.mod.Draft.Model.Encoding

import typings.draftJs.mod.Draft.Model.Constants.DraftInlineStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of an inline style range.
  */
trait RawDraftInlineStyleRange extends js.Object {
  var length: Double
  var offset: Double
  var style: DraftInlineStyleType
}

object RawDraftInlineStyleRange {
  @scala.inline
  def apply(length: Double, offset: Double, style: DraftInlineStyleType): RawDraftInlineStyleRange = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawDraftInlineStyleRange]
  }
}

