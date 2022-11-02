package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docusign-esign", "TemplatesApi")
@js.native
open class TemplatesApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  def createCustomFields(accountId: String, templateId: String): js.Promise[CustomFields] = js.native
  def createCustomFields(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[CustomFields] = js.native
  def createCustomFields(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def createCustomFields(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  def createCustomFields(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def createCustomFields(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  
  def createDocumentFields(accountId: String, templateId: String, documentId: String): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def createDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  
  def createEditView(accountId: String, templateId: String): js.Promise[ViewUrl] = js.native
  def createEditView(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[ViewUrl] = js.native
  def createEditView(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createEditView(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  def createEditView(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createEditView(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  
  def createLock(accountId: String, templateId: String): js.Promise[LockInformation] = js.native
  def createLock(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[LockInformation] = js.native
  def createLock(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def createLock(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  def createLock(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def createLock(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  
  def createRecipients(accountId: String, templateId: String): js.Promise[Recipients] = js.native
  def createRecipients(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[Recipients] = js.native
  def createRecipients(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def createRecipients(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  def createRecipients(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def createRecipients(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  
  def createTabs(accountId: String, templateId: String, recipientId: String): js.Promise[Tabs] = js.native
  def createTabs(accountId: String, templateId: String, recipientId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def createTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def createTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def createTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def createTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def createTemplate(accountId: String): js.Promise[TemplateSummary] = js.native
  def createTemplate(accountId: String, optsOrCallback: Any): js.Promise[TemplateSummary] = js.native
  def createTemplate(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[TemplateSummary] = js.native
  def createTemplate(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateSummary] = js.native
  def createTemplate(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[TemplateSummary] = js.native
  def createTemplate(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateSummary] = js.native
  
  def createTemplateDocumentResponsiveHtmlPreview(accountId: String, templateId: String, documentId: String): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateDocumentResponsiveHtmlPreview(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateDocumentResponsiveHtmlPreview(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateDocumentResponsiveHtmlPreview(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateDocumentResponsiveHtmlPreview(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateDocumentResponsiveHtmlPreview(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  
  def createTemplateDocumentTabs(accountId: String, templateId: String, documentId: String): js.Promise[Tabs] = js.native
  def createTemplateDocumentTabs(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def createTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def createTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def createTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def createTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def createTemplateRecipientPreview(accountId: String, templateId: String): js.Promise[ViewUrl] = js.native
  def createTemplateRecipientPreview(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[ViewUrl] = js.native
  def createTemplateRecipientPreview(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createTemplateRecipientPreview(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  def createTemplateRecipientPreview(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[ViewUrl] = js.native
  def createTemplateRecipientPreview(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[ViewUrl] = js.native
  
  def createTemplateResponsiveHtmlPreview(accountId: String, templateId: String): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateResponsiveHtmlPreview(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateResponsiveHtmlPreview(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateResponsiveHtmlPreview(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateResponsiveHtmlPreview(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[DocumentHtmlDefinitions] = js.native
  def createTemplateResponsiveHtmlPreview(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitions] = js.native
  
  def deleteBulkRecipients(accountId: String, templateId: String, recipientId: String): js.Promise[BulkRecipientsUpdateResponse] = js.native
  def deleteBulkRecipients(accountId: String, templateId: String, recipientId: String, callback: js.Function0[Unit]): js.Promise[BulkRecipientsUpdateResponse] = js.native
  def deleteBulkRecipients(
    accountId: String,
    templateId: String,
    recipientId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkRecipientsUpdateResponse] = js.native
  
  def deleteCustomFields(accountId: String, templateId: String): js.Promise[CustomFields] = js.native
  def deleteCustomFields(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[CustomFields] = js.native
  def deleteCustomFields(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def deleteCustomFields(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  def deleteCustomFields(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def deleteCustomFields(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  
  def deleteDocumentFields(accountId: String, templateId: String, documentId: String): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def deleteDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  
  def deleteDocumentPage(accountId: String, templateId: String, documentId: String, pageNumber: String): js.Promise[Unit] = js.native
  def deleteDocumentPage(accountId: String, templateId: String, documentId: String, pageNumber: String, optsOrCallback: Any): js.Promise[Unit] = js.native
  def deleteDocumentPage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def deleteDocumentPage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  def deleteDocumentPage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def deleteDocumentPage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def deleteDocuments(accountId: String, templateId: String): js.Promise[TemplateDocumentsResult] = js.native
  def deleteDocuments(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[TemplateDocumentsResult] = js.native
  def deleteDocuments(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[TemplateDocumentsResult] = js.native
  def deleteDocuments(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentsResult] = js.native
  def deleteDocuments(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[TemplateDocumentsResult] = js.native
  def deleteDocuments(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentsResult] = js.native
  
  def deleteGroupShare(accountId: String, templateId: String, templatePart: String): js.Promise[GroupInformation] = js.native
  def deleteGroupShare(accountId: String, templateId: String, templatePart: String, optsOrCallback: Any): js.Promise[GroupInformation] = js.native
  def deleteGroupShare(
    accountId: String,
    templateId: String,
    templatePart: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[GroupInformation] = js.native
  def deleteGroupShare(
    accountId: String,
    templateId: String,
    templatePart: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  def deleteGroupShare(
    accountId: String,
    templateId: String,
    templatePart: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[GroupInformation] = js.native
  def deleteGroupShare(
    accountId: String,
    templateId: String,
    templatePart: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  
  def deleteLock(accountId: String, templateId: String): js.Promise[LockInformation] = js.native
  def deleteLock(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[LockInformation] = js.native
  def deleteLock(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def deleteLock(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  def deleteLock(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def deleteLock(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  
  def deleteRecipient(accountId: String, templateId: String, recipientId: String): js.Promise[Recipients] = js.native
  def deleteRecipient(accountId: String, templateId: String, recipientId: String, optsOrCallback: Any): js.Promise[Recipients] = js.native
  def deleteRecipient(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Recipients] = js.native
  def deleteRecipient(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  def deleteRecipient(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Recipients] = js.native
  def deleteRecipient(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  
  def deleteRecipients(accountId: String, templateId: String): js.Promise[Recipients] = js.native
  def deleteRecipients(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[Recipients] = js.native
  def deleteRecipients(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def deleteRecipients(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  def deleteRecipients(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def deleteRecipients(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  
  def deleteTabs(accountId: String, templateId: String, recipientId: String): js.Promise[Tabs] = js.native
  def deleteTabs(accountId: String, templateId: String, recipientId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def deleteTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def deleteTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def deleteTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def deleteTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def deleteTemplateDocumentTabs(accountId: String, templateId: String, documentId: String): js.Promise[Tabs] = js.native
  def deleteTemplateDocumentTabs(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def deleteTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def deleteTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def deleteTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def deleteTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def get(accountId: String, templateId: String): js.Promise[EnvelopeTemplate] = js.native
  def get(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[EnvelopeTemplate] = js.native
  def get(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeTemplate] = js.native
  def get(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTemplate] = js.native
  def get(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeTemplate] = js.native
  def get(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTemplate] = js.native
  
  def getDocument(accountId: String, templateId: String, documentId: String): js.Promise[String] = js.native
  def getDocument(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[String] = js.native
  def getDocument(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getDocument(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  def getDocument(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getDocument(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  
  def getDocumentPageImage(accountId: String, templateId: String, documentId: String, pageNumber: String): js.Promise[String] = js.native
  def getDocumentPageImage(accountId: String, templateId: String, documentId: String, pageNumber: String, optsOrCallback: Any): js.Promise[String] = js.native
  def getDocumentPageImage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getDocumentPageImage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  def getDocumentPageImage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[String] = js.native
  def getDocumentPageImage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[String] = js.native
  
  def getDocumentTabs(accountId: String, templateId: String, documentId: String): js.Promise[Tabs] = js.native
  def getDocumentTabs(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def getDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def getDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def getDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def getDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def getLock(accountId: String, templateId: String): js.Promise[LockInformation] = js.native
  def getLock(accountId: String, templateId: String, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def getLock(
    accountId: String,
    templateId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  
  def getNotificationSettings(accountId: String, templateId: String): js.Promise[Notification] = js.native
  def getNotificationSettings(accountId: String, templateId: String, callback: js.Function0[Unit]): js.Promise[Notification] = js.native
  def getNotificationSettings(
    accountId: String,
    templateId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Notification] = js.native
  
  def getPageTabs(accountId: String, templateId: String, documentId: String, pageNumber: String): js.Promise[Tabs] = js.native
  def getPageTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def getPageTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def getPages(accountId: String, templateId: String, documentId: String): js.Promise[PageImages] = js.native
  def getPages(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[PageImages] = js.native
  def getPages(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[PageImages] = js.native
  def getPages(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[PageImages] = js.native
  def getPages(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[PageImages] = js.native
  def getPages(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[PageImages] = js.native
  
  def getTemplateDocumentHtmlDefinitions(accountId: String, templateId: String, documentId: String): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  def getTemplateDocumentHtmlDefinitions(accountId: String, templateId: String, documentId: String, callback: js.Function0[Unit]): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  def getTemplateDocumentHtmlDefinitions(
    accountId: String,
    templateId: String,
    documentId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  
  def getTemplateHtmlDefinitions(accountId: String, templateId: String): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  def getTemplateHtmlDefinitions(accountId: String, templateId: String, callback: js.Function0[Unit]): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  def getTemplateHtmlDefinitions(
    accountId: String,
    templateId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentHtmlDefinitionOriginals] = js.native
  
  def listBulkRecipients(accountId: String, templateId: String, recipientId: String): js.Promise[BulkRecipientsResponse] = js.native
  def listBulkRecipients(accountId: String, templateId: String, recipientId: String, optsOrCallback: Any): js.Promise[BulkRecipientsResponse] = js.native
  def listBulkRecipients(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  def listBulkRecipients(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  def listBulkRecipients(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  def listBulkRecipients(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkRecipientsResponse] = js.native
  
  def listCustomFields(accountId: String, templateId: String): js.Promise[CustomFields] = js.native
  def listCustomFields(accountId: String, templateId: String, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def listCustomFields(
    accountId: String,
    templateId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  
  def listDocumentFields(accountId: String, templateId: String, documentId: String): js.Promise[DocumentFieldsInformation] = js.native
  def listDocumentFields(accountId: String, templateId: String, documentId: String, callback: js.Function0[Unit]): js.Promise[DocumentFieldsInformation] = js.native
  def listDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  
  def listDocuments(accountId: String, templateId: String): js.Promise[TemplateDocumentsResult] = js.native
  def listDocuments(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[TemplateDocumentsResult] = js.native
  def listDocuments(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[TemplateDocumentsResult] = js.native
  def listDocuments(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentsResult] = js.native
  def listDocuments(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[TemplateDocumentsResult] = js.native
  def listDocuments(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentsResult] = js.native
  
  def listRecipients(accountId: String, templateId: String): js.Promise[Recipients] = js.native
  def listRecipients(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[Recipients] = js.native
  def listRecipients(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def listRecipients(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  def listRecipients(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Recipients] = js.native
  def listRecipients(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Recipients] = js.native
  
  def listTabs(accountId: String, templateId: String, recipientId: String): js.Promise[Tabs] = js.native
  def listTabs(accountId: String, templateId: String, recipientId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def listTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def listTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def listTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def listTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def listTemplates(accountId: String): js.Promise[EnvelopeTemplateResults] = js.native
  def listTemplates(accountId: String, optsOrCallback: Any): js.Promise[EnvelopeTemplateResults] = js.native
  def listTemplates(accountId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[EnvelopeTemplateResults] = js.native
  def listTemplates(
    accountId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTemplateResults] = js.native
  def listTemplates(accountId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[EnvelopeTemplateResults] = js.native
  def listTemplates(
    accountId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeTemplateResults] = js.native
  
  def rotateDocumentPage(accountId: String, templateId: String, documentId: String, pageNumber: String): js.Promise[Unit] = js.native
  def rotateDocumentPage(accountId: String, templateId: String, documentId: String, pageNumber: String, optsOrCallback: Any): js.Promise[Unit] = js.native
  def rotateDocumentPage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def rotateDocumentPage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  def rotateDocumentPage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Unit] = js.native
  def rotateDocumentPage(
    accountId: String,
    templateId: String,
    documentId: String,
    pageNumber: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Unit] = js.native
  
  def update(accountId: String, templateId: String): js.Promise[TemplateUpdateSummary] = js.native
  def update(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[TemplateUpdateSummary] = js.native
  def update(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[TemplateUpdateSummary] = js.native
  def update(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateUpdateSummary] = js.native
  def update(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[TemplateUpdateSummary] = js.native
  def update(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateUpdateSummary] = js.native
  
  def updateBulkRecipients(accountId: String, templateId: String, recipientId: String): js.Promise[BulkRecipientsSummaryResponse] = js.native
  def updateBulkRecipients(accountId: String, templateId: String, recipientId: String, optsOrCallback: Any): js.Promise[BulkRecipientsSummaryResponse] = js.native
  def updateBulkRecipients(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsSummaryResponse] = js.native
  def updateBulkRecipients(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkRecipientsSummaryResponse] = js.native
  def updateBulkRecipients(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[BulkRecipientsSummaryResponse] = js.native
  def updateBulkRecipients(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[BulkRecipientsSummaryResponse] = js.native
  
  def updateCustomFields(accountId: String, templateId: String): js.Promise[CustomFields] = js.native
  def updateCustomFields(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[CustomFields] = js.native
  def updateCustomFields(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def updateCustomFields(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  def updateCustomFields(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[CustomFields] = js.native
  def updateCustomFields(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[CustomFields] = js.native
  
  def updateDocument(accountId: String, templateId: String, documentId: String): js.Promise[EnvelopeDocument] = js.native
  def updateDocument(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[EnvelopeDocument] = js.native
  def updateDocument(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[EnvelopeDocument] = js.native
  def updateDocument(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeDocument] = js.native
  def updateDocument(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[EnvelopeDocument] = js.native
  def updateDocument(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[EnvelopeDocument] = js.native
  
  def updateDocumentFields(accountId: String, templateId: String, documentId: String): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  def updateDocumentFields(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[DocumentFieldsInformation] = js.native
  
  def updateDocuments(accountId: String, templateId: String): js.Promise[TemplateDocumentsResult] = js.native
  def updateDocuments(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[TemplateDocumentsResult] = js.native
  def updateDocuments(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[TemplateDocumentsResult] = js.native
  def updateDocuments(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentsResult] = js.native
  def updateDocuments(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[TemplateDocumentsResult] = js.native
  def updateDocuments(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[TemplateDocumentsResult] = js.native
  
  def updateGroupShare(accountId: String, templateId: String, templatePart: String): js.Promise[GroupInformation] = js.native
  def updateGroupShare(accountId: String, templateId: String, templatePart: String, optsOrCallback: Any): js.Promise[GroupInformation] = js.native
  def updateGroupShare(
    accountId: String,
    templateId: String,
    templatePart: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[GroupInformation] = js.native
  def updateGroupShare(
    accountId: String,
    templateId: String,
    templatePart: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  def updateGroupShare(
    accountId: String,
    templateId: String,
    templatePart: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[GroupInformation] = js.native
  def updateGroupShare(
    accountId: String,
    templateId: String,
    templatePart: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[GroupInformation] = js.native
  
  def updateLock(accountId: String, templateId: String): js.Promise[LockInformation] = js.native
  def updateLock(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[LockInformation] = js.native
  def updateLock(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def updateLock(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  def updateLock(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[LockInformation] = js.native
  def updateLock(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[LockInformation] = js.native
  
  def updateNotificationSettings(accountId: String, templateId: String): js.Promise[Notification] = js.native
  def updateNotificationSettings(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[Notification] = js.native
  def updateNotificationSettings(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[Notification] = js.native
  def updateNotificationSettings(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Notification] = js.native
  def updateNotificationSettings(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[Notification] = js.native
  def updateNotificationSettings(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Notification] = js.native
  
  def updateRecipients(accountId: String, templateId: String): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(accountId: String, templateId: String, optsOrCallback: Any): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(accountId: String, templateId: String, optsOrCallback: Any, callback: js.Function0[Unit]): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(
    accountId: String,
    templateId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(accountId: String, templateId: String, optsOrCallback: Unit, callback: js.Function0[Unit]): js.Promise[RecipientsUpdateSummary] = js.native
  def updateRecipients(
    accountId: String,
    templateId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[RecipientsUpdateSummary] = js.native
  
  def updateTabs(accountId: String, templateId: String, recipientId: String): js.Promise[Tabs] = js.native
  def updateTabs(accountId: String, templateId: String, recipientId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def updateTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def updateTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def updateTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def updateTabs(
    accountId: String,
    templateId: String,
    recipientId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  
  def updateTemplateDocumentTabs(accountId: String, templateId: String, documentId: String): js.Promise[Tabs] = js.native
  def updateTemplateDocumentTabs(accountId: String, templateId: String, documentId: String, optsOrCallback: Any): js.Promise[Tabs] = js.native
  def updateTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def updateTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Any,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
  def updateTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function0[Unit]
  ): js.Promise[Tabs] = js.native
  def updateTemplateDocumentTabs(
    accountId: String,
    templateId: String,
    documentId: String,
    optsOrCallback: Unit,
    callback: js.Function3[/* error */ Any, /* data */ Any, /* response */ Any, Unit]
  ): js.Promise[Tabs] = js.native
}
