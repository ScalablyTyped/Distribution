package typings
package firebaseDashAdminLib.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin")
@js.native
object ^ extends js.Object {
  var SDK_VERSION: java.lang.String = js.native
  var apps: js.Array[firebaseDashAdminLib.adminNs.appNs.App | scala.Null] = js.native
  def app(): firebaseDashAdminLib.adminNs.appNs.App = js.native
  def app(name: java.lang.String): firebaseDashAdminLib.adminNs.appNs.App = js.native
  /**
    * Gets the {@link admin.auth.Auth `Auth`} service for the default app or a
    * given app.
    *
    * `admin.auth()` can be called with no arguments to access the default app's
    * {@link admin.auth.Auth `Auth`} service or as `admin.auth(app)` to access the
    * {@link admin.auth.Auth `Auth`} service associated with a specific app.
    *
    * @example
    * ```javascript
    * // Get the Auth service for the default app
    * var defaultAuth = admin.auth();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Auth service for a given app
    * var otherAuth = admin.auth(otherApp);
    * ```
    *
    */
  def auth(): firebaseDashAdminLib.adminNs.authNs.Auth = js.native
  def auth(app: firebaseDashAdminLib.adminNs.appNs.App): firebaseDashAdminLib.adminNs.authNs.Auth = js.native
  /**
    * Gets the {@link admin.database.Database `Database`} service for the default
    * app or a given app.
    *
    * `admin.database()` can be called with no arguments to access the default
    * app's {@link admin.database.Database `Database`} service or as
    * `admin.database(app)` to access the
    * {@link admin.database.Database `Database`} service associated with a specific
    * app.
    *
    * `admin.database` is also a namespace that can be used to access global
    * constants and methods associated with the `Database` service.
    *
    * @example
    * ```javascript
    * // Get the Database service for the default app
    * var defaultDatabase = admin.database();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Database service for a specific app
    * var otherDatabase = admin.database(app);
    * ```
    *
    * @param App whose `Database` service to
    *   return. If not provided, the default `Database` service will be returned.
    *
    * @return The default `Database` service if no app
    *   is provided or the `Database` service associated with the provided app.
    */
  def database(): firebaseDashAdminLib.adminNs.databaseNs.Database = js.native
  def database(app: firebaseDashAdminLib.adminNs.appNs.App): firebaseDashAdminLib.adminNs.databaseNs.Database = js.native
  /**
    *
    * @param app A Firebase App instance
    * @returns A [Firestore](https://cloud.google.com/nodejs/docs/reference/firestore/latest/Firestore)
    * instance as defined in the `@google-cloud/firestore` package.
    */
  def firestore(): firebaseDashAdminLib.adminNs.firestoreNs.Firestore = js.native
  def firestore(app: firebaseDashAdminLib.adminNs.appNs.App): firebaseDashAdminLib.adminNs.firestoreNs.Firestore = js.native
  def initializeApp(): firebaseDashAdminLib.adminNs.appNs.App = js.native
  def initializeApp(options: AppOptions): firebaseDashAdminLib.adminNs.appNs.App = js.native
  def initializeApp(options: AppOptions, name: java.lang.String): firebaseDashAdminLib.adminNs.appNs.App = js.native
  /**
    * Gets the {@link admin.instanceId.InstanceId `InstanceId`} service for the
    * default app or a given app.
    *
    * `admin.instanceId()` can be called with no arguments to access the default
    * app's {@link admin.instanceId.InstanceId `InstanceId`} service or as
    * `admin.instanceId(app)` to access the
    * {@link admin.instanceId.InstanceId `InstanceId`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    * // Get the Instance ID service for the default app
    * var defaultInstanceId = admin.instanceId();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Instance ID service for a given app
    * var otherInstanceId = admin.instanceId(otherApp);
    *```
    *
    * @param app Optional app whose `InstanceId` service to
    *   return. If not provided, the default `InstanceId` service will be
    *   returned.
    *
    * @return The default `InstanceId` service if
    *   no app is provided or the `InstanceId` service associated with the
    *   provided app.
    */
  def instanceId(): firebaseDashAdminLib.adminNs.instanceIdNs.InstanceId = js.native
  def instanceId(app: firebaseDashAdminLib.adminNs.appNs.App): firebaseDashAdminLib.adminNs.instanceIdNs.InstanceId = js.native
  /**
    * Gets the {@link admin.messaging.Messaging `Messaging`} service for the
    * default app or a given app.
    *
    * `admin.messaging()` can be called with no arguments to access the default
    * app's {@link admin.messaging.Messaging `Messaging`} service or as
    * `admin.messaging(app)` to access the
    * {@link admin.messaging.Messaging `Messaging`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    * // Get the Messaging service for the default app
    * var defaultMessaging = admin.messaging();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Messaging service for a given app
    * var otherMessaging = admin.messaging(otherApp);
    * ```
    *
    * @param app Optional app whose `Messaging` service to
    *   return. If not provided, the default `Messaging` service will be returned.
    *
    * @return The default `Messaging` service if no
    *   app is provided or the `Messaging` service associated with the provided
    *   app.
    */
  def messaging(): firebaseDashAdminLib.adminNs.messagingNs.Messaging = js.native
  def messaging(app: firebaseDashAdminLib.adminNs.appNs.App): firebaseDashAdminLib.adminNs.messagingNs.Messaging = js.native
  /**
    * Gets the {@link admin.projectManagement.ProjectManagement
    * `ProjectManagement`} service for the default app or a given app.
    *
    * `admin.projectManagement()` can be called with no arguments to access the
    * default app's {@link admin.projectManagement.ProjectManagement
    * `ProjectManagement`} service, or as `admin.projectManagement(app)` to access
    * the {@link admin.projectManagement.ProjectManagement `ProjectManagement`}
    * service associated with a specific app.
    *
    * @example
    * ```javascript
    * // Get the ProjectManagement service for the default app
    * var defaultProjectManagement = admin.projectManagement();
    * ```
    *
    * @example
    * ```javascript
    * // Get the ProjectManagement service for a given app
    * var otherProjectManagement = admin.projectManagement(otherApp);
    * ```
    *
    * @param app Optional app whose `ProjectManagement` service
    *     to return. If not provided, the default `ProjectManagement` service will
    *     be returned. *
    * @return The default `ProjectManagement` service if no app is provided or the
    *   `ProjectManagement` service associated with the provided app.
    */
  def projectManagement(): firebaseDashAdminLib.adminNs.projectManagementNs.ProjectManagement = js.native
  def projectManagement(app: firebaseDashAdminLib.adminNs.appNs.App): firebaseDashAdminLib.adminNs.projectManagementNs.ProjectManagement = js.native
  /**
    * Gets the {@link admin.storage.Storage `Storage`} service for the
    * default app or a given app.
    *
    * `admin.storage()` can be called with no arguments to access the default
    * app's {@link admin.storage.Storage `Storage`} service or as
    * `admin.storage(app)` to access the
    * {@link admin.storage.Storage `Storage`} service associated with a
    * specific app.
    *
    * @example
    * ```javascript
    * // Get the Storage service for the default app
    * var defaultStorage = admin.storage();
    * ```
    *
    * @example
    * ```javascript
    * // Get the Storage service for a given app
    * var otherStorage = admin.storage(otherApp);
    * ```
    */
  def storage(): firebaseDashAdminLib.adminNs.storageNs.Storage = js.native
  def storage(app: firebaseDashAdminLib.adminNs.appNs.App): firebaseDashAdminLib.adminNs.storageNs.Storage = js.native
}

