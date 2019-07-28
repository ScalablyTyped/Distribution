package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client column.
  */
trait ASPxClientCardViewColumn extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current column.
    * Value: A string value that specifies the name of a data field.
    */
  var fieldName: String
  /**
    * Gets the column's position within the collection.
    * Value: An integer zero-bazed index that specifies the column's position within the collection.
    */
  var index: Double
  /**
    * Gets the name that uniquely identifies the column.
    * Value: A string value assigned to the column's Name property.
    */
  var name: String
  /**
    * Gets whether the column is visible.
    * Value: true to display the column; otherwise, false.
    */
  var visible: Boolean
}

object ASPxClientCardViewColumn {
  @scala.inline
  def apply(fieldName: String, index: Double, name: String, visible: Boolean): ASPxClientCardViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName, index = index, name = name, visible = visible)
  
    __obj.asInstanceOf[ASPxClientCardViewColumn]
  }
}

