package typings.firebaseFirestore

import typings.firebaseFirestore.apiFieldPathMod.FieldPath
import typings.firebaseFirestore.databaseMod.Firestore
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/src/api/transaction", JSImport.Namespace)
@js.native
object transactionMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Transaction * / any */ @js.native
  class Transaction protected () extends js.Object {
    def this(_firestore: Firestore, _transaction: typings.firebaseFirestore.coreTransactionMod.Transaction) = this()
    val _dataReader: js.Any = js.native
    val _firestore: js.Any = js.native
    val _transaction: js.Any = js.native
    def delete(
      documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any
    ): Transaction = js.native
    def get[T](
      documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentSnapshot<T> */ _
      ] = js.native
    def set[T](
      documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any,
      value: T
    ): Transaction = js.native
    def set[T](
      documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any,
      value: Partial[T],
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.SetOptions */ js.Any
    ): Transaction = js.native
    def update(
      documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
      field: String,
      value: js.Any,
      moreFieldsAndValues: js.Any*
    ): Transaction = js.native
    def update(
      documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
      field: FieldPath,
      value: js.Any,
      moreFieldsAndValues: js.Any*
    ): Transaction = js.native
    def update(
      documentRef: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.UpdateData */ js.Any
    ): Transaction = js.native
  }
  
  def runTransaction[T](
    firestore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore */ js.Any,
    updateFunction: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Transaction */ /* transaction */ js.Any, 
      js.Promise[T]
    ]
  ): js.Promise[T] = js.native
}

