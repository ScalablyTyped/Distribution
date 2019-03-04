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
    val __obj = js.Dynamic.literal(asCheckboxGridItem = asCheckboxGridItem, asCheckboxItem = asCheckboxItem, asDateItem = asDateItem, asDateTimeItem = asDateTimeItem, asDurationItem = asDurationItem, asGridItem = asGridItem, asImageItem = asImageItem, asListItem = asListItem, asMultipleChoiceItem = asMultipleChoiceItem, asPageBreakItem = asPageBreakItem, asParagraphTextItem = asParagraphTextItem, asScaleItem = asScaleItem, asSectionHeaderItem = asSectionHeaderItem, asTextItem = asTextItem, asTimeItem = asTimeItem, asVideoItem = asVideoItem, duplicate = duplicate, getHelpText = getHelpText, getId = getId, getIndex = getIndex, getTitle = getTitle, getType = getType, setHelpText = setHelpText, setTitle = setTitle)
  
    __obj.asInstanceOf[Item]
  }
}

