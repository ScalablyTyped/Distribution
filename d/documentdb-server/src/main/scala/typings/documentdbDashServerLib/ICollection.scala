package typings
package documentdbDashServerLib

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
  def createAttachment(documentLink: java.lang.String, body: IAttachment): scala.Boolean = js.native
  def createAttachment(
    documentLink: java.lang.String,
    body: IAttachment,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def createAttachment(documentLink: java.lang.String, body: IAttachment, options: ICreateOptions): scala.Boolean = js.native
  def createAttachment(
    documentLink: java.lang.String,
    body: IAttachment,
    options: ICreateOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Create a document under the collection.
  	 * @param collectionLink resource link of the collection under which the document will be created
  	 * @param body of the document. The "id" property is required and will be generated automatically if not provided (this behaviour can be overriden using the CreateOptions). Any other properties can be added.
  	 * @param optional create options
  	 * @param optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def createDocument(collectionLink: java.lang.String, body: js.Object): scala.Boolean = js.native
  def createDocument(
    collectionLink: java.lang.String,
    body: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def createDocument(collectionLink: java.lang.String, body: js.Object, options: ICreateOptions): scala.Boolean = js.native
  def createDocument(
    collectionLink: java.lang.String,
    body: js.Object,
    options: ICreateOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Delete an attachment.
  	 * @param attachmentLink resource link of the attachment to be deleted
  	 * @param options optional delete options.
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def deleteAttachment(attachmentLink: java.lang.String): scala.Boolean = js.native
  def deleteAttachment(
    attachmentLink: java.lang.String,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def deleteAttachment(attachmentLink: java.lang.String, options: IDeleteOptions): scala.Boolean = js.native
  def deleteAttachment(
    attachmentLink: java.lang.String,
    options: IDeleteOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Delete a document.
  	 * @param documentLink resource link of the document to delete
  	 * @param options optional delete options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def deleteDocument(documentLink: java.lang.String): scala.Boolean = js.native
  def deleteDocument(
    documentLink: java.lang.String,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def deleteDocument(documentLink: java.lang.String, options: IDeleteOptions): scala.Boolean = js.native
  def deleteDocument(
    documentLink: java.lang.String,
    options: IDeleteOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /** Get alt link (name-based link) of current collection. */
  def getAltLink(): java.lang.String = js.native
  /** Get self link of current collection. */
  def getSelfLink(): java.lang.String = js.native
  def queryAttachments(documentLink: java.lang.String, query: IParameterizedQuery): scala.Boolean = js.native
  def queryAttachments(
    documentLink: java.lang.String,
    query: IParameterizedQuery,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def queryAttachments(documentLink: java.lang.String, query: IParameterizedQuery, options: IFeedOptions): scala.Boolean = js.native
  def queryAttachments(
    documentLink: java.lang.String,
    query: IParameterizedQuery,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Execute a SQL query on the attachments for the document.
  	 * @param documentLink resource link of the document whose attachments are being queried
  	 * @param query SQL query string. This can also be a JSON object to pass in a parameterized query along with the values.
  	 * @param options optional query options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def queryAttachments(documentLink: java.lang.String, query: java.lang.String): scala.Boolean = js.native
  def queryAttachments(
    documentLink: java.lang.String,
    query: java.lang.String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def queryAttachments(documentLink: java.lang.String, query: java.lang.String, options: IFeedOptions): scala.Boolean = js.native
  def queryAttachments(
    documentLink: java.lang.String,
    query: java.lang.String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def queryDocuments(collectionLink: java.lang.String, filterQuery: IParameterizedQuery): scala.Boolean = js.native
  def queryDocuments(
    collectionLink: java.lang.String,
    filterQuery: IParameterizedQuery,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def queryDocuments(collectionLink: java.lang.String, filterQuery: IParameterizedQuery, options: IFeedOptions): scala.Boolean = js.native
  def queryDocuments(
    collectionLink: java.lang.String,
    filterQuery: IParameterizedQuery,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Execute a SQL query on the documents of the collection.
  	 * @param collectionLink resource link of the collection whose documents are being queried
  	 * @param filterQuery SQL query string. This can also be a JSON object to pass in a parameterized query along with the values.
  	 * @param options optional query options.
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def queryDocuments(collectionLink: java.lang.String, filterQuery: java.lang.String): scala.Boolean = js.native
  def queryDocuments(
    collectionLink: java.lang.String,
    filterQuery: java.lang.String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def queryDocuments(collectionLink: java.lang.String, filterQuery: java.lang.String, options: IFeedOptions): scala.Boolean = js.native
  def queryDocuments(
    collectionLink: java.lang.String,
    filterQuery: java.lang.String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](collectionLink: java.lang.String, filterQuery: IParameterizedQuery): scala.Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](
    collectionLink: java.lang.String,
    filterQuery: IParameterizedQuery,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](collectionLink: java.lang.String, filterQuery: IParameterizedQuery, options: IFeedOptions): scala.Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](
    collectionLink: java.lang.String,
    filterQuery: IParameterizedQuery,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](collectionLink: java.lang.String, filterQuery: java.lang.String): scala.Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](
    collectionLink: java.lang.String,
    filterQuery: java.lang.String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](collectionLink: java.lang.String, filterQuery: java.lang.String, options: IFeedOptions): scala.Boolean = js.native
  @JSName("queryDocuments")
  def queryDocuments_T[T](
    collectionLink: java.lang.String,
    filterQuery: java.lang.String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Read an Attachment.
  	 * @param attachmenLink resource link of the attachment to read
  	 * @param options optional read options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def readAttachment(attachmenLink: java.lang.String): scala.Boolean = js.native
  def readAttachment(
    attachmenLink: java.lang.String,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def readAttachment(attachmenLink: java.lang.String, options: IReadOptions): scala.Boolean = js.native
  def readAttachment(
    attachmenLink: java.lang.String,
    options: IReadOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Get all attachments for the document.
  	 * @param documentLink resource link of the document whose attachments are being read
  	 * @param options optional read feed options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def readAttachments(documentLink: java.lang.String): scala.Boolean = js.native
  def readAttachments(
    documentLink: java.lang.String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def readAttachments(documentLink: java.lang.String, options: IFeedOptions): scala.Boolean = js.native
  def readAttachments(
    documentLink: java.lang.String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Read a document.
  	 * @param documentLink resource link of the document to read
  	 * @param options optional read options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def readDocument(documentLink: java.lang.String): scala.Boolean = js.native
  def readDocument(
    documentLink: java.lang.String,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def readDocument(documentLink: java.lang.String, options: IReadOptions): scala.Boolean = js.native
  def readDocument(
    documentLink: java.lang.String,
    options: IReadOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("readDocument")
  def readDocument_T[T](documentLink: java.lang.String): scala.Boolean = js.native
  @JSName("readDocument")
  def readDocument_T[T](documentLink: java.lang.String, options: IReadOptions): scala.Boolean = js.native
  @JSName("readDocument")
  def readDocument_T[T](
    documentLink: java.lang.String,
    options: IReadOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ T, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Get all documents for the collection.
  	 * @param collectionLink resource link of the collection whose documents are being read
  	 * @param options optional read feed options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def readDocuments(collectionLink: java.lang.String): scala.Boolean = js.native
  def readDocuments(
    collectionLink: java.lang.String,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def readDocuments(collectionLink: java.lang.String, options: IFeedOptions): scala.Boolean = js.native
  def readDocuments(
    collectionLink: java.lang.String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[js.Object], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  @JSName("readDocuments")
  def readDocuments_T[T](collectionLink: java.lang.String): scala.Boolean = js.native
  @JSName("readDocuments")
  def readDocuments_T[T](collectionLink: java.lang.String, options: IFeedOptions): scala.Boolean = js.native
  @JSName("readDocuments")
  def readDocuments_T[T](
    collectionLink: java.lang.String,
    options: IFeedOptions,
    callback: js.Function3[
      /* error */ IFeedCallbackError, 
      /* resources */ js.Array[T], 
      /* options */ IFeedCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Replace an attachment.
  	 * @param attachmentLink resource link of the attachment to be replaced
  	 * @param attachment new attachment body
  	 * @param options optional replace options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def replaceAttachment(attachmentLink: java.lang.String, attachment: js.Object): scala.Boolean = js.native
  def replaceAttachment(
    attachmentLink: java.lang.String,
    attachment: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def replaceAttachment(attachmentLink: java.lang.String, attachment: js.Object, options: IReplaceOptions): scala.Boolean = js.native
  def replaceAttachment(
    attachmentLink: java.lang.String,
    attachment: js.Object,
    options: IReplaceOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Replace a document.
  	 * @param documentLink resource link of the document
  	 * @param document new document body
  	 * @param options optional replace options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def replaceDocument(documentLink: java.lang.String, document: js.Object): scala.Boolean = js.native
  def replaceDocument(
    documentLink: java.lang.String,
    document: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def replaceDocument(documentLink: java.lang.String, document: js.Object, options: IReplaceOptions): scala.Boolean = js.native
  def replaceDocument(
    documentLink: java.lang.String,
    document: js.Object,
    options: IReplaceOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Upsert an attachment for the document.
  	 * @param documentLink resource link of the document under which the attachment will be upserted
  	 * @param body metadata that defines the attachment media like media, contentType. It can include any other properties as part of the metadata.
  	 * @param options optional upsert options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def upsertAttachment(documentLink: java.lang.String, body: js.Object): scala.Boolean = js.native
  def upsertAttachment(
    documentLink: java.lang.String,
    body: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def upsertAttachment(documentLink: java.lang.String, body: js.Object, options: IUpsertOptions): scala.Boolean = js.native
  def upsertAttachment(
    documentLink: java.lang.String,
    body: js.Object,
    options: IUpsertOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  /**
  	 * Upsert a document under the collection.
  	 * @param collectionLink resource link of the collection under which the document will be upserted
  	 * @param body body of the document. The "id" property is required and will be generated automatically if not provided (this behaviour can be overriden using the UpsertOptions). Any other properties can be added.
  	 * @param options optional upsert options
  	 * @param callback optional callback for the operation. If no callback is provided, any error in the operation will be thrown.
  	 */
  def upsertDocument(collectionLink: java.lang.String, body: js.Object): scala.Boolean = js.native
  def upsertDocument(
    collectionLink: java.lang.String,
    body: js.Object,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
  def upsertDocument(collectionLink: java.lang.String, body: js.Object, options: IUpsertOptions): scala.Boolean = js.native
  def upsertDocument(
    collectionLink: java.lang.String,
    body: js.Object,
    options: IUpsertOptions,
    callback: js.Function3[
      /* error */ IRequestCallbackError, 
      /* resources */ js.Object, 
      /* options */ IRequestCallbackOptions, 
      scala.Unit
    ]
  ): scala.Boolean = js.native
}

