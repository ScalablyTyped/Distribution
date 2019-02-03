package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "Map")
@js.native
class Map[K, V] protected () extends js.Object {
  def this(arr: js.Array[js.Tuple2[K, V]]) = this()
  def this(arr: js.Array[js.Tuple2[K, V]], valueCtor: googleDashProtobufLib.Anon_Init[V]) = this()
  def clear(): scala.Unit = js.native
  def del(key: K): scala.Boolean = js.native
  def entries(): googleDashProtobufLib.googleDashProtobufMod.MapNs.Iterator[js.Tuple2[K, V]] = js.native
  def forEach(callback: js.Function2[/* entry */ V, /* key */ K, scala.Unit]): scala.Unit = js.native
  def forEach(callback: js.Function2[/* entry */ V, /* key */ K, scala.Unit], thisArg: js.Object): scala.Unit = js.native
  def get(key: K): js.UndefOr[V] = js.native
  def getEntryList(): js.Array[js.Tuple2[K, V]] = js.native
  def getLength(): scala.Double = js.native
  def has(key: K): scala.Boolean = js.native
  def keys(): googleDashProtobufLib.googleDashProtobufMod.MapNs.Iterator[K] = js.native
  def set(key: K, value: V): this.type = js.native
  def toArray(): js.Array[js.Tuple2[K, V]] = js.native
  def toObject(): js.Array[js.Tuple2[K, V]] = js.native
  def toObject(includeInstance: scala.Boolean): js.Array[js.Tuple2[K, V]] = js.native
  def toObject[VO](
    includeInstance: scala.Boolean,
    valueToObject: js.Function2[/* includeInstance */ scala.Boolean, /* valueWrapper */ V, VO]
  ): js.Array[js.Tuple2[K, VO]] = js.native
}

/* static members */
@JSImport("google-protobuf", "Map")
@js.native
object Map extends js.Object {
  def fromObject[TK, TV](entries: js.Array[js.Tuple2[TK, TV]], valueCtor: js.Any, valueFromObject: js.Any): googleDashProtobufLib.googleDashProtobufMod.Map[TK, TV] = js.native
}

