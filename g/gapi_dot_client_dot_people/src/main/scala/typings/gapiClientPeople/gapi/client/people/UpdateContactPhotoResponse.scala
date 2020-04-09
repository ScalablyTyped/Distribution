package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContactPhotoResponse extends js.Object {
  /**
    * The updated person, if person_fields is set in the
    * UpdateContactPhotoRequest; otherwise this will be unset.
    */
  var person: js.UndefOr[Person] = js.undefined
}

object UpdateContactPhotoResponse {
  @scala.inline
  def apply(person: Person = null): UpdateContactPhotoResponse = {
    val __obj = js.Dynamic.literal()
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactPhotoResponse]
  }
}

