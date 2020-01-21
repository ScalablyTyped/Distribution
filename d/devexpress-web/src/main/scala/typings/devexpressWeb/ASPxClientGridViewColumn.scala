package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client grid column.
  */
@JSGlobal("ASPxClientGridViewColumn")
@js.native
class ASPxClientGridViewColumn () extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current column.
    */
  var fieldName: String = js.native
  /** @deprecated Use the name property instead. */
  /**
    * Gets the column's unique identifier.
    */
  var id: String = js.native
  /**
    * Gets the column's position within the collection.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the column.
    */
  var name: String = js.native
  /**
    * Gets whether the column is visible.
    */
  var visible: Boolean = js.native
}

