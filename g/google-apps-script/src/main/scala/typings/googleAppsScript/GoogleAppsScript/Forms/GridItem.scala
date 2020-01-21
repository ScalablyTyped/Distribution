package typings.googleAppsScript.GoogleAppsScript.Forms

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait GridItem extends js.Object {
  def clearValidation(): GridItem
  def createResponse(responses: js.Array[String]): ItemResponse
  def duplicate(): GridItem
  def getColumns(): js.Array[String]
  def getHelpText(): String
  def getId(): Integer
  def getIndex(): Integer
  def getRows(): js.Array[String]
  def getTitle(): String
  def getType(): ItemType
  def isRequired(): Boolean
  def setColumns(columns: js.Array[String]): GridItem
  def setHelpText(text: String): GridItem
  def setRequired(enabled: Boolean): GridItem
  def setRows(rows: js.Array[String]): GridItem
  def setTitle(title: String): GridItem
  def setValidation(validation: GridValidation): GridItem
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
}

