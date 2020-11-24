package typings.googleProtobuf.mod

import typings.googleProtobuf.anon.InstantiableV
import typings.googleProtobuf.mod.Map.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "Map")
@js.native
class Map_[K, V] protected () extends js.Object {
  def this(arr: js.Array[js.Tuple2[K, V]]) = this()
  def this(arr: js.Array[js.Tuple2[K, V]], valueCtor: InstantiableV[V]) = this()
  
  def clear(): Unit = js.native
  
  def del(key: K): Boolean = js.native
  
  def entries(): Iterator[js.Tuple2[K, V]] = js.native
  
  def forEach(callback: js.Function2[/* entry */ V, /* key */ K, Unit]): Unit = js.native
  def forEach(callback: js.Function2[/* entry */ V, /* key */ K, Unit], thisArg: js.Object): Unit = js.native
  
  def get(key: K): js.UndefOr[V] = js.native
  
  def getEntryList(): js.Array[js.Tuple2[K, V]] = js.native
  
  def getLength(): Double = js.native
  
  def has(key: K): Boolean = js.native
  
  def keys(): Iterator[K] = js.native
  
  def set(key: K, value: V): this.type = js.native
  
  def toArray(): js.Array[js.Tuple2[K, V]] = js.native
  
  def toObject(): js.Array[js.Tuple2[K, V]] = js.native
  def toObject(includeInstance: Boolean): js.Array[js.Tuple2[K, V]] = js.native
  def toObject[VO](
    includeInstance: Boolean,
    valueToObject: js.Function2[/* includeInstance */ Boolean, /* valueWrapper */ V, VO]
  ): js.Array[js.Tuple2[K, VO]] = js.native
}
