package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var addresses: js.UndefOr[js.Object] = js.undefined
  var agreedToTerms: js.UndefOr[scala.Boolean] = js.undefined
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  var changePasswordAtNextLogin: js.UndefOr[scala.Boolean] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var customSchemas: js.UndefOr[js.Object] = js.undefined
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  var deletionTime: js.UndefOr[java.lang.String] = js.undefined
  var emails: js.UndefOr[js.Object] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var externalIds: js.UndefOr[js.Object] = js.undefined
  var gender: js.UndefOr[js.Object] = js.undefined
  var hashFunction: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var ims: js.UndefOr[js.Object] = js.undefined
  var includeInGlobalAddressList: js.UndefOr[scala.Boolean] = js.undefined
  var ipWhitelisted: js.UndefOr[scala.Boolean] = js.undefined
  var isAdmin: js.UndefOr[scala.Boolean] = js.undefined
  var isDelegatedAdmin: js.UndefOr[scala.Boolean] = js.undefined
  var isEnforcedIn2Sv: js.UndefOr[scala.Boolean] = js.undefined
  var isEnrolledIn2Sv: js.UndefOr[scala.Boolean] = js.undefined
  var isMailboxSetup: js.UndefOr[scala.Boolean] = js.undefined
  var keywords: js.UndefOr[js.Object] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var languages: js.UndefOr[js.Object] = js.undefined
  var lastLoginTime: js.UndefOr[java.lang.String] = js.undefined
  var locations: js.UndefOr[js.Object] = js.undefined
  var name: js.UndefOr[UserName] = js.undefined
  var nonEditableAliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var notes: js.UndefOr[js.Object] = js.undefined
  var orgUnitPath: js.UndefOr[java.lang.String] = js.undefined
  var organizations: js.UndefOr[js.Object] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var phones: js.UndefOr[js.Object] = js.undefined
  var posixAccounts: js.UndefOr[js.Object] = js.undefined
  var primaryEmail: js.UndefOr[java.lang.String] = js.undefined
  var relations: js.UndefOr[js.Object] = js.undefined
  var sshPublicKeys: js.UndefOr[js.Object] = js.undefined
  var suspended: js.UndefOr[scala.Boolean] = js.undefined
  var suspensionReason: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailPhotoEtag: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailPhotoUrl: js.UndefOr[java.lang.String] = js.undefined
  var websites: js.UndefOr[js.Object] = js.undefined
}

object User {
  @scala.inline
  def apply(
    addresses: js.Object = null,
    agreedToTerms: js.UndefOr[scala.Boolean] = js.undefined,
    aliases: js.Array[java.lang.String] = null,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    changePasswordAtNextLogin: js.UndefOr[scala.Boolean] = js.undefined,
    creationTime: java.lang.String = null,
    customSchemas: js.Object = null,
    customerId: java.lang.String = null,
    deletionTime: java.lang.String = null,
    emails: js.Object = null,
    etag: java.lang.String = null,
    externalIds: js.Object = null,
    gender: js.Object = null,
    hashFunction: java.lang.String = null,
    id: java.lang.String = null,
    ims: js.Object = null,
    includeInGlobalAddressList: js.UndefOr[scala.Boolean] = js.undefined,
    ipWhitelisted: js.UndefOr[scala.Boolean] = js.undefined,
    isAdmin: js.UndefOr[scala.Boolean] = js.undefined,
    isDelegatedAdmin: js.UndefOr[scala.Boolean] = js.undefined,
    isEnforcedIn2Sv: js.UndefOr[scala.Boolean] = js.undefined,
    isEnrolledIn2Sv: js.UndefOr[scala.Boolean] = js.undefined,
    isMailboxSetup: js.UndefOr[scala.Boolean] = js.undefined,
    keywords: js.Object = null,
    kind: java.lang.String = null,
    languages: js.Object = null,
    lastLoginTime: java.lang.String = null,
    locations: js.Object = null,
    name: UserName = null,
    nonEditableAliases: js.Array[java.lang.String] = null,
    notes: js.Object = null,
    orgUnitPath: java.lang.String = null,
    organizations: js.Object = null,
    password: java.lang.String = null,
    phones: js.Object = null,
    posixAccounts: js.Object = null,
    primaryEmail: java.lang.String = null,
    relations: js.Object = null,
    sshPublicKeys: js.Object = null,
    suspended: js.UndefOr[scala.Boolean] = js.undefined,
    suspensionReason: java.lang.String = null,
    thumbnailPhotoEtag: java.lang.String = null,
    thumbnailPhotoUrl: java.lang.String = null,
    websites: js.Object = null
  ): User = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (!js.isUndefined(agreedToTerms)) __obj.updateDynamic("agreedToTerms")(agreedToTerms)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (!js.isUndefined(changePasswordAtNextLogin)) __obj.updateDynamic("changePasswordAtNextLogin")(changePasswordAtNextLogin)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (customSchemas != null) __obj.updateDynamic("customSchemas")(customSchemas)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (deletionTime != null) __obj.updateDynamic("deletionTime")(deletionTime)
    if (emails != null) __obj.updateDynamic("emails")(emails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (externalIds != null) __obj.updateDynamic("externalIds")(externalIds)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (hashFunction != null) __obj.updateDynamic("hashFunction")(hashFunction)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ims != null) __obj.updateDynamic("ims")(ims)
    if (!js.isUndefined(includeInGlobalAddressList)) __obj.updateDynamic("includeInGlobalAddressList")(includeInGlobalAddressList)
    if (!js.isUndefined(ipWhitelisted)) __obj.updateDynamic("ipWhitelisted")(ipWhitelisted)
    if (!js.isUndefined(isAdmin)) __obj.updateDynamic("isAdmin")(isAdmin)
    if (!js.isUndefined(isDelegatedAdmin)) __obj.updateDynamic("isDelegatedAdmin")(isDelegatedAdmin)
    if (!js.isUndefined(isEnforcedIn2Sv)) __obj.updateDynamic("isEnforcedIn2Sv")(isEnforcedIn2Sv)
    if (!js.isUndefined(isEnrolledIn2Sv)) __obj.updateDynamic("isEnrolledIn2Sv")(isEnrolledIn2Sv)
    if (!js.isUndefined(isMailboxSetup)) __obj.updateDynamic("isMailboxSetup")(isMailboxSetup)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (lastLoginTime != null) __obj.updateDynamic("lastLoginTime")(lastLoginTime)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (name != null) __obj.updateDynamic("name")(name)
    if (nonEditableAliases != null) __obj.updateDynamic("nonEditableAliases")(nonEditableAliases)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (orgUnitPath != null) __obj.updateDynamic("orgUnitPath")(orgUnitPath)
    if (organizations != null) __obj.updateDynamic("organizations")(organizations)
    if (password != null) __obj.updateDynamic("password")(password)
    if (phones != null) __obj.updateDynamic("phones")(phones)
    if (posixAccounts != null) __obj.updateDynamic("posixAccounts")(posixAccounts)
    if (primaryEmail != null) __obj.updateDynamic("primaryEmail")(primaryEmail)
    if (relations != null) __obj.updateDynamic("relations")(relations)
    if (sshPublicKeys != null) __obj.updateDynamic("sshPublicKeys")(sshPublicKeys)
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended)
    if (suspensionReason != null) __obj.updateDynamic("suspensionReason")(suspensionReason)
    if (thumbnailPhotoEtag != null) __obj.updateDynamic("thumbnailPhotoEtag")(thumbnailPhotoEtag)
    if (thumbnailPhotoUrl != null) __obj.updateDynamic("thumbnailPhotoUrl")(thumbnailPhotoUrl)
    if (websites != null) __obj.updateDynamic("websites")(websites)
    __obj.asInstanceOf[User]
  }
}

