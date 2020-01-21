package typings.firebaseFirestore

import typings.firebaseFirestore.utilMiscMod.Equatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/obj_map", JSImport.Namespace)
@js.native
object utilObjMapMod extends js.Object {
  @js.native
  class ObjectMap[KeyType /* <: Equatable[KeyType] */, ValueType] protected () extends js.Object {
    def this(mapKeyFn: js.Function1[/* key */ KeyType, String]) = this()
    /**
      * The inner map for a key -> value pair. Due to the possibility of
      * collisions we keep a list of entries that we do a linear search through
      * to find an actual match. Note that collisions should be rare, so we still
      * expect near constant time lookups in practice.
      */
    var inner: js.Any = js.native
    var mapKeyFn: js.Any = js.native
    /**
      * Remove this key from the map. Returns a boolean if anything was deleted.
      */
    def delete(key: KeyType): Boolean = js.native
    def forEach(fn: js.Function2[/* key */ KeyType, /* val */ ValueType, Unit]): Unit = js.native
    /** Get a value for this key, or undefined if it does not exist. */
    def get(key: KeyType): js.UndefOr[ValueType] = js.native
    def has(key: KeyType): Boolean = js.native
    def isEmpty(): Boolean = js.native
    /** Put this key and value in the map. */
    def set(key: KeyType, value: ValueType): Unit = js.native
  }
  
}

