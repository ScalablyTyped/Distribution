package typings.firebase.mod

import typings.firebase.mod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "initializeApp")
@js.native
object initializeApp extends js.Object {
  /**
    * Creates and initializes a Firebase {@link firebase.app.App app} instance.
    *
    * See
    * {@link
    *   https://firebase.google.com/docs/web/setup#add_firebase_to_your_app
    *   Add Firebase to your app} and
    * {@link
    *   https://firebase.google.com/docs/web/setup#multiple-projects
    *   Initialize multiple projects} for detailed documentation.
    *
    * @example
    * ```javascript
    *
    * // Initialize default app
    * // Retrieve your own options values by adding a web app on
    * // https://console.firebase.google.com
    * firebase.initializeApp({
    *   apiKey: "AIza....",                             // Auth / General Use
    *   applicationId: "1:27992087142:web:ce....",      // General Use
    *   projectId: "my-firebase-project",               // General Use
    *   authDomain: "YOUR_APP.firebaseapp.com",         // Auth with popup/redirect
    *   databaseURL: "https://YOUR_APP.firebaseio.com", // Realtime Database
    *   storageBucket: "YOUR_APP.appspot.com",          // Storage
    *   messagingSenderId: "123456789"                  // Cloud Messaging
    * });
    * ```
    *
    * @example
    * ```javascript
    *
    * // Initialize another app
    * var otherApp = firebase.initializeApp({
    *   apiKey: "AIza....",
    *   applicationId: "1:27992087142:web:ce....",
    *   projectId: "my-firebase-project",
    *   databaseURL: "https://<OTHER_DATABASE_NAME>.firebaseio.com",
    *   storageBucket: "<OTHER_STORAGE_BUCKET>.appspot.com"
    * }, "nameOfOtherApp");
    * ```
    *
    * @param options Options to configure the app's services.
    * @param name Optional name of the app to initialize. If no name
    *   is provided, the default is `"[DEFAULT]"`.
    *
    * @return {!firebase.app.App} The initialized app.
    */
  def apply(options: js.Object): App = js.native
  def apply(options: js.Object, name: String): App = js.native
}

