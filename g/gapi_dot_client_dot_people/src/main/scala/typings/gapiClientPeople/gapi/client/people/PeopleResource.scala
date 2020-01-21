package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPeople.AnonAccesstoken
import typings.gapiClientPeople.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenParent
import typings.gapiClientPeople.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFields
import typings.gapiClientPeople.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFieldsPp
import typings.gapiClientPeople.AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  var connections: ConnectionsResource
  /** Create a new contact and return the person resource for that contact. */
  def createContact(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenParent): Request_[Person]
  /** Delete a contact person. Any non-contact data will not be deleted. */
  def deleteContact(request: AnonAccesstoken): Request_[js.Object]
  /**
    * Provides information about a person by specifying a resource name. Use
    * `people/me` to indicate the authenticated user.
    * <br>
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFields): Request_[Person]
  /**
    * Provides information about a list of specific people by specifying a list
    * of requested resource names. Use `people/me` to indicate the authenticated
    * user.
    * <br>
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def getBatchGet(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFieldsPp): Request_[GetPeopleResponse]
  /**
    * Update contact data for an existing contact person. Any non-contact data
    * will not be modified.
    *
    * The request throws a 400 error if `updatePersonFields` is not specified.
    * <br>
    * The request throws a 400 error if `person.metadata.sources` is not
    * specified for the contact to be updated.
    * <br>
    * The request throws a 412 error if `person.metadata.sources.etag` is
    * different than the contact's etag, which indicates the contact has changed
    * since its data was read. Clients should get the latest person and re-apply
    * their updates to the latest person.
    */
  def updateContact(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request_[Person]
}

object PeopleResource {
  @scala.inline
  def apply(
    connections: ConnectionsResource,
    createContact: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenParent => Request_[Person],
    deleteContact: AnonAccesstoken => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFields => Request_[Person],
    getBatchGet: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFieldsPp => Request_[GetPeopleResponse],
    updateContact: AnonAccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request_[Person]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], createContact = js.Any.fromFunction1(createContact), deleteContact = js.Any.fromFunction1(deleteContact), get = js.Any.fromFunction1(get), getBatchGet = js.Any.fromFunction1(getBatchGet), updateContact = js.Any.fromFunction1(updateContact))
  
    __obj.asInstanceOf[PeopleResource]
  }
}

