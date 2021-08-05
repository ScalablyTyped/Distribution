package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.ClearObjectStoreRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.DeleteDatabaseRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.DeleteObjectStoreEntriesRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataResponse
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDataRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDataResponse
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesResponse
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedDBApi extends StObject {
  
  /**
    * Clears all entries from an object store.
    */
  def clearObjectStore(params: ClearObjectStoreRequest): js.Promise[Unit]
  
  /**
    * Deletes a database.
    */
  def deleteDatabase(params: DeleteDatabaseRequest): js.Promise[Unit]
  
  /**
    * Delete a range of entries from an object store
    */
  def deleteObjectStoreEntries(params: DeleteObjectStoreEntriesRequest): js.Promise[Unit]
  
  /**
    * Disables events from backend.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables events from backend.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Gets metadata of an object store
    */
  def getMetadata(params: GetMetadataRequest): js.Promise[GetMetadataResponse]
  
  /**
    * Requests data from object store or index.
    */
  def requestData(params: RequestDataRequest): js.Promise[RequestDataResponse]
  
  /**
    * Requests database with given name in given frame.
    */
  def requestDatabase(params: RequestDatabaseRequest): js.Promise[RequestDatabaseResponse]
  
  /**
    * Requests database names for given security origin.
    */
  def requestDatabaseNames(params: RequestDatabaseNamesRequest): js.Promise[RequestDatabaseNamesResponse]
}
object IndexedDBApi {
  
  inline def apply(
    clearObjectStore: ClearObjectStoreRequest => js.Promise[Unit],
    deleteDatabase: DeleteDatabaseRequest => js.Promise[Unit],
    deleteObjectStoreEntries: DeleteObjectStoreEntriesRequest => js.Promise[Unit],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    getMetadata: GetMetadataRequest => js.Promise[GetMetadataResponse],
    requestData: RequestDataRequest => js.Promise[RequestDataResponse],
    requestDatabase: RequestDatabaseRequest => js.Promise[RequestDatabaseResponse],
    requestDatabaseNames: RequestDatabaseNamesRequest => js.Promise[RequestDatabaseNamesResponse]
  ): IndexedDBApi = {
    val __obj = js.Dynamic.literal(clearObjectStore = js.Any.fromFunction1(clearObjectStore), deleteDatabase = js.Any.fromFunction1(deleteDatabase), deleteObjectStoreEntries = js.Any.fromFunction1(deleteObjectStoreEntries), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getMetadata = js.Any.fromFunction1(getMetadata), requestData = js.Any.fromFunction1(requestData), requestDatabase = js.Any.fromFunction1(requestDatabase), requestDatabaseNames = js.Any.fromFunction1(requestDatabaseNames))
    __obj.asInstanceOf[IndexedDBApi]
  }
  
  extension [Self <: IndexedDBApi](x: Self) {
    
    inline def setClearObjectStore(value: ClearObjectStoreRequest => js.Promise[Unit]): Self = StObject.set(x, "clearObjectStore", js.Any.fromFunction1(value))
    
    inline def setDeleteDatabase(value: DeleteDatabaseRequest => js.Promise[Unit]): Self = StObject.set(x, "deleteDatabase", js.Any.fromFunction1(value))
    
    inline def setDeleteObjectStoreEntries(value: DeleteObjectStoreEntriesRequest => js.Promise[Unit]): Self = StObject.set(x, "deleteObjectStoreEntries", js.Any.fromFunction1(value))
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetMetadata(value: GetMetadataRequest => js.Promise[GetMetadataResponse]): Self = StObject.set(x, "getMetadata", js.Any.fromFunction1(value))
    
    inline def setRequestData(value: RequestDataRequest => js.Promise[RequestDataResponse]): Self = StObject.set(x, "requestData", js.Any.fromFunction1(value))
    
    inline def setRequestDatabase(value: RequestDatabaseRequest => js.Promise[RequestDatabaseResponse]): Self = StObject.set(x, "requestDatabase", js.Any.fromFunction1(value))
    
    inline def setRequestDatabaseNames(value: RequestDatabaseNamesRequest => js.Promise[RequestDatabaseNamesResponse]): Self = StObject.set(x, "requestDatabaseNames", js.Any.fromFunction1(value))
  }
}
