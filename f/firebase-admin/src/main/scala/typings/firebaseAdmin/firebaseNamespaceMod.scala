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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firebaseNamespaceMod {
  
  @JSImport("firebase-admin/lib/firebase-namespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/firebase-namespace", "SDK_VERSION")
  @js.native
  val SDK_VERSION: String = js.native
  
  object app {
    
    inline def apply(): App = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[App]
    inline def apply(name: String): App = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[App]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "app")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @JSImport("firebase-admin/lib/firebase-namespace", "apps")
  @js.native
  val apps: js.Array[App | Null] = js.native
  
  object auth {
    
    inline def apply(): Auth = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Auth]
    inline def apply(app: App): Auth = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Auth]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "auth")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object credential {
    
    @JSImport("firebase-admin/lib/firebase-namespace", "credential")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def applicationDefault(): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")().asInstanceOf[Credential]
    inline def applicationDefault(httpAgent: Agent): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("applicationDefault")(httpAgent.asInstanceOf[js.Any]).asInstanceOf[Credential]
    
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
    inline def cert(serviceAccountPathOrObject: String): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
    inline def cert(serviceAccountPathOrObject: String, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
    inline def cert(serviceAccountPathOrObject: ServiceAccount): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
    inline def cert(serviceAccountPathOrObject: ServiceAccount, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("cert")(serviceAccountPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
    
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
    inline def refreshToken(refreshTokenPathOrObject: String): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
    inline def refreshToken(refreshTokenPathOrObject: String, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
    inline def refreshToken(refreshTokenPathOrObject: js.Object): Credential = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any]).asInstanceOf[Credential]
    inline def refreshToken(refreshTokenPathOrObject: js.Object, httpAgent: Agent): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshToken")(refreshTokenPathOrObject.asInstanceOf[js.Any], httpAgent.asInstanceOf[js.Any])).asInstanceOf[Credential]
  }
  
  object database {
    
    inline def apply(): Database = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Database]
    inline def apply(app: App): Database = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Database]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "database")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * [`ServerValue`](https://firebase.google.com/docs/reference/js/firebase.database.ServerValue)
      * module from the `@firebase/database` package.
      */
    @JSImport("firebase-admin/lib/firebase-namespace", "database.ServerValue")
    @js.native
    val ServerValue: typings.firebaseDatabaseTypes.mod.ServerValue = js.native
    
    inline def enableLogging(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")().asInstanceOf[js.Any]
    inline def enableLogging(logger: js.Function1[/* a */ String, js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def enableLogging(logger: js.Function1[/* a */ String, js.Any], persistent: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def enableLogging(logger: Boolean): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def enableLogging(logger: Boolean, persistent: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def enableLogging(logger: Unit, persistent: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  object firestore {
    
    inline def apply(): typings.googleCloudFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.googleCloudFirestore.mod.Firestore]
    inline def apply(app: App): typings.googleCloudFirestore.mod.Firestore = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.mod.Firestore]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.BulkWriter")
    @js.native
    /* private */ class BulkWriter ()
      extends typings.firebaseAdmin.firestoreMod.firestore.BulkWriter
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.CollectionGroup")
    @js.native
    /* private */ class CollectionGroup[T] ()
      extends typings.firebaseAdmin.firestoreMod.firestore.CollectionGroup[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.CollectionReference")
    @js.native
    /* private */ class CollectionReference[T] ()
      extends typings.firebaseAdmin.firestoreMod.firestore.CollectionReference[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.DocumentReference")
    @js.native
    /* private */ class DocumentReference[T] ()
      extends typings.firebaseAdmin.firestoreMod.firestore.DocumentReference[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.DocumentSnapshot")
    @js.native
    /* protected */ class DocumentSnapshot[T] ()
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
      
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldPath")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Returns a special sentinel FieldPath to refer to the ID of a document.
        * It can be used in queries to sort or filter by the document ID.
        */
      inline def documentId(): typings.googleCloudFirestore.FirebaseFirestore.FieldPath = ^.asInstanceOf[js.Dynamic].applyDynamic("documentId")().asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldPath]
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldValue")
    @js.native
    /* private */ class FieldValue ()
      extends typings.firebaseAdmin.firestoreMod.firestore.FieldValue
    /* static members */
    object FieldValue {
      
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.FieldValue")
      @js.native
      val ^ : js.Any = js.native
      
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
      inline def arrayRemove(elements: js.Any*): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(elements.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
      
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
      inline def arrayUnion(elements: js.Any*): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnion")(elements.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
      
      /**
        * Returns a sentinel for use with update() or set() with {merge:true} to
        * mark a field for deletion.
        *
        * @return The FieldValue sentinel for use in a call to set() or update().
        */
      inline def delete(): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")().asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
      
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
      inline def increment(n: Double): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(n.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
      
      /**
        * Returns a sentinel used with set(), create() or update() to include a
        * server-generated timestamp in the written data.
        *
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      inline def serverTimestamp(): typings.googleCloudFirestore.FirebaseFirestore.FieldValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.FieldValue]
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
      def apply(value: Double): js.UndefOr[typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus & Double] = js.native
      
      /* 10 */ val ABORTED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ABORTED & Double = js.native
      
      /* 6 */ val ALREADY_EXISTS: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ALREADY_EXISTS & Double = js.native
      
      /* 1 */ val CANCELLED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.CANCELLED & Double = js.native
      
      /* 15 */ val DATA_LOSS: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DATA_LOSS & Double = js.native
      
      /* 4 */ val DEADLINE_EXCEEDED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DEADLINE_EXCEEDED & Double = js.native
      
      /* 9 */ val FAILED_PRECONDITION: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.FAILED_PRECONDITION & Double = js.native
      
      /* 13 */ val INTERNAL: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INTERNAL & Double = js.native
      
      /* 3 */ val INVALID_ARGUMENT: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INVALID_ARGUMENT & Double = js.native
      
      /* 5 */ val NOT_FOUND: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.NOT_FOUND & Double = js.native
      
      /* 0 */ val OK: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OK & Double = js.native
      
      /* 11 */ val OUT_OF_RANGE: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OUT_OF_RANGE & Double = js.native
      
      /* 7 */ val PERMISSION_DENIED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.PERMISSION_DENIED & Double = js.native
      
      /* 8 */ val RESOURCE_EXHAUSTED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.RESOURCE_EXHAUSTED & Double = js.native
      
      /* 16 */ val UNAUTHENTICATED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAUTHENTICATED & Double = js.native
      
      /* 14 */ val UNAVAILABLE: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAVAILABLE & Double = js.native
      
      /* 12 */ val UNIMPLEMENTED: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNIMPLEMENTED & Double = js.native
      
      /* 2 */ val UNKNOWN: typings.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNKNOWN & Double = js.native
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Query")
    @js.native
    /* protected */ class Query[T] ()
      extends typings.firebaseAdmin.firestoreMod.firestore.Query[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.QueryDocumentSnapshot")
    @js.native
    /* private */ class QueryDocumentSnapshot[T] ()
      extends typings.firebaseAdmin.firestoreMod.firestore.QueryDocumentSnapshot[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.QueryPartition")
    @js.native
    /* private */ class QueryPartition[T] ()
      extends typings.firebaseAdmin.firestoreMod.firestore.QueryPartition[T]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.QuerySnapshot")
    @js.native
    /* private */ class QuerySnapshot[T] ()
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
      
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Timestamp")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new timestamp from the given date.
        *
        * @param date The date to initialize the `Timestamp` from.
        * @return A new `Timestamp` representing the same point in time as the
        * given date.
        */
      inline def fromDate(date: Date): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Timestamp]
      
      /**
        * Creates a new timestamp from the given number of milliseconds.
        *
        * @param milliseconds Number of milliseconds since Unix epoch
        * 1970-01-01T00:00:00Z.
        * @return A new `Timestamp` representing the same point in time as the
        * given number of milliseconds.
        */
      inline def fromMillis(milliseconds: Double): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMillis")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Timestamp]
      
      /**
        * Creates a new timestamp with the current date, with millisecond precision.
        *
        * @return A new `Timestamp` representing the current date.
        */
      inline def now(): typings.googleCloudFirestore.FirebaseFirestore.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.googleCloudFirestore.FirebaseFirestore.Timestamp]
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.Transaction")
    @js.native
    /* private */ class Transaction ()
      extends typings.firebaseAdmin.firestoreMod.firestore.Transaction
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.WriteBatch")
    @js.native
    /* private */ class WriteBatch ()
      extends typings.firebaseAdmin.firestoreMod.firestore.WriteBatch
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.WriteResult")
    @js.native
    /* private */ class WriteResult ()
      extends typings.firebaseAdmin.firestoreMod.firestore.WriteResult
    
    /**
      * Sets or disables the log function for all active Firestore instances.
      *
      * @param logger A log function that takes a message (such as `console.log`) or
      * `null` to turn off logging.
      */
    inline def setLogFunction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogFunction")().asInstanceOf[Unit]
    inline def setLogFunction(logger: js.Function1[/* msg */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogFunction")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    object v1 {
      
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.v1")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.v1.FirestoreAdminClient")
      @js.native
      def FirestoreAdminClient: js.Any = js.native
      inline def FirestoreAdminClient_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreAdminClient")(x.asInstanceOf[js.Any])
      
      @JSImport("firebase-admin/lib/firebase-namespace", "firestore.v1.FirestoreClient")
      @js.native
      def FirestoreClient: js.Any = js.native
      inline def FirestoreClient_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreClient")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("firebase-admin/lib/firebase-namespace", "firestore.v1beta1")
    @js.native
    val v1beta1: js.Any = js.native
  }
  
  inline def initializeApp(): App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")().asInstanceOf[App]
  inline def initializeApp(options: Unit, name: String): App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[App]
  inline def initializeApp(options: AppOptions): App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[App]
  inline def initializeApp(options: AppOptions, name: String): App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[App]
  
  object instanceId {
    
    inline def apply(): InstanceId = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[InstanceId]
    inline def apply(app: App): InstanceId = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[InstanceId]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "instanceId")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object machineLearning {
    
    inline def apply(): MachineLearning = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MachineLearning]
    inline def apply(app: App): MachineLearning = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[MachineLearning]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "machineLearning")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object messaging {
    
    inline def apply(): Messaging = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Messaging]
    inline def apply(app: App): Messaging = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Messaging]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "messaging")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object projectManagement {
    
    inline def apply(): ProjectManagement = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ProjectManagement]
    inline def apply(app: App): ProjectManagement = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[ProjectManagement]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "projectManagement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Platforms with which a Firebase App can be associated.
      */
    @JSImport("firebase-admin/lib/firebase-namespace", "projectManagement.AppPlatform")
    @js.native
    object AppPlatform extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[
            typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform & String
          ] = js.native
      
      /* "ANDROID" */ val ANDROID: typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.ANDROID & String = js.native
      
      /* "IOS" */ val IOS: typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.IOS & String = js.native
      
      /* "PLATFORM_UNKNOWN" */ val PLATFORM_UNKNOWN: typings.firebaseAdmin.projectManagementMod.projectManagement.AppPlatform.PLATFORM_UNKNOWN & String = js.native
    }
  }
  
  object remoteConfig {
    
    inline def apply(): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RemoteConfig]
    inline def apply(app: App): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[RemoteConfig]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "remoteConfig")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object securityRules {
    
    inline def apply(): SecurityRules = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[SecurityRules]
    inline def apply(app: App): SecurityRules = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[SecurityRules]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "securityRules")
    @js.native
    val ^ : js.Any = js.native
  }
  
  object storage {
    
    inline def apply(): Storage = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Storage]
    inline def apply(app: App): Storage = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Storage]
    
    @JSImport("firebase-admin/lib/firebase-namespace", "storage")
    @js.native
    val ^ : js.Any = js.native
  }
}
