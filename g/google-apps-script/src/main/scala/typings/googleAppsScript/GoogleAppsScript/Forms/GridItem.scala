package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item, presented as a grid of columns and rows, that allows the respondent to select
  * one choice per row from a sequence of radio buttons. Items can be accessed or created from a
  * Form.
  *
  *     // Open a form by ID and add a new grid item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addGridItem();
  *     item.setTitle('Rate your interests')
  *         .setRows(['Cars', 'Computers', 'Celebrities'])
  *         .setColumns(['Boring', 'So-so', 'Interesting']);
  */
@js.native
trait GridItem extends js.Object {
  
  def clearValidation(): GridItem = js.native
  
  def createResponse(responses: js.Array[String]): ItemResponse = js.native
  
  def duplicate(): GridItem = js.native
  
  def getColumns(): js.Array[String] = js.native
  
  def getHelpText(): String = js.native
  
  def getId(): Integer = js.native
  
  def getIndex(): Integer = js.native
  
  def getRows(): js.Array[String] = js.native
  
  def getTitle(): String = js.native
  
  def getType(): ItemType = js.native
  
  def isRequired(): Boolean = js.native
  
  def setColumns(columns: js.Array[String]): GridItem = js.native
  
  def setHelpText(text: String): GridItem = js.native
  
  def setRequired(enabled: Boolean): GridItem = js.native
  
  def setRows(rows: js.Array[String]): GridItem = js.native
  
  def setTitle(title: String): GridItem = js.native
  
  def setValidation(validation: GridValidation): GridItem = js.native
}
object GridItem {
  
  @scala.inline
  def apply(
    clearValidation: () => GridItem,
    createResponse: js.Array[String] => ItemResponse,
    duplicate: () => GridItem,
    getColumns: () => js.Array[String],
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getRows: () => js.Array[String],
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setColumns: js.Array[String] => GridItem,
    setHelpText: String => GridItem,
    setRequired: Boolean => GridItem,
    setRows: js.Array[String] => GridItem,
    setTitle: String => GridItem,
    setValidation: GridValidation => GridItem
  ): GridItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getColumns = js.Any.fromFunction0(getColumns), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getRows = js.Any.fromFunction0(getRows), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setColumns = js.Any.fromFunction1(setColumns), setHelpText = js.Any.fromFunction1(setHelpText), setRequired = js.Any.fromFunction1(setRequired), setRows = js.Any.fromFunction1(setRows), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[GridItem]
  }
  
  @scala.inline
  implicit class GridItemOps[Self <: GridItem] (val x: Self) extends AnyVal {
    
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
    def setClearValidation(value: () => GridItem): Self = this.set("clearValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateResponse(value: js.Array[String] => ItemResponse): Self = this.set("createResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuplicate(value: () => GridItem): Self = this.set("duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColumns(value: () => js.Array[String]): Self = this.set("getColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = this.set("getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = this.set("getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRows(value: () => js.Array[String]): Self = this.set("getRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = this.set("isRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColumns(value: js.Array[String] => GridItem): Self = this.set("setColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => GridItem): Self = this.set("setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequired(value: Boolean => GridItem): Self = this.set("setRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRows(value: js.Array[String] => GridItem): Self = this.set("setRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => GridItem): Self = this.set("setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValidation(value: GridValidation => GridItem): Self = this.set("setValidation", js.Any.fromFunction1(value))
  }
}
