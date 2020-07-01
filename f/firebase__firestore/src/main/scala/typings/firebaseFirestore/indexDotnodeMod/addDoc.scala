package typings.firebaseFirestore.indexDotnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "addDoc")
@js.native
object addDoc extends js.Object {
  def apply[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference<T> */ js.Any,
    data: T
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ _
  ] = js.native
}

