package typings
package draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A plain object representation of an inline style range.
  */
trait RawDraftInlineStyleRange extends js.Object {
  var length: scala.Double
  var offset: scala.Double
  var style: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInlineStyleType
}

object RawDraftInlineStyleRange {
  @scala.inline
  def apply(
    length: scala.Double,
    offset: scala.Double,
    style: draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.ConstantsNs.DraftInlineStyleType
  ): RawDraftInlineStyleRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[RawDraftInlineStyleRange]
  }
}

