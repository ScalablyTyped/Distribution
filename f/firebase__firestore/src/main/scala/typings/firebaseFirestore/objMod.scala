package typings.firebaseFirestore

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/obj", JSImport.Namespace)
@js.native
object objMod extends js.Object {
  def contains[V](obj: Dict[V], key: String): Boolean = js.native
  def contains[V](obj: Dict[V], key: Double): Boolean = js.native
  def defaulted[V](value: V, defaultValue: V): V = js.native
  def defaulted[V](value: js.UndefOr[scala.Nothing], defaultValue: V): V = js.native
  def forEach[V](obj: Dict[V], fn: js.Function2[/* key */ String, /* val */ V, Unit]): Unit = js.native
  def forEachNumber[V](obj: Dict[V], fn: js.Function2[/* key */ Double, /* val */ V, Unit]): Unit = js.native
  def get[V](obj: Dict[V], key: String): V | Null = js.native
  def get[V](obj: Dict[V], key: Double): V | Null = js.native
  def isEmpty[V](obj: Dict[V]): Boolean = js.native
  def lookupOrInsert[V](obj: Dict[V], key: String, valFn: js.Function0[V]): V = js.native
  def lookupOrInsert[V](obj: Dict[V], key: Double, valFn: js.Function0[V]): V = js.native
  def shallowCopy[V](obj: Dict[V]): Dict[V] = js.native
  def size[V](obj: Dict[V]): Double = js.native
  def values[V](obj: Dict[V]): js.Array[V] = js.native
  type Dict[V] = StringDictionary[V] with NumberDictionary[V]
}

