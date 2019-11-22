package typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import typings.atFirebaseFirestoreDashTypes.Anon_CompleteErrorNextSnapshot
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore-types", "Query")
@js.native
class Query protected () extends js.Object {
  val firestore: FirebaseFirestore = js.native
  def endAt(fieldValues: js.Any*): Query = js.native
  def endAt(snapshot: DocumentSnapshot): Query = js.native
  def endBefore(fieldValues: js.Any*): Query = js.native
  def endBefore(snapshot: DocumentSnapshot): Query = js.native
  def get(): js.Promise[QuerySnapshot] = js.native
  def get(options: GetOptions): js.Promise[QuerySnapshot] = js.native
  def isEqual(other: Query): Boolean = js.native
  def limit(limit: Double): Query = js.native
  def limitToLast(limit: Double): Query = js.native
  def onSnapshot(observer: Anon_CompleteErrorNextSnapshot): js.Function0[Unit] = js.native
  def onSnapshot(onNext: js.Function1[/* snapshot */ QuerySnapshot, Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ QuerySnapshot, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    onNext: js.Function1[/* snapshot */ QuerySnapshot, Unit],
    onError: js.Function1[/* error */ Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, observer: Anon_CompleteErrorNextSnapshot): js.Function0[Unit] = js.native
  def onSnapshot(options: SnapshotListenOptions, onNext: js.Function1[/* snapshot */ QuerySnapshot, Unit]): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ QuerySnapshot, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): js.Function0[Unit] = js.native
  def onSnapshot(
    options: SnapshotListenOptions,
    onNext: js.Function1[/* snapshot */ QuerySnapshot, Unit],
    onError: js.Function1[/* error */ Error, Unit],
    onCompletion: js.Function0[Unit]
  ): js.Function0[Unit] = js.native
  def orderBy(fieldPath: String): Query = js.native
  def orderBy(fieldPath: String, directionStr: OrderByDirection): Query = js.native
  def orderBy(fieldPath: FieldPath): Query = js.native
  def orderBy(fieldPath: FieldPath, directionStr: OrderByDirection): Query = js.native
  def startAfter(fieldValues: js.Any*): Query = js.native
  def startAfter(snapshot: DocumentSnapshot): Query = js.native
  def startAt(fieldValues: js.Any*): Query = js.native
  def startAt(snapshot: DocumentSnapshot): Query = js.native
  def where(fieldPath: String, opStr: WhereFilterOp, value: js.Any): Query = js.native
  def where(fieldPath: FieldPath, opStr: WhereFilterOp, value: js.Any): Query = js.native
}

