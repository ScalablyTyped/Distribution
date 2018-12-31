package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("documentdb", "DocumentClient")
@js.native
class DocumentClient protected () extends js.Object {
  /**
    * Constructs a DocumentClient.
    * @param urlConnection           - The service endpoint to use to create the client.
    * @param auth                    - An object that is used for authenticating requests and must contains one of the options.
    * @param [connectionPolicy]      - An instance of {@link ConnectionPolicy} class. This parameter is optional and the default connectionPolicy will be used if omitted.
    * @param [consistencyLevel]      - An optional parameter that represents the consistency level. It can take any value from {@link ConsistencyLevel}.
    */
  def this(urlConnection: java.lang.String, auth: AuthOptions) = this()
  def this(urlConnection: java.lang.String, auth: AuthOptions, connectionPolicy: ConnectionPolicy) = this()
  def this(urlConnection: java.lang.String, auth: AuthOptions, connectionPolicy: ConnectionPolicy, consistencyLevel: ConsistencyLevel) = this()
  def createAttachment(documentLink: java.lang.String, body: Attachment, callback: RequestCallback[AttachmentMeta]): scala.Unit = js.native
  /**
    * Create an attachment for the document object.
    * <p>
    *  Each document may contain zero or more attachments. Attachments can be of any MIME type - text, image, binary data. <br>
    *  These are stored externally in Azure Blob storage. Attachments are automatically deleted when the parent document is deleted.
    * </p>
    * @param documentLink  - The self-link of the document.
    * @param body          - The metadata the defines the attachment media like media, contentType. It can include any other properties as part of the metedata
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def createAttachment(
    documentLink: java.lang.String,
    body: Attachment,
    options: RequestOptions,
    callback: RequestCallback[AttachmentMeta]
  ): scala.Unit = js.native
  def createAttachmentAndUploadMedia(
    documentLink: java.lang.String,
    readableStream: nodeLib.NodeJSNs.ReadableStream,
    callback: RequestCallback[AttachmentMeta]
  ): scala.Unit = js.native
  /**
    * Create an attachment with media file for the document object.
    * @param documentLink      - The self-link of the document.
    * @param readableStream    - The stream that represents the media itself that needs to be uploaded.
    * @param [options]         - The request options.
    * @param callback          - The callback for the request.
    */
  def createAttachmentAndUploadMedia(
    documentLink: java.lang.String,
    readableStream: nodeLib.NodeJSNs.ReadableStream,
    options: MediaOptions,
    callback: RequestCallback[AttachmentMeta]
  ): scala.Unit = js.native
  def createCollection(databaseLink: java.lang.String, body: Collection, callback: RequestCallback[CollectionMeta]): scala.Unit = js.native
  /**
    * Creates a collection.
    * <p>
    * A collection is a named logical container for documents. <br>
    * A database may contain zero or more named collections and each collection consists of zero or more JSON documents. <br>
    * Being schema-free, the documents in a collection do not need to share the same structure or fields. <br>
    * Since collections are application resources, they can be authorized using either the master key or resource keys. <br>
    * </p>
    * @param databaseLink  - The self-link of the database.
    * @param body          - Represents the body of the collection.
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def createCollection(
    databaseLink: java.lang.String,
    body: Collection,
    options: RequestOptions,
    callback: RequestCallback[CollectionMeta]
  ): scala.Unit = js.native
  def createDatabase(body: UniqueId, callback: RequestCallback[DatabaseMeta]): scala.Unit = js.native
  /**
    * Send a request for creating a database.
    *  A database manages users, permissions and a set of collections.
    *  Each Azure DocumentDB Database Account is able to support multiple independent named databases, with the database being the logical container for data.
    *  Each Database consists of one or more collections, each of which in turn contain one or more documents. Since databases are an an administrative
    *  resource, the Service Master Key will be required in order to access and successfully complete any action using the User APIs.
    * @param body      - A json object that represents The database to be created.
    * @param [options] - The request options.
    * @param callback  - The callback for the request.
    */
  def createDatabase(body: UniqueId, options: RequestOptions, callback: RequestCallback[DatabaseMeta]): scala.Unit = js.native
  def createDocument[TDocument](
    documentsFeedOrDatabaseLink: java.lang.String,
    document: NewDocument,
    callback: RequestCallback[RetrievedDocument]
  ): scala.Unit = js.native
  /**
    * Create a document.
    * <p>
    * There is no set schema for JSON documents. They may contain any number of custom properties as well as an optional list of attachments. <br>
    * A Document is an application resource and can be authorized using the master key or resource keys
    * </p>
    * @param documentsFeedOrDatabaseLink    - The self-link of the collection.
    * @param document          - Represents the body of the document. Can contain any number of user defined properties.
    * @param [options]         - The request options.
    * @param callback 			- The callback for the request.
    */
  def createDocument[TDocument](
    documentsFeedOrDatabaseLink: java.lang.String,
    document: NewDocument,
    options: DocumentOptions,
    callback: RequestCallback[RetrievedDocument]
  ): scala.Unit = js.native
  def createPermission(userLink: java.lang.String, body: Permission, callback: RequestCallback[PermissionMeta]): scala.Unit = js.native
  /**
    * Create a permission. A permission represents a per-User Permission to access a specific resource e.g. Document or Collection.
    * @param userLink      - Self-link of the user.
    * @param body          - Permission body
    * @param options       - Request options
    * @param callback      - Callback for the request
    */
  def createPermission(
    userLink: java.lang.String,
    body: Permission,
    options: RequestOptions,
    callback: RequestCallback[PermissionMeta]
  ): scala.Unit = js.native
  def createStoredProcedure(collectionLink: java.lang.String, procedure: Procedure, callback: RequestCallback[ProcedureMeta]): scala.Unit = js.native
  /**
    * Create a StoredProcedure.
    * <p>
    * DocumentDB allows stored procedures to be executed in the storage tier, directly against a document collection. The script <br>
    * gets executed under ACID transactions on the primary storage partition of the specified collection. For additional details, <br>
    * refer to the server-side JavaScript API documentation.
    * </p>
    * @param collectionLink    - The self-link of the collection.
    * @param procedure         - Represents the body of the stored procedure.
    * @param [options]         - The request options.
    * @param callback          - The callback for the request.
    */
  def createStoredProcedure(
    collectionLink: java.lang.String,
    procedure: Procedure,
    options: RequestOptions,
    callback: RequestCallback[ProcedureMeta]
  ): scala.Unit = js.native
  def createTrigger(collectionLink: java.lang.String, trigger: Trigger, callback: RequestCallback[TriggerMeta]): scala.Unit = js.native
  /**
    * Create a trigger.
    * <p>
    * DocumentDB supports pre and post triggers defined in JavaScript to be executed on creates, updates and deletes. <br>
    * For additional details, refer to the server-side JavaScript API documentation.
    * </p>
    * @param collectionLink  - The self-link of the collection.
    * @param trigger         - Represents the body of the trigger.
    * @param [options]       - The request options.
    * @param callback        - The callback for the request.
    */
  def createTrigger(
    collectionLink: java.lang.String,
    trigger: Trigger,
    options: RequestOptions,
    callback: RequestCallback[TriggerMeta]
  ): scala.Unit = js.native
  def createUser(databaseLink: java.lang.String, body: UniqueId, callback: RequestCallback[AbstractMeta]): scala.Unit = js.native
  /**
    * Create a user
    * @param databaseLink  - The self-link of the database.
    * @param body          - Represents the body of the user.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def createUser(
    databaseLink: java.lang.String,
    body: UniqueId,
    options: RequestOptions,
    callback: RequestCallback[AbstractMeta]
  ): scala.Unit = js.native
  def createUserDefinedFunction(
    collectionLink: java.lang.String,
    udf: UserDefinedFunction,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): scala.Unit = js.native
  /**
    * Create a UserDefinedFunction.
    * <p>
    * DocumentDB supports JavaScript UDFs which can be used inside queries, stored procedures and triggers. <br>
    * For additional details, refer to the server-side JavaScript API documentation.
    * </p>
    * @param collectionLink    - The self-link of the collection.
    * @param udf               - Represents the body of the userDefinedFunction.
    * @param [options]         - The request options.
    * @param callback          - The callback for the request.
    */
  def createUserDefinedFunction(
    collectionLink: java.lang.String,
    udf: UserDefinedFunction,
    options: RequestOptions,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): scala.Unit = js.native
  def deleteAttachment(attachmentLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete an attachment
    * @param attachmentLink    - The self-link of the attachment.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteAttachment(attachmentLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def deleteCollection(collectionLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete the collection object.
    * @param collectionLink    - The self-link of the collection.
    * @param [options]         - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteCollection(collectionLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def deleteConflict(conflictLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete a conflict
    * @param conflictLink      - The self-link of the conflict.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteConflict(conflictLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def deleteDatabase(databaseLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete the database object.
    * @param databaseLink  - The self-link of the database.
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def deleteDatabase(databaseLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def deleteDocument(documentLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete the document object.
    * @param documentLink  - The self-link of the document.
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def deleteDocument(documentLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def deletePermission(permissionLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete a permission
    * @param permissionLink    - The self-link of the permission.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deletePermission(permissionLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def deleteStoredProcedure(procedureLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete the StoredProcedure object.
    * @param procedureLink - The self-link of the stored procedure.
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def deleteStoredProcedure(procedureLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def deleteTrigger(triggerLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete a trigger
    * @param triggerLink       - The self-link of the trigger.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteTrigger(triggerLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def deleteUser(userLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete a user
    * @param userLink          - The self-link of the user.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteUser(userLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def deleteUserDefinedFunction(udfLink: java.lang.String, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  /**
    * Delete a user-defined function
    * @param udfLink           - The self-link of the user defined function.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteUserDefinedFunction(udfLink: java.lang.String, options: RequestOptions, callback: RequestCallback[scala.Unit]): scala.Unit = js.native
  def executeStoredProcedure[TResult](
    procedureLink: java.lang.String,
    paramsOrOptions: RequestOptions,
    callback: RequestCallback[TResult]
  ): scala.Unit = js.native
  def executeStoredProcedure[TResult](procedureLink: java.lang.String, paramsOrOptions: js.Array[_], callback: RequestCallback[TResult]): scala.Unit = js.native
  /**
    * Execute the StoredProcedure represented by the object.
    * @param procedureLink - The self-link of the stored procedure.
    * @param [params]      - Represents the parameters of the stored procedure.
    * @param options       - The request options
    * @param callback      - The callback for the request.
    */
  def executeStoredProcedure[TResult](
    procedureLink: java.lang.String,
    params: js.Array[_],
    options: RequestOptions,
    callback: RequestCallback[TResult]
  ): scala.Unit = js.native
  def getDatabaseAccount(callback: RequestCallback[DatabaseAccount]): scala.Unit = js.native
  /**
    * Gets the Database account information.
    * @param options       - The request options
    * @param callback      - The callback for the request
    */
  def getDatabaseAccount(options: DatabaseAccountRequestOptions, callback: RequestCallback[DatabaseAccount]): scala.Unit = js.native
  /**
    * Gets the curent read endpoint for a geo-replicated database account.
    * @param callback      - The callback for the request
    */
  def getReadEndpoint(callback: RequestCallback[java.lang.String]): scala.Unit = js.native
  /**
    * Gets the curent write endpoint for a geo-replicated database account.
    * @param callback      - The callback for the request
    */
  def getWriteEndpoint(callback: RequestCallback[java.lang.String]): scala.Unit = js.native
  /**
    * Query the attachments for the document.
    * @param documentLink      - The self-link of the document.
    * @param query             - A SQL query.
    * @param [options]         - Represents the feed options.
    */
  def queryAttachments[T](documentLink: java.lang.String, query: DocumentQuery): QueryIterator[T] = js.native
  def queryAttachments[T](documentLink: java.lang.String, query: DocumentQuery, options: FeedOptions): QueryIterator[T] = js.native
  /**
    * Query the collections for the database.
    * @param databaseLink  - The self-link of the database.
    * @param query         - A SQL query string.
    * @param [options]     - Represents the feed options.
    * @returns             - An instance of queryIterator to handle reading feed.
    */
  def queryCollections(databaseLink: java.lang.String, query: DocumentQuery): QueryIterator[CollectionMeta] = js.native
  def queryCollections(databaseLink: java.lang.String, query: DocumentQuery, options: FeedOptions): QueryIterator[CollectionMeta] = js.native
  /**
    * Query the conflicts for the collection.
    * @param collectionLink    - The self-link of the collection.
    * @param query             - A SQL query.
    * @param [options]         - Represents the feed options.
    */
  def queryConflicts(collectionLink: java.lang.String, query: DocumentQuery): QueryIterator[_] = js.native
  def queryConflicts(collectionLink: java.lang.String, query: DocumentQuery, options: FeedOptions): QueryIterator[_] = js.native
  /**
    * Lists all databases that satisfy a query.
    * @param query     - A SQL query string.
    * @param [options] - The feed options.
    * @returns         - An instance of QueryIterator to handle reading feed.
    */
  def queryDatabases(query: DocumentQuery): QueryIterator[DatabaseMeta] = js.native
  def queryDatabases(query: DocumentQuery, options: FeedOptions): QueryIterator[DatabaseMeta] = js.native
  /**
    * Query the documents for the collection.
    * @param collectionLink - The self-link of the collection.
    * @param query          - A SQL query string.
    * @param [options]      - Represents the feed options.
    * @returns              - An instance of queryIterator to handle reading feed.
    */
  def queryDocuments[TDocument](collectionLink: java.lang.String, query: DocumentQuery): QueryIterator[RetrievedDocument with TDocument] = js.native
  def queryDocuments[TDocument](collectionLink: java.lang.String, query: DocumentQuery, options: FeedOptions): QueryIterator[RetrievedDocument with TDocument] = js.native
  /**
    * Lists all offers that satisfy a query.
    * @param query     - A SQL query.
    * @param options   - The feed options.
    */
  def queryOffers(query: DocumentQuery): QueryIterator[_] = js.native
  def queryOffers(query: DocumentQuery, options: FeedOptions): QueryIterator[_] = js.native
  /**
    * Query the permission for the user.
    * @param userLink  - The self-link of the user.
    * @param query     - A SQL query.
    * @param options   - Feed options.
    */
  def queryPermissions(userLink: java.lang.String, query: DocumentQuery): QueryIterator[PermissionMeta] = js.native
  def queryPermissions(userLink: java.lang.String, query: DocumentQuery, options: FeedOptions): QueryIterator[PermissionMeta] = js.native
  /**
    * Query the storedProcedures for the collection.
    * @param collectionLink    - The self-link of the collection.
    * @param query             - A SQL query string.
    * @param [options]         - Represents the feed options.
    * @returns                 - An instance of queryIterator to handle reading feed.
    */
  def queryStoredProcedures(collectionLink: java.lang.String, query: DocumentQuery): QueryIterator[ProcedureMeta] = js.native
  def queryStoredProcedures(collectionLink: java.lang.String, query: DocumentQuery, options: FeedOptions): QueryIterator[ProcedureMeta] = js.native
  /**
    * Query the triggers for the collection.
    * @param collectionLink         - The self-link of the collection.
    * @param query   - A SQL query.
    * @param [options]         - Represents the feed options.
    * @returns               - An instance of queryIterator to handle reading feed.
    */
  def queryTriggers(collectionLink: java.lang.String, query: DocumentQuery): QueryIterator[TriggerMeta] = js.native
  def queryTriggers(collectionLink: java.lang.String, query: DocumentQuery, options: FeedOptions): QueryIterator[TriggerMeta] = js.native
  /**
    * Query the user-defined functions for the collection.
    * @param collectionLink    - The self-link of the collection.
    * @param query             - A SQL query string.
    * @param [options]         - Represents the feed options.
    * @returns                 - An instance of queryIterator to handle reading feed.
    */
  def queryUserDefinedFunctions(collectionLink: java.lang.String, query: DocumentQuery): QueryIterator[UserDefinedFunctionMeta] = js.native
  def queryUserDefinedFunctions(collectionLink: java.lang.String, query: DocumentQuery, options: FeedOptions): QueryIterator[UserDefinedFunctionMeta] = js.native
  /**
    * Query the users for the database.
    * @param databaseLink  - The self-link of the database.
    * @param query         - A SQL query.
    * @param options       - Represents the feed options.
    */
  def queryUsers(databaseLink: java.lang.String, query: DocumentQuery): QueryIterator[AbstractMeta] = js.native
  def queryUsers(databaseLink: java.lang.String, query: DocumentQuery, options: FeedOptions): QueryIterator[AbstractMeta] = js.native
  def readAttachment(attachmentLink: java.lang.String, callback: RequestCallback[AttachmentMeta]): scala.Unit = js.native
  /**
    * Read an Attachment object.
    * @param attachmentLink    - The self-link of the attachment.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readAttachment(
    attachmentLink: java.lang.String,
    options: RequestOptions,
    callback: RequestCallback[AttachmentMeta]
  ): scala.Unit = js.native
  /**
    * Get all attachments for this document.
    * @param documentLink      - The self-link of the document.
    * @param options           - The feed options.
    */
  def readAttachments(documentLink: java.lang.String): QueryIterator[AttachmentMeta] = js.native
  def readAttachments(documentLink: java.lang.String, options: FeedOptions): QueryIterator[AttachmentMeta] = js.native
  def readCollection(collectionLink: java.lang.String, callback: RequestCallback[CollectionMeta]): scala.Unit = js.native
  /**
    * Read a collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readCollection(
    collectionLink: java.lang.String,
    options: RequestOptions,
    callback: RequestCallback[CollectionMeta]
  ): scala.Unit = js.native
  /**
    * Get all collections in this database.
    * @param databaseLink      - The self-link of the database.
    * @param options           - The feed options.
    */
  def readCollections(databaseLink: java.lang.String): QueryIterator[CollectionMeta] = js.native
  def readCollections(databaseLink: java.lang.String, options: FeedOptions): QueryIterator[CollectionMeta] = js.native
  def readConflict(conflictLink: java.lang.String, callback: RequestCallback[_]): scala.Unit = js.native
  /**
    * Read a conflict.
    * @param conflictLink      - The self-link of the conflict.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readConflict(conflictLink: java.lang.String, options: RequestOptions, callback: RequestCallback[_]): scala.Unit = js.native
  /**
    * Get all conflicts in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readConflicts(collectionLink: java.lang.String): QueryIterator[_] = js.native
  def readConflicts(collectionLink: java.lang.String, options: FeedOptions): QueryIterator[_] = js.native
  def readDatabase(databaseLink: java.lang.String, callback: RequestCallback[DatabaseMeta]): scala.Unit = js.native
  /**
    * Read a database.
    * @param databaseLink      - The self-link of the database.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readDatabase(databaseLink: java.lang.String, options: RequestOptions, callback: RequestCallback[DatabaseMeta]): scala.Unit = js.native
  /**
    * List all databases.
    * @param options       - The request options.
    */
  def readDatabases(): QueryIterator[DatabaseMeta] = js.native
  def readDatabases(options: FeedOptions): QueryIterator[DatabaseMeta] = js.native
  def readDocument(documentLink: java.lang.String, callback: RequestCallback[RetrievedDocument]): scala.Unit = js.native
  /**
    * Read a document.
    * @param documentLink      - The self-link of the document.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readDocument(
    documentLink: java.lang.String,
    options: RequestOptions,
    callback: RequestCallback[RetrievedDocument]
  ): scala.Unit = js.native
  /**
    * Get all documents in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readDocuments(collectionLink: java.lang.String): QueryIterator[RetrievedDocument] = js.native
  def readDocuments(collectionLink: java.lang.String, options: FeedOptions): QueryIterator[RetrievedDocument] = js.native
  /**
    * Read the media for the attachment object.
    * @param mediaLink     - The media link of the media in the attachment.
    * @param callback      - The callback for the request, the result parameter can be a buffer or a stream depending on the value of MediaReadMode
    */
  def readMedia(
    mediaLink: java.lang.String,
    callback: RequestCallback[nodeLib.Buffer | nodeLib.NodeJSNs.ReadableStream]
  ): scala.Unit = js.native
  /**
    * Read an offer.
    * @param offerLink     - The self-link of the offer.
    * @param callback      - The callback for the request.
    */
  def readOffer(offerLink: java.lang.String, callback: RequestCallback[_]): scala.Unit = js.native
  /**
    * List all offers
    * @param options       - The feed options.
    */
  def readOffers(): QueryIterator[js.Array[_]] = js.native
  def readOffers(options: FeedOptions): QueryIterator[js.Array[_]] = js.native
  def readPermission(permissionLink: java.lang.String, callback: RequestCallback[PermissionMeta]): scala.Unit = js.native
  /**
    * Read a permission.
    * @param permissionLink    - The self-link of the permission.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readPermission(
    permissionLink: java.lang.String,
    options: RequestOptions,
    callback: RequestCallback[PermissionMeta]
  ): scala.Unit = js.native
  /**
    * Get all permissions for this user.
    * @param userLink          - The self-link of the user.
    * @param feedOptions       - The feed options
    */
  def readPermissions(userLink: java.lang.String): QueryIterator[PermissionMeta] = js.native
  def readPermissions(userLink: java.lang.String, feedOptions: FeedOptions): QueryIterator[PermissionMeta] = js.native
  def readStoredProcedure(sprocLink: java.lang.String, callback: RequestCallback[ProcedureMeta]): scala.Unit = js.native
  /**
    * Read a stored procedure
    * @param sprocLink         - The self-link of the stored procedure.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readStoredProcedure(sprocLink: java.lang.String, options: RequestOptions, callback: RequestCallback[ProcedureMeta]): scala.Unit = js.native
  /**
    * Get all StoredProcedures in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readStoredProcedures(collectionLink: java.lang.String): QueryIterator[ProcedureMeta] = js.native
  def readStoredProcedures(collectionLink: java.lang.String, options: RequestOptions): QueryIterator[ProcedureMeta] = js.native
  def readTrigger(triggerLink: java.lang.String, callback: RequestCallback[TriggerMeta]): scala.Unit = js.native
  /**
    * Reads a trigger object.
    * @param triggerLink       - The self-link of the trigger.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readTrigger(triggerLink: java.lang.String, options: RequestOptions, callback: RequestCallback[TriggerMeta]): scala.Unit = js.native
  /**
    * Get all triggers in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readTriggers(collectionLink: java.lang.String): QueryIterator[TriggerMeta] = js.native
  def readTriggers(collectionLink: java.lang.String, options: FeedOptions): QueryIterator[TriggerMeta] = js.native
  def readUser(userLink: java.lang.String, callback: RequestCallback[AbstractMeta]): scala.Unit = js.native
  /**
    * Reads a user.
    * @param userLink  - The self-link of the user.
    * @param options   - The request options.
    * @param callback  - The callback for the request.
    */
  def readUser(userLink: java.lang.String, options: RequestOptions, callback: RequestCallback[AbstractMeta]): scala.Unit = js.native
  def readUserDefinedFunction(udfLink: java.lang.String, callback: RequestCallback[UserDefinedFunctionMeta]): scala.Unit = js.native
  /**
    * Reads a udf object.
    * @param udfLink   - The self-link of the user defined function.
    * @param options   - The request options.
    * @param callback  - The callback for the request.
    */
  def readUserDefinedFunction(
    udfLink: java.lang.String,
    options: RequestOptions,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): scala.Unit = js.native
  /**
    * Get all UserDefinedFunctions in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readUserDefinedFunctions(collectionLink: java.lang.String): QueryIterator[UserDefinedFunctionMeta] = js.native
  def readUserDefinedFunctions(collectionLink: java.lang.String, options: FeedOptions): QueryIterator[UserDefinedFunctionMeta] = js.native
  /**
    * Get all users in this database.
    * @param databaseLink      - The self-link of the database.
    * @param feedOptions       - The feed options.
    */
  def readUsers(databaseLink: java.lang.String): QueryIterator[js.Array[AbstractMeta]] = js.native
  def readUsers(databaseLink: java.lang.String, feedOptions: FeedOptions): QueryIterator[js.Array[AbstractMeta]] = js.native
  def replaceAttachment(
    attachmentLink: java.lang.String,
    attachment: Attachment,
    callback: RequestCallback[AttachmentMeta]
  ): scala.Unit = js.native
  /**
    * Replace the attachment object.
    * @param attachmentLink    - The self-link of the attachment.
    * @param attachment        - Represent the new attachment body.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def replaceAttachment(
    attachmentLink: java.lang.String,
    attachment: Attachment,
    options: RequestOptions,
    callback: RequestCallback[AttachmentMeta]
  ): scala.Unit = js.native
  def replaceCollection(
    collectionLink: java.lang.String,
    collection: Collection,
    callback: RequestCallback[CollectionMeta]
  ): scala.Unit = js.native
  /**
    * Replace the document collection.
    * @param collectionLink    - The self-link of the document collection.
    * @param collection        - Represent the new document collection body.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def replaceCollection(
    collectionLink: java.lang.String,
    collection: Collection,
    options: RequestOptions,
    callback: RequestCallback[CollectionMeta]
  ): scala.Unit = js.native
  def replaceDocument[TDocument](
    documentLink: java.lang.String,
    document: NewDocument,
    callback: RequestCallback[RetrievedDocument]
  ): scala.Unit = js.native
  /**
    * Replace the document object.
    * @param documentLink      - The self-link of the document.
    * @param document          - Represent the new document body.
    * @param [options] - The request options.
    * @param callback - The callback for the request.
    */
  def replaceDocument[TDocument](
    documentLink: java.lang.String,
    document: NewDocument,
    options: RequestOptions,
    callback: RequestCallback[RetrievedDocument]
  ): scala.Unit = js.native
  /**
    * Replace the offer object.
    * @param offerLink     - The self-link of the offer.
    * @param offer         - Represent the new offer body.
    * @param callback      - The callback for the request.
    */
  def replaceOffer(offerLink: java.lang.String, offer: js.Any, callback: RequestCallback[_]): scala.Unit = js.native
  def replacePermission(
    permissionLink: java.lang.String,
    permission: Permission,
    callback: RequestCallback[PermissionMeta]
  ): scala.Unit = js.native
  /**
    * Replace the permission object.
    * @param permissionLink    - The self-link of the permission.
    * @param permission        - Represent the new permission body.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def replacePermission(
    permissionLink: java.lang.String,
    permission: Permission,
    options: RequestOptions,
    callback: RequestCallback[PermissionMeta]
  ): scala.Unit = js.native
  def replaceStoredProcedure(procedureLink: java.lang.String, procedure: Procedure, callback: RequestCallback[ProcedureMeta]): scala.Unit = js.native
  /**
    * Replace the StoredProcedure object.
    * @param procedureLink - The self-link of the stored procedure.
    * @param procedure     - Represent the new procedure body.
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def replaceStoredProcedure(
    procedureLink: java.lang.String,
    procedure: Procedure,
    options: RequestOptions,
    callback: RequestCallback[ProcedureMeta]
  ): scala.Unit = js.native
  def replaceTrigger(triggerLink: java.lang.String, trigger: Trigger, callback: RequestCallback[TriggerMeta]): scala.Unit = js.native
  /**
    * Replace the trigger object.
    * @param triggerLink   - The self-link of the trigger.
    * @param trigger       - Represent the new trigger body.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def replaceTrigger(
    triggerLink: java.lang.String,
    trigger: Trigger,
    options: RequestOptions,
    callback: RequestCallback[TriggerMeta]
  ): scala.Unit = js.native
  def replaceUser(userLink: java.lang.String, user: UniqueId, callback: RequestCallback[AbstractMeta]): scala.Unit = js.native
  /**
    * Replace the user object.
    * @param userLink      - The self-link of the user.
    * @param user          - Represent the new user body.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def replaceUser(
    userLink: java.lang.String,
    user: UniqueId,
    options: RequestOptions,
    callback: RequestCallback[AbstractMeta]
  ): scala.Unit = js.native
  def replaceUserDefinedFunction(
    udfLink: java.lang.String,
    udf: UserDefinedFunction,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): scala.Unit = js.native
  /**
    * Replace the UserDefinedFunction object.
    * @param udfLink       - The self-link of the user defined function.
    * @param udf           - Represent the new udf body.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def replaceUserDefinedFunction(
    udfLink: java.lang.String,
    udf: UserDefinedFunction,
    options: RequestOptions,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): scala.Unit = js.native
  def updateMedia(
    mediaLink: java.lang.String,
    readableStream: nodeLib.NodeJSNs.ReadableStream,
    callback: RequestCallback[_]
  ): scala.Unit = js.native
  /**
    * Update media for the attachment
    * @param mediaLink         - The media link of the media in the attachment.
    * @param readableStream    - The stream that represents the media itself that needs to be uploaded.
    * @param options           - options for the media
    * @param callback          - The callback for the request.
    */
  def updateMedia(
    mediaLink: java.lang.String,
    readableStream: nodeLib.NodeJSNs.ReadableStream,
    options: MediaOptions,
    callback: RequestCallback[_]
  ): scala.Unit = js.native
  def upsertAttachment(documentLink: java.lang.String, body: Attachment, callback: RequestCallback[AttachmentMeta]): scala.Unit = js.native
  /**
    * Upsert an attachment for the document object.
    * <p>
    *  Each document may contain zero or more attachments. Attachments can be of any MIME type - text, image, binary data.
    *  These are stored externally in Azure Blob storage. Attachments are automatically deleted when the parent document is deleted.
    * </p>
    * @param documentLink  - The self-link of the document.
    * @param body          - The metadata the defines the attachment media like media, contentType. It can include any other properties as part of the metedata.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def upsertAttachment(
    documentLink: java.lang.String,
    body: Attachment,
    options: RequestOptions,
    callback: RequestCallback[AttachmentMeta]
  ): scala.Unit = js.native
  def upsertAttachmentAndUploadMedia(
    documentLink: java.lang.String,
    readableStream: nodeLib.NodeJSNs.ReadableStream,
    callback: RequestCallback[_]
  ): scala.Unit = js.native
  /**
    * Upsert an attachment for the document object.
    * @param documentLink      - The self-link of the document.
    * @param readableStream    - the stream that represents the media itself that needs to be uploaded.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def upsertAttachmentAndUploadMedia(
    documentLink: java.lang.String,
    readableStream: nodeLib.NodeJSNs.ReadableStream,
    options: MediaOptions,
    callback: RequestCallback[_]
  ): scala.Unit = js.native
  def upsertDocument[T](
    documentsFeedOrDatabaseLink: java.lang.String,
    body: NewDocument,
    callback: RequestCallback[RetrievedDocument]
  ): scala.Unit = js.native
  /**
    * Upsert a document.
    * <p>
    *  There is no set schema for JSON documents. They may contain any number of custom properties as well as an optional list of attachments.
    *  A Document is an application resource and can be authorized using the master key or resource keys
    * </p>
    * @param documentsFeedOrDatabaseLink   - The collection link or database link if using a partition resolver
    * @param body          - Represents the body of the document. Can contain any number of user defined properties.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def upsertDocument[T](
    documentsFeedOrDatabaseLink: java.lang.String,
    body: NewDocument,
    options: DocumentOptions,
    callback: RequestCallback[RetrievedDocument]
  ): scala.Unit = js.native
  def upsertPermission(userLink: java.lang.String, body: Permission, callback: RequestCallback[PermissionMeta]): scala.Unit = js.native
  /**
    * Upsert a permission.
    * <p>
    *  A permission represents a per-User Permission to access a specific resource e.g. Document or Collection.
    * </p>
    * @param userLink  - The self-link of the user.
    * @param body      - Represents the body of the permission.
    * @param options   - The request options.
    * @param callback  - The callback for the request.
    */
  def upsertPermission(
    userLink: java.lang.String,
    body: Permission,
    options: RequestOptions,
    callback: RequestCallback[PermissionMeta]
  ): scala.Unit = js.native
  def upsertStoredProcedure(collectionLink: java.lang.String, sproc: Procedure, callback: RequestCallback[ProcedureMeta]): scala.Unit = js.native
  /**
    * Upsert a StoredProcedure.
    * <p>
    *  DocumentDB allows stored procedures to be executed in the storage tier, directly against a document collection. The script
    *  gets executed under ACID transactions on the primary storage partition of the specified collection. For additional details,
    *  refer to the server-side JavaScript API documentation.
    * </p>
    * @param collectionLink    - The self-link of the collection.
    * @param sproc             - Represents the body of the stored procedure.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def upsertStoredProcedure(
    collectionLink: java.lang.String,
    sproc: Procedure,
    options: RequestOptions,
    callback: RequestCallback[ProcedureMeta]
  ): scala.Unit = js.native
  def upsertTrigger(collectionLink: java.lang.String, trigger: Trigger, callback: RequestCallback[TriggerMeta]): scala.Unit = js.native
  /**
    * Upsert a trigger.
    * <p>
    *  DocumentDB supports pre and post triggers defined in JavaScript to be executed on creates, updates and deletes.
    *  For additional details, refer to the server-side JavaScript API documentation.
    * </p>
    * @param collectionLink    - The self-link of the collection.
    * @param trigger           - Represents the body of the trigger.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def upsertTrigger(
    collectionLink: java.lang.String,
    trigger: Trigger,
    options: RequestOptions,
    callback: RequestCallback[TriggerMeta]
  ): scala.Unit = js.native
  def upsertUser(databaseLink: java.lang.String, body: UniqueId, callback: RequestCallback[AbstractMeta]): scala.Unit = js.native
  /**
    * Upsert a database user.
    * @param databaseLink  - The self-link of the database.
    * @param body          - Represents the body of the user.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def upsertUser(
    databaseLink: java.lang.String,
    body: UniqueId,
    options: RequestOptions,
    callback: RequestCallback[AbstractMeta]
  ): scala.Unit = js.native
  def upsertUserDefinedFunction(
    collectionLink: java.lang.String,
    udf: UserDefinedFunction,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): scala.Unit = js.native
  /**
    * Upsert a UserDefinedFunction.
    * <p>
    *  DocumentDB supports JavaScript UDFs which can be used inside queries, stored procedures and triggers.
    *  For additional details, refer to the server-side JavaScript API documentation.
    * </p>
    * @param collectionLink    - The self-link of the collection.
    * @param udf               - Represents the body of the userDefinedFunction.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def upsertUserDefinedFunction(
    collectionLink: java.lang.String,
    udf: UserDefinedFunction,
    options: RequestOptions,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): scala.Unit = js.native
}

