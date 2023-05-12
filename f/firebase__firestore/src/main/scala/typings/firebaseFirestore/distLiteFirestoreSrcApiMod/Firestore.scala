package typings.firebaseFirestore.distLiteFirestoreSrcApiMod

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.CredentialsProvider
import typings.firebaseFirestore.distLiteFirestoreSrcAuthUserMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/api", "Firestore")
@js.native
open class Firestore protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcApiDatabaseMod.Firestore {
  /** @hideconstructor */
  def this(
    authCredentialsProvider: CredentialsProvider[User],
    appCheckCredentialsProvider: CredentialsProvider[String],
    databaseId: typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseId
  ) = this()
  def this(
    authCredentialsProvider: CredentialsProvider[User],
    appCheckCredentialsProvider: CredentialsProvider[String],
    databaseId: typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseId,
    app: FirebaseApp
  ) = this()
}
