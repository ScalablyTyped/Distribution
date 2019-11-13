package typings.googleDashAppsDashScript.GoogleAppsScript.Contacts

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Date
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Month
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Contact contains the name, address, and various contact details of a contact.
  */
@js.native
trait Contact extends js.Object {
  def addAddress(label: String, address: String): AddressField = js.native
  def addAddress(
    label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any,
    address: String
  ): AddressField = js.native
  def addCompany(company: String, title: String): CompanyField = js.native
  def addCustomField(label: String, content: js.Any): CustomField = js.native
  def addCustomField(
    label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExtendedField */ js.Any,
    content: js.Any
  ): CustomField = js.native
  def addDate(label: String, month: Month, day: Integer, year: Integer): DateField = js.native
  def addDate(
    label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any,
    month: Month,
    day: Integer,
    year: Integer
  ): DateField = js.native
  def addEmail(label: String, address: String): EmailField = js.native
  def addEmail(
    label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any,
    address: String
  ): EmailField = js.native
  def addIM(label: String, address: String): IMField = js.native
  def addIM(
    label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any,
    address: String
  ): IMField = js.native
  def addPhone(label: String, number: String): PhoneField = js.native
  def addPhone(
    label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any,
    number: String
  ): PhoneField = js.native
  def addToGroup(group: ContactGroup): Contact = js.native
  def addUrl(label: String, url: String): UrlField = js.native
  def addUrl(
    label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any,
    url: String
  ): UrlField = js.native
  def deleteContact(): Unit = js.native
  def getAddresses(): js.Array[AddressField] = js.native
  def getAddresses(label: String): js.Array[AddressField] = js.native
  def getAddresses(label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any): js.Array[AddressField] = js.native
  def getCompanies(): js.Array[CompanyField] = js.native
  def getContactGroups(): js.Array[ContactGroup] = js.native
  def getCustomFields(): js.Array[CustomField] = js.native
  def getCustomFields(label: String): js.Array[CustomField] = js.native
  def getCustomFields(
    label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExtendedField */ js.Any
  ): js.Array[CustomField] = js.native
  def getDates(): js.Array[DateField] = js.native
  def getDates(label: String): js.Array[DateField] = js.native
  def getDates(label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any): js.Array[DateField] = js.native
  /** @deprecated DO NOT USE */ def getEmailAddresses(): js.Array[String] = js.native
  def getEmails(): js.Array[EmailField] = js.native
  def getEmails(label: String): js.Array[EmailField] = js.native
  def getEmails(label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any): js.Array[EmailField] = js.native
  def getFamilyName(): String = js.native
  def getFullName(): String = js.native
  def getGivenName(): String = js.native
  /** @deprecated DO NOT USE */ def getHomeAddress(): String = js.native
  /** @deprecated DO NOT USE */ def getHomeFax(): String = js.native
  /** @deprecated DO NOT USE */ def getHomePhone(): String = js.native
  def getIMs(): js.Array[IMField] = js.native
  def getIMs(label: String): js.Array[IMField] = js.native
  def getIMs(label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any): js.Array[IMField] = js.native
  def getId(): String = js.native
  def getInitials(): String = js.native
  def getLastUpdated(): Date = js.native
  def getMaidenName(): String = js.native
  def getMiddleName(): String = js.native
  /** @deprecated DO NOT USE */ def getMobilePhone(): String = js.native
  def getNickname(): String = js.native
  def getNotes(): String = js.native
  /** @deprecated DO NOT USE */ def getPager(): String = js.native
  def getPhones(): js.Array[PhoneField] = js.native
  def getPhones(label: String): js.Array[PhoneField] = js.native
  def getPhones(label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any): js.Array[PhoneField] = js.native
  def getPrefix(): String = js.native
  def getPrimaryEmail(): String = js.native
  def getShortName(): String = js.native
  def getSuffix(): String = js.native
  def getUrls(): js.Array[UrlField] = js.native
  def getUrls(label: String): js.Array[UrlField] = js.native
  def getUrls(label: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Field */ js.Any): js.Array[UrlField] = js.native
  /** @deprecated DO NOT USE */ def getUserDefinedField(key: String): String = js.native
  /** @deprecated DO NOT USE */ def getUserDefinedFields(): js.Any = js.native
  /** @deprecated DO NOT USE */ def getWorkAddress(): String = js.native
  /** @deprecated DO NOT USE */ def getWorkFax(): String = js.native
  /** @deprecated DO NOT USE */ def getWorkPhone(): String = js.native
  def removeFromGroup(group: ContactGroup): Contact = js.native
  def setFamilyName(familyName: String): Contact = js.native
  def setFullName(fullName: String): Contact = js.native
  def setGivenName(givenName: String): Contact = js.native
  /** @deprecated DO NOT USE */ def setHomeAddress(addr: String): Unit = js.native
  /** @deprecated DO NOT USE */ def setHomeFax(phone: String): Unit = js.native
  /** @deprecated DO NOT USE */ def setHomePhone(phone: String): Unit = js.native
  def setInitials(initials: String): Contact = js.native
  def setMaidenName(maidenName: String): Contact = js.native
  def setMiddleName(middleName: String): Contact = js.native
  /** @deprecated DO NOT USE */ def setMobilePhone(phone: String): Unit = js.native
  def setNickname(nickname: String): Contact = js.native
  def setNotes(notes: String): Contact = js.native
  /** @deprecated DO NOT USE */ def setPager(phone: String): Unit = js.native
  def setPrefix(prefix: String): Contact = js.native
  /** @deprecated DO NOT USE */ def setPrimaryEmail(primaryEmail: String): Unit = js.native
  def setShortName(shortName: String): Contact = js.native
  def setSuffix(suffix: String): Contact = js.native
  /** @deprecated DO NOT USE */ def setUserDefinedField(key: String, value: String): Unit = js.native
  /** @deprecated DO NOT USE */ def setUserDefinedFields(o: js.Any): Unit = js.native
  /** @deprecated DO NOT USE */ def setWorkAddress(addr: String): Unit = js.native
  /** @deprecated DO NOT USE */ def setWorkFax(phone: String): Unit = js.native
  /** @deprecated DO NOT USE */ def setWorkPhone(phone: String): Unit = js.native
}

