package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcUtilNodeUnderscoreApiMod.NodeCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/util/node_api", JSImport.Namespace)
@js.native
object distSrcUtilNodeUnderscoreApiMod extends js.Object {
  def nodePromise[R](action: js.Function1[/* callback */ NodeCallback[R], Unit]): js.Promise[R] = js.native
  type NodeCallback[R] = js.Function2[/* error */ js.UndefOr[js.Any], /* value */ js.UndefOr[R], Unit]
}

