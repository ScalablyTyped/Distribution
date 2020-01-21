package typings.firebaseFirestore.utilInputValidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreStrings.undefined
  - typings.firebaseFirestore.firebaseFirestoreStrings.`object`
  - typings.firebaseFirestore.firebaseFirestoreStrings.function
  - typings.firebaseFirestore.firebaseFirestoreStrings.boolean
  - typings.firebaseFirestore.firebaseFirestoreStrings.number
  - typings.firebaseFirestore.firebaseFirestoreStrings.string
  - typings.firebaseFirestore.firebaseFirestoreStrings.`non-empty string`
*/
trait ValidationType extends js.Object

object ValidationType {
  @scala.inline
  def boolean: typings.firebaseFirestore.firebaseFirestoreStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def function: typings.firebaseFirestore.firebaseFirestoreStrings.function = this.cast("function")
  @scala.inline
  def `non-empty string`: typings.firebaseFirestore.firebaseFirestoreStrings.`non-empty string` = this.cast("non-empty string")
  @scala.inline
  def number: typings.firebaseFirestore.firebaseFirestoreStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.firebaseFirestore.firebaseFirestoreStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.firebaseFirestore.firebaseFirestoreStrings.string = this.cast("string")
  @scala.inline
  def undefined: typings.firebaseFirestore.firebaseFirestoreStrings.undefined = this.cast("undefined")
}

