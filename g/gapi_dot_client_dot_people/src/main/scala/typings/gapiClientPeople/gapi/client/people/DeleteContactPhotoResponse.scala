package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteContactPhotoResponse extends js.Object {
  /**
    * The updated person, if person_fields is set in the
    * DeleteContactPhotoRequest; otherwise this will be unset.
    */
  var person: js.UndefOr[Person] = js.native
}

object DeleteContactPhotoResponse {
  @scala.inline
  def apply(): DeleteContactPhotoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteContactPhotoResponse]
  }
  @scala.inline
  implicit class DeleteContactPhotoResponseOps[Self <: DeleteContactPhotoResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPerson(value: Person): Self = this.set("person", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerson: Self = this.set("person", js.undefined)
  }
  
}

