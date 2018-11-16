package typings
package devexpressDashWebLib

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
  var applyFirstColumn: scala.Boolean
  /**
       * Gets or sets a value specifying whether special formatting is applied to the first row of the table.
       * Value: true, to apply the formatting; otherwise, false.
       */
  var applyFirstRow: scala.Boolean
  /**
       * Gets or sets a value specifying whether special formatting is applied to the last column of the table.
       * Value: true, to apply the formatting; otherwise, false.
       */
  var applyLastColumn: scala.Boolean
  /**
       * Gets or sets a value specifying whether special formatting is applied to the last row of the table.
       * Value: true, to apply the formatting; otherwise, false.
       */
  var applyLastRow: scala.Boolean
  /**
       * Gets or sets a value specifying whether column banding formatting is not applied to the table.
       * Value: true, to apply the formatting; otherwise, false.
       */
  var doNotApplyColumnBanding: scala.Boolean
  /**
       * Gets or sets a value specifying whether row banding formatting is not applied to the table.
       * Value: true, to apply the formatting; otherwise, false.
       */
  var doNotApplyRowBanding: scala.Boolean
}

