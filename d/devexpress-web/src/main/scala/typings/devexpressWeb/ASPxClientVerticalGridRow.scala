package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client grid row.
  */
trait ASPxClientVerticalGridRow extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current row.
    */
  var fieldName: String
  /**
    * Gets the row's position within the collection.
    */
  var index: Double
  /**
    * Gets the name that uniquely identifies the row.
    */
  var name: String
  /**
    * Gets whether the row is visible.
    */
  var visible: Boolean
}

object ASPxClientVerticalGridRow {
  @scala.inline
  def apply(fieldName: String, index: Double, name: String, visible: Boolean): ASPxClientVerticalGridRow = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientVerticalGridRow]
  }
}

