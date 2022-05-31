package typings.firebase.global.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The current SDK version.
  */
inline def SDK_VERSION: java.lang.String = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].selectDynamic("SDK_VERSION").asInstanceOf[java.lang.String]
inline def SDK_VERSION_=(x: java.lang.String): scala.Unit = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])

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
inline def app(): typings.firebase.mod.firebase.app.App = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("app")().asInstanceOf[typings.firebase.mod.firebase.app.App]
inline def app(name: java.lang.String): typings.firebase.mod.firebase.app.App = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("app")(name.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.app.App]

/**
  * A (read-only) array of all initialized apps.
  */
inline def apps: js.Array[typings.firebase.mod.firebase.app.App] = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].selectDynamic("apps").asInstanceOf[js.Array[typings.firebase.mod.firebase.app.App]]
inline def apps_=(x: js.Array[typings.firebase.mod.firebase.app.App]): scala.Unit = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].updateDynamic("apps")(x.asInstanceOf[js.Any])

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
  *   appId: "1:27992087142:web:ce....",      // General Use
  *   projectId: "my-firebase-project",               // General Use
  *   authDomain: "YOUR_APP.firebaseapp.com",         // Auth with popup/redirect
  *   databaseURL: "https://YOUR_APP.firebaseio.com", // Realtime Database
  *   storageBucket: "YOUR_APP.appspot.com",          // Storage
  *   messagingSenderId: "123456789",                  // Cloud Messaging
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
inline def initializeApp(options: js.Object): typings.firebase.mod.firebase.app.App = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.app.App]
inline def initializeApp(options: js.Object, name: java.lang.String): typings.firebase.mod.firebase.app.App = (typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.firebase.mod.firebase.app.App]

/**
  * Sets log handler for all Firebase packages.
  * @param logCallback An optional custom log handler that executes user code whenever
  * the Firebase SDK makes a logging call.
  */
inline def onLog(logCallback: js.Function1[/* callbackParams */ typings.firebase.anon.Args, scala.Unit]): scala.Unit = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def onLog(
  logCallback: js.Function1[/* callbackParams */ typings.firebase.anon.Args, scala.Unit],
  options: typings.firebase.anon.Level
): scala.Unit = (typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

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
inline def performance(): typings.firebase.mod.firebase.performance.Performance = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("performance")().asInstanceOf[typings.firebase.mod.firebase.performance.Performance]
/**
  * @webonly
  */
inline def performance(app: typings.firebase.mod.firebase.app.App): typings.firebase.mod.firebase.performance.Performance = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("performance")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.performance.Performance]

/**
  * Registers a library's name and version for platform logging purposes.
  * @param library Name of 1p or 3p library (e.g. firestore, angularfire)
  * @param version Current version of that library.
  * @param variant Bundle variant, e.g., node, rn, etc.
  */
inline def registerVersion(library: java.lang.String, version: java.lang.String): scala.Unit = (typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(library.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def registerVersion(library: java.lang.String, version: java.lang.String, variant: java.lang.String): scala.Unit = (typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(library.asInstanceOf[js.Any], version.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Gets the {@link firebase.remoteConfig.RemoteConfig `RemoteConfig`} instance.
  *
  * @webonly
  *
  * @example
  * ```javascript
  * // Get the RemoteConfig instance for the default app
  * const defaultRemoteConfig = firebase.remoteConfig();
  * ```
  *
  * @param app The app to create a Remote Config service for. If not passed, uses the default app.
  */
/**
  * @webonly
  */
inline def remoteConfig(): typings.firebase.mod.firebase.remoteConfig.RemoteConfig = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("remoteConfig")().asInstanceOf[typings.firebase.mod.firebase.remoteConfig.RemoteConfig]
/**
  * @webonly
  */
inline def remoteConfig(app: typings.firebase.mod.firebase.app.App): typings.firebase.mod.firebase.remoteConfig.RemoteConfig = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("remoteConfig")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.remoteConfig.RemoteConfig]

/**
  * Sets log level for all Firebase packages.
  *
  * All of the log types above the current log level are captured (i.e. if
  * you set the log level to `info`, errors are logged, but `debug` and
  * `verbose` logs are not).
  */
inline def setLogLevel(logLevel: typings.firebase.mod.firebase.LogLevel): scala.Unit = typings.firebase.global.firebase.^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
