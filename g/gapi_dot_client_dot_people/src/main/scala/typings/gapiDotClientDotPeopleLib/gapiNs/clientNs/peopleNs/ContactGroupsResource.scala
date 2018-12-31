package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupsResource extends js.Object {
  var members: MembersResource
  /**
    * Get a list of contact groups owned by the authenticated user by specifying
    * a list of contact group resource names.
    */
  def batchGet(request: gapiDotClientDotPeopleLib.Anon_MaxMembersAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[BatchGetContactGroupsResponse]
  /** Create a new contact group owned by the authenticated user. */
  def create(request: gapiDotClientDotPeopleLib.Anon_AccesstokenPrettyPrintBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ContactGroup]
  /**
    * Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    */
  def delete(request: gapiDotClientDotPeopleLib.Anon_DeleteContacts): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Get a specific contact group owned by the authenticated user by specifying
    * a contact group resource name.
    */
  def get(request: gapiDotClientDotPeopleLib.Anon_MaxMembers): gapiDotClientLib.gapiNs.clientNs.Request[ContactGroup]
  /**
    * List all contact groups owned by the authenticated user. Members of the
    * contact groups are not populated.
    */
  def list(request: gapiDotClientDotPeopleLib.Anon_AccesstokenPageSize): gapiDotClientLib.gapiNs.clientNs.Request[ListContactGroupsResponse]
  /**
    * Update the name of an existing contact group owned by the authenticated
    * user.
    */
  def update(request: gapiDotClientDotPeopleLib.Anon_AccesstokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ContactGroup]
}

