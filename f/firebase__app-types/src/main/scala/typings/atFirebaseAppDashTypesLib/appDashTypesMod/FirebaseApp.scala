package typings
package atFirebaseAppDashTypesLib.appDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/app-types", "FirebaseApp")
@js.native
class FirebaseApp () extends js.Object {
  /**
    * The settable config flag for GDPR opt-in/opt-out
    */
  var automaticDataCollectionEnabled: scala.Boolean = js.native
  /**
    * The (read-only) name (identifier) for this App. '[DEFAULT]' is the default
    * App.
    */
  var name: java.lang.String = js.native
  /**
    * The (read-only) configuration options from the app initialization.
    */
  var options: FirebaseOptions = js.native
  /**
    * Make the given App unusable and free resources.
    */
  def delete(): js.Promise[scala.Unit] = js.native
}

