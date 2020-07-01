package typings.firebaseFirestore

import typings.firebaseFirestore.apiDatabaseMod.BaseQuery
import typings.firebaseFirestore.apiFieldPathMod.FieldPath
import typings.firebaseFirestore.databaseMod.Firestore
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.userDataReaderMod.DocumentKeyReference
import typings.firebaseFirestore.userDataReaderMod.UserDataReader
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/src/api/reference", JSImport.Namespace)
@js.native
object referenceMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference<T> * / any */ @js.native
  class CollectionReference[T] protected () extends Query[T] {
    def this(firestore: Firestore, _path: ResourcePath) = this()
    def this(
      firestore: Firestore,
      _path: ResourcePath,
      _converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any
    ) = this()
    val _path: ResourcePath = js.native
    def id: String = js.native
    def path: String = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> * / any */ @js.native
  class DocumentReference[T] protected () extends DocumentKeyReference[T] {
    def this(firestore: Firestore, key: DocumentKey) = this()
    def this(
      firestore: Firestore,
      key: DocumentKey,
      _converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any
    ) = this()
    @JSName("_converter")
    val _converter_DocumentReference: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any) | Null = js.native
    val firestore: Firestore = js.native
    def id: String = js.native
    def path: String = js.native
    def withConverter[U](
      converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<U> */ js.Any
    ): js.Any = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Query<T> * / any */ @js.native
  class Query[T] protected () extends BaseQuery {
    def this(firestore: Firestore, _query: typings.firebaseFirestore.queryMod.Query) = this()
    def this(
      firestore: Firestore,
      _query: typings.firebaseFirestore.queryMod.Query,
      _converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any
    ) = this()
    val _converter: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<T> */ js.Any) | Null = js.native
    /** Helper function to create a bound from a document or fields */
    var boundFromDocOrFields: js.Any = js.native
    val firestore: Firestore = js.native
    def endAt(docOrField: js.Any, fields: js.Any*): js.Any = js.native
    def endBefore(docOrField: js.Any, fields: js.Any*): js.Any = js.native
    def limit(n: Double): js.Any = js.native
    def limitToLast(n: Double): js.Any = js.native
    def orderBy(field: String): js.Any = js.native
    def orderBy(
      field: String,
      directionStr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.OrderByDirection */ js.Any
    ): js.Any = js.native
    def orderBy(field: FieldPath): js.Any = js.native
    def orderBy(
      field: FieldPath,
      directionStr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.OrderByDirection */ js.Any
    ): js.Any = js.native
    def startAfter(docOrField: js.Any, fields: js.Any*): js.Any = js.native
    def startAt(docOrField: js.Any, fields: js.Any*): js.Any = js.native
    def where(
      fieldPath: String,
      opStr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.WhereFilterOp */ js.Any,
      value: js.Any
    ): js.Any = js.native
    def where(
      fieldPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FieldPath */ js.Any,
      opStr: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.WhereFilterOp */ js.Any,
      value: js.Any
    ): js.Any = js.native
    def withConverter[U](
      converter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirestoreDataConverter<U> */ js.Any
    ): js.Any = js.native
  }
  
  def addDoc[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference<T> */ js.Any,
    data: T
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ _
  ] = js.native
  def collection(
    firestore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore */ js.Any,
    collectionPath: String
  ): CollectionReference[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentData */ _
  ] = js.native
  def collectionGroup(
    firestore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore */ js.Any,
    collectionId: String
  ): Query[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentData */ _
  ] = js.native
  def deleteDoc(
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference */ js.Any
  ): js.Promise[Unit] = js.native
  def doc(
    firestore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore */ js.Any,
    documentPath: String
  ): DocumentReference[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentData */ _
  ] = js.native
  def doc[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference<T> */ js.Any
  ): DocumentReference[T] = js.native
  @JSName("doc")
  def doc_T[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference<T> */ js.Any,
    documentPath: String
  ): DocumentReference[T] = js.native
  def getDoc[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentSnapshot<T> */ _
  ] = js.native
  def getQuery[T](
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Query<T> */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.QuerySnapshot<T> */ _
  ] = js.native
  def newUserDataReader(firestore: Firestore): UserDataReader = js.native
  def parent(
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference<unknown> */ js.Any
  ): (DocumentReference[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentData */ _
  ]) | Null = js.native
  @JSName("parent")
  def parent_T_CollectionReference[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any
  ): CollectionReference[T] = js.native
  def queryEqual[T](
    left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Query<T> */ js.Any,
    right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Query<T> */ js.Any
  ): Boolean = js.native
  def refEqual[T](
    left: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference<T> */ js.Any,
    right: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.CollectionReference<T> */ js.Any
  ): Boolean = js.native
  def setDoc[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any,
    data: T
  ): js.Promise[Unit] = js.native
  def setDoc[T](
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<T> */ js.Any,
    data: Partial[T],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.SetOptions */ js.Any
  ): js.Promise[Unit] = js.native
  def updateDoc(
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.UpdateData */ js.Any
  ): js.Promise[Unit] = js.native
  def updateDoc(
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
    field: String,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): js.Promise[Unit] = js.native
  def updateDoc(
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.DocumentReference<unknown> */ js.Any,
    field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FieldPath */ js.Any,
    value: js.Any,
    moreFieldsAndValues: js.Any*
  ): js.Promise[Unit] = js.native
}

