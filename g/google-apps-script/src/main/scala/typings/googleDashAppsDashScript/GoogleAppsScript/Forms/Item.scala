package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic form item that contains properties common to all items, such as title and help text.
  * Items can be accessed or created from a Form.
  *
  * To operate on type-specific properties, use getType() to check the item's ItemType, then cast the item to the
  * appropriate class using a method like asCheckboxItem().
  *
  *     // Create a new form and add a text item.
  *     var form = FormApp.create('Form Name');
  *     form.addTextItem();
  *
  *     // Access the text item as a generic item.
  *     var items = form.getItems();
  *     var item = items[0];
  *
  *     // Cast the generic item to the text-item class.
  *     if (item.getType() == 'TEXT') {
  *       var textItem = item.asTextItem();
  *       textItem.setRequired(false);
  *     }
  *
  * Implementing classes
  *
  * NameBrief description
  */
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
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getTitle(): String
  def getType(): ItemType
  def setHelpText(text: String): Item
  def setTitle(title: String): Item
}

object Item {
  @scala.inline
  def apply(
    asCheckboxGridItem: () => CheckboxGridItem,
    asCheckboxItem: () => CheckboxItem,
    asDateItem: () => DateItem,
    asDateTimeItem: () => DateTimeItem,
    asDurationItem: () => DurationItem,
    asGridItem: () => GridItem,
    asImageItem: () => ImageItem,
    asListItem: () => ListItem,
    asMultipleChoiceItem: () => MultipleChoiceItem,
    asPageBreakItem: () => PageBreakItem,
    asParagraphTextItem: () => ParagraphTextItem,
    asScaleItem: () => ScaleItem,
    asSectionHeaderItem: () => SectionHeaderItem,
    asTextItem: () => TextItem,
    asTimeItem: () => TimeItem,
    asVideoItem: () => VideoItem,
    duplicate: () => Item,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    setHelpText: String => Item,
    setTitle: String => Item
  ): Item = {
    val __obj = js.Dynamic.literal(asCheckboxGridItem = js.Any.fromFunction0(asCheckboxGridItem), asCheckboxItem = js.Any.fromFunction0(asCheckboxItem), asDateItem = js.Any.fromFunction0(asDateItem), asDateTimeItem = js.Any.fromFunction0(asDateTimeItem), asDurationItem = js.Any.fromFunction0(asDurationItem), asGridItem = js.Any.fromFunction0(asGridItem), asImageItem = js.Any.fromFunction0(asImageItem), asListItem = js.Any.fromFunction0(asListItem), asMultipleChoiceItem = js.Any.fromFunction0(asMultipleChoiceItem), asPageBreakItem = js.Any.fromFunction0(asPageBreakItem), asParagraphTextItem = js.Any.fromFunction0(asParagraphTextItem), asScaleItem = js.Any.fromFunction0(asScaleItem), asSectionHeaderItem = js.Any.fromFunction0(asSectionHeaderItem), asTextItem = js.Any.fromFunction0(asTextItem), asTimeItem = js.Any.fromFunction0(asTimeItem), asVideoItem = js.Any.fromFunction0(asVideoItem), duplicate = js.Any.fromFunction0(duplicate), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[Item]
  }
}

