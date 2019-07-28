package typings.documentdbDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stored procedures and triggers are registered for a particular collection. The Collection object supports create, read, update and delete (CRUD) and query operations on documents and attachments in the current collection.
  * All collection operations are completed asynchronously. You can provide a callback to handle the result of the operation, and to perform error handling if necessary.
  * Stored procedures and triggers are executed in a time-limited manner. Long-running stored procedures and triggers are defensively timed out and all transactions performed are rolled back.
  * We stop queuing collection operations if the stored procedure is close to timing out. You can inspect the boolean return value of all collection operations to see if an operation was not queued and handle this situation gracefully.
  */
@js.native
trait ICollection extends IQueryAPI {
  /** Opening call to start a chained query. Should be used in conjunction with the closing value call to perform chained queries. */
  def chain(): IQueryResponse = js.native
  /**
    * Create an attachment for the document.
    * @param documentLink resource link of the collection under which the document will be created
    * @param body metadata that defines the attachment media like media, contentType. It can include any other properties as part of the metedata.
    * @param options optional create options
    * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
    */
  def createAttachment(documentLink: String, body: IAttachment): Boolean = js.native
  def createAttachment(
    documentLink: String,
    body: IAttachment,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def createAttachment(documentLink: String, body: IAttachment, options: ICreateOptions): Boolean = js.native
  def createAttachment(
    documentLink: String,
    body: IAttachment,
    options: ICreateOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Create a document under the collection.
  	 * @param collectionLink resource link of the collection under which the document will be created
  	 * @param body of the document. The "id" property is required and will be generated automatically if not provided (this behaviour can be overriden using the CreateOptions). Any other properties can be added.
  	 * @param optional create options
  	 * @param optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def createDocument(collectionLink: String, body: js.Object): Boolean = js.native
  def createDocument(
    collectionLink: String,
    body: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def createDocument(collectionLink: String, body: js.Object, options: ICreateOptions): Boolean = js.native
  def createDocument(
    collectionLink: String,
    body: js.Object,
    options: ICreateOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Delete an attachment.
  	 * @param attachmentLink resource link of the attachment to be deleted
  	 * @param options optional delete options.
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def deleteAttachment(attachmentLink: String): Boolean = js.native
  def deleteAttachment(
    attachmentLink: String,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def deleteAttachment(attachmentLink: String, options: IDeleteOptions): Boolean = js.native
  def deleteAttachment(
    attachmentLink: String,
    options: IDeleteOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Delete a document.
  	 * @param documentLink resource link of the document to delete
  	 * @param options optional delete options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def deleteDocument(documentLink: String): Boolean = js.native
  def deleteDocument(
    documentLink: String,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def deleteDocument(documentLink: String, options: IDeleteOptions): Boolean = js.native
  def deleteDocument(
    documentLink: String,
    options: IDeleteOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /** Get alt link (name-based link) of current collection. */
  def getAltLink(): String = js.native
  /** Get self link of current collection. */
  def getSelfLink(): String = js.native
  /**
  	 * Execute a SQL query on the attachments for the document.
  	 * @param documentLink resource link of the document whose attachments are being queried
  	 * @param query SQL query string. This can also be a JSON object to pass in a parameterized query along with the values.
  	 * @param options optional query options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def queryAttachments(documentLink: String, query: String): Boolean = js.native
  def queryAttachments(
    documentLink: String,
    query: String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def queryAttachments(documentLink: String, query: String, options: IFeedOptions): Boolean = js.native
  def queryAttachments(
    documentLink: String,
    query: String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def queryAttachments(documentLink: String, query: IParameterizedQuery): Boolean = js.native
  def queryAttachments(
    documentLink: String,
    query: IParameterizedQuery,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def queryAttachments(documentLink: String, query: IParameterizedQuery, options: IFeedOptions): Boolean = js.native
  def queryAttachments(
    documentLink: String,
    query: IParameterizedQuery,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Execute a SQL query on the documents of the collection.
  	 * @param collectionLink resource link of the collection whose documents are being queried
  	 * @param filterQuery SQL query string. This can also be a JSON object to pass in a parameterized query along with the values.
  	 * @param options optional query options.
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def queryDocuments(collectionLink: String, filterQuery: String): Boolean = js.native
  def queryDocuments(
    collectionLink: String,
    filterQuery: String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def queryDocuments(collectionLink: String, filterQuery: String, options: IFeedOptions): Boolean = js.native
  def queryDocuments(
    collectionLink: String,
    filterQuery: String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def queryDocuments(collectionLink: String, filterQuery: IParameterizedQuery): Boolean = js.native
  def queryDocuments(
    collectionLink: String,
    filterQuery: IParameterizedQuery,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def queryDocuments(collectionLink: String, filterQuery: IParameterizedQuery, options: IFeedOptions): Boolean = js.native
  def queryDocuments(
    collectionLink: String,
    filterQuery: IParameterizedQuery,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](collectionLink: String, filterQuery: String): Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](
    collectionLink: String,
    filterQuery: String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](collectionLink: String, filterQuery: String, options: IFeedOptions): Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](
    collectionLink: String,
    filterQuery: String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](collectionLink: String, filterQuery: IParameterizedQuery): Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](
    collectionLink: String,
    filterQuery: IParameterizedQuery,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](collectionLink: String, filterQuery: IParameterizedQuery, options: IFeedOptions): Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](
    collectionLink: String,
    filterQuery: IParameterizedQuery,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Read an Attachment.
  	 * @param attachmenLink resource link of the attachment to read
  	 * @param options optional read options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def readAttachment(attachmenLink: String): Boolean = js.native
  def readAttachment(
    attachmenLink: String,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def readAttachment(attachmenLink: String, options: IReadOptions): Boolean = js.native
  def readAttachment(
    attachmenLink: String,
    options: IReadOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Get all attachments for the document.
  	 * @param documentLink resource link of the document whose attachments are being read
  	 * @param options optional read feed options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def readAttachments(documentLink: String): Boolean = js.native
  def readAttachments(
    documentLink: String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def readAttachments(documentLink: String, options: IFeedOptions): Boolean = js.native
  def readAttachments(
    documentLink: String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Read a document.
  	 * @param documentLink resource link of the document to read
  	 * @param options optional read options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def readDocument(documentLink: String): Boolean = js.native
  def readDocument(
    documentLink: String,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def readDocument(documentLink: String, options: IReadOptions): Boolean = js.native
  def readDocument(
    documentLink: String,
    options: IReadOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  @JSName("readDocument")
  def readDocument_T[T](documentLink: String): Boolean = js.native
  @JSName("readDocument")
  def readDocument_T[T](documentLink: String, options: IReadOptions): Boolean = js.native
  @JSName("readDocument")
  def readDocument_T[T](
    documentLink: String,
    options: IReadOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ T, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Get all documents for the collection.
  	 * @param collectionLink resource link of the collection whose documents are being read
  	 * @param options optional read feed options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def readDocuments(collectionLink: String): Boolean = js.native
  def readDocuments(
    collectionLink: String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def readDocuments(collectionLink: String, options: IFeedOptions): Boolean = js.native
  def readDocuments(
    collectionLink: String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  @JSName("readDocuments")
  def readDocuments_T[T](collectionLink: String): Boolean = js.native
  @JSName("readDocuments")
  def readDocuments_T[T](collectionLink: String, options: IFeedOptions): Boolean = js.native
  @JSName("readDocuments")
  def readDocuments_T[T](
    collectionLink: String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Replace an attachment.
  	 * @param attachmentLink resource link of the attachment to be replaced
  	 * @param attachment new attachment body
  	 * @param options optional replace options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def replaceAttachment(attachmentLink: String, attachment: js.Object): Boolean = js.native
  def replaceAttachment(
    attachmentLink: String,
    attachment: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def replaceAttachment(attachmentLink: String, attachment: js.Object, options: IReplaceOptions): Boolean = js.native
  def replaceAttachment(
    attachmentLink: String,
    attachment: js.Object,
    options: IReplaceOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Replace a document.
  	 * @param documentLink resource link of the document
  	 * @param document new document body
  	 * @param options optional replace options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def replaceDocument(documentLink: String, document: js.Object): Boolean = js.native
  def replaceDocument(
    documentLink: String,
    document: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def replaceDocument(documentLink: String, document: js.Object, options: IReplaceOptions): Boolean = js.native
  def replaceDocument(
    documentLink: String,
    document: js.Object,
    options: IReplaceOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Upsert an attachment for the document.
  	 * @param documentLink resource link of the document under which the attachment will be upserted
  	 * @param body metadata that defines the attachment media like media, contentType. It can include any other properties as part of the metadata.
  	 * @param options optional upsert options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def upsertAttachment(documentLink: String, body: js.Object): Boolean = js.native
  def upsertAttachment(
    documentLink: String,
    body: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def upsertAttachment(documentLink: String, body: js.Object, options: IUpsertOptions): Boolean = js.native
  def upsertAttachment(
    documentLink: String,
    body: js.Object,
    options: IUpsertOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  /**
  	 * Upsert a document under the collection.
  	 * @param collectionLink resource link of the collection under which the document will be upserted
  	 * @param body body of the document. The "id" property is required and will be generated automatically if not provided (this behaviour can be overriden using the UpsertOptions). Any other properties can be added.
  	 * @param options optional upsert options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def upsertDocument(collectionLink: String, body: js.Object): Boolean = js.native
  def upsertDocument(
    collectionLink: String,
    body: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
  def upsertDocument(collectionLink: String, body: js.Object, options: IUpsertOptions): Boolean = js.native
  def upsertDocument(
    collectionLink: String,
    body: js.Object,
    options: IUpsertOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      Unit
    ]
  ): Boolean = js.native
}

