package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphStyleSuggestionState extends js.Object {
  var alignmentSuggested: js.UndefOr[Boolean] = js.native
  var avoidWidowAndOrphanSuggested: js.UndefOr[Boolean] = js.native
  var borderBetweenSuggested: js.UndefOr[Boolean] = js.native
  var borderBottomSuggested: js.UndefOr[Boolean] = js.native
  var borderLeftSuggested: js.UndefOr[Boolean] = js.native
  var borderRightSuggested: js.UndefOr[Boolean] = js.native
  var borderTopSuggested: js.UndefOr[Boolean] = js.native
  var directionSuggested: js.UndefOr[Boolean] = js.native
  var headingIdSuggested: js.UndefOr[Boolean] = js.native
  var indentEndSuggested: js.UndefOr[Boolean] = js.native
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.native
  var indentStartSuggested: js.UndefOr[Boolean] = js.native
  var keepLinesTogetherSuggested: js.UndefOr[Boolean] = js.native
  var keepWithNextSuggested: js.UndefOr[Boolean] = js.native
  var lineSpacingSuggested: js.UndefOr[Boolean] = js.native
  var namedStyleTypeSuggested: js.UndefOr[Boolean] = js.native
  var shadingSuggestionState: js.UndefOr[ShadingSuggestionState] = js.native
  var spaceAboveSuggested: js.UndefOr[Boolean] = js.native
  var spaceBelowSuggested: js.UndefOr[Boolean] = js.native
  var spacingModeSuggested: js.UndefOr[Boolean] = js.native
}

object ParagraphStyleSuggestionState {
  @scala.inline
  def apply(): ParagraphStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyleSuggestionState]
  }
  @scala.inline
  implicit class ParagraphStyleSuggestionStateOps[Self <: ParagraphStyleSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignmentSuggested(value: Boolean): Self = this.set("alignmentSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignmentSuggested: Self = this.set("alignmentSuggested", js.undefined)
    @scala.inline
    def setAvoidWidowAndOrphanSuggested(value: Boolean): Self = this.set("avoidWidowAndOrphanSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidWidowAndOrphanSuggested: Self = this.set("avoidWidowAndOrphanSuggested", js.undefined)
    @scala.inline
    def setBorderBetweenSuggested(value: Boolean): Self = this.set("borderBetweenSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBetweenSuggested: Self = this.set("borderBetweenSuggested", js.undefined)
    @scala.inline
    def setBorderBottomSuggested(value: Boolean): Self = this.set("borderBottomSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomSuggested: Self = this.set("borderBottomSuggested", js.undefined)
    @scala.inline
    def setBorderLeftSuggested(value: Boolean): Self = this.set("borderLeftSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftSuggested: Self = this.set("borderLeftSuggested", js.undefined)
    @scala.inline
    def setBorderRightSuggested(value: Boolean): Self = this.set("borderRightSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightSuggested: Self = this.set("borderRightSuggested", js.undefined)
    @scala.inline
    def setBorderTopSuggested(value: Boolean): Self = this.set("borderTopSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopSuggested: Self = this.set("borderTopSuggested", js.undefined)
    @scala.inline
    def setDirectionSuggested(value: Boolean): Self = this.set("directionSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionSuggested: Self = this.set("directionSuggested", js.undefined)
    @scala.inline
    def setHeadingIdSuggested(value: Boolean): Self = this.set("headingIdSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadingIdSuggested: Self = this.set("headingIdSuggested", js.undefined)
    @scala.inline
    def setIndentEndSuggested(value: Boolean): Self = this.set("indentEndSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentEndSuggested: Self = this.set("indentEndSuggested", js.undefined)
    @scala.inline
    def setIndentFirstLineSuggested(value: Boolean): Self = this.set("indentFirstLineSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentFirstLineSuggested: Self = this.set("indentFirstLineSuggested", js.undefined)
    @scala.inline
    def setIndentStartSuggested(value: Boolean): Self = this.set("indentStartSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentStartSuggested: Self = this.set("indentStartSuggested", js.undefined)
    @scala.inline
    def setKeepLinesTogetherSuggested(value: Boolean): Self = this.set("keepLinesTogetherSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepLinesTogetherSuggested: Self = this.set("keepLinesTogetherSuggested", js.undefined)
    @scala.inline
    def setKeepWithNextSuggested(value: Boolean): Self = this.set("keepWithNextSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepWithNextSuggested: Self = this.set("keepWithNextSuggested", js.undefined)
    @scala.inline
    def setLineSpacingSuggested(value: Boolean): Self = this.set("lineSpacingSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineSpacingSuggested: Self = this.set("lineSpacingSuggested", js.undefined)
    @scala.inline
    def setNamedStyleTypeSuggested(value: Boolean): Self = this.set("namedStyleTypeSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamedStyleTypeSuggested: Self = this.set("namedStyleTypeSuggested", js.undefined)
    @scala.inline
    def setShadingSuggestionState(value: ShadingSuggestionState): Self = this.set("shadingSuggestionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadingSuggestionState: Self = this.set("shadingSuggestionState", js.undefined)
    @scala.inline
    def setSpaceAboveSuggested(value: Boolean): Self = this.set("spaceAboveSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceAboveSuggested: Self = this.set("spaceAboveSuggested", js.undefined)
    @scala.inline
    def setSpaceBelowSuggested(value: Boolean): Self = this.set("spaceBelowSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceBelowSuggested: Self = this.set("spaceBelowSuggested", js.undefined)
    @scala.inline
    def setSpacingModeSuggested(value: Boolean): Self = this.set("spacingModeSuggested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacingModeSuggested: Self = this.set("spacingModeSuggested", js.undefined)
  }
  
}

