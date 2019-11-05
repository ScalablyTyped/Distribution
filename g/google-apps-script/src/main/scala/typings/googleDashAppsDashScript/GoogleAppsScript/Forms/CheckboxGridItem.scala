package typings.googleDashAppsDashScript.GoogleAppsScript.Forms

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait CheckboxGridItem extends js.Object {
  def clearValidation(): CheckboxGridItem
  def createResponse(responses: js.Array[js.Array[String]]): ItemResponse
  def duplicate(): CheckboxGridItem
  def getColumns(): js.Array[String]
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getRows(): js.Array[String]
  def getTitle(): String
  def getType(): ItemType
  def isRequired(): Boolean
  def setColumns(columns: js.Array[String]): CheckboxGridItem
  def setHelpText(text: String): CheckboxGridItem
  def setRequired(enabled: Boolean): CheckboxGridItem
  def setRows(rows: js.Array[String]): CheckboxGridItem
  def setTitle(title: String): CheckboxGridItem
  def setValidation(validation: CheckboxGridValidation): CheckboxGridItem
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
}

