package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2020 Google LLC
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
/** Provides LRU functionality for IndexedDB persistence. */ trait Eo extends StObject {
  
  def Jn(t: Any): Any
  
  def Wn(t: Any, e: Any): Any
  
  /**
    * Returns true if anything would prevent this document from being garbage
    * collected, given that the document in question is not present in any
    * targets and has a sequence number less than or equal to the upper bound for
    * the collection run.
    */ def Xn(t: Any, e: Any): Any
  
  /**
    * Call provided function for each document in the cache that is 'orphaned'. Orphaned
    * means not a part of any target, so the only entry in the target-document index for
    * that document will be the sentinel row (targetId 0), which will also have the sequence
    * number for the last time the document was accessed.
    */ def Yn(t: Any, e: Any): Any
  
  def addReference(t: Any, e: Any, n: Any): Any
  
  var db: Any
  
  def forEachTarget(t: Any, e: Any): Any
  
  var garbageCollector: Io
  
  def getCacheSize(t: Any): Any
  
  def markPotentiallyOrphaned(t: Any, e: Any): Any
  
  def removeOrphanedDocuments(t: Any, e: Any): Any
  
  def removeReference(t: Any, e: Any, n: Any): Any
  
  def removeTarget(t: Any, e: Any): Any
  
  def removeTargets(t: Any, e: Any, n: Any): Any
  
  def updateLimboDocument(t: Any, e: Any): Any
  
  def zn(t: Any): Any
}
object Eo {
  
  inline def apply(
    Jn: Any => Any,
    Wn: (Any, Any) => Any,
    Xn: (Any, Any) => Any,
    Yn: (Any, Any) => Any,
    addReference: (Any, Any, Any) => Any,
    db: Any,
    forEachTarget: (Any, Any) => Any,
    garbageCollector: Io,
    getCacheSize: Any => Any,
    markPotentiallyOrphaned: (Any, Any) => Any,
    removeOrphanedDocuments: (Any, Any) => Any,
    removeReference: (Any, Any, Any) => Any,
    removeTarget: (Any, Any) => Any,
    removeTargets: (Any, Any, Any) => Any,
    updateLimboDocument: (Any, Any) => Any,
    zn: Any => Any
  ): Eo = {
    val __obj = js.Dynamic.literal(Jn = js.Any.fromFunction1(Jn), Wn = js.Any.fromFunction2(Wn), Xn = js.Any.fromFunction2(Xn), Yn = js.Any.fromFunction2(Yn), addReference = js.Any.fromFunction3(addReference), db = db.asInstanceOf[js.Any], forEachTarget = js.Any.fromFunction2(forEachTarget), garbageCollector = garbageCollector.asInstanceOf[js.Any], getCacheSize = js.Any.fromFunction1(getCacheSize), markPotentiallyOrphaned = js.Any.fromFunction2(markPotentiallyOrphaned), removeOrphanedDocuments = js.Any.fromFunction2(removeOrphanedDocuments), removeReference = js.Any.fromFunction3(removeReference), removeTarget = js.Any.fromFunction2(removeTarget), removeTargets = js.Any.fromFunction3(removeTargets), updateLimboDocument = js.Any.fromFunction2(updateLimboDocument), zn = js.Any.fromFunction1(zn))
    __obj.asInstanceOf[Eo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Eo] (val x: Self) extends AnyVal {
    
    inline def setAddReference(value: (Any, Any, Any) => Any): Self = StObject.set(x, "addReference", js.Any.fromFunction3(value))
    
    inline def setDb(value: Any): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    
    inline def setForEachTarget(value: (Any, Any) => Any): Self = StObject.set(x, "forEachTarget", js.Any.fromFunction2(value))
    
    inline def setGarbageCollector(value: Io): Self = StObject.set(x, "garbageCollector", value.asInstanceOf[js.Any])
    
    inline def setGetCacheSize(value: Any => Any): Self = StObject.set(x, "getCacheSize", js.Any.fromFunction1(value))
    
    inline def setJn(value: Any => Any): Self = StObject.set(x, "Jn", js.Any.fromFunction1(value))
    
    inline def setMarkPotentiallyOrphaned(value: (Any, Any) => Any): Self = StObject.set(x, "markPotentiallyOrphaned", js.Any.fromFunction2(value))
    
    inline def setRemoveOrphanedDocuments(value: (Any, Any) => Any): Self = StObject.set(x, "removeOrphanedDocuments", js.Any.fromFunction2(value))
    
    inline def setRemoveReference(value: (Any, Any, Any) => Any): Self = StObject.set(x, "removeReference", js.Any.fromFunction3(value))
    
    inline def setRemoveTarget(value: (Any, Any) => Any): Self = StObject.set(x, "removeTarget", js.Any.fromFunction2(value))
    
    inline def setRemoveTargets(value: (Any, Any, Any) => Any): Self = StObject.set(x, "removeTargets", js.Any.fromFunction3(value))
    
    inline def setUpdateLimboDocument(value: (Any, Any) => Any): Self = StObject.set(x, "updateLimboDocument", js.Any.fromFunction2(value))
    
    inline def setWn(value: (Any, Any) => Any): Self = StObject.set(x, "Wn", js.Any.fromFunction2(value))
    
    inline def setXn(value: (Any, Any) => Any): Self = StObject.set(x, "Xn", js.Any.fromFunction2(value))
    
    inline def setYn(value: (Any, Any) => Any): Self = StObject.set(x, "Yn", js.Any.fromFunction2(value))
    
    inline def setZn(value: Any => Any): Self = StObject.set(x, "zn", js.Any.fromFunction1(value))
  }
}
