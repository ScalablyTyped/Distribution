package typings
package firebaseDashAdminLib.adminNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Firebase app holds the initialization information for a collection of
  * services.
  *
  * Do not call this constructor directly. Instead, use
  * {@link
  *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
  *   `admin.initializeApp()`}
  * to create an app.
  */
@js.native
trait App extends js.Object {
  /**
    * The (read-only) name for this app.
    *
    * The default app's name is `"[DEFAULT]"`.
    *
    * @example
    * ```javascript
    * // The default app's name is "[DEFAULT]"
    * admin.initializeApp(defaultAppConfig);
    * console.log(admin.app().name);  // "[DEFAULT]"
    * ```
    *
    * @example
    * ```javascript
    * // A named app's name is what you provide to initializeApp()
    * var otherApp = admin.initializeApp(otherAppConfig, "other");
    * console.log(otherApp.name);  // "other"
    * ```
    */
  var name: java.lang.String = js.native
  /**
    * The (read-only) configuration options for this app. These are the original
    * parameters given in
    * {@link
    *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
    *   `admin.initializeApp()`}.
    *
    * @example
    * ```javascript
    * var app = admin.initializeApp(config);
    * console.log(app.options.credential === config.credential);  // true
    * console.log(app.options.databaseURL === config.databaseURL);  // true
    * ```
    */
  var options: firebaseDashAdminLib.adminNs.AppOptions = js.native
  def auth(): firebaseDashAdminLib.adminNs.authNs.Auth = js.native
  def database(): firebaseDashAdminLib.adminNs.databaseNs.Database = js.native
  def database(url: java.lang.String): firebaseDashAdminLib.adminNs.databaseNs.Database = js.native
  /**
    * Renders this local `FirebaseApp` unusable and frees the resources of
    * all associated services (though it does *not* clean up any backend
    * resources). When running the SDK locally, this method
    * must be called to ensure graceful termination of the process.
    *
    * @example
    * ```javascript
    * app.delete()
    *   .then(function() {
    *     console.log("App deleted successfully");
    *   })
    *   .catch(function(error) {
    *     console.log("Error deleting app:", error);
    *   });
    * ```
    */
  def delete(): js.Promise[scala.Unit] = js.native
  def firestore(): firebaseDashAdminLib.adminNs.firestoreNs.Firestore = js.native
  def instanceId(): firebaseDashAdminLib.adminNs.instanceIdNs.InstanceId = js.native
  def messaging(): firebaseDashAdminLib.adminNs.messagingNs.Messaging = js.native
  def projectManagement(): firebaseDashAdminLib.adminNs.projectManagementNs.ProjectManagement = js.native
  def storage(): firebaseDashAdminLib.adminNs.storageNs.Storage = js.native
}

