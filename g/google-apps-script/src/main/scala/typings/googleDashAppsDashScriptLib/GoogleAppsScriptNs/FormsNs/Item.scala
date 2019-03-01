package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  def asCheckboxGridItem(): CheckboxGridItem
  def asCheckboxItem(): CheckboxItem
  def asDateItem(): DateItem
  def asDateTimeItem(): DateTimeItem
  def asDurationItem(): DurationItem
  def asGridItem(): GridItem
  def asImageItem(): ImageItem
  def asListItem(): ListItem
  def asMultipleChoiceItem(): MultipleChoiceItem
  def asPageBreakItem(): PageBreakItem
  def asParagraphTextItem(): ParagraphTextItem
  def asScaleItem(): ScaleItem
  def asSectionHeaderItem(): SectionHeaderItem
  def asTextItem(): TextItem
  def asTimeItem(): TimeItem
  def asVideoItem(): VideoItem
  def duplicate(): Item
  def getHelpText(): java.lang.String
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getTitle(): java.lang.String
  def getType(): ItemType
  def setHelpText(text: java.lang.String): Item
  def setTitle(title: java.lang.String): Item
}

object Item {
  @scala.inline
  def apply(
    asCheckboxGridItem: js.Function0[CheckboxGridItem],
    asCheckboxItem: js.Function0[CheckboxItem],
    asDateItem: js.Function0[DateItem],
    asDateTimeItem: js.Function0[DateTimeItem],
    asDurationItem: js.Function0[DurationItem],
    asGridItem: js.Function0[GridItem],
    asImageItem: js.Function0[ImageItem],
    asListItem: js.Function0[ListItem],
    asMultipleChoiceItem: js.Function0[MultipleChoiceItem],
    asPageBreakItem: js.Function0[PageBreakItem],
    asParagraphTextItem: js.Function0[ParagraphTextItem],
    asScaleItem: js.Function0[ScaleItem],
    asSectionHeaderItem: js.Function0[SectionHeaderItem],
    asTextItem: js.Function0[TextItem],
    asTimeItem: js.Function0[TimeItem],
    asVideoItem: js.Function0[VideoItem],
    duplicate: js.Function0[Item],
    getHelpText: js.Function0[java.lang.String],
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getTitle: js.Function0[java.lang.String],
    getType: js.Function0[ItemType],
    setHelpText: js.Function1[java.lang.String, Item],
    setTitle: js.Function1[java.lang.String, Item]
  ): Item = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asCheckboxGridItem")(asCheckboxGridItem)
    __obj.updateDynamic("asCheckboxItem")(asCheckboxItem)
    __obj.updateDynamic("asDateItem")(asDateItem)
    __obj.updateDynamic("asDateTimeItem")(asDateTimeItem)
    __obj.updateDynamic("asDurationItem")(asDurationItem)
    __obj.updateDynamic("asGridItem")(asGridItem)
    __obj.updateDynamic("asImageItem")(asImageItem)
    __obj.updateDynamic("asListItem")(asListItem)
    __obj.updateDynamic("asMultipleChoiceItem")(asMultipleChoiceItem)
    __obj.updateDynamic("asPageBreakItem")(asPageBreakItem)
    __obj.updateDynamic("asParagraphTextItem")(asParagraphTextItem)
    __obj.updateDynamic("asScaleItem")(asScaleItem)
    __obj.updateDynamic("asSectionHeaderItem")(asSectionHeaderItem)
    __obj.updateDynamic("asTextItem")(asTextItem)
    __obj.updateDynamic("asTimeItem")(asTimeItem)
    __obj.updateDynamic("asVideoItem")(asVideoItem)
    __obj.updateDynamic("duplicate")(duplicate)
    __obj.updateDynamic("getHelpText")(getHelpText)
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setHelpText")(setHelpText)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[Item]
  }
}

