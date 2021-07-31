package typings.docusignEsign.mod

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "AccountsApi")
@js.native
class AccountsApi protected () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def _delete(accountId: String): js.Promise[Unit] = js.native
  def _delete(accountId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def create(): js.Promise[NewAccountSummary] = js.native
  def create(optsOrCallback: js.Any): js.Promise[NewAccountSummary] = js.native
  def create(optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[NewAccountSummary] = js.native
  def create(optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[NewAccountSummary] = js.native
  
  def createBrand(accountId: String): js.Promise[BrandsResponse] = js.native
  def createBrand(accountId: String, optsOrCallback: js.Any): js.Promise[BrandsResponse] = js.native
  def createBrand(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  def createBrand(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  
  def createCustomField(accountId: String): js.Promise[CustomFields] = js.native
  def createCustomField(accountId: String, optsOrCallback: js.Any): js.Promise[CustomFields] = js.native
  def createCustomField(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def createCustomField(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  
  def createPermissionProfile(accountId: String): js.Promise[PermissionProfile] = js.native
  def createPermissionProfile(accountId: String, optsOrCallback: js.Any): js.Promise[PermissionProfile] = js.native
  def createPermissionProfile(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[PermissionProfile] = js.native
  def createPermissionProfile(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PermissionProfile] = js.native
  
  def deleteBrand(accountId: String, brandId: String): js.Promise[Unit] = js.native
  def deleteBrand(accountId: String, brandId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def deleteBrandLogoByType(accountId: String, brandId: String, logoType: String): js.Promise[Unit] = js.native
  def deleteBrandLogoByType(accountId: String, brandId: String, logoType: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def deleteBrands(accountId: String): js.Promise[BrandsResponse] = js.native
  def deleteBrands(accountId: String, optsOrCallback: js.Any): js.Promise[BrandsResponse] = js.native
  def deleteBrands(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  def deleteBrands(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  
  def deleteCaptiveRecipient(accountId: String, recipientPart: String): js.Promise[CaptiveRecipientInformation] = js.native
  def deleteCaptiveRecipient(accountId: String, recipientPart: String, optsOrCallback: js.Any): js.Promise[CaptiveRecipientInformation] = js.native
  def deleteCaptiveRecipient(accountId: String, recipientPart: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[CaptiveRecipientInformation] = js.native
  def deleteCaptiveRecipient(accountId: String, recipientPart: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CaptiveRecipientInformation] = js.native
  
  def deleteCustomField(accountId: String, customFieldId: String): js.Promise[Unit] = js.native
  def deleteCustomField(accountId: String, customFieldId: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def deleteCustomField(accountId: String, customFieldId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def deleteCustomField(accountId: String, customFieldId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def deleteENoteConfiguration(accountId: String): js.Promise[Unit] = js.native
  def deleteENoteConfiguration(accountId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def deletePermissionProfile(accountId: String, permissionProfileId: String): js.Promise[Unit] = js.native
  def deletePermissionProfile(accountId: String, permissionProfileId: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def deletePermissionProfile(
    accountId: String,
    permissionProfileId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def deletePermissionProfile(accountId: String, permissionProfileId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def getAccountIdentityVerification(accountId: String): js.Promise[AccountIdentityVerificationResponse] = js.native
  def getAccountIdentityVerification(accountId: String, callback: js.Function0[Unit]): js.Promise[AccountIdentityVerificationResponse] = js.native
  
  def getAccountInformation(accountId: String): js.Promise[AccountInformation] = js.native
  def getAccountInformation(accountId: String, optsOrCallback: js.Any): js.Promise[AccountInformation] = js.native
  def getAccountInformation(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[AccountInformation] = js.native
  def getAccountInformation(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[AccountInformation] = js.native
  
  def getAccountTabSettings(accountId: String): js.Promise[TabAccountSettings] = js.native
  def getAccountTabSettings(accountId: String, callback: js.Function0[Unit]): js.Promise[TabAccountSettings] = js.native
  
  def getAllPaymentGatewayAccounts(accountId: String): js.Promise[PaymentGatewayAccountsInfo] = js.native
  def getAllPaymentGatewayAccounts(accountId: String, callback: js.Function0[Unit]): js.Promise[PaymentGatewayAccountsInfo] = js.native
  
  def getBillingCharges(accountId: String): js.Promise[BillingChargeResponse] = js.native
  def getBillingCharges(accountId: String, optsOrCallback: js.Any): js.Promise[BillingChargeResponse] = js.native
  def getBillingCharges(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BillingChargeResponse] = js.native
  def getBillingCharges(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BillingChargeResponse] = js.native
  
  def getBrand(accountId: String, brandId: String): js.Promise[Brand] = js.native
  def getBrand(accountId: String, brandId: String, optsOrCallback: js.Any): js.Promise[Brand] = js.native
  def getBrand(accountId: String, brandId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Brand] = js.native
  def getBrand(accountId: String, brandId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Brand] = js.native
  
  def getBrandExportFile(accountId: String, brandId: String): js.Promise[Unit] = js.native
  def getBrandExportFile(accountId: String, brandId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def getBrandLogoByType(accountId: String, brandId: String, logoType: String): js.Promise[js.Object] = js.native
  def getBrandLogoByType(accountId: String, brandId: String, logoType: String, callback: js.Function0[Unit]): js.Promise[js.Object] = js.native
  
  def getBrandResources(accountId: String, brandId: String): js.Promise[BrandResourcesList] = js.native
  def getBrandResources(accountId: String, brandId: String, callback: js.Function0[Unit]): js.Promise[BrandResourcesList] = js.native
  
  def getBrandResourcesByContentType(accountId: String, brandId: String, resourceContentType: String): js.Promise[Unit] = js.native
  def getBrandResourcesByContentType(accountId: String, brandId: String, resourceContentType: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def getBrandResourcesByContentType(
    accountId: String,
    brandId: String,
    resourceContentType: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def getBrandResourcesByContentType(
    accountId: String,
    brandId: String,
    resourceContentType: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  
  def getConsumerDisclosure(accountId: String, langCode: String): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosure(accountId: String, langCode: String, callback: js.Function0[Unit]): js.Promise[ConsumerDisclosure] = js.native
  
  def getConsumerDisclosureDefault(accountId: String): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosureDefault(accountId: String, optsOrCallback: js.Any): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosureDefault(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosureDefault(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ConsumerDisclosure] = js.native
  
  def getENoteConfiguration(accountId: String): js.Promise[ENoteConfiguration] = js.native
  def getENoteConfiguration(accountId: String, callback: js.Function0[Unit]): js.Promise[ENoteConfiguration] = js.native
  
  def getEnvelopePurgeConfiguration(accountId: String): js.Promise[EnvelopePurgeConfiguration] = js.native
  def getEnvelopePurgeConfiguration(accountId: String, callback: js.Function0[Unit]): js.Promise[EnvelopePurgeConfiguration] = js.native
  
  def getFavoriteTemplates(accountId: String): js.Promise[FavoriteTemplatesInfo] = js.native
  def getFavoriteTemplates(accountId: String, callback: js.Function0[Unit]): js.Promise[FavoriteTemplatesInfo] = js.native
  
  def getNotificationDefaults(accountId: String): js.Promise[NotificationDefaults] = js.native
  def getNotificationDefaults(accountId: String, callback: js.Function0[Unit]): js.Promise[NotificationDefaults] = js.native
  
  def getPasswordRules(accountId: String): js.Promise[AccountPasswordRules] = js.native
  def getPasswordRules(accountId: String, callback: js.Function0[Unit]): js.Promise[AccountPasswordRules] = js.native
  
  def getPasswordRules_0(): js.Promise[UserPasswordRules] = js.native
  def getPasswordRules_0(callback: js.Function0[Unit]): js.Promise[UserPasswordRules] = js.native
  
  def getPermissionProfile(accountId: String, permissionProfileId: String): js.Promise[PermissionProfile] = js.native
  def getPermissionProfile(accountId: String, permissionProfileId: String, optsOrCallback: js.Any): js.Promise[PermissionProfile] = js.native
  def getPermissionProfile(
    accountId: String,
    permissionProfileId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[PermissionProfile] = js.native
  def getPermissionProfile(accountId: String, permissionProfileId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PermissionProfile] = js.native
  
  def getProvisioning(): js.Promise[ProvisioningInformation] = js.native
  def getProvisioning(callback: js.Function0[Unit]): js.Promise[ProvisioningInformation] = js.native
  
  def getSupportedLanguages(accountId: String): js.Promise[SupportedLanguages] = js.native
  def getSupportedLanguages(accountId: String, callback: js.Function0[Unit]): js.Promise[SupportedLanguages] = js.native
  
  def getWatermark(accountId: String): js.Promise[Watermark] = js.native
  def getWatermark(accountId: String, callback: js.Function0[Unit]): js.Promise[Watermark] = js.native
  
  def getWatermarkPreview(accountId: String): js.Promise[Watermark] = js.native
  def getWatermarkPreview(accountId: String, optsOrCallback: js.Any): js.Promise[Watermark] = js.native
  def getWatermarkPreview(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Watermark] = js.native
  def getWatermarkPreview(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Watermark] = js.native
  
  def listBrands(accountId: String): js.Promise[BrandsResponse] = js.native
  def listBrands(accountId: String, optsOrCallback: js.Any): js.Promise[BrandsResponse] = js.native
  def listBrands(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  def listBrands(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[BrandsResponse] = js.native
  
  def listCustomFields(accountId: String): js.Promise[CustomFields] = js.native
  def listCustomFields(accountId: String, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  
  def listPermissions(accountId: String): js.Promise[PermissionProfileInformation] = js.native
  def listPermissions(accountId: String, optsOrCallback: js.Any): js.Promise[PermissionProfileInformation] = js.native
  def listPermissions(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[PermissionProfileInformation] = js.native
  def listPermissions(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PermissionProfileInformation] = js.native
  
  def listRecipientNamesByEmail(accountId: String): js.Promise[RecipientNamesResponse] = js.native
  def listRecipientNamesByEmail(accountId: String, optsOrCallback: js.Any): js.Promise[RecipientNamesResponse] = js.native
  def listRecipientNamesByEmail(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[RecipientNamesResponse] = js.native
  def listRecipientNamesByEmail(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[RecipientNamesResponse] = js.native
  
  def listSettings(accountId: String): js.Promise[AccountSettingsInformation] = js.native
  def listSettings(accountId: String, callback: js.Function0[Unit]): js.Promise[AccountSettingsInformation] = js.native
  
  def listSignatureProviders(accountId: String): js.Promise[AccountSignatureProviders] = js.native
  def listSignatureProviders(accountId: String, callback: js.Function0[Unit]): js.Promise[AccountSignatureProviders] = js.native
  
  def listUnsupportedFileTypes(accountId: String): js.Promise[FileTypeList] = js.native
  def listUnsupportedFileTypes(accountId: String, callback: js.Function0[Unit]): js.Promise[FileTypeList] = js.native
  
  def unFavoriteTemplate(accountId: String): js.Promise[FavoriteTemplatesInfo] = js.native
  def unFavoriteTemplate(accountId: String, optsOrCallback: js.Any): js.Promise[FavoriteTemplatesInfo] = js.native
  def unFavoriteTemplate(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[FavoriteTemplatesInfo] = js.native
  def unFavoriteTemplate(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[FavoriteTemplatesInfo] = js.native
  
  def updateAccountTabSettings(accountId: String): js.Promise[TabAccountSettings] = js.native
  def updateAccountTabSettings(accountId: String, optsOrCallback: js.Any): js.Promise[TabAccountSettings] = js.native
  def updateAccountTabSettings(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[TabAccountSettings] = js.native
  def updateAccountTabSettings(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[TabAccountSettings] = js.native
  
  def updateBrand(accountId: String, brandId: String): js.Promise[Brand] = js.native
  def updateBrand(accountId: String, brandId: String, optsOrCallback: js.Any): js.Promise[Brand] = js.native
  def updateBrand(accountId: String, brandId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Brand] = js.native
  def updateBrand(accountId: String, brandId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Brand] = js.native
  
  def updateBrandLogoByType(logoFileBytes: Blob, accountId: String, brandId: String, logoType: String): js.Promise[Unit] = js.native
  def updateBrandLogoByType(
    logoFileBytes: Blob,
    accountId: String,
    brandId: String,
    logoType: String,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  
  def updateBrandResourcesByContentType(accountId: String, brandId: String, resourceContentType: String): js.Promise[BrandResources] = js.native
  def updateBrandResourcesByContentType(accountId: String, brandId: String, resourceContentType: String, callback: js.Function0[Unit]): js.Promise[BrandResources] = js.native
  
  def updateConsumerDisclosure(accountId: String, langCode: String): js.Promise[ConsumerDisclosure] = js.native
  def updateConsumerDisclosure(accountId: String, langCode: String, optsOrCallback: js.Any): js.Promise[ConsumerDisclosure] = js.native
  def updateConsumerDisclosure(accountId: String, langCode: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[ConsumerDisclosure] = js.native
  def updateConsumerDisclosure(accountId: String, langCode: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ConsumerDisclosure] = js.native
  
  def updateCustomField(accountId: String, customFieldId: String): js.Promise[CustomFields] = js.native
  def updateCustomField(accountId: String, customFieldId: String, optsOrCallback: js.Any): js.Promise[CustomFields] = js.native
  def updateCustomField(accountId: String, customFieldId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def updateCustomField(accountId: String, customFieldId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  
  def updateENoteConfiguration(accountId: String): js.Promise[ENoteConfiguration] = js.native
  def updateENoteConfiguration(accountId: String, optsOrCallback: js.Any): js.Promise[ENoteConfiguration] = js.native
  def updateENoteConfiguration(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[ENoteConfiguration] = js.native
  def updateENoteConfiguration(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ENoteConfiguration] = js.native
  
  def updateEnvelopePurgeConfiguration(accountId: String): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(accountId: String, optsOrCallback: js.Any): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[EnvelopePurgeConfiguration] = js.native
  def updateEnvelopePurgeConfiguration(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopePurgeConfiguration] = js.native
  
  def updateFavoriteTemplate(accountId: String): js.Promise[FavoriteTemplatesInfo] = js.native
  def updateFavoriteTemplate(accountId: String, optsOrCallback: js.Any): js.Promise[FavoriteTemplatesInfo] = js.native
  def updateFavoriteTemplate(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[FavoriteTemplatesInfo] = js.native
  def updateFavoriteTemplate(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[FavoriteTemplatesInfo] = js.native
  
  def updateNotificationDefaults(accountId: String): js.Promise[NotificationDefaults] = js.native
  def updateNotificationDefaults(accountId: String, optsOrCallback: js.Any): js.Promise[NotificationDefaults] = js.native
  def updateNotificationDefaults(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[NotificationDefaults] = js.native
  def updateNotificationDefaults(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[NotificationDefaults] = js.native
  
  def updatePasswordRules(accountId: String): js.Promise[AccountPasswordRules] = js.native
  def updatePasswordRules(accountId: String, optsOrCallback: js.Any): js.Promise[AccountPasswordRules] = js.native
  def updatePasswordRules(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[AccountPasswordRules] = js.native
  def updatePasswordRules(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[AccountPasswordRules] = js.native
  
  def updatePermissionProfile(accountId: String, permissionProfileId: String): js.Promise[PermissionProfile] = js.native
  def updatePermissionProfile(accountId: String, permissionProfileId: String, optsOrCallback: js.Any): js.Promise[PermissionProfile] = js.native
  def updatePermissionProfile(
    accountId: String,
    permissionProfileId: String,
    optsOrCallback: js.Any,
    callback: js.Function0[Unit]
  ): js.Promise[PermissionProfile] = js.native
  def updatePermissionProfile(accountId: String, permissionProfileId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[PermissionProfile] = js.native
  
  def updateSettings(accountId: String): js.Promise[Unit] = js.native
  def updateSettings(accountId: String, optsOrCallback: js.Any): js.Promise[Unit] = js.native
  def updateSettings(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def updateSettings(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def updateWatermark(accountId: String): js.Promise[Watermark] = js.native
  def updateWatermark(accountId: String, optsOrCallback: js.Any): js.Promise[Watermark] = js.native
  def updateWatermark(accountId: String, optsOrCallback: js.Any, callback: js.Function0[Unit]): js.Promise[Watermark] = js.native
  def updateWatermark(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Watermark] = js.native
}
