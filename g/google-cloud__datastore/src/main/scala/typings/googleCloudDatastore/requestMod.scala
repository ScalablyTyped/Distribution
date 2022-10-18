package typings.googleCloudDatastore

import typings.googleCloudDatastore.entityMod.DatastoreKey
import typings.googleCloudDatastore.entityMod.OneOrMany
import typings.googleCloudDatastore.queryMod.Query
import typings.googleCloudDatastore.queryMod.QueryCallback
import typings.googleCloudDatastore.queryMod.QueryOptions
import typings.googleCloudDatastore.queryMod.QueryResult
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  /**
    * Creates requests to the Datastore endpoint.
    * Designed to be inherited by {@link Datastore} & {@link DatastoreTransaction}
    */
  /* note: abstract class */ @JSImport("@google-cloud/datastore/request", "DatastoreRequest")
  @js.native
  open class DatastoreRequest () extends StObject {
    
    def allocateIds(incompleteKey: DatastoreKey, n: Double): js.Promise[AllocateIdsResult] = js.native
    def allocateIds(incompleteKey: DatastoreKey, n: Double, callback: AllocateIdsCallback): Unit = js.native
    
    def createReadStream(keys: js.Array[DatastoreKey], options: QueryOptions): ReadableStream = js.native
    def createReadStream(keys: DatastoreKey, options: QueryOptions): ReadableStream = js.native
    
    def delete(keyOrKeys: js.Array[DatastoreKey]): js.Promise[CommitResult] | Unit = js.native
    def delete(keyOrKeys: js.Array[DatastoreKey], callback: CommitCallback): Unit = js.native
    def delete(keyOrKeys: DatastoreKey): js.Promise[CommitResult] | Unit = js.native
    def delete(keyOrKeys: DatastoreKey, callback: CommitCallback): Unit = js.native
    
    def get(keys: js.Array[DatastoreKey]): js.Promise[js.Array[js.Array[js.Object]]] = js.native
    def get(keys: js.Array[DatastoreKey], callback: GetCallback[js.Array[js.Object]]): Unit = js.native
    def get(keys: js.Array[DatastoreKey], options: QueryOptions): js.Promise[js.Array[js.Array[js.Object]]] = js.native
    def get(keys: js.Array[DatastoreKey], options: QueryOptions, callback: GetCallback[js.Array[js.Object]]): Unit = js.native
    def get(key: DatastoreKey): js.Promise[js.Array[js.UndefOr[js.Object]]] = js.native
    def get(key: DatastoreKey, callback: GetCallback[js.Object]): Unit = js.native
    def get(key: DatastoreKey, options: QueryOptions): js.Promise[js.Array[js.UndefOr[js.Object]]] = js.native
    def get(key: DatastoreKey, options: QueryOptions, callback: GetCallback[js.Object]): Unit = js.native
    
    def insert(entities: OneOrMany[js.Object]): js.Promise[CommitResult] = js.native
    def insert(entities: OneOrMany[js.Object], callback: CommitCallback): Unit = js.native
    
    def runQuery(query: Query): js.Promise[QueryResult] = js.native
    def runQuery(query: Query, callback: QueryCallback): Unit = js.native
    def runQuery(query: Query, options: QueryOptions): js.Promise[QueryResult] = js.native
    def runQuery(query: Query, options: QueryOptions, callback: QueryCallback): Unit = js.native
    
    def runQueryStream(query: Query): ReadableStream = js.native
    def runQueryStream(query: Query, options: QueryOptions): ReadableStream = js.native
    
    def save(entities: OneOrMany[js.Object]): js.Promise[CommitResult] | Unit = js.native
    def save(entities: OneOrMany[js.Object], callback: CommitCallback): Unit = js.native
    
    def update(entities: OneOrMany[js.Object]): js.Promise[CommitResult] = js.native
    def update(entities: OneOrMany[js.Object], callback: CommitCallback): Unit = js.native
    
    def upsert(entities: OneOrMany[js.Object]): js.Promise[CommitResult] = js.native
    def upsert(entities: OneOrMany[js.Object], callback: CommitCallback): Unit = js.native
  }
  
  type AllocateIdsCallback = js.Function2[/* err */ js.Error, /* keys */ js.Array[DatastoreKey], Unit]
  
  type AllocateIdsResult = js.Array[js.Array[DatastoreKey]]
  
  type CommitCallback = js.Function2[/* err */ js.Error, /* result */ CommitResponse, Unit]
  
  trait CommitResponse extends StObject {
    
    var indexUpdates: Double
    
    var mutationResults: js.Array[MutationResult]
  }
  object CommitResponse {
    
    inline def apply(indexUpdates: Double, mutationResults: js.Array[MutationResult]): CommitResponse = {
      val __obj = js.Dynamic.literal(indexUpdates = indexUpdates.asInstanceOf[js.Any], mutationResults = mutationResults.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommitResponse]
    }
    
    extension [Self <: CommitResponse](x: Self) {
      
      inline def setIndexUpdates(value: Double): Self = StObject.set(x, "indexUpdates", value.asInstanceOf[js.Any])
      
      inline def setMutationResults(value: js.Array[MutationResult]): Self = StObject.set(x, "mutationResults", value.asInstanceOf[js.Any])
      
      inline def setMutationResultsVarargs(value: MutationResult*): Self = StObject.set(x, "mutationResults", js.Array(value*))
    }
  }
  
  type CommitResult = js.Array[CommitResponse]
  
  type GetCallback[T] = js.Function2[/* err */ js.Error, /* entity */ T, Unit]
  
  trait MutationResult extends StObject {
    
    var conflictDetected: Boolean
    
    var key: DatastoreKey
    
    var version: Double
  }
  object MutationResult {
    
    inline def apply(conflictDetected: Boolean, key: DatastoreKey, version: Double): MutationResult = {
      val __obj = js.Dynamic.literal(conflictDetected = conflictDetected.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutationResult]
    }
    
    extension [Self <: MutationResult](x: Self) {
      
      inline def setConflictDetected(value: Boolean): Self = StObject.set(x, "conflictDetected", value.asInstanceOf[js.Any])
      
      inline def setKey(value: DatastoreKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
