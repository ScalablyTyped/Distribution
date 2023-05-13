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
  */ trait Oo_ extends StObject {
  
  def Es(t: Any): Ee
  
  /**
    * Clears all references with a given ID. Calls removeRef() for each key
    * removed.
    */ def Is(t: Any): js.Array[Any]
  
  def Ts(): Unit
  
  /** Adds a reference to the given document key for the given ID. */ def addReference(t: Any, e: Any): Unit
  
  def containsKey(t: Any): Any
  
  var fs: Ee
  
  /** Add references to the given document keys for the given ID. */ def gs(t: Any, e: Any): Unit
  
  /** Returns true if the reference set contains no references. */ def isEmpty(): Any
  
  def ps(t: Any, e: Any): Unit
  
  /**
    * Removes a reference to the given document key for the given
    * ID.
    */ def removeReference(t: Any, e: Any): Unit
  
  var ws: Ee
  
  def ys(t: Any): Unit
}
object Oo_ {
  
  inline def apply(
    Es: Any => Ee,
    Is: Any => js.Array[Any],
    Ts: () => Unit,
    addReference: (Any, Any) => Unit,
    containsKey: Any => Any,
    fs: Ee,
    gs: (Any, Any) => Unit,
    isEmpty: () => Any,
    ps: (Any, Any) => Unit,
    removeReference: (Any, Any) => Unit,
    ws: Ee,
    ys: Any => Unit
  ): Oo_ = {
    val __obj = js.Dynamic.literal(Es = js.Any.fromFunction1(Es), Is = js.Any.fromFunction1(Is), Ts = js.Any.fromFunction0(Ts), addReference = js.Any.fromFunction2(addReference), containsKey = js.Any.fromFunction1(containsKey), fs = fs.asInstanceOf[js.Any], gs = js.Any.fromFunction2(gs), isEmpty = js.Any.fromFunction0(isEmpty), ps = js.Any.fromFunction2(ps), removeReference = js.Any.fromFunction2(removeReference), ws = ws.asInstanceOf[js.Any], ys = js.Any.fromFunction1(ys))
    __obj.asInstanceOf[Oo_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Oo_] (val x: Self) extends AnyVal {
    
    inline def setAddReference(value: (Any, Any) => Unit): Self = StObject.set(x, "addReference", js.Any.fromFunction2(value))
    
    inline def setContainsKey(value: Any => Any): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
    
    inline def setEs(value: Any => Ee): Self = StObject.set(x, "Es", js.Any.fromFunction1(value))
    
    inline def setFs(value: Ee): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setGs(value: (Any, Any) => Unit): Self = StObject.set(x, "gs", js.Any.fromFunction2(value))
    
    inline def setIs(value: Any => js.Array[Any]): Self = StObject.set(x, "Is", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Any): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setPs(value: (Any, Any) => Unit): Self = StObject.set(x, "ps", js.Any.fromFunction2(value))
    
    inline def setRemoveReference(value: (Any, Any) => Unit): Self = StObject.set(x, "removeReference", js.Any.fromFunction2(value))
    
    inline def setTs(value: () => Unit): Self = StObject.set(x, "Ts", js.Any.fromFunction0(value))
    
    inline def setWs(value: Ee): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    
    inline def setYs(value: Any => Unit): Self = StObject.set(x, "ys", js.Any.fromFunction1(value))
  }
}
