package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client grid row.
  */
@JSGlobal("ASPxClientVerticalGridRow")
@js.native
class ASPxClientVerticalGridRow () extends ASPxClientGridColumnBase {
  /**
    * Gets the name of the database field assigned to the current row.
    */
  var fieldName: String = js.native
  /**
    * Gets the row's position within the collection.
    */
  var index: Double = js.native
  /**
    * Gets the name that uniquely identifies the row.
    */
  var name: String = js.native
  /**
    * Gets whether the row is visible.
    */
  var visible: Boolean = js.native
}

