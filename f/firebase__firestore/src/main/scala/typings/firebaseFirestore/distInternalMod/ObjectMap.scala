package typings.firebaseFirestore.distInternalMod

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
  * A map implementation that uses objects as keys. Objects must have an
  * associated equals function and must be immutable. Entries in the map are
  * stored together with the key being produced from the mapKeyFn. This map
  * automatically handles collisions of keys.
  */
trait ObjectMap[KeyType, ValueType] extends StObject {
  
  /**
    * Remove this key from the map. Returns a boolean if anything was deleted.
    */
  def delete(key: KeyType): Boolean
  
  /* private */ var equalsFn: Any
  
  def forEach(fn: js.Function2[/* key */ KeyType, /* val */ ValueType, Unit]): Unit
  
  /** Get a value for this key, or undefined if it does not exist. */
  def get(key: KeyType): js.UndefOr[ValueType]
  
  def has(key: KeyType): Boolean
  
  /**
    * The inner map for a key/value pair. Due to the possibility of collisions we
    * keep a list of entries that we do a linear search through to find an actual
    * match. Note that collisions should be rare, so we still expect near
    * constant time lookups in practice.
    */
  /* private */ var inner: Any
  
  /** The number of entries stored in the map */
  /* private */ var innerSize: Any
  
  def isEmpty(): Boolean
  
  /* private */ var mapKeyFn: Any
  
  /** Put this key and value in the map. */
  def set(key: KeyType, value: ValueType): Unit
  
  def size(): Double
}
object ObjectMap {
  
  inline def apply[KeyType, ValueType](
    delete: KeyType => Boolean,
    equalsFn: Any,
    forEach: js.Function2[/* key */ KeyType, /* val */ ValueType, Unit] => Unit,
    get: KeyType => js.UndefOr[ValueType],
    has: KeyType => Boolean,
    inner: Any,
    innerSize: Any,
    isEmpty: () => Boolean,
    mapKeyFn: Any,
    set: (KeyType, ValueType) => Unit,
    size: () => Double
  ): ObjectMap[KeyType, ValueType] = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), equalsFn = equalsFn.asInstanceOf[js.Any], forEach = js.Any.fromFunction1(forEach), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), inner = inner.asInstanceOf[js.Any], innerSize = innerSize.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), mapKeyFn = mapKeyFn.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[ObjectMap[KeyType, ValueType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectMap[?, ?], KeyType, ValueType] (val x: Self & (ObjectMap[KeyType, ValueType])) extends AnyVal {
    
    inline def setDelete(value: KeyType => Boolean): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setEqualsFn(value: Any): Self = StObject.set(x, "equalsFn", value.asInstanceOf[js.Any])
    
    inline def setForEach(value: js.Function2[/* key */ KeyType, /* val */ ValueType, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
    
    inline def setGet(value: KeyType => js.UndefOr[ValueType]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHas(value: KeyType => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setInner(value: Any): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
    
    inline def setInnerSize(value: Any): Self = StObject.set(x, "innerSize", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setMapKeyFn(value: Any): Self = StObject.set(x, "mapKeyFn", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (KeyType, ValueType) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
  }
}
