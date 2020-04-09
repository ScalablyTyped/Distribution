package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/obj", JSImport.Namespace)
@js.native
object utilObjMod extends js.Object {
  def forEach[V](obj: Dict[V], fn: js.Function2[/* key */ String, /* val */ V, Unit]): Unit = js.native
  def isEmpty[V](obj: Dict[V]): Boolean = js.native
  def objectSize[V](obj: js.Object): Double = js.native
  type Dict[V] = StringDictionary[V]
}

