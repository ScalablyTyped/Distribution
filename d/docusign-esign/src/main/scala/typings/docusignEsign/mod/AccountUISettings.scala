package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUISettings extends js.Object {
  
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
  implicit class AccountUISettingsOps[Self <: AccountUISettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdminMessage(value: AdminMessage): Self = this.set("adminMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminMessage: Self = this.set("adminMessage", js.undefined)
    
    @scala.inline
    def setAskAnAdmin(value: AskAnAdmin): Self = this.set("askAnAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAskAnAdmin: Self = this.set("askAnAdmin", js.undefined)
    
    @scala.inline
    def setEnableAdminMessage(value: String): Self = this.set("enableAdminMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAdminMessage: Self = this.set("enableAdminMessage", js.undefined)
    
    @scala.inline
    def setEnableAdminMessageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableAdminMessageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAdminMessageMetadata: Self = this.set("enableAdminMessageMetadata", js.undefined)
    
    @scala.inline
    def setEnableEasySignCanUseMultiTemplateApply(value: String): Self = this.set("enableEasySignCanUseMultiTemplateApply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEasySignCanUseMultiTemplateApply: Self = this.set("enableEasySignCanUseMultiTemplateApply", js.undefined)
    
    @scala.inline
    def setEnableEasySignCanUseMultiTemplateApplyMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableEasySignCanUseMultiTemplateApplyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEasySignCanUseMultiTemplateApplyMetadata: Self = this.set("enableEasySignCanUseMultiTemplateApplyMetadata", js.undefined)
    
    @scala.inline
    def setEnableEasySignTemplateUpload(value: String): Self = this.set("enableEasySignTemplateUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEasySignTemplateUpload: Self = this.set("enableEasySignTemplateUpload", js.undefined)
    
    @scala.inline
    def setEnableEasySignTemplateUploadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableEasySignTemplateUploadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEasySignTemplateUploadMetadata: Self = this.set("enableEasySignTemplateUploadMetadata", js.undefined)
    
    @scala.inline
    def setEnableEnvelopeCopyWithData(value: String): Self = this.set("enableEnvelopeCopyWithData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEnvelopeCopyWithData: Self = this.set("enableEnvelopeCopyWithData", js.undefined)
    
    @scala.inline
    def setEnableEnvelopeCopyWithDataMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableEnvelopeCopyWithDataMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEnvelopeCopyWithDataMetadata: Self = this.set("enableEnvelopeCopyWithDataMetadata", js.undefined)
    
    @scala.inline
    def setHideSendAnEnvelope(value: String): Self = this.set("hideSendAnEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSendAnEnvelope: Self = this.set("hideSendAnEnvelope", js.undefined)
    
    @scala.inline
    def setHideSendAnEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("hideSendAnEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideSendAnEnvelopeMetadata: Self = this.set("hideSendAnEnvelopeMetadata", js.undefined)
    
    @scala.inline
    def setHideUseATemplate(value: String): Self = this.set("hideUseATemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideUseATemplate: Self = this.set("hideUseATemplate", js.undefined)
    
    @scala.inline
    def setHideUseATemplateInPrepare(value: String): Self = this.set("hideUseATemplateInPrepare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideUseATemplateInPrepare: Self = this.set("hideUseATemplateInPrepare", js.undefined)
    
    @scala.inline
    def setHideUseATemplateInPrepareMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("hideUseATemplateInPrepareMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideUseATemplateInPrepareMetadata: Self = this.set("hideUseATemplateInPrepareMetadata", js.undefined)
    
    @scala.inline
    def setHideUseATemplateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("hideUseATemplateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideUseATemplateMetadata: Self = this.set("hideUseATemplateMetadata", js.undefined)
    
    @scala.inline
    def setOrderBasedRecipientIdGeneration(value: String): Self = this.set("orderBasedRecipientIdGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBasedRecipientIdGeneration: Self = this.set("orderBasedRecipientIdGeneration", js.undefined)
    
    @scala.inline
    def setOrderBasedRecipientIdGenerationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("orderBasedRecipientIdGenerationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBasedRecipientIdGenerationMetadata: Self = this.set("orderBasedRecipientIdGenerationMetadata", js.undefined)
    
    @scala.inline
    def setRemoveEnvelopeForwarding(value: String): Self = this.set("removeEnvelopeForwarding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEnvelopeForwarding: Self = this.set("removeEnvelopeForwarding", js.undefined)
    
    @scala.inline
    def setRemoveEnvelopeForwardingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("removeEnvelopeForwardingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEnvelopeForwardingMetadata: Self = this.set("removeEnvelopeForwardingMetadata", js.undefined)
    
    @scala.inline
    def setShouldRedactAccessCode(value: String): Self = this.set("shouldRedactAccessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRedactAccessCode: Self = this.set("shouldRedactAccessCode", js.undefined)
    
    @scala.inline
    def setShouldRedactAccessCodeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("shouldRedactAccessCodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldRedactAccessCodeMetadata: Self = this.set("shouldRedactAccessCodeMetadata", js.undefined)
    
    @scala.inline
    def setUploadNewImageToSignOrInitial(value: String): Self = this.set("uploadNewImageToSignOrInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadNewImageToSignOrInitial: Self = this.set("uploadNewImageToSignOrInitial", js.undefined)
    
    @scala.inline
    def setUploadNewImageToSignOrInitialMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("uploadNewImageToSignOrInitialMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadNewImageToSignOrInitialMetadata: Self = this.set("uploadNewImageToSignOrInitialMetadata", js.undefined)
  }
}
