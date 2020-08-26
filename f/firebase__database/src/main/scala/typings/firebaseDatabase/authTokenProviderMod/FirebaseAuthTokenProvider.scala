package typings.firebaseDatabase.authTokenProviderMod

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/AuthTokenProvider", "FirebaseAuthTokenProvider")
@js.native
class FirebaseAuthTokenProvider protected () extends AuthTokenProvider {
  def this(app_ : FirebaseApp, authProvider_ : Provider[FirebaseAuthInternalName]) = this()
  var app_ : js.Any = js.native
  var authProvider_ : js.Any = js.native
  var auth_ : js.Any = js.native
}

