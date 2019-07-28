package typings.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod

import typings.atFirebaseAppDashTypes.Anon_App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseNamespace extends js.Object {
  // The current SDK version.
  var SDK_VERSION: String = js.native
  @JSName("app")
  var app_Original: Anon_App = js.native
  /**
    * A (read-only) array of all the initialized Apps.
    */
  var apps: js.Array[FirebaseApp] = js.native
  /**
    * Retrieve an instance of a FirebaseApp.
    *
    * Usage: firebase.app()
    *
    * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
    */
  def app(): FirebaseApp = js.native
  def app(name: String): FirebaseApp = js.native
  /**
    * Create (and initialize) a FirebaseApp.
    *
    * @param options Options to configure the services used in the App.
    * @param config The optional config for your firebase app
    */
  def initializeApp(options: FirebaseOptions): FirebaseApp = js.native
  def initializeApp(options: FirebaseOptions, config: FirebaseAppConfig): FirebaseApp = js.native
  def initializeApp(options: FirebaseOptions, name: String): FirebaseApp = js.native
}

