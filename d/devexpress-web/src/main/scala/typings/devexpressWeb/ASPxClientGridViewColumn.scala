package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client grid column.
  */
trait ASPxClientGridViewColumn extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String
  /** @deprecated Use the name property instead. */
  /**
    * Gets the column's unique identifier.
    */
  var id: String
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

object ASPxClientGridViewColumn {
  @scala.inline
  def apply(fieldName: String, id: String, index: Double, name: String, visible: Boolean): ASPxClientGridViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGridViewColumn]
  }
}

