package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client grid column.
  */
trait ASPxClientGridViewColumn extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current column.
    * Value: A string value that specifies the name of a data field.
    */
  var fieldName: java.lang.String
  /**
    * Gets the column's unique identifier.
    * Value: A string value that specifies the column's unique identifier.
    */
  var id: java.lang.String
  /**
    * Gets the column's position within the collection.
    * Value: An integer zero-bazed index that specifies the column's position within the collection.
    */
  var index: scala.Double
  /**
    * Gets the name that uniquely identifies the column.
    * Value: A string value assigned to the column's Name property.
    */
  var name: java.lang.String
  /**
    * Gets whether the column is visible.
    * Value: true to display the column; otherwise, false.
    */
  var visible: scala.Boolean
}

object ASPxClientGridViewColumn {
  @scala.inline
  def apply(
    fieldName: java.lang.String,
    id: java.lang.String,
    index: scala.Double,
    name: java.lang.String,
    visible: scala.Boolean
  ): ASPxClientGridViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName, id = id, index = index, name = name, visible = visible)
  
    __obj.asInstanceOf[ASPxClientGridViewColumn]
  }
}

