package typings
package atFirebaseFirestoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_App extends js.Object {
  var Blob: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Blob] = js.native
  var CollectionReference: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.CollectionReference] = js.native
  var DocumentReference: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.DocumentReference] = js.native
  var DocumentSnapshot: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.DocumentSnapshot] = js.native
  var FieldPath: ScalablyTyped.runtime.Instantiable1[
    /* fieldNames (repeated) */ java.lang.String, 
    atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.FieldPath
  ] = js.native
  var FieldValue: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.FieldValue] = js.native
  var Firestore: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.FirebaseFirestore] = js.native
  var GeoPoint: ScalablyTyped.runtime.Instantiable2[
    /* latitude */ scala.Double, 
    /* longitude */ scala.Double, 
    atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.GeoPoint
  ] = js.native
  var Query: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Query] = js.native
  var QuerySnapshot: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.QuerySnapshot] = js.native
  var Timestamp: ScalablyTyped.runtime.Instantiable2[
    /* seconds */ scala.Double, 
    /* nanoseconds */ scala.Double, 
    atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Timestamp
  ] = js.native
  var Transaction: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.Transaction] = js.native
  var WriteBatch: ScalablyTyped.runtime.Instantiable0[atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.WriteBatch] = js.native
  var setLogLevel: js.Function1[
    /* logLevel */ atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.LogLevel, 
    scala.Unit
  ] = js.native
  def apply(): atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.FirebaseFirestore = js.native
  def apply(app: atFirebaseFirestoreLib.firestoreMod.appDashTypesMod.FirebaseApp): atFirebaseFirestoreDashTypesLib.firestoreDashTypesMod.FirebaseFirestore = js.native
}

