package typings.gapiDotClientDotPeople.gapiNs.clientNs.peopleNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPeople.Anon_Accesstoken
import typings.gapiDotClientDotPeople.Anon_AccesstokenAlt
import typings.gapiDotClientDotPeople.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotPeople.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotPeople.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotPeople.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactGroupsResource extends js.Object {
  var members: MembersResource
  /**
    * Get a list of contact groups owned by the authenticated user by specifying
    * a list of contact group resource names.
    */
  def batchGet(request: Anon_AccesstokenAlt): Request[BatchGetContactGroupsResponse]
  /** Create a new contact group owned by the authenticated user. */
  def create(request: Anon_AccesstokenAltBearertoken): Request[ContactGroup]
  /**
    * Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    */
  def delete(request: Anon_AccesstokenAltBearertokenCallback): Request[js.Object]
  /**
    * Get a specific contact group owned by the authenticated user by specifying
    * a contact group resource name.
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFields): Request[ContactGroup]
  /**
    * List all contact groups owned by the authenticated user. Members of the
    * contact groups are not populated.
    */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[ListContactGroupsResponse]
  /**
    * Update the name of an existing contact group owned by the authenticated
    * user.
    */
  def update(request: Anon_Accesstoken): Request[ContactGroup]
}

object ContactGroupsResource {
  @scala.inline
  def apply(
    batchGet: Anon_AccesstokenAlt => Request[BatchGetContactGroupsResponse],
    create: Anon_AccesstokenAltBearertoken => Request[ContactGroup],
    delete: Anon_AccesstokenAltBearertokenCallback => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFields => Request[ContactGroup],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[ListContactGroupsResponse],
    members: MembersResource,
    update: Anon_Accesstoken => Request[ContactGroup]
  ): ContactGroupsResource = {
    val __obj = js.Dynamic.literal(batchGet = js.Any.fromFunction1(batchGet), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), members = members, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ContactGroupsResource]
  }
}

