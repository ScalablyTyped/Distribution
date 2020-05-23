package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/util/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  def findIndex[A](array: js.Array[A], predicate: js.Function1[/* value */ A, Boolean]): Double | Null = js.native
  def includes[T](array: js.Array[T], value: T): Boolean = js.native
  def some[T](array: js.Array[T], predicate: js.Function1[/* t */ T, Boolean]): Boolean = js.native
}

