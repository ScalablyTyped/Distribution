package typings.firebaseFirestore.apiDatabaseMod

import org.scalablytyped.runtime.Instantiable2
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.mod.FirebaseApp
import typings.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "PublicFirestore")
@js.native
class PublicFirestore protected () extends Firestore {
  def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
}

@JSImport("@firebase/firestore/dist/src/api/database", "PublicFirestore")
@js.native
object PublicFirestore extends Instantiable2[
      (/* databaseIdOrApp */ FirebaseApp) | (/* databaseIdOrApp */ FirestoreDatabase), 
      /* authProvider */ Provider[FirebaseAuthInternalName], 
      Firestore
    ] {
  var databaseIdFromApp: js.Any = js.native
  def logLevel(): LogLevel = js.native
  def setLogLevel(level: LogLevel): Unit = js.native
}

