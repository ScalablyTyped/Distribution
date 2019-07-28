package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client grid row.
  */
trait ASPxClientVerticalGridRow extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current row.
    * Value: A string value that specifies the name of a data field.
    */
  var fieldName: String
  /**
    * Gets the row's position within the collection.
    * Value: An integer zero-bazed index that specifies the row's position within the collection.
    */
  var index: Double
  /**
    * Gets the name that uniquely identifies the row.
    * Value: A string value assigned to the row's Name property.
    */
  var name: String
  /**
    * Gets whether the row is visible.
    * Value: true, to display the row; otherwise, false.
    */
  var visible: Boolean
}

object ASPxClientVerticalGridRow {
  @scala.inline
  def apply(fieldName: String, index: Double, name: String, visible: Boolean): ASPxClientVerticalGridRow = {
    val __obj = js.Dynamic.literal(fieldName = fieldName, index = index, name = name, visible = visible)
  
    __obj.asInstanceOf[ASPxClientVerticalGridRow]
  }
}

