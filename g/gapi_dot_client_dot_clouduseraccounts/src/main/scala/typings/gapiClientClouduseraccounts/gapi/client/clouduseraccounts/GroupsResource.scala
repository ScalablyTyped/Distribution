package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouduseraccounts.anon.Fields
import typings.gapiClientClouduseraccounts.anon.GroupName
import typings.gapiClientClouduseraccounts.anon.Oauthtoken
import typings.gapiClientClouduseraccounts.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Adds users to the specified group. */
  def addMember(request: GroupName): Request[Operation]
  /** Deletes the specified Group resource. */
  def delete(request: GroupName): Request[Operation]
  /** Returns the specified Group resource. */
  def get(request: GroupName): Request[Group]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Oauthtoken): Request[Policy]
  /** Creates a Group resource in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves the list of groups contained within the specified project. */
  def list(request: Fields): Request[GroupList]
  /** Removes users from the specified group. */
  def removeMember(request: GroupName): Request[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Oauthtoken): Request[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Oauthtoken): Request[TestPermissionsResponse]
}

object GroupsResource {
  @scala.inline
  def apply(
    addMember: GroupName => Request[Operation],
    delete: GroupName => Request[Operation],
    get: GroupName => Request[Group],
    getIamPolicy: Oauthtoken => Request[Policy],
    insert: PrettyPrint => Request[Operation],
    list: Fields => Request[GroupList],
    removeMember: GroupName => Request[Operation],
    setIamPolicy: Oauthtoken => Request[Policy],
    testIamPermissions: Oauthtoken => Request[TestPermissionsResponse]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeMember = js.Any.fromFunction1(removeMember), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
    __obj.asInstanceOf[GroupsResource]
  }
}

