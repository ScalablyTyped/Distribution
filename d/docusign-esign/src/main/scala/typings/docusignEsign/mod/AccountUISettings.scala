package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountUISettings extends StObject {
  
  var adminMessage: js.UndefOr[AdminMessage] = js.undefined
  
  var askAnAdmin: js.UndefOr[AskAnAdmin] = js.undefined
  
  var enableAdminMessage: js.UndefOr[String] = js.undefined
  
  var enableAdminMessageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var enableEasySignCanUseMultiTemplateApply: js.UndefOr[String] = js.undefined
  
  var enableEasySignCanUseMultiTemplateApplyMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var enableEasySignTemplateUpload: js.UndefOr[String] = js.undefined
  
  var enableEasySignTemplateUploadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var enableEnvelopeCopyWithData: js.UndefOr[String] = js.undefined
  
  var enableEnvelopeCopyWithDataMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var hideSendAnEnvelope: js.UndefOr[String] = js.undefined
  
  var hideSendAnEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the **Templates** menu is hidden from account users who are not Admins. The default value is **false**.
    */
  var hideUseATemplate: js.UndefOr[String] = js.undefined
  
  var hideUseATemplateInPrepare: js.UndefOr[String] = js.undefined
  
  var hideUseATemplateInPrepareMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var hideUseATemplateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var orderBasedRecipientIdGeneration: js.UndefOr[String] = js.undefined
  
  var orderBasedRecipientIdGenerationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var removeEnvelopeForwarding: js.UndefOr[String] = js.undefined
  
  var removeEnvelopeForwardingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var shouldRedactAccessCode: js.UndefOr[String] = js.undefined
  
  var shouldRedactAccessCodeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var uploadNewImageToSignOrInitial: js.UndefOr[String] = js.undefined
  
  var uploadNewImageToSignOrInitialMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
}
object AccountUISettings {
  
  inline def apply(): AccountUISettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUISettings]
  }
  
  extension [Self <: AccountUISettings](x: Self) {
    
    inline def setAdminMessage(value: AdminMessage): Self = StObject.set(x, "adminMessage", value.asInstanceOf[js.Any])
    
    inline def setAdminMessageUndefined: Self = StObject.set(x, "adminMessage", js.undefined)
    
    inline def setAskAnAdmin(value: AskAnAdmin): Self = StObject.set(x, "askAnAdmin", value.asInstanceOf[js.Any])
    
    inline def setAskAnAdminUndefined: Self = StObject.set(x, "askAnAdmin", js.undefined)
    
    inline def setEnableAdminMessage(value: String): Self = StObject.set(x, "enableAdminMessage", value.asInstanceOf[js.Any])
    
    inline def setEnableAdminMessageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableAdminMessageMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableAdminMessageMetadataUndefined: Self = StObject.set(x, "enableAdminMessageMetadata", js.undefined)
    
    inline def setEnableAdminMessageUndefined: Self = StObject.set(x, "enableAdminMessage", js.undefined)
    
    inline def setEnableEasySignCanUseMultiTemplateApply(value: String): Self = StObject.set(x, "enableEasySignCanUseMultiTemplateApply", value.asInstanceOf[js.Any])
    
    inline def setEnableEasySignCanUseMultiTemplateApplyMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableEasySignCanUseMultiTemplateApplyMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableEasySignCanUseMultiTemplateApplyMetadataUndefined: Self = StObject.set(x, "enableEasySignCanUseMultiTemplateApplyMetadata", js.undefined)
    
    inline def setEnableEasySignCanUseMultiTemplateApplyUndefined: Self = StObject.set(x, "enableEasySignCanUseMultiTemplateApply", js.undefined)
    
    inline def setEnableEasySignTemplateUpload(value: String): Self = StObject.set(x, "enableEasySignTemplateUpload", value.asInstanceOf[js.Any])
    
    inline def setEnableEasySignTemplateUploadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableEasySignTemplateUploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableEasySignTemplateUploadMetadataUndefined: Self = StObject.set(x, "enableEasySignTemplateUploadMetadata", js.undefined)
    
    inline def setEnableEasySignTemplateUploadUndefined: Self = StObject.set(x, "enableEasySignTemplateUpload", js.undefined)
    
    inline def setEnableEnvelopeCopyWithData(value: String): Self = StObject.set(x, "enableEnvelopeCopyWithData", value.asInstanceOf[js.Any])
    
    inline def setEnableEnvelopeCopyWithDataMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableEnvelopeCopyWithDataMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableEnvelopeCopyWithDataMetadataUndefined: Self = StObject.set(x, "enableEnvelopeCopyWithDataMetadata", js.undefined)
    
    inline def setEnableEnvelopeCopyWithDataUndefined: Self = StObject.set(x, "enableEnvelopeCopyWithData", js.undefined)
    
    inline def setHideSendAnEnvelope(value: String): Self = StObject.set(x, "hideSendAnEnvelope", value.asInstanceOf[js.Any])
    
    inline def setHideSendAnEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "hideSendAnEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    inline def setHideSendAnEnvelopeMetadataUndefined: Self = StObject.set(x, "hideSendAnEnvelopeMetadata", js.undefined)
    
    inline def setHideSendAnEnvelopeUndefined: Self = StObject.set(x, "hideSendAnEnvelope", js.undefined)
    
    inline def setHideUseATemplate(value: String): Self = StObject.set(x, "hideUseATemplate", value.asInstanceOf[js.Any])
    
    inline def setHideUseATemplateInPrepare(value: String): Self = StObject.set(x, "hideUseATemplateInPrepare", value.asInstanceOf[js.Any])
    
    inline def setHideUseATemplateInPrepareMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "hideUseATemplateInPrepareMetadata", value.asInstanceOf[js.Any])
    
    inline def setHideUseATemplateInPrepareMetadataUndefined: Self = StObject.set(x, "hideUseATemplateInPrepareMetadata", js.undefined)
    
    inline def setHideUseATemplateInPrepareUndefined: Self = StObject.set(x, "hideUseATemplateInPrepare", js.undefined)
    
    inline def setHideUseATemplateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "hideUseATemplateMetadata", value.asInstanceOf[js.Any])
    
    inline def setHideUseATemplateMetadataUndefined: Self = StObject.set(x, "hideUseATemplateMetadata", js.undefined)
    
    inline def setHideUseATemplateUndefined: Self = StObject.set(x, "hideUseATemplate", js.undefined)
    
    inline def setOrderBasedRecipientIdGeneration(value: String): Self = StObject.set(x, "orderBasedRecipientIdGeneration", value.asInstanceOf[js.Any])
    
    inline def setOrderBasedRecipientIdGenerationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "orderBasedRecipientIdGenerationMetadata", value.asInstanceOf[js.Any])
    
    inline def setOrderBasedRecipientIdGenerationMetadataUndefined: Self = StObject.set(x, "orderBasedRecipientIdGenerationMetadata", js.undefined)
    
    inline def setOrderBasedRecipientIdGenerationUndefined: Self = StObject.set(x, "orderBasedRecipientIdGeneration", js.undefined)
    
    inline def setRemoveEnvelopeForwarding(value: String): Self = StObject.set(x, "removeEnvelopeForwarding", value.asInstanceOf[js.Any])
    
    inline def setRemoveEnvelopeForwardingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "removeEnvelopeForwardingMetadata", value.asInstanceOf[js.Any])
    
    inline def setRemoveEnvelopeForwardingMetadataUndefined: Self = StObject.set(x, "removeEnvelopeForwardingMetadata", js.undefined)
    
    inline def setRemoveEnvelopeForwardingUndefined: Self = StObject.set(x, "removeEnvelopeForwarding", js.undefined)
    
    inline def setShouldRedactAccessCode(value: String): Self = StObject.set(x, "shouldRedactAccessCode", value.asInstanceOf[js.Any])
    
    inline def setShouldRedactAccessCodeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "shouldRedactAccessCodeMetadata", value.asInstanceOf[js.Any])
    
    inline def setShouldRedactAccessCodeMetadataUndefined: Self = StObject.set(x, "shouldRedactAccessCodeMetadata", js.undefined)
    
    inline def setShouldRedactAccessCodeUndefined: Self = StObject.set(x, "shouldRedactAccessCode", js.undefined)
    
    inline def setUploadNewImageToSignOrInitial(value: String): Self = StObject.set(x, "uploadNewImageToSignOrInitial", value.asInstanceOf[js.Any])
    
    inline def setUploadNewImageToSignOrInitialMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "uploadNewImageToSignOrInitialMetadata", value.asInstanceOf[js.Any])
    
    inline def setUploadNewImageToSignOrInitialMetadataUndefined: Self = StObject.set(x, "uploadNewImageToSignOrInitialMetadata", js.undefined)
    
    inline def setUploadNewImageToSignOrInitialUndefined: Self = StObject.set(x, "uploadNewImageToSignOrInitial", js.undefined)
  }
}
