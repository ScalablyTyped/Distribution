package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPeople.anon.Alt
import typings.gapiClientPeople.anon.Key
import typings.gapiClientPeople.anon.PersonFields
import typings.gapiClientPeople.anon.QuotaUser
import typings.gapiClientPeople.anon.RequestMaskincludeField
import typings.gapiClientPeople.anon.Resource
import typings.gapiClientPeople.anon.ResourceName
import typings.gapiClientPeople.anon.ResourceNames
import typings.gapiClientPeople.anon.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeopleResource extends js.Object {
  var connections: ConnectionsResource = js.native
  def createContact(request: Key, body: Person): Request[Person] = js.native
  /** Create a new contact and return the person resource for that contact. */
  def createContact(request: QuotaUser): Request[Person] = js.native
  /** Delete a contact person. Any non-contact data will not be deleted. */
  def deleteContact(): Request[js.Object] = js.native
  def deleteContact(request: Alt): Request[js.Object] = js.native
  /** Delete a contact's photo. */
  def deleteContactPhoto(): Request[DeleteContactPhotoResponse] = js.native
  def deleteContactPhoto(request: PersonFields): Request[DeleteContactPhotoResponse] = js.native
  /**
    * Provides information about a person by specifying a resource name. Use
    * `people/me` to indicate the authenticated user.
    *
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def get(): Request[Person] = js.native
  def get(request: RequestMaskincludeField): Request[Person] = js.native
  /**
    * Provides information about a list of specific people by specifying a list
    * of requested resource names. Use `people/me` to indicate the authenticated
    * user.
    *
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def getBatchGet(): Request[GetPeopleResponse] = js.native
  def getBatchGet(request: ResourceNames): Request[GetPeopleResponse] = js.native
  /**
    * Update contact data for an existing contact person. Any non-contact data
    * will not be modified.
    *
    * The request throws a 400 error if `updatePersonFields` is not specified.
    *
    * The request throws a 400 error if `person.metadata.sources` is not
    * specified for the contact to be updated.
    *
    * The request throws a 400 error with an error with reason
    * `"failedPrecondition"` if `person.metadata.sources.etag` is different than
    * the contact's etag, which indicates the contact has changed since its data
    * was read. Clients should get the latest person and re-apply their updates
    * to the latest person.
    */
  def updateContact(request: Resource): Request[Person] = js.native
  def updateContact(request: ResourceName, body: Person): Request[Person] = js.native
  def updateContactPhoto(request: Alt, body: UpdateContactPhotoRequest): Request[UpdateContactPhotoResponse] = js.native
  /** Update a contact's photo. */
  def updateContactPhoto(request: UploadType): Request[UpdateContactPhotoResponse] = js.native
}

