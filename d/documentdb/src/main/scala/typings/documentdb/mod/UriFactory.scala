package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UriFactory {
  
  @JSImport("documentdb", "UriFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @summary Given a database, collection and conflict id, this creates a conflict link.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param documentId        -The document Id\
    * @param attachmentId      -The attachment Id
    * @returns                 -A conflict link in the format of dbs/{0}/colls/{1}/conflicts/{2} with {0} being a Uri escaped version of the databaseId,
    *                                    {1} being collectionId and {2} being the conflictId
    * @description Would be used when creating a Conflict in Azure DocumentDB database service.
    */
  inline def createAttachmentUri(databaseId: String, collectionId: String, documentId: String, attachmentId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createAttachmentUri")(databaseId.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any], documentId.asInstanceOf[js.Any], attachmentId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @summary
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param conflictId        -The conflict Id
    * @returns                 -A conflict link in the format of dbs/{0}/colls/{1}/conflicts/{2}
    *                                    with {0} being a Uri escaped version of the databaseId, {1} being collectionId and {2} being the conflictId
    * @description Would be used when creating a Conflict in Azure DocumentDB database service.
    */
  inline def createConflictUri(databaseId: String, collectionId: String, conflictId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createConflictUri")(databaseId.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any], conflictId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Given a database id, this creates a database link.
    * @param databaseId -The database id
    * @returns          -A database link in the format of dbs/{0} with {0} being a Uri escaped version of the databaseId
    * @description Would be used when creating or deleting a DocumentCollection or a User in Azure DocumentDB database service
    */
  inline def createDatabaseUri(databaseId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createDatabaseUri")(databaseId.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Given a database and collection id, this creates a collection link.
    * @param databaseId        -The database id
    * @param collectionId      -The collection id
    * @returns                 A collection link in the format of dbs/{0}/colls/{1} with {0} being a Uri escaped version of the databaseId and {1} being collectionId
    * @description Would be used when updating or deleting a DocumentCollection, creating a Document, a StoredProcedure, a
    *              Trigger, a UserDefinedFunction, or when executing a query with CreateDocumentQuery in Azure DocumentDB database service.
    */
  inline def createDocumentCollectionUri(databaseId: String, collectionId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocumentCollectionUri")(databaseId.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Given a database and collection id, this creates a collection link.
    * @param databaseId        -The database id
    * @param collectionId      -The collection id
    * @param documentId        -The document id
    * @returns                 -A document link in the format of dbs/{0}/colls/{1}/docs/{2} with {0}
    *                                    being a Uri escaped version of the databaseId, {1} being collectionId and {2} being the documentId
    * @description Would be used when creating an Attachment, or when replacing or deleting a Document in Azure DocumentDB database service
    */
  inline def createDocumentUri(databaseId: String, collectionId: String, documentId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocumentUri")(databaseId.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any], documentId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @summary Given a database and collection, this creates a partition key ranges link in the Azure DocumentDB database service.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @returns                 -A partition key ranges link in the format of dbs/{0}/colls/{1}/pkranges with {0} being a Uri escaped version of the databaseId and {1} being collectionId
    */
  inline def createPartitionKeyRangesUri(databaseId: String, collectionId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPartitionKeyRangesUri")(databaseId.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Given a database, collection and document id, this creates a document link.
    * @param databaseId    -The database Id
    * @param userId        -The user Id
    * @param permissionId  - The permissionId
    * @returns A permission link in the format of dbs/{0}/users/{1}/permissions/{2} with {0} being a Uri escaped version of the databaseId, {1} being userId and {2} being permissionId
    * @description Would be used when replacing or deleting a Permission in Azure DocumentDB database service.
    */
  inline def createPermissionUri(databaseId: String, userId: String, permissionId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPermissionUri")(databaseId.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], permissionId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Given a database, collection and stored proc id, this creates a stored proc link.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param storedProcedureId -The stored procedure Id
    * @returns                 -A stored procedure link in the format of dbs/{0}/colls/{1}/sprocs/{2}
    *                                    with {0} being a Uri escaped version of the databaseId,
    *                                    {1} being collectionId and {2} being the storedProcedureId
    * @description Would be used when replacing, executing, or deleting a StoredProcedure in Azure DocumentDB database service.
    */
  inline def createStoredProcedureUri(databaseId: String, collectionId: String, storedProcedureId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createStoredProcedureUri")(databaseId.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any], storedProcedureId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @summary Given a database, collection and trigger id, this creates a trigger link.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param triggerId         -The trigger Id
    * @returns                 -A trigger link in the format of dbs/{0}/colls/{1}/triggers/{2}
    *                                    with {0} being a Uri escaped version of the databaseId,
    *                                    {1} being collectionId and {2} being the triggerId
    * @description Would be used when replacing, executing, or deleting a Trigger in Azure DocumentDB database service
    */
  inline def createTriggerUri(databaseId: String, collectionId: String, triggerId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createTriggerUri")(databaseId.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any], triggerId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @summary Given a database, collection and udf id, this creates a udf link.
    * @param databaseId        -The database Id
    * @param collectionId      -The collection Id
    * @param udfId             -The User Defined Function Id
    * @returns                 -A udf link in the format of dbs/{0}/colls/{1}/udfs/{2} with {0} being a Uri escaped version of the databaseId, {1} being collectionId and {2} being the udfId
    * @description Would be used when replacing, executing, or deleting a UserDefinedFunction in Azure DocumentDB database service
    */
  inline def createUserDefinedFunctionUri(databaseId: String, collectionId: String, udfId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createUserDefinedFunctionUri")(databaseId.asInstanceOf[js.Any], collectionId.asInstanceOf[js.Any], udfId.asInstanceOf[js.Any])).asInstanceOf[String]
}
