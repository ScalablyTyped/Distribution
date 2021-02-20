package typings.documentdb.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("documentdb", "DocumentClient")
@js.native
class DocumentClient protected () extends StObject {
  /**
    * Constructs a DocumentClient.
    * @param urlConnection           - The service endpoint to use to create the client.
    * @param auth                    - An object that is used for authenticating requests and must contains one of the options.
    * @param [connectionPolicy]      - An instance of {@link ConnectionPolicy} class. This parameter is optional and the default connectionPolicy will be used if omitted.
    * @param [consistencyLevel]      - An optional parameter that represents the consistency level. It can take any value from {@link ConsistencyLevel}.
    */
  def this(urlConnection: String, auth: AuthOptions) = this()
  def this(urlConnection: String, auth: AuthOptions, connectionPolicy: ConnectionPolicy) = this()
  def this(
    urlConnection: String,
    auth: AuthOptions,
    connectionPolicy: js.UndefOr[scala.Nothing],
    consistencyLevel: ConsistencyLevel
  ) = this()
  def this(
    urlConnection: String,
    auth: AuthOptions,
    connectionPolicy: ConnectionPolicy,
    consistencyLevel: ConsistencyLevel
  ) = this()
  
  def createAttachment(documentLink: String, body: Attachment, callback: RequestCallback[AttachmentMeta]): Unit = js.native
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
    documentLink: String,
    body: Attachment,
    options: RequestOptions,
    callback: RequestCallback[AttachmentMeta]
  ): Unit = js.native
  
  def createAttachmentAndUploadMedia(documentLink: String, readableStream: ReadableStream, callback: RequestCallback[AttachmentMeta]): Unit = js.native
  /**
    * Create an attachment with media file for the document object.
    * @param documentLink      - The self-link of the document.
    * @param readableStream    - The stream that represents the media itself that needs to be uploaded.
    * @param [options]         - The request options.
    * @param callback          - The callback for the request.
    */
  def createAttachmentAndUploadMedia(
    documentLink: String,
    readableStream: ReadableStream,
    options: MediaOptions,
    callback: RequestCallback[AttachmentMeta]
  ): Unit = js.native
  
  def createCollection(databaseLink: String, body: Collection, callback: RequestCallback[CollectionMeta]): Unit = js.native
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
    databaseLink: String,
    body: Collection,
    options: RequestOptions,
    callback: RequestCallback[CollectionMeta]
  ): Unit = js.native
  
  def createDatabase(body: UniqueId, callback: RequestCallback[DatabaseMeta]): Unit = js.native
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
  def createDatabase(body: UniqueId, options: RequestOptions, callback: RequestCallback[DatabaseMeta]): Unit = js.native
  
  def createDocument[TDocument](
    documentsFeedOrDatabaseLink: String,
    document: NewDocument,
    callback: RequestCallback[RetrievedDocument]
  ): Unit = js.native
  /**
    * Create a document.
    * <p>
    * There is no set schema for JSON documents. They may contain any number of custom properties as well as an optional list of attachments. <br>
    * A Document is an application resource and can be authorized using the master key or resource keys
    * </p>
    * @param documentsFeedOrDatabaseLink    - The self-link of the collection.
    * @param document          - Represents the body of the document. Can contain any number of user defined properties.
    * @param [options]         - The request options.
    * @param callback             - The callback for the request.
    */
  def createDocument[TDocument](
    documentsFeedOrDatabaseLink: String,
    document: NewDocument,
    options: DocumentOptions,
    callback: RequestCallback[RetrievedDocument]
  ): Unit = js.native
  
  def createPermission(userLink: String, body: Permission, callback: RequestCallback[PermissionMeta]): Unit = js.native
  /**
    * Create a permission. A permission represents a per-User Permission to access a specific resource e.g. Document or Collection.
    * @param userLink      - Self-link of the user.
    * @param body          - Permission body
    * @param options       - Request options
    * @param callback      - Callback for the request
    */
  def createPermission(
    userLink: String,
    body: Permission,
    options: RequestOptions,
    callback: RequestCallback[PermissionMeta]
  ): Unit = js.native
  
  def createStoredProcedure(collectionLink: String, procedure: Procedure, callback: RequestCallback[ProcedureMeta]): Unit = js.native
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
    collectionLink: String,
    procedure: Procedure,
    options: RequestOptions,
    callback: RequestCallback[ProcedureMeta]
  ): Unit = js.native
  
  def createTrigger(collectionLink: String, trigger: Trigger, callback: RequestCallback[TriggerMeta]): Unit = js.native
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
    collectionLink: String,
    trigger: Trigger,
    options: RequestOptions,
    callback: RequestCallback[TriggerMeta]
  ): Unit = js.native
  
  def createUser(databaseLink: String, body: UniqueId, callback: RequestCallback[AbstractMeta]): Unit = js.native
  /**
    * Create a user
    * @param databaseLink  - The self-link of the database.
    * @param body          - Represents the body of the user.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def createUser(
    databaseLink: String,
    body: UniqueId,
    options: RequestOptions,
    callback: RequestCallback[AbstractMeta]
  ): Unit = js.native
  
  def createUserDefinedFunction(
    collectionLink: String,
    udf: UserDefinedFunction,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): Unit = js.native
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
    collectionLink: String,
    udf: UserDefinedFunction,
    options: RequestOptions,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): Unit = js.native
  
  def deleteAttachment(attachmentLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete an attachment
    * @param attachmentLink    - The self-link of the attachment.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteAttachment(attachmentLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def deleteCollection(collectionLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete the collection object.
    * @param collectionLink    - The self-link of the collection.
    * @param [options]         - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteCollection(collectionLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def deleteConflict(conflictLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete a conflict
    * @param conflictLink      - The self-link of the conflict.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteConflict(conflictLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def deleteDatabase(databaseLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete the database object.
    * @param databaseLink  - The self-link of the database.
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def deleteDatabase(databaseLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def deleteDocument(documentLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete the document object.
    * @param documentLink  - The self-link of the document.
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def deleteDocument(documentLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def deletePermission(permissionLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete a permission
    * @param permissionLink    - The self-link of the permission.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deletePermission(permissionLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def deleteStoredProcedure(procedureLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete the StoredProcedure object.
    * @param procedureLink - The self-link of the stored procedure.
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def deleteStoredProcedure(procedureLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def deleteTrigger(triggerLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete a trigger
    * @param triggerLink       - The self-link of the trigger.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteTrigger(triggerLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def deleteUser(userLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete a user
    * @param userLink          - The self-link of the user.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteUser(userLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def deleteUserDefinedFunction(udfLink: String, callback: RequestCallback[Unit]): Unit = js.native
  /**
    * Delete a user-defined function
    * @param udfLink           - The self-link of the user defined function.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def deleteUserDefinedFunction(udfLink: String, options: RequestOptions, callback: RequestCallback[Unit]): Unit = js.native
  
  def executeStoredProcedure[TResult](procedureLink: String, paramsOrOptions: js.Array[_], callback: RequestCallback[TResult]): Unit = js.native
  def executeStoredProcedure[TResult](procedureLink: String, paramsOrOptions: RequestOptions, callback: RequestCallback[TResult]): Unit = js.native
  /**
    * Execute the StoredProcedure represented by the object.
    * @param procedureLink - The self-link of the stored procedure.
    * @param [params]      - Represents the parameters of the stored procedure.
    * @param options       - The request options
    * @param callback      - The callback for the request.
    */
  def executeStoredProcedure[TResult](
    procedureLink: String,
    params: js.Array[_],
    options: RequestOptions,
    callback: RequestCallback[TResult]
  ): Unit = js.native
  
  def getDatabaseAccount(callback: RequestCallback[DatabaseAccount]): Unit = js.native
  /**
    * Gets the Database account information.
    * @param options       - The request options
    * @param callback      - The callback for the request
    */
  def getDatabaseAccount(options: DatabaseAccountRequestOptions, callback: RequestCallback[DatabaseAccount]): Unit = js.native
  
  /**
    * Gets the curent read endpoint for a geo-replicated database account.
    * @param callback      - The callback for the request
    */
  def getReadEndpoint(callback: RequestCallback[String]): Unit = js.native
  
  /**
    * Gets the curent write endpoint for a geo-replicated database account.
    * @param callback      - The callback for the request
    */
  def getWriteEndpoint(callback: RequestCallback[String]): Unit = js.native
  
  /**
    * Query the attachments for the document.
    * @param documentLink      - The self-link of the document.
    * @param query             - A SQL query.
    * @param [options]         - Represents the feed options.
    */
  def queryAttachments[T](documentLink: String, query: DocumentQuery): QueryIterator[T] = js.native
  def queryAttachments[T](documentLink: String, query: DocumentQuery, options: FeedOptions): QueryIterator[T] = js.native
  
  /**
    * Query the collections for the database.
    * @param databaseLink  - The self-link of the database.
    * @param query         - A SQL query string.
    * @param [options]     - Represents the feed options.
    * @returns             - An instance of queryIterator to handle reading feed.
    */
  def queryCollections(databaseLink: String, query: DocumentQuery): QueryIterator[CollectionMeta] = js.native
  def queryCollections(databaseLink: String, query: DocumentQuery, options: FeedOptions): QueryIterator[CollectionMeta] = js.native
  
  /**
    * Query the conflicts for the collection.
    * @param collectionLink    - The self-link of the collection.
    * @param query             - A SQL query.
    * @param [options]         - Represents the feed options.
    */
  def queryConflicts(collectionLink: String, query: DocumentQuery): QueryIterator[_] = js.native
  def queryConflicts(collectionLink: String, query: DocumentQuery, options: FeedOptions): QueryIterator[_] = js.native
  
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
  def queryDocuments[TDocument](collectionLink: String, query: DocumentQuery): QueryIterator[RetrievedDocument with TDocument] = js.native
  def queryDocuments[TDocument](collectionLink: String, query: DocumentQuery, options: FeedOptions): QueryIterator[RetrievedDocument with TDocument] = js.native
  
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
  def queryPermissions(userLink: String, query: DocumentQuery): QueryIterator[PermissionMeta] = js.native
  def queryPermissions(userLink: String, query: DocumentQuery, options: FeedOptions): QueryIterator[PermissionMeta] = js.native
  
  /**
    * Query the storedProcedures for the collection.
    * @param collectionLink    - The self-link of the collection.
    * @param query             - A SQL query string.
    * @param [options]         - Represents the feed options.
    * @returns                 - An instance of queryIterator to handle reading feed.
    */
  def queryStoredProcedures(collectionLink: String, query: DocumentQuery): QueryIterator[ProcedureMeta] = js.native
  def queryStoredProcedures(collectionLink: String, query: DocumentQuery, options: FeedOptions): QueryIterator[ProcedureMeta] = js.native
  
  /**
    * Query the triggers for the collection.
    * @param collectionLink         - The self-link of the collection.
    * @param query   - A SQL query.
    * @param [options]         - Represents the feed options.
    * @returns               - An instance of queryIterator to handle reading feed.
    */
  def queryTriggers(collectionLink: String, query: DocumentQuery): QueryIterator[TriggerMeta] = js.native
  def queryTriggers(collectionLink: String, query: DocumentQuery, options: FeedOptions): QueryIterator[TriggerMeta] = js.native
  
  /**
    * Query the user-defined functions for the collection.
    * @param collectionLink    - The self-link of the collection.
    * @param query             - A SQL query string.
    * @param [options]         - Represents the feed options.
    * @returns                 - An instance of queryIterator to handle reading feed.
    */
  def queryUserDefinedFunctions(collectionLink: String, query: DocumentQuery): QueryIterator[UserDefinedFunctionMeta] = js.native
  def queryUserDefinedFunctions(collectionLink: String, query: DocumentQuery, options: FeedOptions): QueryIterator[UserDefinedFunctionMeta] = js.native
  
  /**
    * Query the users for the database.
    * @param databaseLink  - The self-link of the database.
    * @param query         - A SQL query.
    * @param options       - Represents the feed options.
    */
  def queryUsers(databaseLink: String, query: DocumentQuery): QueryIterator[AbstractMeta] = js.native
  def queryUsers(databaseLink: String, query: DocumentQuery, options: FeedOptions): QueryIterator[AbstractMeta] = js.native
  
  def readAttachment(attachmentLink: String, callback: RequestCallback[AttachmentMeta]): Unit = js.native
  /**
    * Read an Attachment object.
    * @param attachmentLink    - The self-link of the attachment.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readAttachment(attachmentLink: String, options: RequestOptions, callback: RequestCallback[AttachmentMeta]): Unit = js.native
  
  /**
    * Get all attachments for this document.
    * @param documentLink      - The self-link of the document.
    * @param options           - The feed options.
    */
  def readAttachments(documentLink: String): QueryIterator[AttachmentMeta] = js.native
  def readAttachments(documentLink: String, options: FeedOptions): QueryIterator[AttachmentMeta] = js.native
  
  def readCollection(collectionLink: String, callback: RequestCallback[CollectionMeta]): Unit = js.native
  /**
    * Read a collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readCollection(collectionLink: String, options: RequestOptions, callback: RequestCallback[CollectionMeta]): Unit = js.native
  
  /**
    * Get all collections in this database.
    * @param databaseLink      - The self-link of the database.
    * @param options           - The feed options.
    */
  def readCollections(databaseLink: String): QueryIterator[CollectionMeta] = js.native
  def readCollections(databaseLink: String, options: FeedOptions): QueryIterator[CollectionMeta] = js.native
  
  def readConflict(conflictLink: String, callback: RequestCallback[_]): Unit = js.native
  /**
    * Read a conflict.
    * @param conflictLink      - The self-link of the conflict.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readConflict(conflictLink: String, options: RequestOptions, callback: RequestCallback[_]): Unit = js.native
  
  /**
    * Get all conflicts in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readConflicts(collectionLink: String): QueryIterator[_] = js.native
  def readConflicts(collectionLink: String, options: FeedOptions): QueryIterator[_] = js.native
  
  def readDatabase(databaseLink: String, callback: RequestCallback[DatabaseMeta]): Unit = js.native
  /**
    * Read a database.
    * @param databaseLink      - The self-link of the database.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readDatabase(databaseLink: String, options: RequestOptions, callback: RequestCallback[DatabaseMeta]): Unit = js.native
  
  /**
    * List all databases.
    * @param options       - The request options.
    */
  def readDatabases(): QueryIterator[DatabaseMeta] = js.native
  def readDatabases(options: FeedOptions): QueryIterator[DatabaseMeta] = js.native
  
  def readDocument(documentLink: String, callback: RequestCallback[RetrievedDocument]): Unit = js.native
  /**
    * Read a document.
    * @param documentLink      - The self-link of the document.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readDocument(documentLink: String, options: RequestOptions, callback: RequestCallback[RetrievedDocument]): Unit = js.native
  
  /**
    * Get all documents in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readDocuments(collectionLink: String): QueryIterator[RetrievedDocument] = js.native
  def readDocuments(collectionLink: String, options: FeedOptions): QueryIterator[RetrievedDocument] = js.native
  
  /**
    * Read the media for the attachment object.
    * @param mediaLink     - The media link of the media in the attachment.
    * @param callback      - The callback for the request, the result parameter can be a buffer or a stream depending on the value of MediaReadMode
    */
  def readMedia(mediaLink: String, callback: RequestCallback[Buffer | ReadableStream]): Unit = js.native
  
  /**
    * Read an offer.
    * @param offerLink     - The self-link of the offer.
    * @param callback      - The callback for the request.
    */
  def readOffer(offerLink: String, callback: RequestCallback[_]): Unit = js.native
  
  /**
    * List all offers
    * @param options       - The feed options.
    */
  def readOffers(): QueryIterator[js.Array[_]] = js.native
  def readOffers(options: FeedOptions): QueryIterator[js.Array[_]] = js.native
  
  def readPermission(permissionLink: String, callback: RequestCallback[PermissionMeta]): Unit = js.native
  /**
    * Read a permission.
    * @param permissionLink    - The self-link of the permission.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readPermission(permissionLink: String, options: RequestOptions, callback: RequestCallback[PermissionMeta]): Unit = js.native
  
  /**
    * Get all permissions for this user.
    * @param userLink          - The self-link of the user.
    * @param feedOptions       - The feed options
    */
  def readPermissions(userLink: String): QueryIterator[PermissionMeta] = js.native
  def readPermissions(userLink: String, feedOptions: FeedOptions): QueryIterator[PermissionMeta] = js.native
  
  def readStoredProcedure(sprocLink: String, callback: RequestCallback[ProcedureMeta]): Unit = js.native
  /**
    * Read a stored procedure
    * @param sprocLink         - The self-link of the stored procedure.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readStoredProcedure(sprocLink: String, options: RequestOptions, callback: RequestCallback[ProcedureMeta]): Unit = js.native
  
  /**
    * Get all StoredProcedures in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readStoredProcedures(collectionLink: String): QueryIterator[ProcedureMeta] = js.native
  def readStoredProcedures(collectionLink: String, options: RequestOptions): QueryIterator[ProcedureMeta] = js.native
  
  def readTrigger(triggerLink: String, callback: RequestCallback[TriggerMeta]): Unit = js.native
  /**
    * Reads a trigger object.
    * @param triggerLink       - The self-link of the trigger.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def readTrigger(triggerLink: String, options: RequestOptions, callback: RequestCallback[TriggerMeta]): Unit = js.native
  
  /**
    * Get all triggers in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readTriggers(collectionLink: String): QueryIterator[TriggerMeta] = js.native
  def readTriggers(collectionLink: String, options: FeedOptions): QueryIterator[TriggerMeta] = js.native
  
  def readUser(userLink: String, callback: RequestCallback[AbstractMeta]): Unit = js.native
  /**
    * Reads a user.
    * @param userLink  - The self-link of the user.
    * @param options   - The request options.
    * @param callback  - The callback for the request.
    */
  def readUser(userLink: String, options: RequestOptions, callback: RequestCallback[AbstractMeta]): Unit = js.native
  
  def readUserDefinedFunction(udfLink: String, callback: RequestCallback[UserDefinedFunctionMeta]): Unit = js.native
  /**
    * Reads a udf object.
    * @param udfLink   - The self-link of the user defined function.
    * @param options   - The request options.
    * @param callback  - The callback for the request.
    */
  def readUserDefinedFunction(udfLink: String, options: RequestOptions, callback: RequestCallback[UserDefinedFunctionMeta]): Unit = js.native
  
  /**
    * Get all UserDefinedFunctions in this collection.
    * @param collectionLink    - The self-link of the collection.
    * @param options           - The feed options.
    */
  def readUserDefinedFunctions(collectionLink: String): QueryIterator[UserDefinedFunctionMeta] = js.native
  def readUserDefinedFunctions(collectionLink: String, options: FeedOptions): QueryIterator[UserDefinedFunctionMeta] = js.native
  
  /**
    * Get all users in this database.
    * @param databaseLink      - The self-link of the database.
    * @param feedOptions       - The feed options.
    */
  def readUsers(databaseLink: String): QueryIterator[js.Array[AbstractMeta]] = js.native
  def readUsers(databaseLink: String, feedOptions: FeedOptions): QueryIterator[js.Array[AbstractMeta]] = js.native
  
  def replaceAttachment(attachmentLink: String, attachment: Attachment, callback: RequestCallback[AttachmentMeta]): Unit = js.native
  /**
    * Replace the attachment object.
    * @param attachmentLink    - The self-link of the attachment.
    * @param attachment        - Represent the new attachment body.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def replaceAttachment(
    attachmentLink: String,
    attachment: Attachment,
    options: RequestOptions,
    callback: RequestCallback[AttachmentMeta]
  ): Unit = js.native
  
  def replaceCollection(collectionLink: String, collection: Collection, callback: RequestCallback[CollectionMeta]): Unit = js.native
  /**
    * Replace the document collection.
    * @param collectionLink    - The self-link of the document collection.
    * @param collection        - Represent the new document collection body.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def replaceCollection(
    collectionLink: String,
    collection: Collection,
    options: RequestOptions,
    callback: RequestCallback[CollectionMeta]
  ): Unit = js.native
  
  def replaceDocument[TDocument](documentLink: String, document: NewDocument, callback: RequestCallback[RetrievedDocument]): Unit = js.native
  /**
    * Replace the document object.
    * @param documentLink      - The self-link of the document.
    * @param document          - Represent the new document body.
    * @param [options] - The request options.
    * @param callback - The callback for the request.
    */
  def replaceDocument[TDocument](
    documentLink: String,
    document: NewDocument,
    options: RequestOptions,
    callback: RequestCallback[RetrievedDocument]
  ): Unit = js.native
  
  /**
    * Replace the offer object.
    * @param offerLink     - The self-link of the offer.
    * @param offer         - Represent the new offer body.
    * @param callback      - The callback for the request.
    */
  def replaceOffer(offerLink: String, offer: js.Any, callback: RequestCallback[_]): Unit = js.native
  
  def replacePermission(permissionLink: String, permission: Permission, callback: RequestCallback[PermissionMeta]): Unit = js.native
  /**
    * Replace the permission object.
    * @param permissionLink    - The self-link of the permission.
    * @param permission        - Represent the new permission body.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def replacePermission(
    permissionLink: String,
    permission: Permission,
    options: RequestOptions,
    callback: RequestCallback[PermissionMeta]
  ): Unit = js.native
  
  def replaceStoredProcedure(procedureLink: String, procedure: Procedure, callback: RequestCallback[ProcedureMeta]): Unit = js.native
  /**
    * Replace the StoredProcedure object.
    * @param procedureLink - The self-link of the stored procedure.
    * @param procedure     - Represent the new procedure body.
    * @param [options]     - The request options.
    * @param callback      - The callback for the request.
    */
  def replaceStoredProcedure(
    procedureLink: String,
    procedure: Procedure,
    options: RequestOptions,
    callback: RequestCallback[ProcedureMeta]
  ): Unit = js.native
  
  def replaceTrigger(triggerLink: String, trigger: Trigger, callback: RequestCallback[TriggerMeta]): Unit = js.native
  /**
    * Replace the trigger object.
    * @param triggerLink   - The self-link of the trigger.
    * @param trigger       - Represent the new trigger body.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def replaceTrigger(
    triggerLink: String,
    trigger: Trigger,
    options: RequestOptions,
    callback: RequestCallback[TriggerMeta]
  ): Unit = js.native
  
  def replaceUser(userLink: String, user: UniqueId, callback: RequestCallback[AbstractMeta]): Unit = js.native
  /**
    * Replace the user object.
    * @param userLink      - The self-link of the user.
    * @param user          - Represent the new user body.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def replaceUser(userLink: String, user: UniqueId, options: RequestOptions, callback: RequestCallback[AbstractMeta]): Unit = js.native
  
  def replaceUserDefinedFunction(udfLink: String, udf: UserDefinedFunction, callback: RequestCallback[UserDefinedFunctionMeta]): Unit = js.native
  /**
    * Replace the UserDefinedFunction object.
    * @param udfLink       - The self-link of the user defined function.
    * @param udf           - Represent the new udf body.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def replaceUserDefinedFunction(
    udfLink: String,
    udf: UserDefinedFunction,
    options: RequestOptions,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): Unit = js.native
  
  def updateMedia(mediaLink: String, readableStream: ReadableStream, callback: RequestCallback[_]): Unit = js.native
  /**
    * Update media for the attachment
    * @param mediaLink         - The media link of the media in the attachment.
    * @param readableStream    - The stream that represents the media itself that needs to be uploaded.
    * @param options           - options for the media
    * @param callback          - The callback for the request.
    */
  def updateMedia(
    mediaLink: String,
    readableStream: ReadableStream,
    options: MediaOptions,
    callback: RequestCallback[_]
  ): Unit = js.native
  
  def upsertAttachment(documentLink: String, body: Attachment, callback: RequestCallback[AttachmentMeta]): Unit = js.native
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
    documentLink: String,
    body: Attachment,
    options: RequestOptions,
    callback: RequestCallback[AttachmentMeta]
  ): Unit = js.native
  
  def upsertAttachmentAndUploadMedia(documentLink: String, readableStream: ReadableStream, callback: RequestCallback[_]): Unit = js.native
  /**
    * Upsert an attachment for the document object.
    * @param documentLink      - The self-link of the document.
    * @param readableStream    - the stream that represents the media itself that needs to be uploaded.
    * @param options           - The request options.
    * @param callback          - The callback for the request.
    */
  def upsertAttachmentAndUploadMedia(
    documentLink: String,
    readableStream: ReadableStream,
    options: MediaOptions,
    callback: RequestCallback[_]
  ): Unit = js.native
  
  def upsertDocument[T](
    documentsFeedOrDatabaseLink: String,
    body: NewDocument,
    callback: RequestCallback[RetrievedDocument]
  ): Unit = js.native
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
    documentsFeedOrDatabaseLink: String,
    body: NewDocument,
    options: DocumentOptions,
    callback: RequestCallback[RetrievedDocument]
  ): Unit = js.native
  
  def upsertPermission(userLink: String, body: Permission, callback: RequestCallback[PermissionMeta]): Unit = js.native
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
    userLink: String,
    body: Permission,
    options: RequestOptions,
    callback: RequestCallback[PermissionMeta]
  ): Unit = js.native
  
  def upsertStoredProcedure(collectionLink: String, sproc: Procedure, callback: RequestCallback[ProcedureMeta]): Unit = js.native
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
    collectionLink: String,
    sproc: Procedure,
    options: RequestOptions,
    callback: RequestCallback[ProcedureMeta]
  ): Unit = js.native
  
  def upsertTrigger(collectionLink: String, trigger: Trigger, callback: RequestCallback[TriggerMeta]): Unit = js.native
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
    collectionLink: String,
    trigger: Trigger,
    options: RequestOptions,
    callback: RequestCallback[TriggerMeta]
  ): Unit = js.native
  
  def upsertUser(databaseLink: String, body: UniqueId, callback: RequestCallback[AbstractMeta]): Unit = js.native
  /**
    * Upsert a database user.
    * @param databaseLink  - The self-link of the database.
    * @param body          - Represents the body of the user.
    * @param options       - The request options.
    * @param callback      - The callback for the request.
    */
  def upsertUser(
    databaseLink: String,
    body: UniqueId,
    options: RequestOptions,
    callback: RequestCallback[AbstractMeta]
  ): Unit = js.native
  
  def upsertUserDefinedFunction(
    collectionLink: String,
    udf: UserDefinedFunction,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): Unit = js.native
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
    collectionLink: String,
    udf: UserDefinedFunction,
    options: RequestOptions,
    callback: RequestCallback[UserDefinedFunctionMeta]
  ): Unit = js.native
}
