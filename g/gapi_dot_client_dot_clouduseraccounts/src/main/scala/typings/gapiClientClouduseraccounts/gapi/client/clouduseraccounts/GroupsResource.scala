package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientClouduseraccounts.AnonAltFields
import typings.gapiClientClouduseraccounts.AnonAltFieldsGroupName
import typings.gapiClientClouduseraccounts.AnonAltFieldsKey
import typings.gapiClientClouduseraccounts.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupsResource extends js.Object {
  /** Adds users to the specified group. */
  def addMember(request: AnonAltFieldsGroupName): Request_[Operation]
  /** Deletes the specified Group resource. */
  def delete(request: AnonAltFieldsGroupName): Request_[Operation]
  /** Returns the specified Group resource. */
  def get(request: AnonAltFieldsGroupName): Request_[Group]
  /** Gets the access control policy for a resource. May be empty if no such policy or resource exists. */
  def getIamPolicy(request: AnonAltFieldsKey): Request_[Policy]
  /** Creates a Group resource in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtoken): Request_[Operation]
  /** Retrieves the list of groups contained within the specified project. */
  def list(request: AnonAltFields): Request_[GroupList]
  /** Removes users from the specified group. */
  def removeMember(request: AnonAltFieldsGroupName): Request_[Operation]
  /** Sets the access control policy on the specified resource. Replaces any existing policy. */
  def setIamPolicy(request: AnonAltFieldsKey): Request_[Policy]
  /** Returns permissions that a caller has on the specified resource. */
  def testIamPermissions(request: AnonAltFieldsKey): Request_[TestPermissionsResponse]
}

object GroupsResource {
  @scala.inline
  def apply(
    addMember: AnonAltFieldsGroupName => Request_[Operation],
    delete: AnonAltFieldsGroupName => Request_[Operation],
    get: AnonAltFieldsGroupName => Request_[Group],
    getIamPolicy: AnonAltFieldsKey => Request_[Policy],
    insert: AnonAltFieldsKeyOauthtoken => Request_[Operation],
    list: AnonAltFields => Request_[GroupList],
    removeMember: AnonAltFieldsGroupName => Request_[Operation],
    setIamPolicy: AnonAltFieldsKey => Request_[Policy],
    testIamPermissions: AnonAltFieldsKey => Request_[TestPermissionsResponse]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), getIamPolicy = js.Any.fromFunction1(getIamPolicy), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), removeMember = js.Any.fromFunction1(removeMember), setIamPolicy = js.Any.fromFunction1(setIamPolicy), testIamPermissions = js.Any.fromFunction1(testIamPermissions))
  
    __obj.asInstanceOf[GroupsResource]
  }
}

