package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gapiDotPeople.gapiDotPeopleStrings.OBJECT_TYPE_UNSPECIFIED
  - typings.gapiDotPeople.gapiDotPeopleStrings.PERSON
  - typings.gapiDotPeople.gapiDotPeopleStrings.PAGE
*/
trait ObjectType extends js.Object

object ObjectType {
  @scala.inline
  def OBJECT_TYPE_UNSPECIFIED: typings.gapiDotPeople.gapiDotPeopleStrings.OBJECT_TYPE_UNSPECIFIED = this.cast("OBJECT_TYPE_UNSPECIFIED")
  @scala.inline
  def PAGE: typings.gapiDotPeople.gapiDotPeopleStrings.PAGE = this.cast("PAGE")
  @scala.inline
  def PERSON: typings.gapiDotPeople.gapiDotPeopleStrings.PERSON = this.cast("PERSON")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

