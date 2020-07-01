package typings.firebaseFirestore.indexDotnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "QuerySnapshot")
@js.native
class QuerySnapshot[T] protected ()
  extends typings.firebaseFirestore.snapshotMod.QuerySnapshot[T] {
  def this(
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Query<T> */ js.Any,
    _docs: js.Array[typings.firebaseFirestore.snapshotMod.QueryDocumentSnapshot[T]]
  ) = this()
}

