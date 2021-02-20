package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A question item, presented as a grid of columns and rows, that allows the respondent to select
  * multiple choices per row from a sequence of checkboxes. Items can be accessed or created from a
  * Form.
  *
  *     // Open a form by ID and add a new checkgox grid item.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var item = form.addCheckboxGridItem();
  *     item.setTitle('Where did you celebrate New Years?')
  *       .setRows(['New York', 'San Francisco', 'London'])
  *       .setColumns(['2014', '2015', '2016', '2017']);
  */
@js.native
trait CheckboxGridItem extends StObject {
  
  def clearValidation(): CheckboxGridItem = js.native
  
  def createResponse(responses: js.Array[js.Array[String]]): ItemResponse = js.native
  
  def duplicate(): CheckboxGridItem = js.native
  
  def getColumns(): js.Array[String] = js.native
  
  def getHelpText(): String = js.native
  
  def getId(): Integer = js.native
  
  def getIndex(): Integer = js.native
  
  def getRows(): js.Array[String] = js.native
  
  def getTitle(): String = js.native
  
  def getType(): ItemType = js.native
  
  def isRequired(): Boolean = js.native
  
  def setColumns(columns: js.Array[String]): CheckboxGridItem = js.native
  
  def setHelpText(text: String): CheckboxGridItem = js.native
  
  def setRequired(enabled: Boolean): CheckboxGridItem = js.native
  
  def setRows(rows: js.Array[String]): CheckboxGridItem = js.native
  
  def setTitle(title: String): CheckboxGridItem = js.native
  
  def setValidation(validation: CheckboxGridValidation): CheckboxGridItem = js.native
}
object CheckboxGridItem {
  
  @scala.inline
  def apply(
    clearValidation: () => CheckboxGridItem,
    createResponse: js.Array[js.Array[String]] => ItemResponse,
    duplicate: () => CheckboxGridItem,
    getColumns: () => js.Array[String],
    getHelpText: () => String,
    getId: () => Integer,
    getIndex: () => Integer,
    getRows: () => js.Array[String],
    getTitle: () => String,
    getType: () => ItemType,
    isRequired: () => Boolean,
    setColumns: js.Array[String] => CheckboxGridItem,
    setHelpText: String => CheckboxGridItem,
    setRequired: Boolean => CheckboxGridItem,
    setRows: js.Array[String] => CheckboxGridItem,
    setTitle: String => CheckboxGridItem,
    setValidation: CheckboxGridValidation => CheckboxGridItem
  ): CheckboxGridItem = {
    val __obj = js.Dynamic.literal(clearValidation = js.Any.fromFunction0(clearValidation), createResponse = js.Any.fromFunction1(createResponse), duplicate = js.Any.fromFunction0(duplicate), getColumns = js.Any.fromFunction0(getColumns), getHelpText = js.Any.fromFunction0(getHelpText), getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getRows = js.Any.fromFunction0(getRows), getTitle = js.Any.fromFunction0(getTitle), getType = js.Any.fromFunction0(getType), isRequired = js.Any.fromFunction0(isRequired), setColumns = js.Any.fromFunction1(setColumns), setHelpText = js.Any.fromFunction1(setHelpText), setRequired = js.Any.fromFunction1(setRequired), setRows = js.Any.fromFunction1(setRows), setTitle = js.Any.fromFunction1(setTitle), setValidation = js.Any.fromFunction1(setValidation))
    __obj.asInstanceOf[CheckboxGridItem]
  }
  
  @scala.inline
  implicit class CheckboxGridItemMutableBuilder[Self <: CheckboxGridItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearValidation(value: () => CheckboxGridItem): Self = StObject.set(x, "clearValidation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateResponse(value: js.Array[js.Array[String]] => ItemResponse): Self = StObject.set(x, "createResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuplicate(value: () => CheckboxGridItem): Self = StObject.set(x, "duplicate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetColumns(value: () => js.Array[String]): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHelpText(value: () => String): Self = StObject.set(x, "getHelpText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Integer): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Integer): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRows(value: () => js.Array[String]): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => ItemType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsRequired(value: () => Boolean): Self = StObject.set(x, "isRequired", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetColumns(value: js.Array[String] => CheckboxGridItem): Self = StObject.set(x, "setColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => CheckboxGridItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRequired(value: Boolean => CheckboxGridItem): Self = StObject.set(x, "setRequired", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRows(value: js.Array[String] => CheckboxGridItem): Self = StObject.set(x, "setRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitle(value: String => CheckboxGridItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValidation(value: CheckboxGridValidation => CheckboxGridItem): Self = StObject.set(x, "setValidation", js.Any.fromFunction1(value))
  }
}
