package typings.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gapiPeople.gapiPeopleStrings.SOURCE_TYPE_UNSPECIFIED
  - typings.gapiPeople.gapiPeopleStrings.ACCOUNT
  - typings.gapiPeople.gapiPeopleStrings.PROFILE
  - typings.gapiPeople.gapiPeopleStrings.DOMAIN_PROFILE
  - typings.gapiPeople.gapiPeopleStrings.CONTACT
*/
trait SourceType extends js.Object

object SourceType {
  @scala.inline
  def ACCOUNT: typings.gapiPeople.gapiPeopleStrings.ACCOUNT = this.cast("ACCOUNT")
  @scala.inline
  def CONTACT: typings.gapiPeople.gapiPeopleStrings.CONTACT = this.cast("CONTACT")
  @scala.inline
  def DOMAIN_PROFILE: typings.gapiPeople.gapiPeopleStrings.DOMAIN_PROFILE = this.cast("DOMAIN_PROFILE")
  @scala.inline
  def PROFILE: typings.gapiPeople.gapiPeopleStrings.PROFILE = this.cast("PROFILE")
  @scala.inline
  def SOURCE_TYPE_UNSPECIFIED: typings.gapiPeople.gapiPeopleStrings.SOURCE_TYPE_UNSPECIFIED = this.cast("SOURCE_TYPE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

