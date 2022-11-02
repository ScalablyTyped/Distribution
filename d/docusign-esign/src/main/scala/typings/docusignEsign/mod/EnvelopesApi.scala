package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "EnvelopesApi")
@js.native
open class EnvelopesApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def applyTemplate(accountId: String, envelopeId: String): js.Promise[DocumentTemplateList] = js.native
  def applyTemplate(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[DocumentTemplateList] = js.native
  def applyTemplate(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[DocumentTemplateList] = js.native
  def applyTemplate(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentTemplateList] = js.native
  def applyTemplate(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[DocumentTemplateList] = js.native
  def applyTemplate(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentTemplateList] = js.native
  
  def applyTemplateToDocument(accountId: String, envelopeId: String, documentId: String): js.Promise[DocumentTemplateList] = js.native
  def applyTemplateToDocument(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[DocumentTemplateList] = js.native
  def applyTemplateToDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentTemplateList] = js.native
  def applyTemplateToDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentTemplateList] = js.native
  def applyTemplateToDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentTemplateList] = js.native
  def applyTemplateToDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentTemplateList] = js.native
  
  def createChunkedUpload(accountId: String): js.Promise[ChunkedUploadResponse] = js.native
  def createChunkedUpload(accountId: String, optsOrCallback: Any): js.Promise[ChunkedUploadResponse] = js.native
  def createChunkedUpload(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ChunkedUploadResponse] = js.native
  def createChunkedUpload(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  def createChunkedUpload(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ChunkedUploadResponse] = js.native
  def createChunkedUpload(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  
  def createConsoleView(accountId: String): js.Promise[ViewUrl] = js.native
  def createConsoleView(accountId: String, optsOrCallback: Any): js.Promise[ViewUrl] = js.native
  def createConsoleView(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createConsoleView(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  def createConsoleView(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createConsoleView(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  
  def createCorrectView(accountId: String, envelopeId: String): js.Promise[ViewUrl] = js.native
  def createCorrectView(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[ViewUrl] = js.native
  def createCorrectView(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createCorrectView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  def createCorrectView(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createCorrectView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  
  def createCustomFields(accountId: String, envelopeId: String): js.Promise[CustomFields] = js.native
  def createCustomFields(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[CustomFields] = js.native
  def createCustomFields(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def createCustomFields(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  def createCustomFields(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def createCustomFields(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  
  def createDocumentFields(accountId: String, envelopeId: String, documentId: String): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  
  def createDocumentResponsiveHtmlPreview(accountId: String, envelopeId: String, documentId: String): js.Promise[DocumentHtmlDefinitions] = js.native
  def createDocumentResponsiveHtmlPreview(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[DocumentHtmlDefinitions] = js.native
  def createDocumentResponsiveHtmlPreview(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  def createDocumentResponsiveHtmlPreview(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  def createDocumentResponsiveHtmlPreview(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  def createDocumentResponsiveHtmlPreview(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  
  def createDocumentTabs(accountId: String, envelopeId: String, documentId: String): js.Promise[Tabs] = js.native
  def createDocumentTabs(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def createDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def createDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def createDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def createDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def createEditView(accountId: String, envelopeId: String): js.Promise[ViewUrl] = js.native
  def createEditView(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[ViewUrl] = js.native
  def createEditView(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createEditView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  def createEditView(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createEditView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  
  def createEmailSettings(accountId: String, envelopeId: String): js.Promise[EmailSettings] = js.native
  def createEmailSettings(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[EmailSettings] = js.native
  def createEmailSettings(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EmailSettings] = js.native
  def createEmailSettings(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EmailSettings] = js.native
  def createEmailSettings(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EmailSettings] = js.native
  def createEmailSettings(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EmailSettings] = js.native
  
  def createEnvelope(accountId: String): js.Promise[EnvelopeSummary] = js.native
  def createEnvelope(accountId: String, options: Any): js.Promise[EnvelopeSummary] = js.native
  def createEnvelope(accountId: String, options: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeSummary] = js.native
  def createEnvelope(
    accountId: String,
    options: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeSummary] = js.native
  def createEnvelope(accountId: String, options: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeSummary] = js.native
  def createEnvelope(
    accountId: String,
    options: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeSummary] = js.native
  
  def createEnvelopeComments(accountId: String, envelopeId: String): js.Promise[CommentHistoryResult] = js.native
  def createEnvelopeComments(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[CommentHistoryResult] = js.native
  def createEnvelopeComments(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[CommentHistoryResult] = js.native
  def createEnvelopeComments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CommentHistoryResult] = js.native
  def createEnvelopeComments(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CommentHistoryResult] = js.native
  def createEnvelopeComments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CommentHistoryResult] = js.native
  
  def createEnvelopeRecipientPreview(accountId: String, envelopeId: String): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientPreview(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientPreview(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientPreview(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientPreview(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientPreview(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  
  def createEnvelopeRecipientSharedView(accountId: String, envelopeId: String): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientSharedView(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientSharedView(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientSharedView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientSharedView(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createEnvelopeRecipientSharedView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  
  def createEnvelopeTransferRules(accountId: String): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def createEnvelopeTransferRules(accountId: String, optsOrCallback: Any): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def createEnvelopeTransferRules(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def createEnvelopeTransferRules(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def createEnvelopeTransferRules(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def createEnvelopeTransferRules(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTransferRuleInformation] = js.native
  
  def createLock(accountId: String, envelopeId: String): js.Promise[LockInformation] = js.native
  def createLock(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[LockInformation] = js.native
  def createLock(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def createLock(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  def createLock(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def createLock(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  
  def createRecipient(accountId: String, envelopeId: String): js.Promise[Recipients] = js.native
  def createRecipient(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[Recipients] = js.native
  def createRecipient(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def createRecipient(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  def createRecipient(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def createRecipient(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  
  def createRecipientProofFileLink(accountId: String, envelopeId: String, recipientId: String): js.Promise[ProofServiceViewLink] = js.native
  def createRecipientProofFileLink(accountId: String, envelopeId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[ProofServiceViewLink] = js.native
  def createRecipientProofFileLink(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ProofServiceViewLink] = js.native
  
  def createRecipientProofFileResourceToken(tokenScopes: String, accountId: String, envelopeId: String, recipientId: String): js.Promise[ProofServiceResourceToken] = js.native
  def createRecipientProofFileResourceToken(
    tokenScopes: String,
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function0[Unit]
  ): js.Promise[ProofServiceResourceToken] = js.native
  def createRecipientProofFileResourceToken(
    tokenScopes: String,
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ProofServiceResourceToken] = js.native
  
  def createRecipientView(accountId: String, envelopeId: String): js.Promise[ViewUrl] = js.native
  def createRecipientView(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[ViewUrl] = js.native
  def createRecipientView(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createRecipientView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  def createRecipientView(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createRecipientView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  
  def createResponsiveHtmlPreview(accountId: String, envelopeId: String): js.Promise[DocumentHtmlDefinitions] = js.native
  def createResponsiveHtmlPreview(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[DocumentHtmlDefinitions] = js.native
  def createResponsiveHtmlPreview(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[DocumentHtmlDefinitions] = js.native
  def createResponsiveHtmlPreview(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  def createResponsiveHtmlPreview(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[DocumentHtmlDefinitions] = js.native
  def createResponsiveHtmlPreview(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  
  def createSenderView(accountId: String, envelopeId: String): js.Promise[ViewUrl] = js.native
  def createSenderView(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[ViewUrl] = js.native
  def createSenderView(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createSenderView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  def createSenderView(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createSenderView(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  
  def createTabs(accountId: String, envelopeId: String, recipientId: String): js.Promise[Tabs] = js.native
  def createTabs(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def createTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def createTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def createTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def createTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def deleteAttachments(accountId: String, envelopeId: String): js.Promise[EnvelopeAttachmentsResult] = js.native
  def deleteAttachments(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[EnvelopeAttachmentsResult] = js.native
  def deleteAttachments(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeAttachmentsResult] = js.native
  def deleteAttachments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeAttachmentsResult] = js.native
  def deleteAttachments(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeAttachmentsResult] = js.native
  def deleteAttachments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeAttachmentsResult] = js.native
  
  def deleteChunkedUpload(accountId: String, chunkedUploadId: String): js.Promise[ChunkedUploadResponse] = js.native
  def deleteChunkedUpload(accountId: String, chunkedUploadId: String, callback: js.Function0[Unit]): js.Promise[ChunkedUploadResponse] = js.native
  def deleteChunkedUpload(
    accountId: String,
    chunkedUploadId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  
  def deleteCustomFields(accountId: String, envelopeId: String): js.Promise[CustomFields] = js.native
  def deleteCustomFields(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[CustomFields] = js.native
  def deleteCustomFields(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def deleteCustomFields(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  def deleteCustomFields(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def deleteCustomFields(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  
  def deleteDocumentFields(accountId: String, envelopeId: String, documentId: String): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  
  def deleteDocumentPage(accountId: String, envelopeId: String, documentId: String, pageNumber: String): js.Promise[Unit] = js.native
  def deleteDocumentPage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def deleteDocumentPage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def deleteDocumentTabs(accountId: String, envelopeId: String, documentId: String): js.Promise[Tabs] = js.native
  def deleteDocumentTabs(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def deleteDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def deleteDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def deleteDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def deleteDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def deleteDocuments(accountId: String, envelopeId: String): js.Promise[EnvelopeDocumentsResult] = js.native
  def deleteDocuments(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[EnvelopeDocumentsResult] = js.native
  def deleteDocuments(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeDocumentsResult] = js.native
  def deleteDocuments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeDocumentsResult] = js.native
  def deleteDocuments(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeDocumentsResult] = js.native
  def deleteDocuments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeDocumentsResult] = js.native
  
  def deleteEmailSettings(accountId: String, envelopeId: String): js.Promise[EmailSettings] = js.native
  def deleteEmailSettings(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[EmailSettings] = js.native
  def deleteEmailSettings(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EmailSettings] = js.native
  
  def deleteEnvelopeTransferRules(accountId: String, envelopeTransferRuleId: String): js.Promise[Unit] = js.native
  def deleteEnvelopeTransferRules(accountId: String, envelopeTransferRuleId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def deleteEnvelopeTransferRules(
    accountId: String,
    envelopeTransferRuleId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def deleteLock(accountId: String, envelopeId: String): js.Promise[LockInformation] = js.native
  def deleteLock(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def deleteLock(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  
  def deleteRecipient(accountId: String, envelopeId: String, recipientId: String): js.Promise[Recipients] = js.native
  def deleteRecipient(accountId: String, envelopeId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def deleteRecipient(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  
  def deleteRecipients(accountId: String, envelopeId: String): js.Promise[Recipients] = js.native
  def deleteRecipients(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[Recipients] = js.native
  def deleteRecipients(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def deleteRecipients(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  def deleteRecipients(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def deleteRecipients(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  
  def deleteTabs(accountId: String, envelopeId: String, recipientId: String): js.Promise[Tabs] = js.native
  def deleteTabs(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def deleteTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def deleteTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def deleteTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def deleteTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def deleteTemplatesFromDocument(accountId: String, envelopeId: String, documentId: String, templateId: String): js.Promise[Unit] = js.native
  def deleteTemplatesFromDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    templateId: String,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def deleteTemplatesFromDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    templateId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def getAttachment(accountId: String, envelopeId: String, attachmentId: String): js.Promise[Unit] = js.native
  def getAttachment(accountId: String, envelopeId: String, attachmentId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def getAttachment(
    accountId: String,
    envelopeId: String,
    attachmentId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def getAttachments(accountId: String, envelopeId: String): js.Promise[EnvelopeAttachmentsResult] = js.native
  def getAttachments(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[EnvelopeAttachmentsResult] = js.native
  def getAttachments(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeAttachmentsResult] = js.native
  
  def getChunkedUpload(accountId: String, chunkedUploadId: String): js.Promise[ChunkedUploadResponse] = js.native
  def getChunkedUpload(accountId: String, chunkedUploadId: String, optsOrCallback: Any): js.Promise[ChunkedUploadResponse] = js.native
  def getChunkedUpload(accountId: String, chunkedUploadId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ChunkedUploadResponse] = js.native
  def getChunkedUpload(
    accountId: String,
    chunkedUploadId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  def getChunkedUpload(accountId: String, chunkedUploadId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ChunkedUploadResponse] = js.native
  def getChunkedUpload(
    accountId: String,
    chunkedUploadId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  
  def getCommentsTranscript(accountId: String, envelopeId: String): js.Promise[js.Object] = js.native
  def getCommentsTranscript(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[js.Object] = js.native
  def getCommentsTranscript(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[js.Object] = js.native
  def getCommentsTranscript(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[js.Object] = js.native
  def getCommentsTranscript(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[js.Object] = js.native
  def getCommentsTranscript(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[js.Object] = js.native
  
  def getConsumerDisclosure(accountId: String, envelopeId: String, recipientId: String, langCode: String): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosure(accountId: String, envelopeId: String, recipientId: String, langCode: String, optsOrCallback: Any): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosure(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    langCode: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosure(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    langCode: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosure(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    langCode: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosure(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    langCode: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConsumerDisclosure] = js.native
  
  def getConsumerDisclosureDefault(accountId: String, envelopeId: String, recipientId: String): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosureDefault(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: Any): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosureDefault(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosureDefault(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosureDefault(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[ConsumerDisclosure] = js.native
  def getConsumerDisclosureDefault(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ConsumerDisclosure] = js.native
  
  def getDocument(accountId: String, envelopeId: String, documentId: String, optsOrCallback: DocumentOptions): js.Promise[String] = js.native
  def getDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: DocumentOptions,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: DocumentOptions,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  
  def getDocumentPageImage(accountId: String, envelopeId: String, documentId: String, pageNumber: String): js.Promise[String] = js.native
  def getDocumentPageImage(accountId: String, envelopeId: String, documentId: String, pageNumber: String, optsOrCallback: Any): js.Promise[String] = js.native
  def getDocumentPageImage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getDocumentPageImage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  def getDocumentPageImage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getDocumentPageImage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  
  def getDocumentTabs(accountId: String, envelopeId: String, documentId: String): js.Promise[Tabs] = js.native
  def getDocumentTabs(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def getDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def getDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def getDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def getDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def getEmailSettings(accountId: String, envelopeId: String): js.Promise[EmailSettings] = js.native
  def getEmailSettings(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[EmailSettings] = js.native
  def getEmailSettings(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EmailSettings] = js.native
  
  def getEnvelope(accountId: String, envelopeId: String): js.Promise[Envelope] = js.native
  def getEnvelope(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[Envelope] = js.native
  def getEnvelope(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Envelope] = js.native
  def getEnvelope(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Envelope] = js.native
  def getEnvelope(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Envelope] = js.native
  def getEnvelope(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Envelope] = js.native
  
  def getEnvelopeDocumentHtmlDefinitions(accountId: String, envelopeId: String, documentId: String): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  def getEnvelopeDocumentHtmlDefinitions(accountId: String, envelopeId: String, documentId: String, callback: js.Function0[Unit]): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  def getEnvelopeDocumentHtmlDefinitions(
    accountId: String,
    envelopeId: String,
    documentId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  
  def getEnvelopeHtmlDefinitions(accountId: String, envelopeId: String): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  def getEnvelopeHtmlDefinitions(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  def getEnvelopeHtmlDefinitions(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  
  def getEnvelopeTransferRules(accountId: String): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def getEnvelopeTransferRules(accountId: String, optsOrCallback: Any): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def getEnvelopeTransferRules(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def getEnvelopeTransferRules(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def getEnvelopeTransferRules(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def getEnvelopeTransferRules(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTransferRuleInformation] = js.native
  
  def getFormData(accountId: String, envelopeId: String): js.Promise[EnvelopeFormData] = js.native
  def getFormData(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[EnvelopeFormData] = js.native
  def getFormData(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeFormData] = js.native
  
  def getLock(accountId: String, envelopeId: String): js.Promise[LockInformation] = js.native
  def getLock(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def getLock(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  
  def getNotificationSettings(accountId: String, envelopeId: String): js.Promise[Notification] = js.native
  def getNotificationSettings(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[Notification] = js.native
  def getNotificationSettings(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Notification] = js.native
  
  def getPageTabs(accountId: String, envelopeId: String, documentId: String, pageNumber: String): js.Promise[Tabs] = js.native
  def getPageTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def getPageTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def getPages(accountId: String, envelopeId: String, documentId: String): js.Promise[PageImages] = js.native
  def getPages(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[PageImages] = js.native
  def getPages(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[PageImages] = js.native
  def getPages(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[PageImages] = js.native
  def getPages(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[PageImages] = js.native
  def getPages(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[PageImages] = js.native
  
  def getRecipientDocumentVisibility(accountId: String, envelopeId: String, recipientId: String): js.Promise[DocumentVisibilityList] = js.native
  def getRecipientDocumentVisibility(accountId: String, envelopeId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[DocumentVisibilityList] = js.native
  def getRecipientDocumentVisibility(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentVisibilityList] = js.native
  
  def getRecipientInitialsImage(accountId: String, envelopeId: String, recipientId: String): js.Promise[String] = js.native
  def getRecipientInitialsImage(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: Any): js.Promise[String] = js.native
  def getRecipientInitialsImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getRecipientInitialsImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  def getRecipientInitialsImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getRecipientInitialsImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  
  def getRecipientSignature(accountId: String, envelopeId: String, recipientId: String): js.Promise[UserSignature] = js.native
  def getRecipientSignature(accountId: String, envelopeId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[UserSignature] = js.native
  def getRecipientSignature(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[UserSignature] = js.native
  
  def getRecipientSignatureImage(accountId: String, envelopeId: String, recipientId: String): js.Promise[String] = js.native
  def getRecipientSignatureImage(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: Any): js.Promise[String] = js.native
  def getRecipientSignatureImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getRecipientSignatureImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  def getRecipientSignatureImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getRecipientSignatureImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  
  def getTabsBlob(accountId: String, envelopeId: String): js.Promise[Unit] = js.native
  def getTabsBlob(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def getTabsBlob(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def getTemplateRecipientDocumentVisibility(accountId: String, templateId: String, recipientId: String): js.Promise[DocumentVisibilityList] = js.native
  def getTemplateRecipientDocumentVisibility(accountId: String, templateId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[DocumentVisibilityList] = js.native
  def getTemplateRecipientDocumentVisibility(
    accountId: String,
    templateId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentVisibilityList] = js.native
  
  def listAuditEvents(accountId: String, envelopeId: String): js.Promise[EnvelopeAuditEventResponse] = js.native
  def listAuditEvents(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[EnvelopeAuditEventResponse] = js.native
  def listAuditEvents(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeAuditEventResponse] = js.native
  
  def listCustomFields(accountId: String, envelopeId: String): js.Promise[CustomFieldsEnvelope] = js.native
  def listCustomFields(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[CustomFieldsEnvelope] = js.native
  def listCustomFields(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFieldsEnvelope] = js.native
  
  def listDocumentFields(accountId: String, envelopeId: String, documentId: String): js.Promise[DocumentFieldsInformation] = js.native
  def listDocumentFields(accountId: String, envelopeId: String, documentId: String, callback: js.Function0[Unit]): js.Promise[DocumentFieldsInformation] = js.native
  def listDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  
  def listDocuments(accountId: String, envelopeId: String): js.Promise[EnvelopeDocumentsResult] = js.native
  def listDocuments(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[EnvelopeDocumentsResult] = js.native
  def listDocuments(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeDocumentsResult] = js.native
  def listDocuments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeDocumentsResult] = js.native
  def listDocuments(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeDocumentsResult] = js.native
  def listDocuments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeDocumentsResult] = js.native
  
  def listRecipients(accountId: String, envelopeId: String): js.Promise[Recipients] = js.native
  def listRecipients(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[Recipients] = js.native
  def listRecipients(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def listRecipients(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  def listRecipients(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def listRecipients(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  
  def listStatus(accountId: String): js.Promise[EnvelopesInformation] = js.native
  def listStatus(accountId: String, optsOrCallback: Any): js.Promise[EnvelopesInformation] = js.native
  def listStatus(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopesInformation] = js.native
  def listStatus(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopesInformation] = js.native
  def listStatus(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopesInformation] = js.native
  def listStatus(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopesInformation] = js.native
  
  def listStatusChanges(accountId: String, optsOrCallback: EnvelopesFilters): js.Promise[EnvelopesInformation] = js.native
  def listStatusChanges(accountId: String, optsOrCallback: EnvelopesFilters, callback: js.Function0[Unit]): js.Promise[EnvelopesInformation] = js.native
  def listStatusChanges(
    accountId: String,
    optsOrCallback: EnvelopesFilters,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopesInformation] = js.native
  
  def listTabs(accountId: String, envelopeId: String, recipientId: String): js.Promise[Tabs] = js.native
  def listTabs(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def listTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def listTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def listTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def listTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def listTemplates(accountId: String, envelopeId: String): js.Promise[TemplateInformation] = js.native
  def listTemplates(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[TemplateInformation] = js.native
  def listTemplates(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[TemplateInformation] = js.native
  def listTemplates(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateInformation] = js.native
  def listTemplates(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[TemplateInformation] = js.native
  def listTemplates(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateInformation] = js.native
  
  def listTemplatesForDocument(accountId: String, envelopeId: String, documentId: String): js.Promise[TemplateInformation] = js.native
  def listTemplatesForDocument(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[TemplateInformation] = js.native
  def listTemplatesForDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[TemplateInformation] = js.native
  def listTemplatesForDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateInformation] = js.native
  def listTemplatesForDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[TemplateInformation] = js.native
  def listTemplatesForDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateInformation] = js.native
  
  def putAttachment(accountId: String, envelopeId: String, attachmentId: String): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachment(accountId: String, envelopeId: String, attachmentId: String, optsOrCallback: Any): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachment(
    accountId: String,
    envelopeId: String,
    attachmentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachment(
    accountId: String,
    envelopeId: String,
    attachmentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachment(
    accountId: String,
    envelopeId: String,
    attachmentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachment(
    accountId: String,
    envelopeId: String,
    attachmentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeAttachmentsResult] = js.native
  
  def putAttachments(accountId: String, envelopeId: String): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachments(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachments(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachments(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeAttachmentsResult] = js.native
  def putAttachments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeAttachmentsResult] = js.native
  
  def rotateDocumentPage(accountId: String, envelopeId: String, documentId: String, pageNumber: String): js.Promise[Unit] = js.native
  def rotateDocumentPage(accountId: String, envelopeId: String, documentId: String, pageNumber: String, optsOrCallback: Any): js.Promise[Unit] = js.native
  def rotateDocumentPage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def rotateDocumentPage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  def rotateDocumentPage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def rotateDocumentPage(
    accountId: String,
    envelopeId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def update(accountId: String, envelopeId: String): js.Promise[EnvelopeUpdateSummary] = js.native
  def update(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[EnvelopeUpdateSummary] = js.native
  def update(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeUpdateSummary] = js.native
  def update(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeUpdateSummary] = js.native
  def update(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeUpdateSummary] = js.native
  def update(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeUpdateSummary] = js.native
  
  def updateChunkedUpload(accountId: String, chunkedUploadId: String): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUpload(accountId: String, chunkedUploadId: String, optsOrCallback: Any): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUpload(accountId: String, chunkedUploadId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUpload(
    accountId: String,
    chunkedUploadId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUpload(accountId: String, chunkedUploadId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUpload(
    accountId: String,
    chunkedUploadId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  
  def updateChunkedUploadPart(accountId: String, chunkedUploadId: String, chunkedUploadPartSeq: String): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUploadPart(accountId: String, chunkedUploadId: String, chunkedUploadPartSeq: String, optsOrCallback: Any): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUploadPart(
    accountId: String,
    chunkedUploadId: String,
    chunkedUploadPartSeq: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUploadPart(
    accountId: String,
    chunkedUploadId: String,
    chunkedUploadPartSeq: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUploadPart(
    accountId: String,
    chunkedUploadId: String,
    chunkedUploadPartSeq: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  def updateChunkedUploadPart(
    accountId: String,
    chunkedUploadId: String,
    chunkedUploadPartSeq: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ChunkedUploadResponse] = js.native
  
  def updateCustomFields(accountId: String, envelopeId: String): js.Promise[CustomFields] = js.native
  def updateCustomFields(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[CustomFields] = js.native
  def updateCustomFields(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def updateCustomFields(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  def updateCustomFields(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def updateCustomFields(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  
  def updateDocument(accountId: String, envelopeId: String, documentId: String): js.Promise[EnvelopeDocument] = js.native
  def updateDocument(accountId: String, envelopeId: String, documentId: String, callback: js.Function0[Unit]): js.Promise[EnvelopeDocument] = js.native
  def updateDocument(
    accountId: String,
    envelopeId: String,
    documentId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeDocument] = js.native
  
  def updateDocumentFields(accountId: String, envelopeId: String, documentId: String): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  
  def updateDocumentTabs(accountId: String, envelopeId: String, documentId: String): js.Promise[Tabs] = js.native
  def updateDocumentTabs(accountId: String, envelopeId: String, documentId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def updateDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def updateDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def updateDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def updateDocumentTabs(
    accountId: String,
    envelopeId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def updateDocuments(accountId: String, envelopeId: String): js.Promise[EnvelopeDocumentsResult] = js.native
  def updateDocuments(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[EnvelopeDocumentsResult] = js.native
  def updateDocuments(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeDocumentsResult] = js.native
  def updateDocuments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeDocumentsResult] = js.native
  def updateDocuments(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeDocumentsResult] = js.native
  def updateDocuments(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeDocumentsResult] = js.native
  
  def updateEmailSettings(accountId: String, envelopeId: String): js.Promise[EmailSettings] = js.native
  def updateEmailSettings(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[EmailSettings] = js.native
  def updateEmailSettings(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EmailSettings] = js.native
  def updateEmailSettings(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EmailSettings] = js.native
  def updateEmailSettings(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EmailSettings] = js.native
  def updateEmailSettings(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EmailSettings] = js.native
  
  def updateEnvelopeTransferRule(accountId: String, envelopeTransferRuleId: String): js.Promise[EnvelopeTransferRule] = js.native
  def updateEnvelopeTransferRule(accountId: String, envelopeTransferRuleId: String, optsOrCallback: Any): js.Promise[EnvelopeTransferRule] = js.native
  def updateEnvelopeTransferRule(
    accountId: String,
    envelopeTransferRuleId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[EnvelopeTransferRule] = js.native
  def updateEnvelopeTransferRule(
    accountId: String,
    envelopeTransferRuleId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTransferRule] = js.native
  def updateEnvelopeTransferRule(
    accountId: String,
    envelopeTransferRuleId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[EnvelopeTransferRule] = js.native
  def updateEnvelopeTransferRule(
    accountId: String,
    envelopeTransferRuleId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTransferRule] = js.native
  
  def updateEnvelopeTransferRules(accountId: String): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def updateEnvelopeTransferRules(accountId: String, optsOrCallback: Any): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def updateEnvelopeTransferRules(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def updateEnvelopeTransferRules(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def updateEnvelopeTransferRules(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeTransferRuleInformation] = js.native
  def updateEnvelopeTransferRules(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTransferRuleInformation] = js.native
  
  def updateLock(accountId: String, envelopeId: String): js.Promise[LockInformation] = js.native
  def updateLock(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[LockInformation] = js.native
  def updateLock(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def updateLock(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  def updateLock(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def updateLock(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  
  def updateNotificationSettings(accountId: String, envelopeId: String): js.Promise[Notification] = js.native
  def updateNotificationSettings(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[Notification] = js.native
  def updateNotificationSettings(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Notification] = js.native
  def updateNotificationSettings(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Notification] = js.native
  def updateNotificationSettings(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Notification] = js.native
  def updateNotificationSettings(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Notification] = js.native
  
  def updateRecipientDocumentVisibility(accountId: String, envelopeId: String, recipientId: String): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientDocumentVisibility(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: Any): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientDocumentVisibility(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientDocumentVisibility(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientDocumentVisibility(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientDocumentVisibility(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentVisibilityList] = js.native
  
  def updateRecipientInitialsImage(accountId: String, envelopeId: String, recipientId: String): js.Promise[Unit] = js.native
  def updateRecipientInitialsImage(accountId: String, envelopeId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def updateRecipientInitialsImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def updateRecipientSignatureImage(accountId: String, envelopeId: String, recipientId: String): js.Promise[Unit] = js.native
  def updateRecipientSignatureImage(accountId: String, envelopeId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def updateRecipientSignatureImage(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def updateRecipients(accountId: String, envelopeId: String): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[RecipientsUpdateSummary] = js.native
  
  def updateRecipientsDocumentVisibility(accountId: String, envelopeId: String): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientsDocumentVisibility(accountId: String, envelopeId: String, optsOrCallback: Any): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientsDocumentVisibility(accountId: String, envelopeId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientsDocumentVisibility(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientsDocumentVisibility(accountId: String, envelopeId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[DocumentVisibilityList] = js.native
  def updateRecipientsDocumentVisibility(
    accountId: String,
    envelopeId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentVisibilityList] = js.native
  
  def updateTabs(accountId: String, envelopeId: String, recipientId: String): js.Promise[Tabs] = js.native
  def updateTabs(accountId: String, envelopeId: String, recipientId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def updateTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def updateTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def updateTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def updateTabs(
    accountId: String,
    envelopeId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def updateTabsBlob(accountId: String, envelopeId: String): js.Promise[Unit] = js.native
  def updateTabsBlob(accountId: String, envelopeId: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def updateTabsBlob(
    accountId: String,
    envelopeId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def updateTemplateRecipientDocumentVisibility(accountId: String, templateId: String, recipientId: String): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientDocumentVisibility(accountId: String, templateId: String, recipientId: String, optsOrCallback: Any): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientDocumentVisibility(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientDocumentVisibility(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientDocumentVisibility(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientDocumentVisibility(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentVisibilityList] = js.native
  
  def updateTemplateRecipientsDocumentVisibility(accountId: String, templateId: String): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientsDocumentVisibility(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientsDocumentVisibility(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientsDocumentVisibility(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientsDocumentVisibility(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[TemplateDocumentVisibilityList] = js.native
  def updateTemplateRecipientsDocumentVisibility(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentVisibilityList] = js.native
}
