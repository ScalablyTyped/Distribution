package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContactPhotoRequest extends js.Object {
  /**
    * Optional. A field mask to restrict which fields on the person are returned. Multiple
    * fields can be specified by separating them with commas. Defaults to empty
    * if not set, which will skip the post mutate get. Valid values are:
    *
    * &#42; addresses
    * &#42; ageRanges
    * &#42; biographies
    * &#42; birthdays
    * &#42; braggingRights
    * &#42; coverPhotos
    * &#42; emailAddresses
    * &#42; events
    * &#42; genders
    * &#42; imClients
    * &#42; interests
    * &#42; locales
    * &#42; memberships
    * &#42; metadata
    * &#42; names
    * &#42; nicknames
    * &#42; occupations
    * &#42; organizations
    * &#42; phoneNumbers
    * &#42; photos
    * &#42; relations
    * &#42; relationshipInterests
    * &#42; relationshipStatuses
    * &#42; residences
    * &#42; sipAddresses
    * &#42; skills
    * &#42; taglines
    * &#42; urls
    * &#42; userDefined
    */
  var personFields: js.UndefOr[String] = js.undefined
  /** Required. Raw photo bytes */
  var photoBytes: js.UndefOr[String] = js.undefined
}

object UpdateContactPhotoRequest {
  @scala.inline
  def apply(personFields: String = null, photoBytes: String = null): UpdateContactPhotoRequest = {
    val __obj = js.Dynamic.literal()
    if (personFields != null) __obj.updateDynamic("personFields")(personFields.asInstanceOf[js.Any])
    if (photoBytes != null) __obj.updateDynamic("photoBytes")(photoBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactPhotoRequest]
  }
}

