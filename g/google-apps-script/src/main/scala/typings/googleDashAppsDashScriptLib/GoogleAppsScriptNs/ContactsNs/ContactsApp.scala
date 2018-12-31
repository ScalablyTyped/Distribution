package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactsApp extends js.Object {
  var ExtendedField: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Contacts.ExtendedField */ js.Any = js.native
  var Field: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Contacts.Field */ js.Any = js.native
  var Gender: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Contacts.Gender */ js.Any = js.native
  var Month: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Base.Month */ js.Any = js.native
  var Priority: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Contacts.Priority */ js.Any = js.native
  var Sensitivity: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google-apps-script.GoogleAppsScript.Contacts.Sensitivity */ js.Any = js.native
  def createContact(givenName: java.lang.String, familyName: java.lang.String, email: java.lang.String): Contact = js.native
  def createContactGroup(name: java.lang.String): ContactGroup = js.native
  def deleteContact(contact: Contact): scala.Unit = js.native
  def deleteContactGroup(group: ContactGroup): scala.Unit = js.native
  def findByEmailAddress(email: java.lang.String): Contact = js.native
  def findContactGroup(name: java.lang.String): ContactGroup = js.native
  def getAllContacts(): js.Array[Contact] = js.native
  def getContact(emailAddress: java.lang.String): Contact = js.native
  def getContactById(id: java.lang.String): Contact = js.native
  def getContactGroup(name: java.lang.String): ContactGroup = js.native
  def getContactGroupById(id: java.lang.String): ContactGroup = js.native
  def getContactGroups(): js.Array[ContactGroup] = js.native
  def getContacts(): js.Array[Contact] = js.native
  def getContactsByAddress(query: java.lang.String): js.Array[Contact] = js.native
  def getContactsByAddress(query: java.lang.String, label: Field): js.Array[Contact] = js.native
  def getContactsByAddress(query: java.lang.String, label: java.lang.String): js.Array[Contact] = js.native
  def getContactsByCompany(query: java.lang.String): js.Array[Contact] = js.native
  def getContactsByCustomField(query: js.Object, label: ExtendedField): js.Array[Contact] = js.native
  def getContactsByDate(
    month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month,
    day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    label: Field
  ): js.Array[Contact] = js.native
  def getContactsByDate(
    month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month,
    day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    label: java.lang.String
  ): js.Array[Contact] = js.native
  def getContactsByDate(
    month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month,
    day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    year: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    label: Field
  ): js.Array[Contact] = js.native
  def getContactsByDate(
    month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month,
    day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    year: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    label: java.lang.String
  ): js.Array[Contact] = js.native
  def getContactsByEmailAddress(query: java.lang.String): js.Array[Contact] = js.native
  def getContactsByEmailAddress(query: java.lang.String, label: Field): js.Array[Contact] = js.native
  def getContactsByEmailAddress(query: java.lang.String, label: java.lang.String): js.Array[Contact] = js.native
  def getContactsByGroup(group: ContactGroup): js.Array[Contact] = js.native
  def getContactsByIM(query: java.lang.String): js.Array[Contact] = js.native
  def getContactsByIM(query: java.lang.String, label: Field): js.Array[Contact] = js.native
  def getContactsByIM(query: java.lang.String, label: java.lang.String): js.Array[Contact] = js.native
  def getContactsByJobTitle(query: java.lang.String): js.Array[Contact] = js.native
  def getContactsByName(query: java.lang.String): js.Array[Contact] = js.native
  def getContactsByName(query: java.lang.String, label: Field): js.Array[Contact] = js.native
  def getContactsByNotes(query: java.lang.String): js.Array[Contact] = js.native
  def getContactsByPhone(query: java.lang.String): js.Array[Contact] = js.native
  def getContactsByPhone(query: java.lang.String, label: Field): js.Array[Contact] = js.native
  def getContactsByPhone(query: java.lang.String, label: java.lang.String): js.Array[Contact] = js.native
  def getContactsByUrl(query: java.lang.String): js.Array[Contact] = js.native
  def getContactsByUrl(query: java.lang.String, label: Field): js.Array[Contact] = js.native
  def getContactsByUrl(query: java.lang.String, label: java.lang.String): js.Array[Contact] = js.native
}

