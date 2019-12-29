package typings.atFirebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.atFirebaseFirestore.distIndexDotNodeMod.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirebaseFirestore
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AppBlob extends js.Object {
  var Blob: TypeofClassBlob = js.native
  var CollectionReference: Instantiable0[
    typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.CollectionReference[js.Object]
  ] = js.native
  var DocumentReference: Instantiable0[
    typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentReference[js.Object]
  ] = js.native
  var DocumentSnapshot: Instantiable0[
    typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentSnapshot[js.Object]
  ] = js.native
  var FieldPath: TypeofClassFieldPath = js.native
  var FieldValue: TypeofClassFieldValue = js.native
  var Firestore: Instantiable0[FirebaseFirestore] = js.native
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.GeoPoint
  ] = js.native
  var Query: Instantiable0[
    typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Query[js.Object]
  ] = js.native
  var QuerySnapshot: Instantiable0[
    typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.QuerySnapshot[js.Object]
  ] = js.native
  var Timestamp: TypeofClassTimestamp = js.native
  var Transaction: Instantiable0[typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.Transaction] = js.native
  var WriteBatch: Instantiable0[typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.WriteBatch] = js.native
  @JSName("setLogLevel")
  var setLogLevel_Original: js.Function1[/* logLevel */ LogLevel, Unit] = js.native
  def apply(): FirebaseFirestore = js.native
  def apply(app: FirebaseApp): FirebaseFirestore = js.native
  def setLogLevel(logLevel: LogLevel): Unit = js.native
}

