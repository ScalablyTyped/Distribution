package typings.firebaseFirestore.indexDotnodeMod

import typings.firebaseFirestore.databaseMod.Firestore
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "DocumentReference")
@js.native
class DocumentReference[T] protected ()
  extends typings.firebaseFirestore.referenceMod.DocumentReference[T] {
  def this(firestore: Firestore, key: DocumentKey) = this()
  def this(
    firestore: Firestore,
    key: DocumentKey,
    _converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any
  ) = this()
}

