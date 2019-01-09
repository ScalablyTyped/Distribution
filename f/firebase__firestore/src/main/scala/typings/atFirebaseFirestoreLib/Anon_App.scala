package typings
package atFirebaseFirestoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_App extends js.Object {
  var Blob: Anon_Array = js.native
  var CollectionReference: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.CollectionReference] = js.native
  var DocumentReference: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.DocumentReference] = js.native
  var DocumentSnapshot: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.DocumentSnapshot] = js.native
  var FieldPath: Anon_DocumentId = js.native
  var FieldValue: Anon_ArrayRemove = js.native
  var Firestore: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.FirebaseFirestore] = js.native
  var GeoPoint: org.scalablytyped.runtime.Instantiable2[
    /* latitude */ scala.Double, 
    /* longitude */ scala.Double, 
    atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.GeoPoint
  ] = js.native
  var Query: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Query] = js.native
  var QuerySnapshot: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.QuerySnapshot] = js.native
  var Timestamp: Anon_Date = js.native
  var Transaction: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Transaction] = js.native
  var WriteBatch: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.WriteBatch] = js.native
  @JSName("setLogLevel")
  var setLogLevel_Original: js.Function1[
    /* logLevel */ atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.LogLevel, 
    scala.Unit
  ] = js.native
  def apply(): atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.FirebaseFirestore = js.native
  def apply(app: atFirebaseFirestoreLib.firestoreMod.appDashTypesMod.FirebaseApp): atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.FirebaseFirestore = js.native
  def setLogLevel(logLevel: atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.LogLevel): scala.Unit = js.native
}

