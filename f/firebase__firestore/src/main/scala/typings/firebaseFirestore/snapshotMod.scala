package typings.firebaseFirestore

import typings.firebaseFirestore.databaseMod.Firestore
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.pathMod.FieldPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/src/api/snapshot", JSImport.Namespace)
@js.native
object snapshotMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentSnapshot<T> * / any */ @js.native
  class DocumentSnapshot[T] protected () extends js.Object {
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
    var _converter: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any) | Null = js.native
    var _document: Document | Null = js.native
    var _firestore: Firestore = js.native
    var _key: DocumentKey = js.native
    def data(): js.UndefOr[T] = js.native
    def exists(): /* is / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.QueryDocumentSnapshot<T> * / any */ Boolean = js.native
    def get(fieldPath: String): js.Any = js.native
    def get(
      fieldPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FieldPath */ js.Any
    ): js.Any = js.native
    def id: String = js.native
    def ref: js.Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.QueryDocumentSnapshot<T> * / any */ @js.native
  class QueryDocumentSnapshot[T] () extends DocumentSnapshot[T]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.QuerySnapshot<T> * / any */ @js.native
  class QuerySnapshot[T] protected () extends js.Object {
    def this(
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Query<T> */ js.Any,
      _docs: js.Array[QueryDocumentSnapshot[T]]
    ) = this()
    val _docs: js.Array[QueryDocumentSnapshot[T]] = js.native
    val query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Query<T> */ js.Any = js.native
    def docs: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.QueryDocumentSnapshot<T> */ _
      ] = js.native
    def empty: Boolean = js.native
    def forEach(
      callback: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.QueryDocumentSnapshot<T> */ /* result */ js.Any, 
          Unit
        ]
    ): Unit = js.native
    def forEach(
      callback: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.QueryDocumentSnapshot<T> */ /* result */ js.Any, 
          Unit
        ],
      thisArg: js.Any
    ): Unit = js.native
    def size: Double = js.native
  }
  
  def fieldPathFromArgument(methodName: String, arg: String): FieldPath = js.native
  def fieldPathFromArgument(
    methodName: String,
    arg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FieldPath */ js.Any
  ): FieldPath = js.native
  def snapshotEqual[T](
    left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentSnapshot<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.QuerySnapshot<T> */ js.Any,
    right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentSnapshot<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.QuerySnapshot<T> */ js.Any
  ): Boolean = js.native
}

