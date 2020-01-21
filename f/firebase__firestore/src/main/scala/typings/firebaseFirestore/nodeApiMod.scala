package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/util/node_api", JSImport.Namespace)
@js.native
object nodeApiMod extends js.Object {
  def nodePromise[R](action: js.Function1[/* callback */ NodeCallback[R], Unit]): js.Promise[R] = js.native
  type NodeCallback[R] = js.Function2[/* error */ js.UndefOr[js.Any], /* value */ js.UndefOr[R], Unit]
}

