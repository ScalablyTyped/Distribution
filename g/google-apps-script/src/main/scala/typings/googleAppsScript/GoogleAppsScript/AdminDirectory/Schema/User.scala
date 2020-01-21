package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var addresses: js.UndefOr[js.Object] = js.undefined
  var agreedToTerms: js.UndefOr[Boolean] = js.undefined
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var archived: js.UndefOr[Boolean] = js.undefined
  var changePasswordAtNextLogin: js.UndefOr[Boolean] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var customSchemas: js.UndefOr[js.Object] = js.undefined
  var customerId: js.UndefOr[String] = js.undefined
  var deletionTime: js.UndefOr[String] = js.undefined
  var emails: js.UndefOr[js.Object] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var externalIds: js.UndefOr[js.Object] = js.undefined
  var gender: js.UndefOr[js.Object] = js.undefined
  var hashFunction: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var ims: js.UndefOr[js.Object] = js.undefined
  var includeInGlobalAddressList: js.UndefOr[Boolean] = js.undefined
  var ipWhitelisted: js.UndefOr[Boolean] = js.undefined
  var isAdmin: js.UndefOr[Boolean] = js.undefined
  var isDelegatedAdmin: js.UndefOr[Boolean] = js.undefined
  var isEnforcedIn2Sv: js.UndefOr[Boolean] = js.undefined
  var isEnrolledIn2Sv: js.UndefOr[Boolean] = js.undefined
  var isMailboxSetup: js.UndefOr[Boolean] = js.undefined
  var keywords: js.UndefOr[js.Object] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var languages: js.UndefOr[js.Object] = js.undefined
  var lastLoginTime: js.UndefOr[String] = js.undefined
  var locations: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[UserName] = js.undefined
  var nonEditableAliases: js.UndefOr[js.Array[String]] = js.undefined
  var notes: js.UndefOr[js.Object] = js.undefined
  var orgUnitPath: js.UndefOr[String] = js.undefined
  var organizations: js.UndefOr[js.Object] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var phones: js.UndefOr[js.Object] = js.undefined
  var posixAccounts: js.UndefOr[js.Object] = js.undefined
  var primaryEmail: js.UndefOr[String] = js.undefined
  var relations: js.UndefOr[js.Object] = js.undefined
  var sshPublicKeys: js.UndefOr[js.Object] = js.undefined
  var suspended: js.UndefOr[Boolean] = js.undefined
  var suspensionReason: js.UndefOr[String] = js.undefined
  var thumbnailPhotoEtag: js.UndefOr[String] = js.undefined
  var thumbnailPhotoUrl: js.UndefOr[String] = js.undefined
  var websites: js.UndefOr[js.Object] = js.undefined
}

object User {
  @scala.inline
  def apply(
    addresses: js.Object = null,
    agreedToTerms: js.UndefOr[Boolean] = js.undefined,
    aliases: js.Array[String] = null,
    archived: js.UndefOr[Boolean] = js.undefined,
    changePasswordAtNextLogin: js.UndefOr[Boolean] = js.undefined,
    creationTime: String = null,
    customSchemas: js.Object = null,
    customerId: String = null,
    deletionTime: String = null,
    emails: js.Object = null,
    etag: String = null,
    externalIds: js.Object = null,
    gender: js.Object = null,
    hashFunction: String = null,
    id: String = null,
    ims: js.Object = null,
    includeInGlobalAddressList: js.UndefOr[Boolean] = js.undefined,
    ipWhitelisted: js.UndefOr[Boolean] = js.undefined,
    isAdmin: js.UndefOr[Boolean] = js.undefined,
    isDelegatedAdmin: js.UndefOr[Boolean] = js.undefined,
    isEnforcedIn2Sv: js.UndefOr[Boolean] = js.undefined,
    isEnrolledIn2Sv: js.UndefOr[Boolean] = js.undefined,
    isMailboxSetup: js.UndefOr[Boolean] = js.undefined,
    keywords: js.Object = null,
    kind: String = null,
    languages: js.Object = null,
    lastLoginTime: String = null,
    locations: js.Object = null,
    name: UserName = null,
    nonEditableAliases: js.Array[String] = null,
    notes: js.Object = null,
    orgUnitPath: String = null,
    organizations: js.Object = null,
    password: String = null,
    phones: js.Object = null,
    posixAccounts: js.Object = null,
    primaryEmail: String = null,
    relations: js.Object = null,
    sshPublicKeys: js.Object = null,
    suspended: js.UndefOr[Boolean] = js.undefined,
    suspensionReason: String = null,
    thumbnailPhotoEtag: String = null,
    thumbnailPhotoUrl: String = null,
    websites: js.Object = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (!js.isUndefined(agreedToTerms)) __obj.updateDynamic("agreedToTerms")(agreedToTerms.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (!js.isUndefined(changePasswordAtNextLogin)) __obj.updateDynamic("changePasswordAtNextLogin")(changePasswordAtNextLogin.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (customSchemas != null) __obj.updateDynamic("customSchemas")(customSchemas.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (deletionTime != null) __obj.updateDynamic("deletionTime")(deletionTime.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (externalIds != null) __obj.updateDynamic("externalIds")(externalIds.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (hashFunction != null) __obj.updateDynamic("hashFunction")(hashFunction.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ims != null) __obj.updateDynamic("ims")(ims.asInstanceOf[js.Any])
    if (!js.isUndefined(includeInGlobalAddressList)) __obj.updateDynamic("includeInGlobalAddressList")(includeInGlobalAddressList.asInstanceOf[js.Any])
    if (!js.isUndefined(ipWhitelisted)) __obj.updateDynamic("ipWhitelisted")(ipWhitelisted.asInstanceOf[js.Any])
    if (!js.isUndefined(isAdmin)) __obj.updateDynamic("isAdmin")(isAdmin.asInstanceOf[js.Any])
    if (!js.isUndefined(isDelegatedAdmin)) __obj.updateDynamic("isDelegatedAdmin")(isDelegatedAdmin.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnforcedIn2Sv)) __obj.updateDynamic("isEnforcedIn2Sv")(isEnforcedIn2Sv.asInstanceOf[js.Any])
    if (!js.isUndefined(isEnrolledIn2Sv)) __obj.updateDynamic("isEnrolledIn2Sv")(isEnrolledIn2Sv.asInstanceOf[js.Any])
    if (!js.isUndefined(isMailboxSetup)) __obj.updateDynamic("isMailboxSetup")(isMailboxSetup.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (lastLoginTime != null) __obj.updateDynamic("lastLoginTime")(lastLoginTime.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nonEditableAliases != null) __obj.updateDynamic("nonEditableAliases")(nonEditableAliases.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (phones != null) __obj.updateDynamic("phones")(phones.asInstanceOf[js.Any])
    if (posixAccounts != null) __obj.updateDynamic("posixAccounts")(posixAccounts.asInstanceOf[js.Any])
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    if (sshPublicKeys != null) __obj.updateDynamic("sshPublicKeys")(sshPublicKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended.asInstanceOf[js.Any])
    if (suspensionReason != null) __obj.updateDynamic("suspensionReason")(suspensionReason.asInstanceOf[js.Any])
    if (thumbnailPhotoEtag != null) __obj.updateDynamic("thumbnailPhotoEtag")(thumbnailPhotoEtag.asInstanceOf[js.Any])
    if (thumbnailPhotoUrl != null) __obj.updateDynamic("thumbnailPhotoUrl")(thumbnailPhotoUrl.asInstanceOf[js.Any])
    if (websites != null) __obj.updateDynamic("websites")(websites.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}

