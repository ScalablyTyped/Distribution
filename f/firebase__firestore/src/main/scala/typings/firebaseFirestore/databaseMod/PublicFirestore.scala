package typings.firebaseFirestore.databaseMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.mod.FirebaseApp
import typings.firebaseFirestore.persistenceMod.PersistenceProvider
import typings.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/api/database", "PublicFirestore")
@js.native
class PublicFirestore protected () extends Firestore {
  def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
  def this(
    databaseIdOrApp: FirestoreDatabase,
    authProvider: Provider[FirebaseAuthInternalName],
    persistenceProvider: PersistenceProvider
  ) = this()
  def this(
    databaseIdOrApp: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    persistenceProvider: PersistenceProvider
  ) = this()
}

@JSImport("@firebase/firestore/dist/lib/src/api/database", "PublicFirestore")
@js.native
object PublicFirestore
  extends Instantiable2[
      (/* databaseIdOrApp */ FirebaseApp) | (/* databaseIdOrApp */ FirestoreDatabase), 
      /* authProvider */ Provider[FirebaseAuthInternalName], 
      Firestore
    ]
     with Instantiable3[
      (/* databaseIdOrApp */ FirebaseApp) | (/* databaseIdOrApp */ FirestoreDatabase), 
      /* authProvider */ Provider[FirebaseAuthInternalName], 
      /* persistenceProvider */ PersistenceProvider, 
      Firestore
    ] {
  var databaseIdFromApp: js.Any = js.native
  def logLevel(): LogLevel = js.native
  def setLogLevel(level: LogLevel): Unit = js.native
}

