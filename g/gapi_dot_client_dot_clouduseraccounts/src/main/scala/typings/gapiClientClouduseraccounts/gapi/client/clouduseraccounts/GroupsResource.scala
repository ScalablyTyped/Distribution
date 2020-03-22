package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouduseraccounts.AnonFields
import typings.gapiClientClouduseraccounts.AnonGroupName
import typings.gapiClientClouduseraccounts.AnonOauthtoken
import typings.gapiClientClouduseraccounts.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Adds users to the specified group. */
  def addMember(request: AnonGroupName): Request_[Operation]
  /** Deletes the specified Group resource. */
  def delete(request: AnonGroupName): Request_[Operation]
  /** Returns the specified Group resource. */
  def get(request: AnonGroupName): Request_[Group]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /** Creates a Group resource in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves the list of groups contained within the specified project. */
  def list(request: AnonFields): Request_[GroupList]
  /** Removes users from the specified group. */
  def removeMember(request: AnonGroupName): Request_[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonOauthtoken): Request_[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonOauthtoken): Request_[TestPermissionsResponse]
}

object GroupsResource {
  @scala.inline
  def apply(
    addMember: AnonGroupName => Request_[Operation],
    delete: AnonGroupName => Request_[Operation],
    get: AnonGroupName => Request_[Group],
    getIamPolicy: AnonOauthtoken => Request_[Policy],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFields => Request_[GroupList],
    removeMember: AnonGroupName => Request_[Operation],
    setIamPolicy: AnonOauthtoken => Request_[Policy],
    testIamPermissions: AnonOauthtoken => Request_[TestPermissionsResponse]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeMember = js.Any.fromFunction1(removeMember), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

