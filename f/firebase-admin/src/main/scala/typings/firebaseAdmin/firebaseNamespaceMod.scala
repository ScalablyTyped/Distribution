package typings.firebaseAdmin

import typings.firebaseAdmin.authMod.auth.Auth
import typings.firebaseAdmin.credentialMod.ServiceAccount
import typings.firebaseAdmin.credentialMod.credential.Credential
import typings.firebaseAdmin.databaseMod.database.Database
import typings.firebaseAdmin.firebaseNamespaceApiMod.AppOptions
import typings.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typings.firebaseAdmin.instanceIdMod.instanceId.InstanceId
import typings.firebaseAdmin.machineLearningMod.machineLearning.MachineLearning
import typings.firebaseAdmin.messagingMod.messaging.Messaging
import typings.firebaseAdmin.projectManagementMod.projectManagement.ProjectManagement
import typings.firebaseAdmin.remoteConfigMod.remoteConfig.RemoteConfig
import typings.firebaseAdmin.securityRulesMod.securityRules.SecurityRules
import typings.firebaseAdmin.storageMod.storage.Storage
import typings.googleCloudFirestore.FirebaseFirestore.Settings
import typings.node.httpMod.Agent
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseNamespaceMod {
  
  @JSImport("firebase-admin/lib/firebase-namespace", "SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
  
  object app {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "app")
    @js.native
    def apply(): App = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "app")
    @js.native
    def apply(name: String): App = js.native
  }
  
  @JSImport("firebase-admin/lib/firebase-namespace", "apps")
  @js.native
  val apps: js.Array[App | Null] = js.native
  
  object auth {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "auth")
    @js.native
    def apply(): Auth = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "auth")
    @js.native
    def apply(app: App): Auth = js.native
  }
  
  object credential {
    
    /**
      * Returns a credential created from the
      * {@link
      *    https://developers.google.com/identity/protocols/application-default-credentials
      *    Google Application Default Credentials}
      * that grants admin access to Firebase services. This credential can be used
      * in the call to
      * {@link
      *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
      *  `admin.initializeApp()`}.
      *
      * Google Application Default Credentials are available on any Google
      * infrastructure, such as Google App Engine and Google Compute Engine.
      *
      * See
      * {@link
      *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
      *   Initialize the SDK}
      * for more details.
      *
      * @example
      * ```javascript
      * admin.initializeApp({
      *   credential: admin.credential.applicationDefault(),
      *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
      * });
      * ```
      *
      * @param {!Object=} httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
      *   to be used when retrieving access tokens from Google token servers.
      *
      * @return {!admin.credential.Credential} A credential authenticated via Google
      *   Application Default Credentials that can be used to initialize an app.
      */
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.applicationDefault")
    @js.native
    def applicationDefault(): Credential = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.applicationDefault")
    @js.native
    def applicationDefault(httpAgent: Agent): Credential = js.native
    
    /**
      * Returns a credential created from the provided service account that grants
      * admin access to Firebase services. This credential can be used in the call
      * to
      * {@link
      *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
      *   `admin.initializeApp()`}.
      *
      * See
      * {@link
      *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
      *   Initialize the SDK}
      * for more details.
      *
      * @example
      * ```javascript
      * // Providing a path to a service account key JSON file
      * var serviceAccount = require("path/to/serviceAccountKey.json");
      * admin.initializeApp({
      *   credential: admin.credential.cert(serviceAccount),
      *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
      * });
      * ```
      *
      * @example
      * ```javascript
      * // Providing a service account object inline
      * admin.initializeApp({
      *   credential: admin.credential.cert({
      *     projectId: "<PROJECT_ID>",
      *     clientEmail: "foo@<PROJECT_ID>.iam.gserviceaccount.com",
      *     privateKey: "-----BEGIN PRIVATE KEY-----<KEY>-----END PRIVATE KEY-----\n"
      *   }),
      *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
      * });
      * ```
      *
      * @param serviceAccountPathOrObject The path to a service
      *   account key JSON file or an object representing a service account key.
      * @param httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
      *   to be used when retrieving access tokens from Google token servers.
      *
      * @return A credential authenticated via the
      *   provided service account that can be used to initialize an app.
      */
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.cert")
    @js.native
    def cert(serviceAccountPathOrObject: String): Credential = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.cert")
    @js.native
    def cert(serviceAccountPathOrObject: String, httpAgent: Agent): Credential = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.cert")
    @js.native
    def cert(serviceAccountPathOrObject: ServiceAccount): Credential = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.cert")
    @js.native
    def cert(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): Credential = js.native
    
    /**
      * Returns a credential created from the provided refresh token that grants
      * admin access to Firebase services. This credential can be used in the call
      * to
      * {@link
      *   https://firebase.google.com/docs/reference/admin/node/admin#.initializeApp
      *   `admin.initializeApp()`}.
      *
      * See
      * {@link
      *   https://firebase.google.com/docs/admin/setup#initialize_the_sdk
      *   Initialize the SDK}
      * for more details.
      *
      * @example
      * ```javascript
      * // Providing a path to a refresh token JSON file
      * var refreshToken = require("path/to/refreshToken.json");
      * admin.initializeApp({
      *   credential: admin.credential.refreshToken(refreshToken),
      *   databaseURL: "https://<DATABASE_NAME>.firebaseio.com"
      * });
      * ```
      *
      * @param refreshTokenPathOrObject The path to a Google
      *   OAuth2 refresh token JSON file or an object representing a Google OAuth2
      *   refresh token.
      * @param httpAgent Optional [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
      *   to be used when retrieving access tokens from Google token servers.
      *
      * @return A credential authenticated via the
      *   provided service account that can be used to initialize an app.
      */
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.refreshToken")
    @js.native
    def refreshToken(refreshTokenPathOrObject: String): Credential = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.refreshToken")
    @js.native
    def refreshToken(refreshTokenPathOrObject: String, httpAgent: Agent): Credential = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.refreshToken")
    @js.native
    def refreshToken(refreshTokenPathOrObject: js.Object): Credential = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "credential.refreshToken")
    @js.native
    def refreshToken(refreshTokenPathOrObject: js.Object, httpAgent: Agent): Credential = js.native
  }
  
  object database {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "database")
    @js.native
    def apply(): Database = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "database")
    @js.native
    def apply(app: App): Database = js.native
    
    /**
      * [`ServerValue`](https://firebase.google.com/docs/reference/js/firebase.database.ServerValue)
      * module from the `@firebase/database` package.
      */
    @JSImport("firebase-admin/lib/firebase-namespace", "database.ServerValue")
    @js.native
    val ServerValue: typings.firebaseDatabaseTypes.mod.ServerValue = js.native
    
    @JSImport("firebase-admin/lib/firebase-namespace", "database.enableLogging")
    @js.native
    def enableLogging(): js.Any = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "database.enableLogging")
    @js.native
    def enableLogging(logger: js.UndefOr[scala.Nothing], persistent: Boolean): js.Any = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "database.enableLogging")
    @js.native
    def enableLogging(logger: js.Function1[/* a */ String, _]): js.Any = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "database.enableLogging")
    @js.native
    def enableLogging(logger: js.Function1[/* a */ String, _], persistent: Boolean): js.Any = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "database.enableLogging")
    @js.native
    def enableLogging(logger: Boolean): js.Any = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "database.enableLogging")
    @js.native
    def enableLogging(logger: Boolean, persistent: Boolean): js.Any = js.native
  }
  
  object firestore {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore")
    @js.native
    def apply(): typings.googleCloudFirestore.mod.Firestore = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore")
    @js.native
    def apply(app: App): typings.googleCloudFirestore.mod.Firestore = js.native
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.BulkWriter")
    @js.native
    class BulkWriter protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.BulkWriter
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.CollectionGroup")
    @js.native
    class CollectionGroup[T] protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.CollectionGroup[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.CollectionReference")
    @js.native
    class CollectionReference[T] protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.CollectionReference[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.DocumentReference")
    @js.native
    class DocumentReference[T] protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.DocumentReference[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.DocumentSnapshot")
    @js.native
    class DocumentSnapshot[T] protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.DocumentSnapshot[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldPath")
    @js.native
    class FieldPath protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.FieldPath {
      /**
        * Creates a FieldPath from the provided field names. If more than one field
        * name is provided, the path will point to a nested field in a document.
        *
        * @param fieldNames A list of field names.
        */
      def this(fieldNames: String*) = this()
    }
    /* static members */
    object FieldPath {
      
      /**
        * Returns a special sentinel FieldPath to refer to the ID of a document.
        * It can be used in queries to sort or filter by the document ID.
        */
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldPath.documentId")
      @js.native
      def documentId(): typings.googleCloudFirestore.FirebaseFirestore.FieldPath = js.native
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldValue")
    @js.native
    class FieldValue protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.FieldValue
    /* static members */
    object FieldValue {
      
      /**
        * Returns a special value that can be used with set(), create() or update()
        * that tells the server to remove the given elements from any array value
        * that already exists on the server. All instances of each element
        * specified will be removed from the array. If the field being modified is
        * not already an array it will be overwritten with an empty array.
        *
        * @param elements The elements to remove from the array.
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldValue.arrayRemove")
      @js.native
      def arrayRemove(elements: js.Any*): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
      
      /**
        * Returns a special value that can be used with set(), create() or update()
        * that tells the server to union the given elements with any array value
        * that already exists on the server. Each specified element that doesn't
        * already exist in the array will be added to the end. If the field being
        * modified is not already an array it will be overwritten with an array
        * containing exactly the specified elements.
        *
        * @param elements The elements to union into the array.
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldValue.arrayUnion")
      @js.native
      def arrayUnion(elements: js.Any*): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
      
      /**
        * Returns a sentinel for use with update() or set() with {merge:true} to
        * mark a field for deletion.
        *
        * @return The FieldValue sentinel for use in a call to set() or update().
        */
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldValue.delete")
      @js.native
      def delete(): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
      
      /**
        * Returns a special value that can be used with set(), create() or update()
        * that tells the server to increment the field's current value by the given
        * value.
        *
        * If either current field value or the operand uses floating point
        * precision, both values will be interpreted as floating point numbers and
        * all arithmetic will follow IEEE 754 semantics. Otherwise, integer
        * precision is kept and the result is capped between -2^63 and 2^63-1.
        *
        * If the current field value is not of type 'number', or if the field does
        * not yet exist, the transformation will set the field to the given value.
        *
        * @param n The value to increment by.
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldValue.increment")
      @js.native
      def increment(n: Double): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
      
      /**
        * Returns a sentinel used with set(), create() or update() to include a
        * server-generated timestamp in the written data.
        *
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldValue.serverTimestamp")
      @js.native
      def serverTimestamp(): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Firestore")
    @js.native
    /**
      * @param settings Configuration object. See [Firestore Documentation]
      * {@link https://firebase.google.com/docs/firestore/}
      */
    class Firestore ()
      extends typings.firebaseAdmin.firestoreMod.firestore.Firestore {
      def this(settings: Settings) = this()
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.GeoPoint")
    @js.native
    class GeoPoint protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.GeoPoint {
      /**
        * Creates a new immutable GeoPoint object with the provided latitude and
        * longitude values.
        * @param latitude The latitude as number between -90 and 90.
        * @param longitude The longitude as number between -180 and 180.
        */
      def this(latitude: Double, longitude: Double) = this()
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.GrpcStatus")
    @js.native
    object GrpcStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus with Double] = js.native
      
      /* 10 */ val ABORTED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ABORTED with Double = js.native
      
      /* 6 */ val ALREADY_EXISTS: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ALREADY_EXISTS with Double = js.native
      
      /* 1 */ val CANCELLED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.CANCELLED with Double = js.native
      
      /* 15 */ val DATA_LOSS: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DATA_LOSS with Double = js.native
      
      /* 4 */ val DEADLINE_EXCEEDED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DEADLINE_EXCEEDED with Double = js.native
      
      /* 9 */ val FAILED_PRECONDITION: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.FAILED_PRECONDITION with Double = js.native
      
      /* 13 */ val INTERNAL: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INTERNAL with Double = js.native
      
      /* 3 */ val INVALID_ARGUMENT: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INVALID_ARGUMENT with Double = js.native
      
      /* 5 */ val NOT_FOUND: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.NOT_FOUND with Double = js.native
      
      /* 0 */ val OK: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OK with Double = js.native
      
      /* 11 */ val OUT_OF_RANGE: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OUT_OF_RANGE with Double = js.native
      
      /* 7 */ val PERMISSION_DENIED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.PERMISSION_DENIED with Double = js.native
      
      /* 8 */ val RESOURCE_EXHAUSTED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.RESOURCE_EXHAUSTED with Double = js.native
      
      /* 16 */ val UNAUTHENTICATED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAUTHENTICATED with Double = js.native
      
      /* 14 */ val UNAVAILABLE: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAVAILABLE with Double = js.native
      
      /* 12 */ val UNIMPLEMENTED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNIMPLEMENTED with Double = js.native
      
      /* 2 */ val UNKNOWN: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNKNOWN with Double = js.native
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Query")
    @js.native
    class Query[T] protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.Query[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.QueryDocumentSnapshot")
    @js.native
    class QueryDocumentSnapshot[T] protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.QueryDocumentSnapshot[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.QueryPartition")
    @js.native
    class QueryPartition[T] protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.QueryPartition[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.QuerySnapshot")
    @js.native
    class QuerySnapshot[T] protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.QuerySnapshot[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Timestamp")
    @js.native
    class Timestamp protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.Timestamp {
      /**
        * Creates a new timestamp.
        *
        * @param seconds The number of seconds of UTC time since Unix epoch
        * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
        * 9999-12-31T23:59:59Z inclusive.
        * @param nanoseconds The non-negative fractions of a second at nanosecond
        * resolution. Negative second values with fractions must still have
        * non-negative nanoseconds values that count forward in time. Must be from
        * 0 to 999,999,999 inclusive.
        */
      def this(seconds: Double, nanoseconds: Double) = this()
    }
    /* static members */
    object Timestamp {
      
      /**
        * Creates a new timestamp from the given date.
        *
        * @param date The date to initialize the `Timestamp` from.
        * @return A new `Timestamp` representing the same point in time as the
        * given date.
        */
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Timestamp.fromDate")
      @js.native
      def fromDate(date: Date): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
      
      /**
        * Creates a new timestamp from the given number of milliseconds.
        *
        * @param milliseconds Number of milliseconds since Unix epoch
        * 1970-01-01T00:00:00Z.
        * @return A new `Timestamp` representing the same point in time as the
        * given number of milliseconds.
        */
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Timestamp.fromMillis")
      @js.native
      def fromMillis(milliseconds: Double): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
      
      /**
        * Creates a new timestamp with the current date, with millisecond precision.
        *
        * @return A new `Timestamp` representing the current date.
        */
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Timestamp.now")
      @js.native
      def now(): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Transaction")
    @js.native
    class Transaction protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.Transaction
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.WriteBatch")
    @js.native
    class WriteBatch protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.WriteBatch
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.WriteResult")
    @js.native
    class WriteResult protected ()
      extends typings.firebaseAdmin.firestoreMod.firestore.WriteResult
    
    /**
      * Sets or disables the log function for all active Firestore instances.
      *
      * @param logger A log function that takes a message (such as `console.log`) or
      * `null` to turn off logging.
      */
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.setLogFunction")
    @js.native
    def setLogFunction(): Unit = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.setLogFunction")
    @js.native
    def setLogFunction(logger: js.Function1[/* msg */ String, Unit]): Unit = js.native
    
    object v1 {
      
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.v1")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.v1.FirestoreAdminClient")
      @js.native
      def FirestoreAdminClient: js.Any = js.native
      @scala.inline
      def FirestoreAdminClient_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreAdminClient")(x.asInstanceOf[js.Any])
      
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.v1.FirestoreClient")
      @js.native
      def FirestoreClient: js.Any = js.native
      @scala.inline
      def FirestoreClient_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreClient")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.v1beta1")
    @js.native
    val v1beta1: js.Any = js.native
  }
  
  @JSImport("firebase-admin/lib/firebase-namespace", "initializeApp")
  @js.native
  def initializeApp(): App = js.native
  @JSImport("firebase-admin/lib/firebase-namespace", "initializeApp")
  @js.native
  def initializeApp(options: js.UndefOr[scala.Nothing], name: String): App = js.native
  @JSImport("firebase-admin/lib/firebase-namespace", "initializeApp")
  @js.native
  def initializeApp(options: AppOptions): App = js.native
  @JSImport("firebase-admin/lib/firebase-namespace", "initializeApp")
  @js.native
  def initializeApp(options: AppOptions, name: String): App = js.native
  
  object instanceId {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "instanceId")
    @js.native
    def apply(): InstanceId = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "instanceId")
    @js.native
    def apply(app: App): InstanceId = js.native
  }
  
  object machineLearning {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "machineLearning")
    @js.native
    def apply(): MachineLearning = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "machineLearning")
    @js.native
    def apply(app: App): MachineLearning = js.native
  }
  
  object messaging {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "messaging")
    @js.native
    def apply(): Messaging = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "messaging")
    @js.native
    def apply(app: App): Messaging = js.native
  }
  
  object projectManagement {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "projectManagement")
    @js.native
    def apply(): ProjectManagement = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "projectManagement")
    @js.native
    def apply(app: App): ProjectManagement = js.native
    
    /**
      * Platforms with which a Firebase App can be associated.
      */
    @JSImport("firebase-admin/lib/firebase-namespace", "projectManagement.AppPlatform")
    @js.native
    object AppPlatform extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform with String
          ] = js.native
      
      /* "ANDROID" */ val ANDROID: typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.ANDROID with String = js.native
      
      /* "IOS" */ val IOS: typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.IOS with String = js.native
      
      /* "PLATFORM_UNKNOWN" */ val PLATFORM_UNKNOWN: typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.PLATFORM_UNKNOWN with String = js.native
    }
  }
  
  object remoteConfig {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "remoteConfig")
    @js.native
    def apply(): RemoteConfig = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "remoteConfig")
    @js.native
    def apply(app: App): RemoteConfig = js.native
  }
  
  object securityRules {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "securityRules")
    @js.native
    def apply(): SecurityRules = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "securityRules")
    @js.native
    def apply(app: App): SecurityRules = js.native
  }
  
  object storage {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "storage")
    @js.native
    def apply(): Storage = js.native
    @JSImport("firebase-admin/lib/firebase-namespace", "storage")
    @js.native
    def apply(app: App): Storage = js.native
  }
}
