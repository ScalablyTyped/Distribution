package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/assert", JSImport.Namespace)
@js.native
object assertMod extends js.Object {
  def assert(assertion: Boolean, message: String): /* asserts assertion */ Boolean = js.native
  def fail(failure: String): scala.Nothing = js.native
}

