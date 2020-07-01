package typings.firebaseFirestore.writeBatchMod

import typings.firebaseFirestore.databaseMod.Firestore
import typings.firebaseFirestore.userDataReaderMod.DocumentKeyReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/src/api/write_batch", "validateReference")
@js.native
object validateReference extends js.Object {
  def apply[T](
    documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any,
    firestore: Firestore
  ): DocumentKeyReference[T] = js.native
}

