package typings.emberController.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line strict-export-declare-modifiers
/* Rewritten from type alias, can be one of: 
  - typings.emberController.emberControllerStrings.boolean
  - typings.emberController.emberControllerStrings.number
  - typings.emberController.emberControllerStrings.array
  - typings.emberController.emberControllerStrings.string
*/
trait QueryParamTypes extends js.Object

object QueryParamTypes {
  @scala.inline
  def array: typings.emberController.emberControllerStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.emberController.emberControllerStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def number: typings.emberController.emberControllerStrings.number = this.cast("number")
  @scala.inline
  def string: typings.emberController.emberControllerStrings.string = this.cast("string")
}

