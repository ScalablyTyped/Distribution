package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPeople.AnonAlt
import typings.gapiClientPeople.AnonCallback
import typings.gapiClientPeople.AnonDeleteContacts
import typings.gapiClientPeople.AnonFields
import typings.gapiClientPeople.AnonKey
import typings.gapiClientPeople.AnonMaxMembers
import typings.gapiClientPeople.AnonOauthtoken
import typings.gapiClientPeople.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactGroupsResource extends js.Object {
  var members: MembersResource = js.native
  /**
    * Get a list of contact groups owned by the authenticated user by specifying
    * a list of contact group resource names.
    */
  def batchGet(): Request_[BatchGetContactGroupsResponse] = js.native
  def batchGet(request: AnonCallback): Request_[BatchGetContactGroupsResponse] = js.native
  /** Create a new contact group owned by the authenticated user. */
  def create(request: AnonFields): Request_[ContactGroup] = js.native
  def create(request: AnonKey, body: CreateContactGroupRequest): Request_[ContactGroup] = js.native
  /**
    * Delete an existing contact group owned by the authenticated user by
    * specifying a contact group resource name.
    */
  def delete(): Request_[js.Object] = js.native
  def delete(request: AnonDeleteContacts): Request_[js.Object] = js.native
  /**
    * Get a specific contact group owned by the authenticated user by specifying
    * a contact group resource name.
    */
  def get(): Request_[ContactGroup] = js.native
  def get(request: AnonMaxMembers): Request_[ContactGroup] = js.native
  /**
    * List all contact groups owned by the authenticated user. Members of the
    * contact groups are not populated.
    */
  def list(): Request_[ListContactGroupsResponse] = js.native
  def list(request: AnonOauthtoken): Request_[ListContactGroupsResponse] = js.native
  def update(request: AnonAlt, body: UpdateContactGroupRequest): Request_[ContactGroup] = js.native
  /**
    * Update the name of an existing contact group owned by the authenticated
    * user.
    */
  def update(request: AnonPrettyPrint): Request_[ContactGroup] = js.native
}

