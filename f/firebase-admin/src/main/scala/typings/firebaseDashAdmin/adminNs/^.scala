package typings.firebaseDashAdmin.adminNs

import typings.firebaseDashAdmin.adminNs.appNs.App
import typings.firebaseDashAdmin.adminNs.authNs.Auth
import typings.firebaseDashAdmin.adminNs.databaseNs.Database
import typings.firebaseDashAdmin.adminNs.firestoreNs.Firestore
import typings.firebaseDashAdmin.adminNs.instanceIdNs.InstanceId
import typings.firebaseDashAdmin.adminNs.messagingNs.Messaging
import typings.firebaseDashAdmin.adminNs.projectManagementNs.ProjectManagement
import typings.firebaseDashAdmin.adminNs.securityRulesNs.SecurityRules
import typings.firebaseDashAdmin.adminNs.storageNs.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("admin")
@js.native
object ^ extends js.Object {
  var SDK_VERSION: String = js.native
  var apps: js.Array[App | Null] = js.native
  def app(): App = js.native
  def app(name: String): App = js.native
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
  def auth(): Auth = js.native
  def auth(app: App): Auth = js.native
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
  def database(): Database = js.native
  def database(app: App): Database = js.native
  /**
    *
    * @param app A Firebase App instance
    * @returns A [Firestore](https://cloud.google.com/nodejs/docs/reference/firestore/latest/Firestore)
    * instance as defined in the `@google-cloud/firestore` package.
    */
  def firestore(): Firestore = js.native
  def firestore(app: App): Firestore = js.native
  def initializeApp(): App = js.native
  def initializeApp(options: AppOptions): App = js.native
  def initializeApp(options: AppOptions, name: String): App = js.native
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
  def instanceId(): InstanceId = js.native
  def instanceId(app: App): InstanceId = js.native
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
  def messaging(): Messaging = js.native
  def messaging(app: App): Messaging = js.native
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
  def projectManagement(): ProjectManagement = js.native
  def projectManagement(app: App): ProjectManagement = js.native
  /**
    * Gets the {@link admin.securityRules.SecurityRules
    * `SecurityRules`} service for the default app or a given app.
    *
    * `admin.securityRules()` can be called with no arguments to access the
    * default app's {@link admin.securityRules.SecurityRules
    * `SecurityRules`} service, or as `admin.securityRules(app)` to access
    * the {@link admin.securityRules.SecurityRules `SecurityRules`}
    * service associated with a specific app.
    *
    * @example
    * ```javascript
    * // Get the SecurityRules service for the default app
    * var defaultSecurityRules = admin.securityRules();
    * ```
    *
    * @example
    * ```javascript
    * // Get the SecurityRules service for a given app
    * var otherSecurityRules = admin.securityRules(otherApp);
    * ```
    *
    * @param app Optional app to return the `SecurityRules` service
    *     for. If not provided, the default `SecurityRules` service
    *     is returned.
    * @return The default `SecurityRules` service if no app is provided, or the
    *   `SecurityRules` service associated with the provided app.
    */
  def securityRules(): SecurityRules = js.native
  def securityRules(app: App): SecurityRules = js.native
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
  def storage(): Storage = js.native
  def storage(app: App): Storage = js.native
}

