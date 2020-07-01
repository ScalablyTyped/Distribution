package typings.firebaseFirestore.apiDatabaseMod

import typings.firebaseFirestore.apiFieldPathMod.FieldPath
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.observerMod.CompleteFn
import typings.firebaseFirestore.observerMod.ErrorFn
import typings.firebaseFirestore.observerMod.NextFn
import typings.firebaseFirestore.observerMod.PartialObserver
import typings.firebaseFirestore.observerMod.Unsubscribe
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.userDataReaderMod.DocumentKeyReference
import typings.firebaseFirestoreTypes.anon.Error
import typings.firebaseFirestoreTypes.anon.Next
import typings.firebaseFirestoreTypes.mod.DocumentData
import typings.firebaseFirestoreTypes.mod.FirebaseFirestore
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typings.firebaseFirestoreTypes.mod.GetOptions
import typings.firebaseFirestoreTypes.mod.SetOptions
import typings.firebaseFirestoreTypes.mod.SnapshotListenOptions
import typings.firebaseFirestoreTypes.mod.UpdateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.firebaseFirestoreTypes.mod.DocumentReference because Inheritance from two classes. Inlined firestore, id, parent, path, collection, delete, get, get, isEqual, onSnapshot, onSnapshot, onSnapshot, onSnapshot, onSnapshot, onSnapshot, onSnapshot, onSnapshot, set, set, update, update, update, withConverter */ @JSImport("@firebase/firestore/dist/packages/firestore/src/api/database", "DocumentReference")
@js.native
class DocumentReference[T] protected () extends DocumentKeyReference[T] {
  def this(_key: DocumentKey, firestore: Firestore) = this()
  def this(_key: DocumentKey, firestore: Firestore, _converter: FirestoreDataConverter[T]) = this()
  @JSName("_converter")
  val _converter_DocumentReference: FirestoreDataConverter[T] | Null = js.native
  var _firestoreClient: js.Any = js.native
  val firestore: FirebaseFirestore | Firestore = js.native
  var getViaSnapshotListener: js.Any = js.native
  @JSName("id")
  val id_FDocumentReference: String = js.native
  var onSnapshotInternal: js.Any = js.native
  @JSName("parent")
  val parent_FDocumentReference: typings.firebaseFirestoreTypes.mod.CollectionReference[T] = js.native
  @JSName("path")
  val path_FDocumentReference: String = js.native
  def collection(pathString: String): typings.firebaseFirestoreTypes.mod.CollectionReference[DocumentData] = js.native
  def delete(): js.Promise[Unit] = js.native
  def get(): js.Promise[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]] = js.native
  def get(options: GetOptions): js.Promise[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]] = js.native
  def id: String = js.native
  def isEqual(other: typings.firebaseFirestoreTypes.mod.DocumentReference[T]): Boolean = js.native
  def onSnapshot(observer: PartialObserver[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]]): Unsubscribe = js.native
  def onSnapshot(observer: Error[T]): js.Function0[Unit] = js.native
  def onSnapshot(onNext: NextFn[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]]): Unsubscribe = js.native
  def onSnapshot(onNext: NextFn[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]], onError: ErrorFn): Unsubscribe = js.native
  def onSnapshot(
    onNext: NextFn[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]],
    onError: ErrorFn,
    onCompletion: CompleteFn
  ): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    observer: PartialObserver[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]]
  ): Unsubscribe = js.native
  def onSnapshot(options: SnapshotListenOptions, observer: Next[T]): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: NextFn[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]]
  ): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: NextFn[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]],
    onError: ErrorFn
  ): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: NextFn[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T]],
    onError: ErrorFn,
    onCompletion: CompleteFn
  ): Unsubscribe = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T], Unit]): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.std.Error, Unit]
  ): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.std.Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T], Unit]
  ): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.std.Error, Unit]
  ): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.DocumentSnapshot[T], Unit],
    onError: js.Function1[/* error */ typings.std.Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def parent: typings.firebaseFirestoreTypes.mod.CollectionReference[T] = js.native
  def path: String = js.native
  def set(data: T): js.Promise[Unit] = js.native
  def set(data: T, options: SetOptions): js.Promise[Unit] = js.native
  def set(value: DocumentData): js.Promise[Unit] = js.native
  def set(value: DocumentData, options: SetOptions): js.Promise[Unit] = js.native
  def update(field: String, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  def update(field: FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  def update(field: typings.firebaseFirestoreTypes.mod.FieldPath, value: js.Any, moreFieldsAndValues: js.Any*): js.Promise[Unit] = js.native
  def update(value: UpdateData): js.Promise[Unit] = js.native
  def withConverter[U](converter: FirestoreDataConverter[U]): typings.firebaseFirestoreTypes.mod.DocumentReference[U] = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/api/database", "DocumentReference")
@js.native
object DocumentReference extends js.Object {
  def forPath[U](path: ResourcePath, firestore: Firestore): DocumentReference[U] = js.native
  def forPath[U](path: ResourcePath, firestore: Firestore, converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
}

