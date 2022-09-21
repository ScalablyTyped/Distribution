package typings.firebase.firebaseMod.default

import typings.firebase.anon.Args
import typings.firebase.anon.Level
import typings.firebase.firebaseMod.default.^
import typings.firebase.firebaseMod.firebase.LogLevel
import typings.firebase.firebaseMod.firebase.app.App
import typings.firebase.firebaseMod.firebase.performance.Performance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The current SDK version.
  */
inline def SDK_VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("SDK_VERSION").asInstanceOf[String]
inline def SDK_VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])

/**
  * Retrieves a Firebase {@link firebase.app.App app} instance.
  *
  * When called with no arguments, the default app is returned. When an app name
  * is provided, the app corresponding to that name is returned.
  *
  * An exception is thrown if the app being retrieved has not yet been
  * initialized.
  *
  * @example
  * ```javascript
  * // Return the default app
  * var app = firebase.app();
  * ```
  *
  * @example
  * ```javascript
  * // Return a named app
  * var otherApp = firebase.app("otherApp");
  * ```
  *
  * @param name Optional name of the app to return. If no name is
  *   provided, the default is `"[DEFAULT]"`.
  *
  * @return The app corresponding to the provided app name.
  *   If no app name is provided, the default app is returned.
  */
inline def app(): App = ^.asInstanceOf[js.Dynamic].applyDynamic("app")().asInstanceOf[App]
inline def app(name: String): App = ^.asInstanceOf[js.Dynamic].applyDynamic("app")(name.asInstanceOf[js.Any]).asInstanceOf[App]

/**
  * A (read-only) array of all initialized apps.
  */
inline def apps: js.Array[App] = ^.asInstanceOf[js.Dynamic].selectDynamic("apps").asInstanceOf[js.Array[App]]
inline def apps_=(x: js.Array[App]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apps")(x.asInstanceOf[js.Any])

/**
  * Creates and initializes a Firebase {@link firebase.app.App app} instance.
  *
  * See
  * {@link
  *   https://firebase.google.com/docs/web/setup#add_firebase_to_your_app
  *   Add Firebase to your app} and
  * {@link
  *   https://firebase.google.com/docs/web/learn-more#multiple-projects
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
  *   appId: "1:27992087142:web:ce....",              // General Use
  *   projectId: "my-firebase-project",               // General Use
  *   authDomain: "YOUR_APP.firebaseapp.com",         // Auth with popup/redirect
  *   databaseURL: "https://YOUR_APP.firebaseio.com", // Realtime Database
  *   storageBucket: "YOUR_APP.appspot.com",          // Storage
  *   messagingSenderId: "123456789",                 // Cloud Messaging
  *   measurementId: "G-12345"                        // Analytics
  * });
  * ```
  *
  * @example
  * ```javascript
  *
  * // Initialize another app
  * var otherApp = firebase.initializeApp({
  *   apiKey: "AIza....",
  *   appId: "1:27992087142:web:ce....",
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
inline def initializeApp(options: js.Object): App = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[App]
inline def initializeApp(options: js.Object, name: String): App = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[App]

/**
  * Sets log handler for all Firebase packages.
  * @param logCallback An optional custom log handler that executes user code whenever
  * the Firebase SDK makes a logging call.
  */
inline def onLog(logCallback: js.Function1[/* callbackParams */ Args, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def onLog(logCallback: js.Function1[/* callbackParams */ Args, Unit], options: Level): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Gets the {@link firebase.performance.Performance `Performance`} service.
  *
  * `firebase.performance()` can be called with no arguments to access the default
  * app's {@link firebase.performance.Performance `Performance`} service.
  * The {@link firebase.performance.Performance `Performance`} service does not work with
  * any other app.
  *
  * @webonly
  *
  * @example
  * ```javascript
  * // Get the Performance service for the default app
  * const defaultPerformance = firebase.performance();
  * ```
  *
  * @param app The app to create a performance service for. Performance Monitoring only works with
  * the default app.
  * If not passed, uses the default app.
  */
/**
  * @webonly
  */
inline def performance(): Performance = ^.asInstanceOf[js.Dynamic].applyDynamic("performance")().asInstanceOf[Performance]
/**
  * @webonly
  */
inline def performance(app: App): Performance = ^.asInstanceOf[js.Dynamic].applyDynamic("performance")(app.asInstanceOf[js.Any]).asInstanceOf[Performance]

/**
  * Registers a library's name and version for platform logging purposes.
  * @param library Name of 1p or 3p library (e.g. firestore, angularfire)
  * @param version Current version of that library.
  * @param variant Bundle variant, e.g., node, rn, etc.
  */
inline def registerVersion(library: String, version: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(library.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerVersion(library: String, version: String, variant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(library.asInstanceOf[js.Any], version.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Sets log level for all Firebase packages.
  *
  * All of the log types above the current log level are captured (i.e. if
  * you set the log level to `info`, errors are logged, but `debug` and
  * `verbose` logs are not).
  */
inline def setLogLevel(logLevel: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
