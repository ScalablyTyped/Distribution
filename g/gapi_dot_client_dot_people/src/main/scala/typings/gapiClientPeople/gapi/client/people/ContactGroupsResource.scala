package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPeople.AnonAccesstoken
import typings.gapiClientPeople.AnonAlt
import typings.gapiClientPeople.AnonBearertoken
import typings.gapiClientPeople.AnonCallback
import typings.gapiClientPeople.AnonFields
import typings.gapiClientPeople.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupsResource extends js.Object {
  var members: MembersResource
  /**
    * Get a list of contact groups owned by the authenticated user by specifying
    * a list of contact group resource names.
    */
  def batchGet(request: AnonAlt): Request_[BatchGetContactGroupsResponse]
  /** Create a new contact group owned by the authenticated user. */
  def create(request: AnonBearertoken): Request_[ContactGroup]
  /**
    * Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    */
  def delete(request: AnonCallback): Request_[js.Object]
  /**
    * Get a specific contact group owned by the authenticated user by specifying
    * a contact group resource name.
    */
  def get(request: AnonFields): Request_[ContactGroup]
  /**
    * List all contact groups owned by the authenticated user. Members of the
    * contact groups are not populated.
    */
  def list(request: AnonKey): Request_[ListContactGroupsResponse]
  /**
    * Update the name of an existing contact group owned by the authenticated
    * user.
    */
  def update(request: AnonAccesstoken): Request_[ContactGroup]
}

object ContactGroupsResource {
  @scala.inline
  def apply(
    batchGet: AnonAlt => Request_[BatchGetContactGroupsResponse],
    create: AnonBearertoken => Request_[ContactGroup],
    delete: AnonCallback => Request_[js.Object],
    get: AnonFields => Request_[ContactGroup],
    list: AnonKey => Request_[ListContactGroupsResponse],
    members: MembersResource,
    update: AnonAccesstoken => Request_[ContactGroup]
  ): ContactGroupsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), members = members.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ContactGroupsResource]
  }
}

