package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2017 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * The RemoteDocumentCache for IndexedDb. To construct, invoke
  * `newIndexedDbRemoteDocumentCache()`.
  */ trait vo extends StObject {
  
  def Xn(t: Any, e: Any): Any
  
  /**
    * Decodes `dbRemoteDoc` and returns the document (or an invalid document if
    * the document corresponds to the format used for sentinel deletes).
    */ def Zn(t: Any, e: Any): Unit | an
  
  /**
    * Adds the supplied entries to the cache.
    *
    * All calls of `addEntry` are required to go through the RemoteDocumentChangeBuffer
    * returned by `newChangeBuffer()` to ensure proper accounting of metadata.
    */ def addEntry(t: Any, e: Any, n: Any): Any
  
  def es(t: Any, e: Any, n: Any): Any
  
  def getAllFromCollectionGroup(t: Any, e: Any, n: Any, s: Any): Any
  
  def getDocumentsMatchingQuery(t: Any, e: Any, n: Any, s: Any): Any
  
  def getEntries(t: Any, e: Any): Any
  
  def getEntry(t: Any, e: Any): Any
  
  def getMetadata(t: Any): Any
  
  def getSize(t: Any): Any
  
  var indexManager: Any
  
  def newChangeBuffer(t: Any): bo
  
  /**
    * Looks up several entries in the cache.
    *
    * @param documentKeys - The set of keys entries to look up.
    * @returns A map of documents indexed by key and a map of sizes indexed by
    *     key (zero if the document does not exist).
    */ def ns(t: Any, e: Any): Any
  
  /**
    * Removes a document from the cache.
    *
    * All calls of `removeEntry`  are required to go through the RemoteDocumentChangeBuffer
    * returned by `newChangeBuffer()` to ensure proper accounting of metadata.
    */ def removeEntry(t: Any, e: Any, n: Any): Any
  
  var serializer: Any
  
  def setIndexManager(t: Any): Unit
  
  /**
    * Looks up an entry in the cache.
    *
    * @param documentKey - The key of the entry to look up.
    * @returns The cached document entry and its size.
    */ def ts(t: Any, e: Any): Any
  
  /**
    * Updates the current cache size.
    *
    * Callers to `addEntry()` and `removeEntry()` *must* call this afterwards to update the
    * cache's metadata.
    */ def updateMetadata(t: Any, e: Any): Any
}
object vo {
  
  inline def apply(
    Xn: (Any, Any) => Any,
    Zn: (Any, Any) => Unit | an,
    addEntry: (Any, Any, Any) => Any,
    es: (Any, Any, Any) => Any,
    getAllFromCollectionGroup: (Any, Any, Any, Any) => Any,
    getDocumentsMatchingQuery: (Any, Any, Any, Any) => Any,
    getEntries: (Any, Any) => Any,
    getEntry: (Any, Any) => Any,
    getMetadata: Any => Any,
    getSize: Any => Any,
    indexManager: Any,
    newChangeBuffer: Any => bo,
    ns: (Any, Any) => Any,
    removeEntry: (Any, Any, Any) => Any,
    serializer: Any,
    setIndexManager: Any => Unit,
    ts: (Any, Any) => Any,
    updateMetadata: (Any, Any) => Any
  ): vo = {
    val __obj = js.Dynamic.literal(Xn = js.Any.fromFunction2(Xn), Zn = js.Any.fromFunction2(Zn), addEntry = js.Any.fromFunction3(addEntry), es = js.Any.fromFunction3(es), getAllFromCollectionGroup = js.Any.fromFunction4(getAllFromCollectionGroup), getDocumentsMatchingQuery = js.Any.fromFunction4(getDocumentsMatchingQuery), getEntries = js.Any.fromFunction2(getEntries), getEntry = js.Any.fromFunction2(getEntry), getMetadata = js.Any.fromFunction1(getMetadata), getSize = js.Any.fromFunction1(getSize), indexManager = indexManager.asInstanceOf[js.Any], newChangeBuffer = js.Any.fromFunction1(newChangeBuffer), ns = js.Any.fromFunction2(ns), removeEntry = js.Any.fromFunction3(removeEntry), serializer = serializer.asInstanceOf[js.Any], setIndexManager = js.Any.fromFunction1(setIndexManager), ts = js.Any.fromFunction2(ts), updateMetadata = js.Any.fromFunction2(updateMetadata))
    __obj.asInstanceOf[vo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vo] (val x: Self) extends AnyVal {
    
    inline def setAddEntry(value: (Any, Any, Any) => Any): Self = StObject.set(x, "addEntry", js.Any.fromFunction3(value))
    
    inline def setEs(value: (Any, Any, Any) => Any): Self = StObject.set(x, "es", js.Any.fromFunction3(value))
    
    inline def setGetAllFromCollectionGroup(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "getAllFromCollectionGroup", js.Any.fromFunction4(value))
    
    inline def setGetDocumentsMatchingQuery(value: (Any, Any, Any, Any) => Any): Self = StObject.set(x, "getDocumentsMatchingQuery", js.Any.fromFunction4(value))
    
    inline def setGetEntries(value: (Any, Any) => Any): Self = StObject.set(x, "getEntries", js.Any.fromFunction2(value))
    
    inline def setGetEntry(value: (Any, Any) => Any): Self = StObject.set(x, "getEntry", js.Any.fromFunction2(value))
    
    inline def setGetMetadata(value: Any => Any): Self = StObject.set(x, "getMetadata", js.Any.fromFunction1(value))
    
    inline def setGetSize(value: Any => Any): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setIndexManager(value: Any): Self = StObject.set(x, "indexManager", value.asInstanceOf[js.Any])
    
    inline def setNewChangeBuffer(value: Any => bo): Self = StObject.set(x, "newChangeBuffer", js.Any.fromFunction1(value))
    
    inline def setNs(value: (Any, Any) => Any): Self = StObject.set(x, "ns", js.Any.fromFunction2(value))
    
    inline def setRemoveEntry(value: (Any, Any, Any) => Any): Self = StObject.set(x, "removeEntry", js.Any.fromFunction3(value))
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setSetIndexManager(value: Any => Unit): Self = StObject.set(x, "setIndexManager", js.Any.fromFunction1(value))
    
    inline def setTs(value: (Any, Any) => Any): Self = StObject.set(x, "ts", js.Any.fromFunction2(value))
    
    inline def setUpdateMetadata(value: (Any, Any) => Any): Self = StObject.set(x, "updateMetadata", js.Any.fromFunction2(value))
    
    inline def setXn(value: (Any, Any) => Any): Self = StObject.set(x, "Xn", js.Any.fromFunction2(value))
    
    inline def setZn(value: (Any, Any) => Unit | an): Self = StObject.set(x, "Zn", js.Any.fromFunction2(value))
  }
}
