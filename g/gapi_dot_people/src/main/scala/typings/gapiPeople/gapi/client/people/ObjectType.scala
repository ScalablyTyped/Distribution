package typings.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gapiPeople.gapiPeopleStrings.OBJECT_TYPE_UNSPECIFIED
  - typings.gapiPeople.gapiPeopleStrings.PERSON
  - typings.gapiPeople.gapiPeopleStrings.PAGE
*/
trait ObjectType extends js.Object

object ObjectType {
  @scala.inline
  def OBJECT_TYPE_UNSPECIFIED: typings.gapiPeople.gapiPeopleStrings.OBJECT_TYPE_UNSPECIFIED = this.cast("OBJECT_TYPE_UNSPECIFIED")
  @scala.inline
  def PAGE: typings.gapiPeople.gapiPeopleStrings.PAGE = this.cast("PAGE")
  @scala.inline
  def PERSON: typings.gapiPeople.gapiPeopleStrings.PERSON = this.cast("PERSON")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

