package typings.firebaseFirestore.indexDotnodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "doc")
@js.native
object doc extends js.Object {
  def apply(
    firestore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore */ js.Any,
    documentPath: String
  ): typings.firebaseFirestore.referenceMod.DocumentReference[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentData */ _
  ] = js.native
  def apply[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference<T> */ js.Any
  ): typings.firebaseFirestore.referenceMod.DocumentReference[T] = js.native
}

