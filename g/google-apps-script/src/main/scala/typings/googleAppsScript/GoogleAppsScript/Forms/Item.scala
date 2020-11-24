package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait Item extends js.Object {
  
  def asCheckboxGridItem(): CheckboxGridItem = js.native
  
  def asCheckboxItem(): CheckboxItem = js.native
  
  def asDateItem(): DateItem = js.native
  
  def asDateTimeItem(): DateTimeItem = js.native
  
  def asDurationItem(): DurationItem = js.native
  
  def asGridItem(): GridItem = js.native
  
  def asImageItem(): ImageItem = js.native
  
  def asListItem(): ListItem = js.native
  
  def asMultipleChoiceItem(): MultipleChoiceItem = js.native
  
  def asPageBreakItem(): PageBreakItem = js.native
  
  def asParagraphTextItem(): ParagraphTextItem = js.native
  
  def asScaleItem(): ScaleItem = js.native
  
  def asSectionHeaderItem(): SectionHeaderItem = js.native
  
  def asTextItem(): TextItem = js.native
  
  def asTimeItem(): TimeItem = js.native
  
  def asVideoItem(): VideoItem = js.native
  
  def duplicate(): Item = js.native
  
  def getHelpText(): String = js.native
  
  def getId(): Integer = js.native
  
  def getIndex(): Integer = js.native
  
  def getTitle(): String = js.native
  
  def getType(): ItemType = js.native
  
  def setHelpText(text: String): Item = js.native
  
  def setTitle(title: String): Item = js.native
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
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
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
    def setAsCheckboxGridItem(value: () => CheckboxGridItem): Self = this.set("asCheckboxGridItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsCheckboxItem(value: () => CheckboxItem): Self = this.set("asCheckboxItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsDateItem(value: () => DateItem): Self = this.set("asDateItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsDateTimeItem(value: () => DateTimeItem): Self = this.set("asDateTimeItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsDurationItem(value: () => DurationItem): Self = this.set("asDurationItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsGridItem(value: () => GridItem): Self = this.set("asGridItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsImageItem(value: () => ImageItem): Self = this.set("asImageItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsListItem(value: () => ListItem): Self = this.set("asListItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsMultipleChoiceItem(value: () => MultipleChoiceItem): Self = this.set("asMultipleChoiceItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsPageBreakItem(value: () => PageBreakItem): Self = this.set("asPageBreakItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsParagraphTextItem(value: () => ParagraphTextItem): Self = this.set("asParagraphTextItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsScaleItem(value: () => ScaleItem): Self = this.set("asScaleItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsSectionHeaderItem(value: () => SectionHeaderItem): Self = this.set("asSectionHeaderItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsTextItem(value: () => TextItem): Self = this.set("asTextItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsTimeItem(value: () => TimeItem): Self = this.set("asTimeItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsVideoItem(value: () => VideoItem): Self = this.set("asVideoItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDuplicate(value: () => Item): Self = this.set("duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = this.set("getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHelpText(value: String => Item): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => Item): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
}
