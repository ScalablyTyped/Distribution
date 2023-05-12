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
  * A collection of references to a document from some kind of numbered entity
  * (either a target ID or batch ID). As references are added to or removed from
  * the set corresponding events are emitted to a registered garbage collector.
  *
  * Each reference is represented by a DocumentReference object. Each of them
  * contains enough information to uniquely identify the reference. They are all
  * stored primarily in a set sorted by key. A document is considered garbage if
  * there's no references in that set (this can be efficiently checked thanks to
  * sorting by key).
  *
  * ReferenceSet also keeps a secondary set that contains references sorted by
  * IDs. This one is used to efficiently implement removal of all references by
  * some target ID.
  */ trait o extends StObject {
  
  def Is(): Unit
  
  def Ts(t: Any): Ee
  
  /** Adds a reference to the given document key for the given ID. */ def addReference(t: Any, e: Any): Unit
  
  def containsKey(t: Any): Any
  
  var ds: Ee
  
  def gs(t: Any): Unit
  
  /** Returns true if the reference set contains no references. */ def isEmpty(): Any
  
  var ls: Ee
  
  /**
    * Clears all references with a given ID. Calls removeRef() for each key
    * removed.
    */ def ps(t: Any): js.Array[Any]
  
  /**
    * Removes a reference to the given document key for the given
    * ID.
    */ def removeReference(t: Any, e: Any): Unit
  
  /** Add references to the given document keys for the given ID. */ def ws(t: Any, e: Any): Unit
  
  def ys(t: Any, e: Any): Unit
}
object o {
  
  inline def apply(
    Is: () => Unit,
    Ts: Any => Ee,
    addReference: (Any, Any) => Unit,
    containsKey: Any => Any,
    ds: Ee,
    gs: Any => Unit,
    isEmpty: () => Any,
    ls: Ee,
    ps: Any => js.Array[Any],
    removeReference: (Any, Any) => Unit,
    ws: (Any, Any) => Unit,
    ys: (Any, Any) => Unit
  ): o = {
    val __obj = js.Dynamic.literal(Is = js.Any.fromFunction0(Is), Ts = js.Any.fromFunction1(Ts), addReference = js.Any.fromFunction2(addReference), containsKey = js.Any.fromFunction1(containsKey), ds = ds.asInstanceOf[js.Any], gs = js.Any.fromFunction1(gs), isEmpty = js.Any.fromFunction0(isEmpty), ls = ls.asInstanceOf[js.Any], ps = js.Any.fromFunction1(ps), removeReference = js.Any.fromFunction2(removeReference), ws = js.Any.fromFunction2(ws), ys = js.Any.fromFunction2(ys))
    __obj.asInstanceOf[o]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: o] (val x: Self) extends AnyVal {
    
    inline def setAddReference(value: (Any, Any) => Unit): Self = StObject.set(x, "addReference", js.Any.fromFunction2(value))
    
    inline def setContainsKey(value: Any => Any): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
    
    inline def setDs(value: Ee): Self = StObject.set(x, "ds", value.asInstanceOf[js.Any])
    
    inline def setGs(value: Any => Unit): Self = StObject.set(x, "gs", js.Any.fromFunction1(value))
    
    inline def setIs(value: () => Unit): Self = StObject.set(x, "Is", js.Any.fromFunction0(value))
    
    inline def setIsEmpty(value: () => Any): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setLs(value: Ee): Self = StObject.set(x, "ls", value.asInstanceOf[js.Any])
    
    inline def setPs(value: Any => js.Array[Any]): Self = StObject.set(x, "ps", js.Any.fromFunction1(value))
    
    inline def setRemoveReference(value: (Any, Any) => Unit): Self = StObject.set(x, "removeReference", js.Any.fromFunction2(value))
    
    inline def setTs(value: Any => Ee): Self = StObject.set(x, "Ts", js.Any.fromFunction1(value))
    
    inline def setWs(value: (Any, Any) => Unit): Self = StObject.set(x, "ws", js.Any.fromFunction2(value))
    
    inline def setYs(value: (Any, Any) => Unit): Self = StObject.set(x, "ys", js.Any.fromFunction2(value))
  }
}
