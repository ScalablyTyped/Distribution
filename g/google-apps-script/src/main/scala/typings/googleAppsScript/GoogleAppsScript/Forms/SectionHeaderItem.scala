package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SectionHeaderItem extends js.Object {
  
  def duplicate(): SectionHeaderItem = js.native
  
  def getHelpText(): String = js.native
  
  def getId(): Integer = js.native
  
  def getIndex(): Integer = js.native
  
  def getTitle(): String = js.native
  
  def getType(): ItemType = js.native
  
  def setHelpText(text: String): SectionHeaderItem = js.native
  
  def setTitle(title: String): SectionHeaderItem = js.native
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
  implicit class SectionHeaderItemOps[Self <: SectionHeaderItem] (val x: Self) extends AnyVal {
    
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
    def setDuplicate(value: () => SectionHeaderItem): Self = this.set("duplicate", js.Any.fromFunction0(value))
    
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
    def setSetHelpText(value: String => SectionHeaderItem): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => SectionHeaderItem): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
}
