package typings.atFirebaseFirestore.distSrcApiDatabaseMod

import org.scalablytyped.runtime.Instantiable2
import typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typings.atFirebaseAuthDashInteropDashTypes.atFirebaseAuthDashInteropDashTypesMod.FirebaseAuthInternalName
import typings.atFirebaseComponent.atFirebaseComponentMod.Provider
import typings.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/api/database", "PublicFirestore")
@js.native
class PublicFirestore protected () extends Firestore {
  def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
  def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
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

