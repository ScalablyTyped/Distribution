package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait Item extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Item](x: Self) {
    
    inline def setAsCheckboxGridItem(value: () => CheckboxGridItem): Self = StObject.set(x, "asCheckboxGridItem", js.Any.fromFunction0(value))
    
    inline def setAsCheckboxItem(value: () => CheckboxItem): Self = StObject.set(x, "asCheckboxItem", js.Any.fromFunction0(value))
    
    inline def setAsDateItem(value: () => DateItem): Self = StObject.set(x, "asDateItem", js.Any.fromFunction0(value))
    
    inline def setAsDateTimeItem(value: () => DateTimeItem): Self = StObject.set(x, "asDateTimeItem", js.Any.fromFunction0(value))
    
    inline def setAsDurationItem(value: () => DurationItem): Self = StObject.set(x, "asDurationItem", js.Any.fromFunction0(value))
    
    inline def setAsGridItem(value: () => GridItem): Self = StObject.set(x, "asGridItem", js.Any.fromFunction0(value))
    
    inline def setAsImageItem(value: () => ImageItem): Self = StObject.set(x, "asImageItem", js.Any.fromFunction0(value))
    
    inline def setAsListItem(value: () => ListItem): Self = StObject.set(x, "asListItem", js.Any.fromFunction0(value))
    
    inline def setAsMultipleChoiceItem(value: () => MultipleChoiceItem): Self = StObject.set(x, "asMultipleChoiceItem", js.Any.fromFunction0(value))
    
    inline def setAsPageBreakItem(value: () => PageBreakItem): Self = StObject.set(x, "asPageBreakItem", js.Any.fromFunction0(value))
    
    inline def setAsParagraphTextItem(value: () => ParagraphTextItem): Self = StObject.set(x, "asParagraphTextItem", js.Any.fromFunction0(value))
    
    inline def setAsScaleItem(value: () => ScaleItem): Self = StObject.set(x, "asScaleItem", js.Any.fromFunction0(value))
    
    inline def setAsSectionHeaderItem(value: () => SectionHeaderItem): Self = StObject.set(x, "asSectionHeaderItem", js.Any.fromFunction0(value))
    
    inline def setAsTextItem(value: () => TextItem): Self = StObject.set(x, "asTextItem", js.Any.fromFunction0(value))
    
    inline def setAsTimeItem(value: () => TimeItem): Self = StObject.set(x, "asTimeItem", js.Any.fromFunction0(value))
    
    inline def setAsVideoItem(value: () => VideoItem): Self = StObject.set(x, "asVideoItem", js.Any.fromFunction0(value))
    
    inline def setDuplicate(value: () => Item): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    inline def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setSetHelpText(value: String => Item): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => Item): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
