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

