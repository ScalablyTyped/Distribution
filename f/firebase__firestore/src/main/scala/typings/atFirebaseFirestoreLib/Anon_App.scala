package typings
package atFirebaseFirestoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_App extends js.Object {
  var Blob: Anon_Array = js.native
  var CollectionReference: org.scalablytyped.runtime.Instantiable0[
    atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.CollectionReference
  ] = js.native
  var DocumentReference: org.scalablytyped.runtime.Instantiable0[
    atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.DocumentReference
  ] = js.native
  var DocumentSnapshot: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.DocumentSnapshot] = js.native
  var FieldPath: Anon_DocumentId = js.native
  var FieldValue: Anon_ArrayRemove = js.native
  var Firestore: org.scalablytyped.runtime.Instantiable0[
    atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FirebaseFirestore
  ] = js.native
  var GeoPoint: org.scalablytyped.runtime.Instantiable2[
    /* latitude */ scala.Double, 
    /* longitude */ scala.Double, 
    atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.GeoPoint
  ] = js.native
  var Query: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.Query] = js.native
  var QuerySnapshot: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.QuerySnapshot] = js.native
  var Timestamp: Anon_Date = js.native
  var Transaction: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.Transaction] = js.native
  var WriteBatch: org.scalablytyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.WriteBatch] = js.native
  @JSName("setLogLevel")
  var setLogLevel_Original: js.Function1[
    /* logLevel */ atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.LogLevel, 
    scala.Unit
  ] = js.native
  def apply(): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FirebaseFirestore = js.native
  def apply(app: atFirebaseFirestoreLib.atFirebaseFirestoreMod.atFirebaseAppDashTypesMod.FirebaseApp): atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.FirebaseFirestore = js.native
  def setLogLevel(logLevel: atFirebaseFirestoreDashTypesLib.atFirebaseFirestoreDashTypesMod.LogLevel): scala.Unit = js.native
}

