package typings.firebaseFirestore.distFirestoreSrcApiMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.distFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distFirestoreSrcAuthUserMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/src/api", "Firestore")
@js.native
open class Firestore protected ()
  extends typings.firebaseFirestore.distFirestoreSrcApiDatabaseMod.Firestore {
  /** @hideconstructor */
  def this(
    authCredentialsProvider: CredentialsProvider[User],
    appCheckCredentialsProvider: CredentialsProvider[String],
    databaseId: typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId
  ) = this()
  def this(
    authCredentialsProvider: CredentialsProvider[User],
    appCheckCredentialsProvider: CredentialsProvider[String],
    databaseId: typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId,
    app: FirebaseApp
  ) = this()
}
