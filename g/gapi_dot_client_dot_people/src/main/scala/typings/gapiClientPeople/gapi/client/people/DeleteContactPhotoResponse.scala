package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteContactPhotoResponse extends js.Object {
  /**
    * The updated person, if person_fields is set in the
    * DeleteContactPhotoRequest; otherwise this will be unset.
    */
  var person: js.UndefOr[Person] = js.undefined
}

object DeleteContactPhotoResponse {
  @scala.inline
  def apply(person: Person = null): DeleteContactPhotoResponse = {
    val __obj = js.Dynamic.literal()
    if (person != null) __obj.updateDynamic("person")(person.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactPhotoResponse]
  }
}

