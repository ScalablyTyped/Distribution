package typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.EncodingNs

import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInlineStyleType
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
    val __obj = js.Dynamic.literal(length = length, offset = offset, style = style)
  
    __obj.asInstanceOf[RawDraftInlineStyleRange]
  }
}

