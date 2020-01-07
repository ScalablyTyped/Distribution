package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Knowledgebases$Documents")
@js.native
class ResourceDollarProjectsDollarKnowledgebasesDollarDocuments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.create
    * @desc Creates a new document.  Operation <response: Document, metadata:
    * KnowledgeOperationMetadata>
    * @alias dialogflow.projects.knowledgeBases.documents.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The knoweldge base to create a document for. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    * @param {().GoogleCloudDialogflowV2beta1Document} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarCreate): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarCreate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.delete
    * @desc Deletes the specified document.  Operation <response:
    * google.protobuf.Empty,            metadata: KnowledgeOperationMetadata>
    * @alias dialogflow.projects.knowledgeBases.documents.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the document to delete. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarDelete): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarDelete,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.get
    * @desc Retrieves the specified document.
    * @alias dialogflow.projects.knowledgeBases.documents.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the document to retrieve. Format `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1Document] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1Document]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarGet): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1Document] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1Document]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1Document],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1Document]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1Document] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1Document]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.list
    * @desc Returns the list of all documents of the knowledge base.
    * @alias dialogflow.projects.knowledgeBases.documents.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 10 and at most 100.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The knowledge base to list all documents for. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarList): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.patch
    * @desc Updates the specified document. Operation <response: Document,
    * metadata: KnowledgeOperationMetadata>
    * @alias dialogflow.projects.knowledgeBases.documents.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The document resource name. The name must be empty when creating a document. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`.
    * @param {string=} params.updateMask Optional. Not specified means `update all`. Currently, only `display_name` can be updated, an InvalidArgument will be returned for attempting to update other fields.
    * @param {().GoogleCloudDialogflowV2beta1Document} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarPatch): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarPatch,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.knowledgeBases.documents.reload
    * @desc Reloads the specified document from its specified source,
    * content_uri or content. The previously loaded content of the document
    * will be deleted. Note: Even when the content of the document has not
    * changed, there still may be side effects because of internal
    * implementation changes. Operation <response: Document, metadata:
    * KnowledgeOperationMetadata>
    * @alias dialogflow.projects.knowledgeBases.documents.reload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the document to reload. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>/documents/<Document ID>`
    * @param {().GoogleCloudDialogflowV2beta1ReloadDocumentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reload(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def reload(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def reload(params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarReload): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def reload(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarReload,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def reload(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarReload,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def reload(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarReload,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def reload(
    params: ParamsDollarResourceDollarProjectsDollarKnowledgebasesDollarDocumentsDollarReload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
}

