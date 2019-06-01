package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contact extends js.Object {
  def addAddress(label: js.Any, address: java.lang.String): AddressField = js.native
  def addCompany(company: java.lang.String, title: java.lang.String): CompanyField = js.native
  def addCustomField(label: js.Any, content: js.Any): CustomField = js.native
  def addDate(
    label: js.Any,
    month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month,
    day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    year: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): DateField = js.native
  def addEmail(label: js.Any, address: java.lang.String): EmailField = js.native
  def addIM(label: js.Any, address: java.lang.String): IMField = js.native
  def addPhone(label: js.Any, number: java.lang.String): PhoneField = js.native
  def addToGroup(group: ContactGroup): Contact = js.native
  def addUrl(label: js.Any, url: java.lang.String): UrlField = js.native
  def deleteContact(): scala.Unit = js.native
  def getAddresses(): js.Array[AddressField] = js.native
  def getAddresses(label: js.Any): js.Array[AddressField] = js.native
  def getCompanies(): js.Array[CompanyField] = js.native
  def getContactGroups(): js.Array[ContactGroup] = js.native
  def getCustomFields(): js.Array[CustomField] = js.native
  def getCustomFields(label: js.Any): js.Array[CustomField] = js.native
  def getDates(): js.Array[DateField] = js.native
  def getDates(label: js.Any): js.Array[DateField] = js.native
  def getEmailAddresses(): js.Array[java.lang.String] = js.native
  def getEmails(): js.Array[EmailField] = js.native
  def getEmails(label: js.Any): js.Array[EmailField] = js.native
  def getFamilyName(): java.lang.String = js.native
  def getFullName(): java.lang.String = js.native
  def getGivenName(): java.lang.String = js.native
  def getHomeAddress(): java.lang.String = js.native
  def getHomeFax(): java.lang.String = js.native
  def getHomePhone(): java.lang.String = js.native
  def getIMs(): js.Array[IMField] = js.native
  def getIMs(label: js.Any): js.Array[IMField] = js.native
  def getId(): java.lang.String = js.native
  def getInitials(): java.lang.String = js.native
  def getLastUpdated(): stdLib.Date = js.native
  def getMaidenName(): java.lang.String = js.native
  def getMiddleName(): java.lang.String = js.native
  def getMobilePhone(): java.lang.String = js.native
  def getNickname(): java.lang.String = js.native
  def getNotes(): java.lang.String = js.native
  def getPager(): java.lang.String = js.native
  def getPhones(): js.Array[PhoneField] = js.native
  def getPhones(label: js.Any): js.Array[PhoneField] = js.native
  def getPrefix(): java.lang.String = js.native
  def getPrimaryEmail(): java.lang.String = js.native
  def getShortName(): java.lang.String = js.native
  def getSuffix(): java.lang.String = js.native
  def getUrls(): js.Array[UrlField] = js.native
  def getUrls(label: js.Any): js.Array[UrlField] = js.native
  def getUserDefinedField(key: java.lang.String): java.lang.String = js.native
  def getUserDefinedFields(): js.Any = js.native
  def getWorkAddress(): java.lang.String = js.native
  def getWorkFax(): java.lang.String = js.native
  def getWorkPhone(): java.lang.String = js.native
  def removeFromGroup(group: ContactGroup): Contact = js.native
  def setFamilyName(familyName: java.lang.String): Contact = js.native
  def setFullName(fullName: java.lang.String): Contact = js.native
  def setGivenName(givenName: java.lang.String): Contact = js.native
  def setHomeAddress(addr: java.lang.String): scala.Unit = js.native
  def setHomeFax(phone: java.lang.String): scala.Unit = js.native
  def setHomePhone(phone: java.lang.String): scala.Unit = js.native
  def setInitials(initials: java.lang.String): Contact = js.native
  def setMaidenName(maidenName: java.lang.String): Contact = js.native
  def setMiddleName(middleName: java.lang.String): Contact = js.native
  def setMobilePhone(phone: java.lang.String): scala.Unit = js.native
  def setNickname(nickname: java.lang.String): Contact = js.native
  def setNotes(notes: java.lang.String): Contact = js.native
  def setPager(phone: java.lang.String): scala.Unit = js.native
  def setPrefix(prefix: java.lang.String): Contact = js.native
  def setPrimaryEmail(primaryEmail: java.lang.String): scala.Unit = js.native
  def setShortName(shortName: java.lang.String): Contact = js.native
  def setSuffix(suffix: java.lang.String): Contact = js.native
  def setUserDefinedField(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setUserDefinedFields(o: js.Any): scala.Unit = js.native
  def setWorkAddress(addr: java.lang.String): scala.Unit = js.native
  def setWorkFax(phone: java.lang.String): scala.Unit = js.native
  def setWorkPhone(phone: java.lang.String): scala.Unit = js.native
}

