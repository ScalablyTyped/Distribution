package typings.googleDashAppsDashScript.GoogleAppsScript.People.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.People.Collection.ContactGroups.MembersCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema.BatchGetContactGroupsResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema.ContactGroup
import typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema.CreateContactGroupRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema.ListContactGroupsResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema.UpdateContactGroupRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactGroupsCollection extends js.Object {
  var Members: js.UndefOr[MembersCollection] = js.native
  // Get a list of contact groups owned by the authenticated user by specifying
  // a list of contact group resource names.
  def batchGet(): BatchGetContactGroupsResponse = js.native
  // Get a list of contact groups owned by the authenticated user by specifying
  // a list of contact group resource names.
  def batchGet(optionalArgs: js.Object): BatchGetContactGroupsResponse = js.native
  // Create a new contact group owned by the authenticated user.
  def create(resource: CreateContactGroupRequest): ContactGroup = js.native
  // Get a specific contact group owned by the authenticated user by specifying
  // a contact group resource name.
  def get(resourceName: String): ContactGroup = js.native
  // Get a specific contact group owned by the authenticated user by specifying
  // a contact group resource name.
  def get(resourceName: String, optionalArgs: js.Object): ContactGroup = js.native
  // List all contact groups owned by the authenticated user. Members of the
  // contact groups are not populated.
  def list(): ListContactGroupsResponse = js.native
  // List all contact groups owned by the authenticated user. Members of the
  // contact groups are not populated.
  def list(optionalArgs: js.Object): ListContactGroupsResponse = js.native
  // Delete an existing contact group owned by the authenticated user by
  // specifying a contact group resource name.
  def remove(resourceName: String): Unit = js.native
  // Delete an existing contact group owned by the authenticated user by
  // specifying a contact group resource name.
  def remove(resourceName: String, optionalArgs: js.Object): Unit = js.native
  // Update the name of an existing contact group owned by the authenticated
  // user.
  def update(resource: UpdateContactGroupRequest, resourceName: String): ContactGroup = js.native
}

