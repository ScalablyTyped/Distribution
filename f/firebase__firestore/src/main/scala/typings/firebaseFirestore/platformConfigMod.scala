package typings.firebaseFirestore

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.apiDatabaseMod.Firestore
import typings.firebaseFirestore.mod.FirebaseApp
import typings.firebaseFirestore.mod.FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/platform/config", JSImport.Namespace)
@js.native
object platformConfigMod extends js.Object {
  def configureForFirebase(
    firebase: FirebaseNamespace,
    firestoreFactory: js.Function2[/* app */ FirebaseApp, /* auth */ Provider[FirebaseAuthInternalName], Firestore]
  ): Unit = js.native
}

