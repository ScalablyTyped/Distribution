package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the table style settings that modify the table appearance.
  */
trait TableLookSettings extends js.Object {
  /**
    * Gets or sets a value specifying whether special formatting is applied to the first column of the table.
    * Value: true, to apply the formatting; otherwise, false.
    */
  var applyFirstColumn: Boolean
  /**
    * Gets or sets a value specifying whether special formatting is applied to the first row of the table.
    * Value: true, to apply the formatting; otherwise, false.
    */
  var applyFirstRow: Boolean
  /**
    * Gets or sets a value specifying whether special formatting is applied to the last column of the table.
    * Value: true, to apply the formatting; otherwise, false.
    */
  var applyLastColumn: Boolean
  /**
    * Gets or sets a value specifying whether special formatting is applied to the last row of the table.
    * Value: true, to apply the formatting; otherwise, false.
    */
  var applyLastRow: Boolean
  /**
    * Gets or sets a value specifying whether column banding formatting is not applied to the table.
    * Value: true, to apply the formatting; otherwise, false.
    */
  var doNotApplyColumnBanding: Boolean
  /**
    * Gets or sets a value specifying whether row banding formatting is not applied to the table.
    * Value: true, to apply the formatting; otherwise, false.
    */
  var doNotApplyRowBanding: Boolean
}

object TableLookSettings {
  @scala.inline
  def apply(
    applyFirstColumn: Boolean,
    applyFirstRow: Boolean,
    applyLastColumn: Boolean,
    applyLastRow: Boolean,
    doNotApplyColumnBanding: Boolean,
    doNotApplyRowBanding: Boolean
  ): TableLookSettings = {
    val __obj = js.Dynamic.literal(applyFirstColumn = applyFirstColumn, applyFirstRow = applyFirstRow, applyLastColumn = applyLastColumn, applyLastRow = applyLastRow, doNotApplyColumnBanding = doNotApplyColumnBanding, doNotApplyRowBanding = doNotApplyRowBanding)
  
    __obj.asInstanceOf[TableLookSettings]
  }
}

