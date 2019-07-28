package typings.googleDashProtobuf.googleDashProtobufMod

import typings.googleDashProtobuf.Anon_Init
import typings.googleDashProtobuf.googleDashProtobufMod.MapNs.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "Map")
@js.native
class Map[K, V] protected () extends js.Object {
  def this(arr: js.Array[js.Tuple2[K, V]]) = this()
  def this(arr: js.Array[js.Tuple2[K, V]], valueCtor: Anon_Init[V]) = this()
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

/* static members */
@JSImport("google-protobuf", "Map")
@js.native
object Map extends js.Object {
  def fromObject[TK, TV](entries: js.Array[js.Tuple2[TK, TV]], valueCtor: js.Any, valueFromObject: js.Any): Map[TK, TV] = js.native
}

