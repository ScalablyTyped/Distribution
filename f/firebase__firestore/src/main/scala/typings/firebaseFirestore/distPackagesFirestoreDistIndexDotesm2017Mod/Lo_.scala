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
  * The memory-only RemoteDocumentCache for IndexedDb. To construct, invoke
  * `newMemoryRemoteDocumentCache()`.
  */
trait Lo_ extends StObject {
  
  def Ds(t: Any, e: Any): vt
  
  var Ss: Any
  
  /**
    * Adds the supplied entry to the cache and updates the cache size as appropriate.
    *
    * All calls of `addEntry`  are required to go through the RemoteDocumentChangeBuffer
    * returned by `newChangeBuffer()`.
    */ def addEntry(t: Any, e: Any): Any
  
  /** Underlying cache of documents and their read times. */
  var docs: pe
  
  def getAllFromCollectionGroup(t: Any, e: Any, n: Any, s: Any): Unit
  
  def getDocumentsMatchingQuery(t: Any, e: Any, n: Any, s: Any): vt
  
  def getEntries(t: Any, e: Any): vt
  
  def getEntry(t: Any, e: Any): vt
  
  def getSize(t: Any): vt
  
  var indexManager: Any
  
  def newChangeBuffer(t: Any): qo
  
  /**
    * Removes the specified entry from the cache and updates the cache size as appropriate.
    *
    * All calls of `removeEntry` are required to go through the RemoteDocumentChangeBuffer
    * returned by `newChangeBuffer()`.
    */ def removeEntry(t: Any): Unit
  
  def setIndexManager(t: Any): Unit
  
  /** Size of all cached documents. */
  var size: Double
}
object Lo_ {
  
  inline def apply(
    Ds: (Any, Any) => vt,
    Ss: Any,
    addEntry: (Any, Any) => Any,
    docs: pe,
    getAllFromCollectionGroup: (Any, Any, Any, Any) => Unit,
    getDocumentsMatchingQuery: (Any, Any, Any, Any) => vt,
    getEntries: (Any, Any) => vt,
    getEntry: (Any, Any) => vt,
    getSize: Any => vt,
    indexManager: Any,
    newChangeBuffer: Any => qo,
    removeEntry: Any => Unit,
    setIndexManager: Any => Unit,
    size: Double
  ): Lo_ = {
    val __obj = js.Dynamic.literal(Ds = js.Any.fromFunction2(Ds), Ss = Ss.asInstanceOf[js.Any], addEntry = js.Any.fromFunction2(addEntry), docs = docs.asInstanceOf[js.Any], getAllFromCollectionGroup = js.Any.fromFunction4(getAllFromCollectionGroup), getDocumentsMatchingQuery = js.Any.fromFunction4(getDocumentsMatchingQuery), getEntries = js.Any.fromFunction2(getEntries), getEntry = js.Any.fromFunction2(getEntry), getSize = js.Any.fromFunction1(getSize), indexManager = indexManager.asInstanceOf[js.Any], newChangeBuffer = js.Any.fromFunction1(newChangeBuffer), removeEntry = js.Any.fromFunction1(removeEntry), setIndexManager = js.Any.fromFunction1(setIndexManager), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lo_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lo_] (val x: Self) extends AnyVal {
    
    inline def setAddEntry(value: (Any, Any) => Any): Self = StObject.set(x, "addEntry", js.Any.fromFunction2(value))
    
    inline def setDocs(value: pe): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDs(value: (Any, Any) => vt): Self = StObject.set(x, "Ds", js.Any.fromFunction2(value))
    
    inline def setGetAllFromCollectionGroup(value: (Any, Any, Any, Any) => Unit): Self = StObject.set(x, "getAllFromCollectionGroup", js.Any.fromFunction4(value))
    
    inline def setGetDocumentsMatchingQuery(value: (Any, Any, Any, Any) => vt): Self = StObject.set(x, "getDocumentsMatchingQuery", js.Any.fromFunction4(value))
    
    inline def setGetEntries(value: (Any, Any) => vt): Self = StObject.set(x, "getEntries", js.Any.fromFunction2(value))
    
    inline def setGetEntry(value: (Any, Any) => vt): Self = StObject.set(x, "getEntry", js.Any.fromFunction2(value))
    
    inline def setGetSize(value: Any => vt): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setIndexManager(value: Any): Self = StObject.set(x, "indexManager", value.asInstanceOf[js.Any])
    
    inline def setNewChangeBuffer(value: Any => qo): Self = StObject.set(x, "newChangeBuffer", js.Any.fromFunction1(value))
    
    inline def setRemoveEntry(value: Any => Unit): Self = StObject.set(x, "removeEntry", js.Any.fromFunction1(value))
    
    inline def setSetIndexManager(value: Any => Unit): Self = StObject.set(x, "setIndexManager", js.Any.fromFunction1(value))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSs(value: Any): Self = StObject.set(x, "Ss", value.asInstanceOf[js.Any])
  }
}
