package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPeople.AnonAccesstoken
import typings.gapiClientPeople.AnonAccesstokenAlt
import typings.gapiClientPeople.AnonAccesstokenAltBearertoken
import typings.gapiClientPeople.AnonAccesstokenAltBearertokenCallback
import typings.gapiClientPeople.AnonAccesstokenAltBearertokenCallbackFields
import typings.gapiClientPeople.AnonAccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupsResource extends js.Object {
  var members: MembersResource
  /**
    * Get a list of contact groups owned by the authenticated user by specifying
    * a list of contact group resource names.
    */
  def batchGet(request: AnonAccesstokenAlt): Request_[BatchGetContactGroupsResponse]
  /** Create a new contact group owned by the authenticated user. */
  def create(request: AnonAccesstokenAltBearertoken): Request_[ContactGroup]
  /**
    * Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    */
  def delete(request: AnonAccesstokenAltBearertokenCallback): Request_[js.Object]
  /**
    * Get a specific contact group owned by the authenticated user by specifying
    * a contact group resource name.
    */
  def get(request: AnonAccesstokenAltBearertokenCallbackFields): Request_[ContactGroup]
  /**
    * List all contact groups owned by the authenticated user. Members of the
    * contact groups are not populated.
    */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[ListContactGroupsResponse]
  /**
    * Update the name of an existing contact group owned by the authenticated
    * user.
    */
  def update(request: AnonAccesstoken): Request_[ContactGroup]
}

object ContactGroupsResource {
  @scala.inline
  def apply(
    batchGet: AnonAccesstokenAlt => Request_[BatchGetContactGroupsResponse],
    create: AnonAccesstokenAltBearertoken => Request_[ContactGroup],
    delete: AnonAccesstokenAltBearertokenCallback => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFields => Request_[ContactGroup],
    list: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[ListContactGroupsResponse],
    members: MembersResource,
    update: AnonAccesstoken => Request_[ContactGroup]
  ): ContactGroupsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), members = members.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ContactGroupsResource]
  }
}

