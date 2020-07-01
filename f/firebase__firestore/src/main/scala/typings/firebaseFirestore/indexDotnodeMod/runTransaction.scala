package typings.firebaseFirestore.indexDotnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "runTransaction")
@js.native
object runTransaction extends js.Object {
  def apply[T](
    firestore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore */ js.Any,
    updateFunction: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Transaction */ /* transaction */ js.Any, 
      js.Promise[T]
    ]
  ): js.Promise[T] = js.native
}

