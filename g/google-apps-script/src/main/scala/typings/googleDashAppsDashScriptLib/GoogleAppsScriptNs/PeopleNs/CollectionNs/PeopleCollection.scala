package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeopleCollection extends js.Object {
  var Connections: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.CollectionNs.PeopleNs.ConnectionsCollection
  ] = js.native
  // Create a new contact and return the person resource for that contact.
  def createContact(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person = js.native
  // Create a new contact and return the person resource for that contact.
  def createContact(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person = js.native
  // Delete a contact person. Any non-contact data will not be deleted.
  def deleteContact(resourceName: java.lang.String): scala.Unit = js.native
  // Provides information about a person by specifying a resource name. Use
  // `people/me` to indicate the authenticated user.
  // <br>
  // The request throws a 400 error if 'personFields' is not specified.
  def get(resourceName: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person = js.native
  // Provides information about a person by specifying a resource name. Use
  // `people/me` to indicate the authenticated user.
  // <br>
  // The request throws a 400 error if 'personFields' is not specified.
  def get(resourceName: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person = js.native
  // Provides information about a list of specific people by specifying a list
  // of requested resource names. Use `people/me` to indicate the authenticated
  // user.
  // <br>
  // The request throws a 400 error if 'personFields' is not specified.
  def getBatchGet(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.GetPeopleResponse = js.native
  // Provides information about a list of specific people by specifying a list
  // of requested resource names. Use `people/me` to indicate the authenticated
  // user.
  // <br>
  // The request throws a 400 error if 'personFields' is not specified.
  def getBatchGet(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.GetPeopleResponse = js.native
  // Update contact data for an existing contact person. Any non-contact data
  // will not be modified.
  // The request throws a 400 error if `updatePersonFields` is not specified.
  // <br>
  // The request throws a 400 error if `person.metadata.sources` is not
  // specified for the contact to be updated.
  // <br>
  // The request throws a 412 error if `person.metadata.sources.etag` is
  // different than the contact's etag, which indicates the contact has changed
  // since its data was read. Clients should get the latest person and re-apply
  // their updates to the latest person.
  def updateContact(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person,
    resourceName: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person = js.native
  // Update contact data for an existing contact person. Any non-contact data
  // will not be modified.
  // The request throws a 400 error if `updatePersonFields` is not specified.
  // <br>
  // The request throws a 400 error if `person.metadata.sources` is not
  // specified for the contact to be updated.
  // <br>
  // The request throws a 412 error if `person.metadata.sources.etag` is
  // different than the contact's etag, which indicates the contact has changed
  // since its data was read. Clients should get the latest person and re-apply
  // their updates to the latest person.
  def updateContact(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person,
    resourceName: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.Person = js.native
}

