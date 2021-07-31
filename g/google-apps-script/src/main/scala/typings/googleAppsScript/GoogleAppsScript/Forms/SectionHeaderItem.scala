package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layout item that visually indicates the start of a section. Items can be accessed or created
  * from a Form.
  *
  *     // Open a form by ID and add a new section header.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addSectionHeaderItem();
  *     item.setTitle('Title of new section');
  */
trait SectionHeaderItem extends StObject {
  
  def duplicate(): SectionHeaderItem
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getIndex(): Integer
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def setHelpText(text: String): SectionHeaderItem
  
  def setTitle(title: String): SectionHeaderItem
}
object SectionHeaderItem {
  
  @scala.inline
  def apply(
    duplicate: () => SectionHeaderItem,
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getTitle: () => String,
    getType: () => ItemType,
    setHelpText: String => SectionHeaderItem,
    setTitle: String => SectionHeaderItem
  ): SectionHeaderItem = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction0(duplicate), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[SectionHeaderItem]
  }
  
  @scala.inline
  implicit class SectionHeaderItemMutableBuilder[Self <: SectionHeaderItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuplicate(value: () => SectionHeaderItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetHelpText(value: String => SectionHeaderItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => SectionHeaderItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
  }
}
