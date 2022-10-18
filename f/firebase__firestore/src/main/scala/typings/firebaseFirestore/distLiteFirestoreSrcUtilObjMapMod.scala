package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcUtilObjMapMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/util/obj_map", "ObjectMap")
  @js.native
  open class ObjectMap[KeyType, ValueType] protected () extends StObject {
    def this(
      mapKeyFn: js.Function1[/* key */ KeyType, String],
      equalsFn: js.Function2[/* l */ KeyType, /* r */ KeyType, Boolean]
    ) = this()
    
    /**
      * Remove this key from the map. Returns a boolean if anything was deleted.
      */
    def delete(key: KeyType): Boolean = js.native
    
    /* private */ var equalsFn: Any = js.native
    
    def forEach(fn: js.Function2[/* key */ KeyType, /* val */ ValueType, Unit]): Unit = js.native
    
    /** Get a value for this key, or undefined if it does not exist. */
    def get(key: KeyType): js.UndefOr[ValueType] = js.native
    
    def has(key: KeyType): Boolean = js.native
    
    /**
      * The inner map for a key/value pair. Due to the possibility of collisions we
      * keep a list of entries that we do a linear search through to find an actual
      * match. Note that collisions should be rare, so we still expect near
      * constant time lookups in practice.
      */
    /* private */ var inner: Any = js.native
    
    /** The number of entries stored in the map */
    /* private */ var innerSize: Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    /* private */ var mapKeyFn: Any = js.native
    
    /** Put this key and value in the map. */
    def set(key: KeyType, value: ValueType): Unit = js.native
    
    def size(): Double = js.native
  }
}
