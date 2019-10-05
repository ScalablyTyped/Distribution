package typings.googleDashAppsDashScript.GoogleAppsScript.Contacts

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Month
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactsApp extends js.Object {
  var ExtendedField: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExtendedField */ js.Any = js.native
  var Field: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any = js.native
  var Gender: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Gender */ js.Any = js.native
  var Month: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Month */ js.Any = js.native
  var Priority: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Priority */ js.Any = js.native
  var Sensitivity: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sensitivity */ js.Any = js.native
  def createContact(givenName: String, familyName: String, email: String): Contact = js.native
  def createContactGroup(name: String): ContactGroup = js.native
  def deleteContact(contact: Contact): Unit = js.native
  def deleteContactGroup(group: ContactGroup): Unit = js.native
  /** @deprecated DO NOT USE */
  def findByEmailAddress(email: String): Contact = js.native
  /** @deprecated DO NOT USE */
  def findContactGroup(name: String): ContactGroup = js.native
  /** @deprecated DO NOT USE */
  def getAllContacts(): js.Array[Contact] = js.native
  def getContact(emailAddress: String): Contact = js.native
  def getContactById(id: String): Contact = js.native
  def getContactGroup(name: String): ContactGroup = js.native
  def getContactGroupById(id: String): ContactGroup = js.native
  def getContactGroups(): js.Array[ContactGroup] = js.native
  def getContacts(): js.Array[Contact] = js.native
  def getContactsByAddress(query: String): js.Array[Contact] = js.native
  def getContactsByAddress(query: String, label: String): js.Array[Contact] = js.native
  def getContactsByAddress(query: String, label: Field): js.Array[Contact] = js.native
  def getContactsByCompany(query: String): js.Array[Contact] = js.native
  def getContactsByCustomField(query: String, label: ExtendedField): js.Array[Contact] = js.native
  def getContactsByCustomField(
    query: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExtendedField */ js.Any,
    label: ExtendedField
  ): js.Array[Contact] = js.native
  def getContactsByDate(month: Month, day: Integer, label: String): js.Array[Contact] = js.native
  def getContactsByDate(month: Month, day: Integer, label: Field): js.Array[Contact] = js.native
  def getContactsByDate(month: Month, day: Integer, year: Integer, label: String): js.Array[Contact] = js.native
  def getContactsByDate(month: Month, day: Integer, year: Integer, label: Field): js.Array[Contact] = js.native
  def getContactsByEmailAddress(query: String): js.Array[Contact] = js.native
  def getContactsByEmailAddress(query: String, label: String): js.Array[Contact] = js.native
  def getContactsByEmailAddress(query: String, label: Field): js.Array[Contact] = js.native
  def getContactsByGroup(group: ContactGroup): js.Array[Contact] = js.native
  def getContactsByIM(query: String): js.Array[Contact] = js.native
  def getContactsByIM(query: String, label: String): js.Array[Contact] = js.native
  def getContactsByIM(query: String, label: Field): js.Array[Contact] = js.native
  def getContactsByJobTitle(query: String): js.Array[Contact] = js.native
  def getContactsByName(query: String): js.Array[Contact] = js.native
  def getContactsByName(query: String, label: Field): js.Array[Contact] = js.native
  def getContactsByNotes(query: String): js.Array[Contact] = js.native
  def getContactsByPhone(query: String): js.Array[Contact] = js.native
  def getContactsByPhone(query: String, label: String): js.Array[Contact] = js.native
  def getContactsByPhone(query: String, label: Field): js.Array[Contact] = js.native
  def getContactsByUrl(query: String): js.Array[Contact] = js.native
  def getContactsByUrl(query: String, label: String): js.Array[Contact] = js.native
  def getContactsByUrl(query: String, label: Field): js.Array[Contact] = js.native
}

