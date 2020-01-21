package typings.firebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.firebaseFirestore.libMod.firebaseAppTypesAugmentingMod.FirebaseApp
import typings.firebaseFirestoreTypes.mod.FirebaseFirestore
import typings.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppBlobCollectionReference extends js.Object {
  var Blob: TypeofClassBlob = js.native
  var CollectionReference: Instantiable0[typings.firebaseFirestoreTypes.mod.CollectionReference[js.Object]] = js.native
  var DocumentReference: Instantiable0[typings.firebaseFirestoreTypes.mod.DocumentReference[js.Object]] = js.native
  var DocumentSnapshot: Instantiable0[typings.firebaseFirestoreTypes.mod.DocumentSnapshot[js.Object]] = js.native
  var FieldPath: TypeofClassFieldPath = js.native
  var FieldValue: TypeofClassFieldValue = js.native
  var Firestore: Instantiable0[FirebaseFirestore] = js.native
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typings.firebaseFirestoreTypes.mod.GeoPoint
  ] = js.native
  var Query: Instantiable0[typings.firebaseFirestoreTypes.mod.Query[js.Object]] = js.native
  var QueryDocumentSnapshot: Instantiable0[typings.firebaseFirestoreTypes.mod.QueryDocumentSnapshot[js.Object]] = js.native
  var QuerySnapshot: Instantiable0[typings.firebaseFirestoreTypes.mod.QuerySnapshot[js.Object]] = js.native
  var Timestamp: TypeofClassTimestamp = js.native
  var Transaction: Instantiable0[typings.firebaseFirestoreTypes.mod.Transaction] = js.native
  var WriteBatch: Instantiable0[typings.firebaseFirestoreTypes.mod.WriteBatch] = js.native
  @JSName("setLogLevel")
  var setLogLevel_Original: js.Function1[/* logLevel */ LogLevel, Unit] = js.native
  def apply(): FirebaseFirestore = js.native
  def apply(app: FirebaseApp): FirebaseFirestore = js.native
  def setLogLevel(logLevel: LogLevel): Unit = js.native
}

