package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PeopleResource extends js.Object {
  var connections: ConnectionsResource
  /** Create a new contact and return the person resource for that contact. */
  def createContact(request: gapiDotClientDotPeopleLib.Anon_Parent): gapiDotClientLib.gapiNs.clientNs.Request[Person]
  /** Delete a contact person. Any non-contact data will not be deleted. */
  def deleteContact(request: gapiDotClientDotPeopleLib.Anon_AccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
               * Provides information about a person by specifying a resource name. Use
               * `people/me` to indicate the authenticated user.
               * <br>
               * The request throws a 400 error if 'personFields' is not specified.
               */
  def get(request: gapiDotClientDotPeopleLib.Anon_AccesstokenPersonFieldsPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Person]
  /**
               * Provides information about a list of specific people by specifying a list
               * of requested resource names. Use `people/me` to indicate the authenticated
               * user.
               * <br>
               * The request throws a 400 error if 'personFields' is not specified.
               */
  def getBatchGet(request: gapiDotClientDotPeopleLib.Anon_AccesstokenPersonFields): gapiDotClientLib.gapiNs.clientNs.Request[GetPeopleResponse]
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
  def updateContact(request: gapiDotClientDotPeopleLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Person]
}

