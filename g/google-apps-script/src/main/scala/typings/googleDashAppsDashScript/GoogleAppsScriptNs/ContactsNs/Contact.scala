package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Month
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contact extends js.Object {
  def addAddress(label: js.Any, address: String): AddressField = js.native
  def addCompany(company: String, title: String): CompanyField = js.native
  def addCustomField(label: js.Any, content: js.Any): CustomField = js.native
  def addDate(label: js.Any, month: Month, day: Integer, year: Integer): DateField = js.native
  def addEmail(label: js.Any, address: String): EmailField = js.native
  def addIM(label: js.Any, address: String): IMField = js.native
  def addPhone(label: js.Any, number: String): PhoneField = js.native
  def addToGroup(group: ContactGroup): Contact = js.native
  def addUrl(label: js.Any, url: String): UrlField = js.native
  def deleteContact(): Unit = js.native
  def getAddresses(): js.Array[AddressField] = js.native
  def getAddresses(label: js.Any): js.Array[AddressField] = js.native
  def getCompanies(): js.Array[CompanyField] = js.native
  def getContactGroups(): js.Array[ContactGroup] = js.native
  def getCustomFields(): js.Array[CustomField] = js.native
  def getCustomFields(label: js.Any): js.Array[CustomField] = js.native
  def getDates(): js.Array[DateField] = js.native
  def getDates(label: js.Any): js.Array[DateField] = js.native
  def getEmailAddresses(): js.Array[String] = js.native
  def getEmails(): js.Array[EmailField] = js.native
  def getEmails(label: js.Any): js.Array[EmailField] = js.native
  def getFamilyName(): String = js.native
  def getFullName(): String = js.native
  def getGivenName(): String = js.native
  def getHomeAddress(): String = js.native
  def getHomeFax(): String = js.native
  def getHomePhone(): String = js.native
  def getIMs(): js.Array[IMField] = js.native
  def getIMs(label: js.Any): js.Array[IMField] = js.native
  def getId(): String = js.native
  def getInitials(): String = js.native
  def getLastUpdated(): Date = js.native
  def getMaidenName(): String = js.native
  def getMiddleName(): String = js.native
  def getMobilePhone(): String = js.native
  def getNickname(): String = js.native
  def getNotes(): String = js.native
  def getPager(): String = js.native
  def getPhones(): js.Array[PhoneField] = js.native
  def getPhones(label: js.Any): js.Array[PhoneField] = js.native
  def getPrefix(): String = js.native
  def getPrimaryEmail(): String = js.native
  def getShortName(): String = js.native
  def getSuffix(): String = js.native
  def getUrls(): js.Array[UrlField] = js.native
  def getUrls(label: js.Any): js.Array[UrlField] = js.native
  def getUserDefinedField(key: String): String = js.native
  def getUserDefinedFields(): js.Any = js.native
  def getWorkAddress(): String = js.native
  def getWorkFax(): String = js.native
  def getWorkPhone(): String = js.native
  def removeFromGroup(group: ContactGroup): Contact = js.native
  def setFamilyName(familyName: String): Contact = js.native
  def setFullName(fullName: String): Contact = js.native
  def setGivenName(givenName: String): Contact = js.native
  def setHomeAddress(addr: String): Unit = js.native
  def setHomeFax(phone: String): Unit = js.native
  def setHomePhone(phone: String): Unit = js.native
  def setInitials(initials: String): Contact = js.native
  def setMaidenName(maidenName: String): Contact = js.native
  def setMiddleName(middleName: String): Contact = js.native
  def setMobilePhone(phone: String): Unit = js.native
  def setNickname(nickname: String): Contact = js.native
  def setNotes(notes: String): Contact = js.native
  def setPager(phone: String): Unit = js.native
  def setPrefix(prefix: String): Contact = js.native
  def setPrimaryEmail(primaryEmail: String): Unit = js.native
  def setShortName(shortName: String): Contact = js.native
  def setSuffix(suffix: String): Contact = js.native
  def setUserDefinedField(key: String, value: String): Unit = js.native
  def setUserDefinedFields(o: js.Any): Unit = js.native
  def setWorkAddress(addr: String): Unit = js.native
  def setWorkFax(phone: String): Unit = js.native
  def setWorkPhone(phone: String): Unit = js.native
}

