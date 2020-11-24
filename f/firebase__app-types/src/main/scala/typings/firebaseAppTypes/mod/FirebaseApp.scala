package typings.firebaseAppTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/app-types", "FirebaseApp")
@js.native
class FirebaseApp () extends js.Object {
  
  /**
    * The settable config flag for GDPR opt-in/opt-out
    */
  var automaticDataCollectionEnabled: Boolean = js.native
  
  /**
    * Make the given App unusable and free resources.
    */
  def delete(): js.Promise[Unit] = js.native
  
  /**
    * The (read-only) name (identifier) for this App. '[DEFAULT]' is the default
    * App.
    */
  var name: String = js.native
  
  /**
    * The (read-only) configuration options from the app initialization.
    */
  var options: FirebaseOptions = js.native
}
