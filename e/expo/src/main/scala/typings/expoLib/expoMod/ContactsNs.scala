package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Contacts")
@js.native
object ContactsNs extends js.Object {
  
  trait Contact extends js.Object {
    var addresses: js.UndefOr[js.Array[expoLib.Anon_City]] = js.undefined
    var company: js.UndefOr[java.lang.String] = js.undefined
    var contactType: java.lang.String
    var dates: js.UndefOr[js.Array[expoLib.Anon_Label]] = js.undefined
    var department: js.UndefOr[java.lang.String] = js.undefined
    var emails: js.UndefOr[js.Array[expoLib.Anon_Email]] = js.undefined
    var firstName: js.UndefOr[java.lang.String] = js.undefined
    var id: java.lang.String
    var image: js.UndefOr[expoLib.Anon_UriStringOptional] = js.undefined
    var imageAvailable: js.UndefOr[scala.Boolean] = js.undefined
    var instantMessageAddresses: js.UndefOr[js.Array[expoLib.Anon_Username]] = js.undefined
    var jobTitle: js.UndefOr[java.lang.String] = js.undefined
    var lastName: js.UndefOr[java.lang.String] = js.undefined
    var middleName: js.UndefOr[java.lang.String] = js.undefined
    var name: java.lang.String
    var namePrefix: js.UndefOr[java.lang.String] = js.undefined
    var nameSuffix: js.UndefOr[java.lang.String] = js.undefined
    var nickname: js.UndefOr[java.lang.String] = js.undefined
    var note: js.UndefOr[java.lang.String] = js.undefined
    var phoneNumbers: js.UndefOr[js.Array[expoLib.Anon_Number]] = js.undefined
    var phoneticFirstName: js.UndefOr[java.lang.String] = js.undefined
    var phoneticLastName: js.UndefOr[java.lang.String] = js.undefined
    var phoneticMiddleName: js.UndefOr[java.lang.String] = js.undefined
    var previousLastName: js.UndefOr[java.lang.String] = js.undefined
    var relationships: js.UndefOr[js.Array[expoLib.Anon_NameLabel]] = js.undefined
    var socialProfiles: js.UndefOr[js.Array[expoLib.Anon_Url]] = js.undefined
    var thumbnail: js.UndefOr[expoLib.Anon_UriStringOptional] = js.undefined
    var urls: js.UndefOr[expoLib.Anon_UrlLabel] = js.undefined
  }
  
  
  trait Options extends js.Object {
    var fields: js.UndefOr[js.Array[FieldType]] = js.undefined
    var pageOffset: js.UndefOr[scala.Double] = js.undefined
    var pageSize: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait Response extends js.Object {
    var data: js.Array[Contact]
    var hasNextPage: scala.Boolean
    var hasPreviousPage: scala.Boolean
    var total: scala.Double
  }
  
  val ADDRESSES: Addresses = js.native
  val BIRTHDAY: Birthday = js.native
  val DATES: Dates = js.native
  val EMAILS: Emails = js.native
  val IMAGE: Image = js.native
  val IM_ADDRESSES: InstantMessageAddresses = js.native
  val NAME_PREFIX: NamePrefix = js.native
  val NAME_SUFFIX: NameSuffix = js.native
  val NON_GREGORIAN_BIRTHDAY: NonGregorianBirthday = js.native
  val NOTE: Note = js.native
  val PHONETIC_FIRST_NAME: PhoneticFirstName = js.native
  val PHONETIC_LAST_NAME: PhoneticLastName = js.native
  val PHONETIC_MIDDLE_NAME: PhoneticMiddleName = js.native
  val PHONE_NUMBERS: PhoneNumbers = js.native
  val RELATIONSHIPS: Relationships = js.native
  val SOCIAL_PROFILES: SocialProfiles = js.native
  val THUMBNAIL: Thumbnail = js.native
  val URLS: UrlAddresses = js.native
  def getContactByIdAsync(options: expoLib.Anon_Fields): js.Promise[Contact] = js.native
  def getContactsAsync(options: Options): js.Promise[Response] = js.native
  type Addresses = expoLib.expoLibStrings.addresses
  type Birthday = expoLib.expoLibStrings.birthday
  type Dates = expoLib.expoLibStrings.dates
  type Emails = expoLib.expoLibStrings.emails
  type FieldType = PhoneNumbers | Emails | Addresses | Image | Thumbnail | Note | Birthday | NonGregorianBirthday | NamePrefix | NameSuffix | PhoneticFirstName | PhoneticMiddleName | PhoneticLastName | SocialProfiles | InstantMessageAddresses | UrlAddresses | Dates | Relationships
  type Image = expoLib.expoLibStrings.image
  type InstantMessageAddresses = expoLib.expoLibStrings.instantMessageAddresses
  type NamePrefix = expoLib.expoLibStrings.namePrefix
  type NameSuffix = expoLib.expoLibStrings.nameSuffix
  type NonGregorianBirthday = expoLib.expoLibStrings.nonGregorianBirthday
  type Note = expoLib.expoLibStrings.note
  type PhoneNumbers = expoLib.expoLibStrings.phoneNumbers
  type PhoneticFirstName = expoLib.expoLibStrings.phoneticFirstName
  type PhoneticLastName = expoLib.expoLibStrings.phoneticLastName
  type PhoneticMiddleName = expoLib.expoLibStrings.phoneticMiddleName
  type Relationships = expoLib.expoLibStrings.relationships
  type SocialProfiles = expoLib.expoLibStrings.socialProfiles
  type Thumbnail = expoLib.expoLibStrings.thumbnail
  type UrlAddresses = expoLib.expoLibStrings.urlAddresses
}

