package typings.firebaseFirestore.indexDotnodeMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "setDoc")
@js.native
object setDoc extends js.Object {
  def apply[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any,
    data: T
  ): js.Promise[Unit] = js.native
  def apply[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any,
    data: Partial[T],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.SetOptions */ js.Any
  ): js.Promise[Unit] = js.native
}

