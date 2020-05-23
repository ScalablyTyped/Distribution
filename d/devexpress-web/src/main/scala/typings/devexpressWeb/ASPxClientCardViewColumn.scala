package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client column.
  */
trait ASPxClientCardViewColumn extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String
  /**
    * Gets the column's position within the collection.
    */
  var index: Double
  /**
    * Gets the name that uniquely identifies the column.
    */
  var name: String
  /**
    * Gets whether the column is visible.
    */
  var visible: Boolean
}

object ASPxClientCardViewColumn {
  @scala.inline
  def apply(fieldName: String, index: Double, name: String, visible: Boolean): ASPxClientCardViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewColumn]
  }
}

