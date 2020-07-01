package typings.firebaseFirestore.apiDatabaseMod

import typings.firebaseFirestore.observerMod.CompleteFn
import typings.firebaseFirestore.observerMod.ErrorFn
import typings.firebaseFirestore.observerMod.NextFn
import typings.firebaseFirestore.observerMod.PartialObserver
import typings.firebaseFirestore.observerMod.Unsubscribe
import typings.firebaseFirestoreTypes.anon.CompleteError
import typings.firebaseFirestoreTypes.mod.FieldPath
import typings.firebaseFirestoreTypes.mod.FirebaseFirestore
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typings.firebaseFirestoreTypes.mod.GetOptions
import typings.firebaseFirestoreTypes.mod.OrderByDirection
import typings.firebaseFirestoreTypes.mod.SnapshotListenOptions
import typings.firebaseFirestoreTypes.mod.WhereFilterOp
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.firebaseFirestoreTypes.mod.Query because Inheritance from two classes. Inlined firestore, endAt, endAt, endBefore, endBefore, get, get, isEqual, limit, limitToLast, onSnapshot, onSnapshot, onSnapshot, onSnapshot, onSnapshot, onSnapshot, onSnapshot, onSnapshot, orderBy, orderBy, orderBy, orderBy, startAfter, startAfter, startAt, startAt, where, where, withConverter */ @JSImport("@firebase/firestore/dist/packages/firestore/src/api/database", "Query")
@js.native
class Query[T] protected () extends BaseQuery {
  def this(_query: typings.firebaseFirestore.queryMod.Query, firestore: Firestore) = this()
  def this(
    _query: typings.firebaseFirestore.queryMod.Query,
    firestore: Firestore,
    _converter: FirestoreDataConverter[T]
  ) = this()
  val _converter: FirestoreDataConverter[T] | Null = js.native
  /** Helper function to create a bound from a document or fields */
  var boundFromDocOrFields: js.Any = js.native
  val firestore: FirebaseFirestore | Firestore = js.native
  var getViaSnapshotListener: js.Any = js.native
  var onSnapshotInternal: js.Any = js.native
  def endAt(docOrField: js.Any, fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endAt(docOrField: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endAt(fieldValues: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endAt(snapshot: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_]): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endBefore(docOrField: js.Any, fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endBefore(docOrField: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endBefore(fieldValues: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def endBefore(snapshot: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_]): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def get(): js.Promise[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]] = js.native
  def get(options: GetOptions): js.Promise[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]] = js.native
  def isEqual(other: typings.firebaseFirestoreTypes.mod.Query[T]): Boolean = js.native
  def limit(n: Double): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def limitToLast(n: Double): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def onSnapshot(observer: PartialObserver[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]]): Unsubscribe = js.native
  def onSnapshot(observer: CompleteError[T]): js.Function0[Unit] = js.native
  def onSnapshot(onNext: NextFn[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]]): Unsubscribe = js.native
  def onSnapshot(onNext: NextFn[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]], onError: ErrorFn): Unsubscribe = js.native
  def onSnapshot(
    onNext: NextFn[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]],
    onError: ErrorFn,
    onCompletion: CompleteFn
  ): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    observer: PartialObserver[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]]
  ): Unsubscribe = js.native
  def onSnapshot(options: SnapshotListenOptions, observer: CompleteError[T]): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: NextFn[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]]
  ): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: NextFn[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]],
    onError: ErrorFn
  ): Unsubscribe = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: NextFn[typings.firebaseFirestoreTypes.mod.QuerySnapshot[T]],
    onError: ErrorFn,
    onCompletion: CompleteFn
  ): Unsubscribe = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.QuerySnapshot[T], Unit]): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.QuerySnapshot[T], Unit]
  ): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): js.Function0[Unit] = js.native
  @JSName("onSnapshot")
  def onSnapshot_Function0(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ typings.firebaseFirestoreTypes.mod.QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def orderBy(fieldPath: FieldPath): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def orderBy(field: String): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def orderBy(field: String, directionStr: OrderByDirection): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def orderBy(field: typings.firebaseFirestore.apiFieldPathMod.FieldPath): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def orderBy(field: typings.firebaseFirestore.apiFieldPathMod.FieldPath, directionStr: OrderByDirection): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAfter(docOrField: js.Any, fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAfter(docOrField: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAfter(fieldValues: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAfter(snapshot: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_]): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAt(docOrField: js.Any, fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAt(docOrField: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_], fields: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAt(fieldValues: js.Any*): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def startAt(snapshot: typings.firebaseFirestoreTypes.mod.DocumentSnapshot[_]): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: js.Any): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def where(field: String, opStr: WhereFilterOp, value: js.Any): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def where(field: typings.firebaseFirestore.apiFieldPathMod.FieldPath, opStr: WhereFilterOp, value: js.Any): typings.firebaseFirestoreTypes.mod.Query[T] = js.native
  def withConverter[U](converter: FirestoreDataConverter[U]): typings.firebaseFirestoreTypes.mod.Query[U] = js.native
}

