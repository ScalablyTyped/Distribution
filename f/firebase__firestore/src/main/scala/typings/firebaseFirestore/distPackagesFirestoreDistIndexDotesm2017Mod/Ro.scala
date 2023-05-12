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
  * An in-memory buffer of entries to be written to a RemoteDocumentCache.
  * It can be used to batch up a set of changes to be written to the cache, but
  * additionally supports reading entries back with the `getEntry()` method,
  * falling back to the underlying RemoteDocumentCache if no entry is
  * buffered.
  *
  * Entries added to the cache *must* be read first. This is to facilitate
  * calculating the size delta of the pending changes.
  *
  * PORTING NOTE: This class was implemented then removed from other platforms.
  * If byte-counting ends up being needed on the other platforms, consider
  * porting this class as part of that implementation work.
  */ trait Ro extends StObject {
  
  /**
    * Buffers a `RemoteDocumentCache.addEntry()` call.
    *
    * You can only modify documents that have already been retrieved via
    * `getEntry()/getEntries()` (enforced via IndexedDbs `apply()`).
    */ def addEntry(t: Any): Unit
  
  /**
    * Applies buffered changes to the underlying RemoteDocumentCache, using
    * the provided transaction.
    */ @JSName("apply")
  def apply(t: Any): Any
  
  /** Helper to assert this.changes is not null  */ def assertNotApplied(): Unit
  
  var changes: os
  
  var changesApplied: Boolean
  
  /**
    * Looks up several entries in the cache, forwarding to
    * `RemoteDocumentCache.getEntry()`.
    *
    * @param transaction - The transaction in which to perform any persistence
    *     operations.
    * @param documentKeys - The keys of the entries to look up.
    * @returns A map of cached documents, indexed by key. If an entry cannot be
    *     found, the corresponding key will be mapped to an invalid document.
    */ def getEntries(t: Any, e: Any): Any
  
  /**
    * Looks up an entry in the cache. The buffered changes will first be checked,
    * and if no buffered change applies, this will forward to
    * `RemoteDocumentCache.getEntry()`.
    *
    * @param transaction - The transaction in which to perform any persistence
    *     operations.
    * @param documentKey - The key of the entry to look up.
    * @returns The cached document or an invalid document if we have nothing
    * cached.
    */ def getEntry(t: Any, e: Any): Any
  
  /**
    * Buffers a `RemoteDocumentCache.removeEntry()` call.
    *
    * You can only remove documents that have already been retrieved via
    * `getEntry()/getEntries()` (enforced via IndexedDbs `apply()`).
    */ def removeEntry(t: Any, e: Any): Unit
}
object Ro {
  
  inline def apply(
    addEntry: Any => Unit,
    apply: Any => Any,
    assertNotApplied: () => Unit,
    changes: os,
    changesApplied: Boolean,
    getEntries: (Any, Any) => Any,
    getEntry: (Any, Any) => Any,
    removeEntry: (Any, Any) => Unit
  ): Ro = {
    val __obj = js.Dynamic.literal(addEntry = js.Any.fromFunction1(addEntry), apply = js.Any.fromFunction1(apply), assertNotApplied = js.Any.fromFunction0(assertNotApplied), changes = changes.asInstanceOf[js.Any], changesApplied = changesApplied.asInstanceOf[js.Any], getEntries = js.Any.fromFunction2(getEntries), getEntry = js.Any.fromFunction2(getEntry), removeEntry = js.Any.fromFunction2(removeEntry))
    __obj.asInstanceOf[Ro]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ro] (val x: Self) extends AnyVal {
    
    inline def setAddEntry(value: Any => Unit): Self = StObject.set(x, "addEntry", js.Any.fromFunction1(value))
    
    inline def setApply(value: Any => Any): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setAssertNotApplied(value: () => Unit): Self = StObject.set(x, "assertNotApplied", js.Any.fromFunction0(value))
    
    inline def setChanges(value: os): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesApplied(value: Boolean): Self = StObject.set(x, "changesApplied", value.asInstanceOf[js.Any])
    
    inline def setGetEntries(value: (Any, Any) => Any): Self = StObject.set(x, "getEntries", js.Any.fromFunction2(value))
    
    inline def setGetEntry(value: (Any, Any) => Any): Self = StObject.set(x, "getEntry", js.Any.fromFunction2(value))
    
    inline def setRemoveEntry(value: (Any, Any) => Unit): Self = StObject.set(x, "removeEntry", js.Any.fromFunction2(value))
  }
}
