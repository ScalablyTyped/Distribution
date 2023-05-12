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
  
  var Fs: Any
  
  /**
    * Maps a targetID to data about its target.
    *
    * PORTING NOTE: We are using an immutable data structure on Web to make re-runs
    * of `applyRemoteEvent()` idempotent.
    */
  var Hi: pe
  
  /** Maps a target to its targetID. */
  var Ji: os
  
  var Ls: Any
  
  var Wi: Any
  
  var Xi: Any
  
  /**
    * A per collection group index of the last read time processed by
    * `getNewDocumentChanges()`.
    *
    * PORTING NOTE: This is only used for multi-tab synchronization.
    */
  var Yi: Map[Any, Any]
  
  def Zi(t: Any): Unit
  
  def collectGarbage(t: Any): Any
  
  var documentOverlayCache: Any
  
  var indexManager: Any
  
  var localDocuments: js.UndefOr[ko] = js.undefined
  
  var mutationQueue: Any
  
  var persistence: Any
  
  var serializer: Any
}
object nu {
  
  inline def apply(
    Fs: Any,
    Hi: pe,
    Ji: os,
    Ls: Any,
    Wi: Any,
    Xi: Any,
    Yi: Map[Any, Any],
    Zi: Any => Unit,
    collectGarbage: Any => Any,
    documentOverlayCache: Any,
    indexManager: Any,
    mutationQueue: Any,
    persistence: Any,
    serializer: Any
  ): nu = {
    val __obj = js.Dynamic.literal(Fs = Fs.asInstanceOf[js.Any], Hi = Hi.asInstanceOf[js.Any], Ji = Ji.asInstanceOf[js.Any], Ls = Ls.asInstanceOf[js.Any], Wi = Wi.asInstanceOf[js.Any], Xi = Xi.asInstanceOf[js.Any], Yi = Yi.asInstanceOf[js.Any], Zi = js.Any.fromFunction1(Zi), collectGarbage = js.Any.fromFunction1(collectGarbage), documentOverlayCache = documentOverlayCache.asInstanceOf[js.Any], indexManager = indexManager.asInstanceOf[js.Any], mutationQueue = mutationQueue.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[nu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: nu] (val x: Self) extends AnyVal {
    
    inline def setCollectGarbage(value: Any => Any): Self = StObject.set(x, "collectGarbage", js.Any.fromFunction1(value))
    
    inline def setDocumentOverlayCache(value: Any): Self = StObject.set(x, "documentOverlayCache", value.asInstanceOf[js.Any])
    
    inline def setFs(value: Any): Self = StObject.set(x, "Fs", value.asInstanceOf[js.Any])
    
    inline def setHi(value: pe): Self = StObject.set(x, "Hi", value.asInstanceOf[js.Any])
    
    inline def setIndexManager(value: Any): Self = StObject.set(x, "indexManager", value.asInstanceOf[js.Any])
    
    inline def setJi(value: os): Self = StObject.set(x, "Ji", value.asInstanceOf[js.Any])
    
    inline def setLocalDocuments(value: ko): Self = StObject.set(x, "localDocuments", value.asInstanceOf[js.Any])
    
    inline def setLocalDocumentsUndefined: Self = StObject.set(x, "localDocuments", js.undefined)
    
    inline def setLs(value: Any): Self = StObject.set(x, "Ls", value.asInstanceOf[js.Any])
    
    inline def setMutationQueue(value: Any): Self = StObject.set(x, "mutationQueue", value.asInstanceOf[js.Any])
    
    inline def setPersistence(value: Any): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setSerializer(value: Any): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setWi(value: Any): Self = StObject.set(x, "Wi", value.asInstanceOf[js.Any])
    
    inline def setXi(value: Any): Self = StObject.set(x, "Xi", value.asInstanceOf[js.Any])
    
    inline def setYi(value: Map[Any, Any]): Self = StObject.set(x, "Yi", value.asInstanceOf[js.Any])
    
    inline def setZi(value: Any => Unit): Self = StObject.set(x, "Zi", js.Any.fromFunction1(value))
  }
}
