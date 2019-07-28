package typings.gapiDotClientDotClouduseraccounts.gapiNs.clientNs.clouduseraccountsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFields
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFieldsGroupName
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFieldsKey
import typings.gapiDotClientDotClouduseraccounts.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Adds users to the specified group. */
  def addMember(request: Anon_AltFieldsGroupName): Request[Operation]
  /** Deletes the specified Group resource. */
  def delete(request: Anon_AltFieldsGroupName): Request[Operation]
  /** Returns the specified Group resource. */
  def get(request: Anon_AltFieldsGroupName): Request[Group]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: Anon_AltFieldsKey): Request[Policy]
  /** Creates a Group resource in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[Operation]
  /** Retrieves the list of groups contained within the specified project. */
  def list(request: Anon_AltFields): Request[GroupList]
  /** Removes users from the specified group. */
  def removeMember(request: Anon_AltFieldsGroupName): Request[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: Anon_AltFieldsKey): Request[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: Anon_AltFieldsKey): Request[TestPermissionsResponse]
}

object GroupsResource {
  @scala.inline
  def apply(
    addMember: Anon_AltFieldsGroupName => Request[Operation],
    delete: Anon_AltFieldsGroupName => Request[Operation],
    get: Anon_AltFieldsGroupName => Request[Group],
    getIamPolicy: Anon_AltFieldsKey => Request[Policy],
    insert: Anon_AltFieldsKeyOauthtoken => Request[Operation],
    list: Anon_AltFields => Request[GroupList],
    removeMember: Anon_AltFieldsGroupName => Request[Operation],
    setIamPolicy: Anon_AltFieldsKey => Request[Policy],
    testIamPermissions: Anon_AltFieldsKey => Request[TestPermissionsResponse]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeMember = js.Any.fromFunction1(removeMember), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

