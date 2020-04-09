package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPeople.AnonAlt
import typings.gapiClientPeople.AnonKey
import typings.gapiClientPeople.AnonPersonFields
import typings.gapiClientPeople.AnonQuotaUser
import typings.gapiClientPeople.AnonRequestMaskincludeField
import typings.gapiClientPeople.AnonResource
import typings.gapiClientPeople.AnonResourceName
import typings.gapiClientPeople.AnonResourceNames
import typings.gapiClientPeople.AnonUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeopleResource extends js.Object {
  var connections: ConnectionsResource = js.native
  def createContact(request: AnonKey, body: Person): Request_[Person] = js.native
  /** Create a new contact and return the person resource for that contact. */
  def createContact(request: AnonQuotaUser): Request_[Person] = js.native
  /** Delete a contact person. Any non-contact data will not be deleted. */
  def deleteContact(): Request_[js.Object] = js.native
  def deleteContact(request: AnonAlt): Request_[js.Object] = js.native
  /** Delete a contact's photo. */
  def deleteContactPhoto(): Request_[DeleteContactPhotoResponse] = js.native
  def deleteContactPhoto(request: AnonPersonFields): Request_[DeleteContactPhotoResponse] = js.native
  /**
    * Provides information about a person by specifying a resource name. Use
    * `people/me` to indicate the authenticated user.
    *
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def get(): Request_[Person] = js.native
  def get(request: AnonRequestMaskincludeField): Request_[Person] = js.native
  /**
    * Provides information about a list of specific people by specifying a list
    * of requested resource names. Use `people/me` to indicate the authenticated
    * user.
    *
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def getBatchGet(): Request_[GetPeopleResponse] = js.native
  def getBatchGet(request: AnonResourceNames): Request_[GetPeopleResponse] = js.native
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
  def updateContact(request: AnonResource): Request_[Person] = js.native
  def updateContact(request: AnonResourceName, body: Person): Request_[Person] = js.native
  def updateContactPhoto(request: AnonAlt, body: UpdateContactPhotoRequest): Request_[UpdateContactPhotoResponse] = js.native
  /** Update a contact's photo. */
  def updateContactPhoto(request: AnonUploadType): Request_[UpdateContactPhotoResponse] = js.native
}

