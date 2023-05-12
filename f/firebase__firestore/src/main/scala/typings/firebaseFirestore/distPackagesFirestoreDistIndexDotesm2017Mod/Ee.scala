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
  * SortedSet is an immutable (copy-on-write) collection that holds elements
  * in order specified by the provided comparator.
  *
  * NOTE: if provided comparator returns 0 for two elements, we consider them to
  * be equal!
  */
@js.native
trait Ee extends StObject {
  
  /** Inserts or updates an element */ def add(t: Any): Ee = js.native
  
  var comparator: Any = js.native
  
  def copy(t: Any): Ee = js.native
  
  var data: pe = js.native
  
  /** Deletes an element */ def delete(t: Any): Ee = js.native
  
  def first(): Any = js.native
  
  /** Finds the least element greater than or equal to `elem`. */ def firstAfterOrEqual(t: Any): Any = js.native
  
  /** Iterates elements in order defined by "comparator" */ def forEach(t: Any): Unit = js.native
  
  /** Iterates over `elem`s such that: range[0] &lt;= elem &lt; range[1]. */ def forEachInRange(t: Any, e: Any): Unit = js.native
  
  /**
    * Iterates over `elem`s such that: start &lt;= elem until false is returned.
    */ def forEachWhile(t: Any, e: Any): Unit = js.native
  
  def getIterator(): Ae = js.native
  
  def getIteratorFrom(t: Any): Ae = js.native
  
  def has(t: Any): Boolean = js.native
  
  def indexOf(t: Any): Any = js.native
  
  def isEmpty(): Any = js.native
  
  def isEqual(t: Any): Boolean = js.native
  
  def last(): Any = js.native
  
  def size: Any = js.native
  
  def toArray(): js.Array[Any] = js.native
  
  def unionWith(t: Any): Ee = js.native
}
