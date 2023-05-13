package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.std.Map
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
/**
  * Implements `LocalStore` interface.
  *
  * Note: some field defined in this class might have public access level, but
  * the class is not exported so they are only accessible from this module.
  * This is useful to implement optional features (like bundles) in free
  * functions, such that they are tree-shakeable.
  */
trait nu extends StObject {
  
  var Bs: Any
  
  var Hi: Any
  
  /**
    * Maps a targetID to data about its target.
    *
    * PORTING NOTE: We are using an immutable data structure on Web to make re-runs
    * of `applyRemoteEvent()` idempotent.
    */
  var Ji: pe
  
  /**
    * A per collection group index of the last read time processed by
    * `getNewDocumentChanges()`.
    *
    * PORTING NOTE: This is only used for multi-tab synchronization.
    */
  var Xi: Map[Any, Any]
  
  /** Maps a target to its targetID. */
  var Yi: os
  
  var Zi: Any
  
  def collectGarbage(t: Any): Any
  
  var documentOverlayCache: Any
  
  var indexManager: Any
  
  var localDocuments: js.UndefOr[ko] = js.undefined
  
  var mutationQueue: Any
  
  var persistence: Any
  
  var qs: Any
  
  var serializer: Any
  
  def tr(t: Any): Unit
}
object nu {
  
  inline def apply(
    Bs: Any,
    Hi: Any,
    Ji: pe,
    Xi: Map[Any, Any],
    Yi: os,
    Zi: Any,
    collectGarbage: Any => Any,
    documentOverlayCache: Any,
    indexManager: Any,
    mutationQueue: Any,
    persistence: Any,
    qs: Any,
    serializer: Any,
    tr: Any => Unit
  ): nu = {
    val __obj = js.Dynamic.literal(Bs = Bs.asInstanceOf[js.Any], Hi = Hi.asInstanceOf[js.Any], Ji = Ji.asInstanceOf[js.Any], Xi = Xi.asInstanceOf[js.Any], Yi = Yi.asInstanceOf[js.Any], Zi = Zi.asInstanceOf[js.Any], collectGarbage = js.Any.fromFunction1(collectGarbage), documentOverlayCache = documentOverlayCache.asInstanceOf[js.Any], indexManager = indexManager.asInstanceOf[js.Any], mutationQueue = mutationQueue.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], qs = qs.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any], tr = js.Any.fromFunction1(tr))
    __obj.asInstanceOf[nu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: nu] (val x: Self) extends AnyVal {
    
    inline def setBs(value: Any): Self = StObject.set(x, "Bs", value.asInstanceOf[js.Any])
    
    inline def setCollectGarbage(value: Any => Any): Self = StObject.set(x, "collectGarbage", js.Any.fromFunction1(value))
    
    inline def setDocumentOverlayCache(value: Any): Self = StObject.set(x, "documentOverlayCache", value.asInstanceOf[js.Any])
    
    inline def setHi(value: Any): Self = StObject.set(x, "Hi", value.asInstanceOf[js.Any])
    
    inline def setIndexManager(value: Any): Self = StObject.set(x, "indexManager", value.asInstanceOf[js.Any])
    
    inline def setJi(value: pe): Self = StObject.set(x, "Ji", value.asInstanceOf[js.Any])
    
    inline def setLocalDocuments(value: ko): Self = StObject.set(x, "localDocuments", value.asInstanceOf[js.Any])
    
    inline def setLocalDocumentsUndefined: Self = StObject.set(x, "localDocuments", js.undefined)
    
    inline def setMutationQueue(value: Any): Self = StObject.set(x, "mutationQueue", value.asInstanceOf[js.Any])
    
    inline def setPersistence(value: Any): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setQs(value: Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setTr(value: Any => Unit): Self = StObject.set(x, "tr", js.Any.fromFunction1(value))
    
    inline def setXi(value: Map[Any, Any]): Self = StObject.set(x, "Xi", value.asInstanceOf[js.Any])
    
    inline def setYi(value: os): Self = StObject.set(x, "Yi", value.asInstanceOf[js.Any])
    
    inline def setZi(value: Any): Self = StObject.set(x, "Zi", value.asInstanceOf[js.Any])
  }
}
