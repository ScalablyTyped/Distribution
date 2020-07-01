package typings.firebaseFirestore.indexDotnodeMod

import typings.firebaseFirestore.databaseMod.Firestore
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/index.node", "DocumentSnapshot")
@js.native
class DocumentSnapshot[T] protected ()
  extends typings.firebaseFirestore.snapshotMod.DocumentSnapshot[T] {
  def this(_firestore: Firestore, _key: DocumentKey) = this()
  def this(_firestore: Firestore, _key: DocumentKey, _document: Document) = this()
  def this(
    _firestore: Firestore,
    _key: DocumentKey,
    _document: Null,
    _converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any
  ) = this()
  def this(
    _firestore: Firestore,
    _key: DocumentKey,
    _document: Document,
    _converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any
  ) = this()
}

