package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the table style settings that modify the table appearance.
  */
@JSGlobal("TableLookSettings")
@js.native
class TableLookSettings () extends js.Object {
  /**
    * Specifies whether special formatting is applied to the first column of the table.
    */
  var applyFirstColumn: Boolean = js.native
  /**
    * Specifies whether special formatting is applied to the first row of the table.
    */
  var applyFirstRow: Boolean = js.native
  /**
    * Specifies whether special formatting is applied to the last column of the table.
    */
  var applyLastColumn: Boolean = js.native
  /**
    * Specifies whether special formatting is applied to the last row of the table.
    */
  var applyLastRow: Boolean = js.native
  /**
    * Specifies whether column banding formatting is not applied to the table.
    */
  var doNotApplyColumnBanding: Boolean = js.native
  /**
    * Specifies whether row banding formatting is not applied to the table.
    */
  var doNotApplyRowBanding: Boolean = js.native
}

