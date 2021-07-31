package typings.firebase.mod.default

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * The current SDK version.
  */
@scala.inline
def SDK_VERSION: java.lang.String = typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("SDK_VERSION").asInstanceOf[java.lang.String]
@scala.inline
def SDK_VERSION_=(x: java.lang.String): scala.Unit = typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].updateDynamic("SDK_VERSION")(x.asInstanceOf[js.Any])

/**
  * A (read-only) array of all initialized apps.
  */
@scala.inline
def apps: js.Array[typings.firebase.mod.firebase.app.App] = typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].selectDynamic("apps").asInstanceOf[js.Array[typings.firebase.mod.firebase.app.App]]
@scala.inline
def apps_=(x: js.Array[typings.firebase.mod.firebase.app.App]): scala.Unit = typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].updateDynamic("apps")(x.asInstanceOf[js.Any])

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
@scala.inline
def initializeApp(options: js.Object): typings.firebase.mod.firebase.app.App = typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.app.App]
@scala.inline
def initializeApp(options: js.Object, name: java.lang.String): typings.firebase.mod.firebase.app.App = (typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("initializeApp")(options.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.firebase.mod.firebase.app.App]

/**
  * Sets log handler for all Firebase packages.
  * @param logCallback An optional custom log handler that executes user code whenever
  * the Firebase SDK makes a logging call.
  */
@scala.inline
def onLog(logCallback: js.Function1[/* callbackParams */ typings.firebase.anon.Args, scala.Unit]): scala.Unit = typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
@scala.inline
def onLog(
  logCallback: js.Function1[/* callbackParams */ typings.firebase.anon.Args, scala.Unit],
  options: typings.firebase.anon.Level
): scala.Unit = (typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("onLog")(logCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Registers a library's name and version for platform logging purposes.
  * @param library Name of 1p or 3p library (e.g. firestore, angularfire)
  * @param version Current version of that library.
  * @param variant Bundle variant, e.g., node, rn, etc.
  */
@scala.inline
def registerVersion(library: java.lang.String, version: java.lang.String): scala.Unit = (typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(library.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def registerVersion(library: java.lang.String, version: java.lang.String, variant: java.lang.String): scala.Unit = (typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("registerVersion")(library.asInstanceOf[js.Any], version.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Sets log level for all Firebase packages.
  *
  * All of the log types above the current log level are captured (i.e. if
  * you set the log level to `info`, errors are logged, but `debug` and
  * `verbose` logs are not).
  */
@scala.inline
def setLogLevel(logLevel: typings.firebase.mod.firebase.LogLevel): scala.Unit = typings.firebase.mod.default.^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
