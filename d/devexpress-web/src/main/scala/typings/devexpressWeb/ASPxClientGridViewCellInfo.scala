package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information on a grid cell.
  */
@JSGlobal("ASPxClientGridViewCellInfo")
@js.native
class ASPxClientGridViewCellInfo () extends js.Object {
  /**
    * Gets the data column that contains the cell currently being processed.
    */
  var column: ASPxClientGridViewColumn = js.native
  /**
    * Gets the row's key.
    */
  var key: js.Any = js.native
  /**
    * Gets the visible index of the row that contains the cell currently being processed.
    */
  var rowVisibleIndex: Double = js.native
}

