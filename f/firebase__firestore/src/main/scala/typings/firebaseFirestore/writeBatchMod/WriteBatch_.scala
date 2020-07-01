package typings.firebaseFirestore.writeBatchMod

import typings.firebaseFirestore.databaseMod.Firestore
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.WriteBatch * / any */ @JSImport("@firebase/firestore/dist/packages/firestore/lite/src/api/write_batch", "WriteBatch")
@js.native
class WriteBatch_ protected () extends js.Object {
  def this(_firestore: Firestore) = this()
  var _committed: js.Any = js.native
  val _dataReader: js.Any = js.native
  val _firestore: js.Any = js.native
  var _mutations: js.Any = js.native
  var verifyNotCommitted: js.Any = js.native
  def commit(): js.Promise[Unit] = js.native
  def delete(
    documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any
  ): WriteBatch_ = js.native
  def set[T](
    documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any,
    value: T
  ): WriteBatch_ = js.native
  def set[T](
    documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any,
    value: Partial[T],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.SetOptions */ js.Any
  ): WriteBatch_ = js.native
  def update(
    documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
    field: String,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): WriteBatch_ = js.native
  def update(
    documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
    field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FieldPath */ js.Any,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): WriteBatch_ = js.native
  def update(
    documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.UpdateData */ js.Any
  ): WriteBatch_ = js.native
}

