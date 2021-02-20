package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUISettings extends StObject {
  
  var adminMessage: js.UndefOr[AdminMessage] = js.native
  
  var askAnAdmin: js.UndefOr[AskAnAdmin] = js.native
  
  var enableAdminMessage: js.UndefOr[String] = js.native
  
  var enableAdminMessageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var enableEasySignCanUseMultiTemplateApply: js.UndefOr[String] = js.native
  
  var enableEasySignCanUseMultiTemplateApplyMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var enableEasySignTemplateUpload: js.UndefOr[String] = js.native
  
  var enableEasySignTemplateUploadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var enableEnvelopeCopyWithData: js.UndefOr[String] = js.native
  
  var enableEnvelopeCopyWithDataMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var hideSendAnEnvelope: js.UndefOr[String] = js.native
  
  var hideSendAnEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the **Templates** menu is hidden from account users who are not Admins. The default value is **false**.
    */
  var hideUseATemplate: js.UndefOr[String] = js.native
  
  var hideUseATemplateInPrepare: js.UndefOr[String] = js.native
  
  var hideUseATemplateInPrepareMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var hideUseATemplateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var orderBasedRecipientIdGeneration: js.UndefOr[String] = js.native
  
  var orderBasedRecipientIdGenerationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var removeEnvelopeForwarding: js.UndefOr[String] = js.native
  
  var removeEnvelopeForwardingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var shouldRedactAccessCode: js.UndefOr[String] = js.native
  
  var shouldRedactAccessCodeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var uploadNewImageToSignOrInitial: js.UndefOr[String] = js.native
  
  var uploadNewImageToSignOrInitialMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
}
object AccountUISettings {
  
  @scala.inline
  def apply(): AccountUISettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUISettings]
  }
  
  @scala.inline
  implicit class AccountUISettingsMutableBuilder[Self <: AccountUISettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminMessage(value: AdminMessage): Self = StObject.set(x, "adminMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminMessageUndefined: Self = StObject.set(x, "adminMessage", js.undefined)
    
    @scala.inline
    def setAskAnAdmin(value: AskAnAdmin): Self = StObject.set(x, "askAnAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAskAnAdminUndefined: Self = StObject.set(x, "askAnAdmin", js.undefined)
    
    @scala.inline
    def setEnableAdminMessage(value: String): Self = StObject.set(x, "enableAdminMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAdminMessageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableAdminMessageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAdminMessageMetadataUndefined: Self = StObject.set(x, "enableAdminMessageMetadata", js.undefined)
    
    @scala.inline
    def setEnableAdminMessageUndefined: Self = StObject.set(x, "enableAdminMessage", js.undefined)
    
    @scala.inline
    def setEnableEasySignCanUseMultiTemplateApply(value: String): Self = StObject.set(x, "enableEasySignCanUseMultiTemplateApply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEasySignCanUseMultiTemplateApplyMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableEasySignCanUseMultiTemplateApplyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEasySignCanUseMultiTemplateApplyMetadataUndefined: Self = StObject.set(x, "enableEasySignCanUseMultiTemplateApplyMetadata", js.undefined)
    
    @scala.inline
    def setEnableEasySignCanUseMultiTemplateApplyUndefined: Self = StObject.set(x, "enableEasySignCanUseMultiTemplateApply", js.undefined)
    
    @scala.inline
    def setEnableEasySignTemplateUpload(value: String): Self = StObject.set(x, "enableEasySignTemplateUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEasySignTemplateUploadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableEasySignTemplateUploadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEasySignTemplateUploadMetadataUndefined: Self = StObject.set(x, "enableEasySignTemplateUploadMetadata", js.undefined)
    
    @scala.inline
    def setEnableEasySignTemplateUploadUndefined: Self = StObject.set(x, "enableEasySignTemplateUpload", js.undefined)
    
    @scala.inline
    def setEnableEnvelopeCopyWithData(value: String): Self = StObject.set(x, "enableEnvelopeCopyWithData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEnvelopeCopyWithDataMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableEnvelopeCopyWithDataMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEnvelopeCopyWithDataMetadataUndefined: Self = StObject.set(x, "enableEnvelopeCopyWithDataMetadata", js.undefined)
    
    @scala.inline
    def setEnableEnvelopeCopyWithDataUndefined: Self = StObject.set(x, "enableEnvelopeCopyWithData", js.undefined)
    
    @scala.inline
    def setHideSendAnEnvelope(value: String): Self = StObject.set(x, "hideSendAnEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSendAnEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "hideSendAnEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSendAnEnvelopeMetadataUndefined: Self = StObject.set(x, "hideSendAnEnvelopeMetadata", js.undefined)
    
    @scala.inline
    def setHideSendAnEnvelopeUndefined: Self = StObject.set(x, "hideSendAnEnvelope", js.undefined)
    
    @scala.inline
    def setHideUseATemplate(value: String): Self = StObject.set(x, "hideUseATemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUseATemplateInPrepare(value: String): Self = StObject.set(x, "hideUseATemplateInPrepare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUseATemplateInPrepareMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "hideUseATemplateInPrepareMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUseATemplateInPrepareMetadataUndefined: Self = StObject.set(x, "hideUseATemplateInPrepareMetadata", js.undefined)
    
    @scala.inline
    def setHideUseATemplateInPrepareUndefined: Self = StObject.set(x, "hideUseATemplateInPrepare", js.undefined)
    
    @scala.inline
    def setHideUseATemplateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "hideUseATemplateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUseATemplateMetadataUndefined: Self = StObject.set(x, "hideUseATemplateMetadata", js.undefined)
    
    @scala.inline
    def setHideUseATemplateUndefined: Self = StObject.set(x, "hideUseATemplate", js.undefined)
    
    @scala.inline
    def setOrderBasedRecipientIdGeneration(value: String): Self = StObject.set(x, "orderBasedRecipientIdGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBasedRecipientIdGenerationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "orderBasedRecipientIdGenerationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBasedRecipientIdGenerationMetadataUndefined: Self = StObject.set(x, "orderBasedRecipientIdGenerationMetadata", js.undefined)
    
    @scala.inline
    def setOrderBasedRecipientIdGenerationUndefined: Self = StObject.set(x, "orderBasedRecipientIdGeneration", js.undefined)
    
    @scala.inline
    def setRemoveEnvelopeForwarding(value: String): Self = StObject.set(x, "removeEnvelopeForwarding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEnvelopeForwardingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "removeEnvelopeForwardingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEnvelopeForwardingMetadataUndefined: Self = StObject.set(x, "removeEnvelopeForwardingMetadata", js.undefined)
    
    @scala.inline
    def setRemoveEnvelopeForwardingUndefined: Self = StObject.set(x, "removeEnvelopeForwarding", js.undefined)
    
    @scala.inline
    def setShouldRedactAccessCode(value: String): Self = StObject.set(x, "shouldRedactAccessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRedactAccessCodeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "shouldRedactAccessCodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRedactAccessCodeMetadataUndefined: Self = StObject.set(x, "shouldRedactAccessCodeMetadata", js.undefined)
    
    @scala.inline
    def setShouldRedactAccessCodeUndefined: Self = StObject.set(x, "shouldRedactAccessCode", js.undefined)
    
    @scala.inline
    def setUploadNewImageToSignOrInitial(value: String): Self = StObject.set(x, "uploadNewImageToSignOrInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadNewImageToSignOrInitialMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "uploadNewImageToSignOrInitialMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadNewImageToSignOrInitialMetadataUndefined: Self = StObject.set(x, "uploadNewImageToSignOrInitialMetadata", js.undefined)
    
    @scala.inline
    def setUploadNewImageToSignOrInitialUndefined: Self = StObject.set(x, "uploadNewImageToSignOrInitial", js.undefined)
  }
}
