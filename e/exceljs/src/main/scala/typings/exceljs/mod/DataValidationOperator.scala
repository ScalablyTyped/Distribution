package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.exceljs.exceljsStrings.between
  - typings.exceljs.exceljsStrings.notBetween
  - typings.exceljs.exceljsStrings.equal
  - typings.exceljs.exceljsStrings.notEqual
  - typings.exceljs.exceljsStrings.greaterThan
  - typings.exceljs.exceljsStrings.lessThan
  - typings.exceljs.exceljsStrings.greaterThanOrEqual
  - typings.exceljs.exceljsStrings.lessThanOrEqual
*/
trait DataValidationOperator extends js.Object

object DataValidationOperator {
  @scala.inline
  def between: typings.exceljs.exceljsStrings.between = this.cast("between")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def equal: typings.exceljs.exceljsStrings.equal = this.cast("equal")
  @scala.inline
  def greaterThan: typings.exceljs.exceljsStrings.greaterThan = this.cast("greaterThan")
  @scala.inline
  def greaterThanOrEqual: typings.exceljs.exceljsStrings.greaterThanOrEqual = this.cast("greaterThanOrEqual")
  @scala.inline
  def lessThan: typings.exceljs.exceljsStrings.lessThan = this.cast("lessThan")
  @scala.inline
  def lessThanOrEqual: typings.exceljs.exceljsStrings.lessThanOrEqual = this.cast("lessThanOrEqual")
  @scala.inline
  def notBetween: typings.exceljs.exceljsStrings.notBetween = this.cast("notBetween")
  @scala.inline
  def notEqual: typings.exceljs.exceljsStrings.notEqual = this.cast("notEqual")
}

