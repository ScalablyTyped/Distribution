package typings.firebaseFirestoreTypes.mod

import typings.firebaseFirestoreTypes.anon.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore-types", "Query")
@js.native
class Query[T] protected () extends js.Object {
  
  def endAt(fieldValues: js.Any*): Query[T] = js.native
  def endAt(snapshot: DocumentSnapshot[_]): Query[T] = js.native
  
  def endBefore(fieldValues: js.Any*): Query[T] = js.native
  def endBefore(snapshot: DocumentSnapshot[_]): Query[T] = js.native
  
  val firestore: FirebaseFirestore = js.native
  
  def get(): js.Promise[QuerySnapshot[T]] = js.native
  def get(options: GetOptions): js.Promise[QuerySnapshot[T]] = js.native
  
  def isEqual(other: Query[T]): Boolean = js.native
  
  def limit(limit: Double): Query[T] = js.native
  
  def limitToLast(limit: Double): Query[T] = js.native
  
  def onSnapshot(observer: Next[T]): js.Function0[Unit] = js.native
  def onSnapshot(onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ FirestoreError, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, observer: Next[T]): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
    onError: js.UndefOr[scala.Nothing],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ FirestoreError, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ QuerySnapshot[T], Unit],
    onError: js.Function1[/* error */ FirestoreError, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  
  def orderBy(fieldPath: String): Query[T] = js.native
  def orderBy(fieldPath: String, directionStr: OrderByDirection): Query[T] = js.native
  def orderBy(fieldPath: FieldPath): Query[T] = js.native
  def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): Query[T] = js.native
  
  def startAfter(fieldValues: js.Any*): Query[T] = js.native
  def startAfter(snapshot: DocumentSnapshot[_]): Query[T] = js.native
  
  def startAt(fieldValues: js.Any*): Query[T] = js.native
  def startAt(snapshot: DocumentSnapshot[_]): Query[T] = js.native
  
  def where(fieldPath: String, opStr: WhereFilterOp, value: js.Any): Query[T] = js.native
  def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: js.Any): Query[T] = js.native
  
  def withConverter[U](converter: FirestoreDataConverter[U]): Query[U] = js.native
}
