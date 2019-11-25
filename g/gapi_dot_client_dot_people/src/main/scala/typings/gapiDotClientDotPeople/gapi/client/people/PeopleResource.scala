package typings.gapiDotClientDotPeople.gapi.client.people

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotPeople.Anon_Accesstoken
import typings.gapiDotClientDotPeople.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenParent
import typings.gapiDotClientDotPeople.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFields
import typings.gapiDotClientDotPeople.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFieldsPp
import typings.gapiDotClientDotPeople.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeopleResource extends js.Object {
  var connections: ConnectionsResource
  /** Create a new contact and return the person resource for that contact. */
  def createContact(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenParent): Request[Person]
  /** Delete a contact person. Any non-contact data will not be deleted. */
  def deleteContact(request: Anon_Accesstoken): Request[js.Object]
  /**
    * Provides information about a person by specifying a resource name. Use
    * `people/me` to indicate the authenticated user.
    * <br>
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFields): Request[Person]
  /**
    * Provides information about a list of specific people by specifying a list
    * of requested resource names. Use `people/me` to indicate the authenticated
    * user.
    * <br>
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def getBatchGet(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFieldsPp): Request[GetPeopleResponse]
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
  def updateContact(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp): Request[Person]
}

object PeopleResource {
  @scala.inline
  def apply(
    connections: ConnectionsResource,
    createContact: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenParent => Request[Person],
    deleteContact: Anon_Accesstoken => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFields => Request[Person],
    getBatchGet: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPersonFieldsPp => Request[GetPeopleResponse],
    updateContact: Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPp => Request[Person]
  ): PeopleResource = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], createContact = js.Any.fromFunction1(createContact), deleteContact = js.Any.fromFunction1(deleteContact), get = js.Any.fromFunction1(get), getBatchGet = js.Any.fromFunction1(getBatchGet), updateContact = js.Any.fromFunction1(updateContact))
  
    __obj.asInstanceOf[PeopleResource]
  }
}

