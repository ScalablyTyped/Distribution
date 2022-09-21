package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.flashpointLauncher.anon.DeepPartialAppPreferencesAppPathOverrides
import typings.flashpointLauncher.anon.Key
import typings.flashpointLauncher.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Dispose of all a disposable;s children but not itself */
inline def clearDisposable(disposable: Disposable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDisposable")(disposable.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Config Data */
inline def config: AppConfigData = ^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[AppConfigData]

/** Data Version of the Flashpoint Launcher */
inline def dataVersion: js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("dataVersion").asInstanceOf[js.UndefOr[String]]

/** Dispose of a disposable and all its children */
inline def dispose(disposable: Disposable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")(disposable.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Path to own extension */
inline def extensionPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("extensionPath").asInstanceOf[String]

/**
  * Gets an extension configuration value given its key
  */
inline def getExtConfigValue(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtConfigValue")(key.asInstanceOf[js.Any]).asInstanceOf[Any]

/**
  * Get a URL for an extensions file
  * @param filePath Relative path to file from extension path
  */
inline def getExtensionFileURL(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtensionFileURL")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]

/** Returns most up to date Preferences Data */
inline def getPreferences(): AppPreferencesData = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreferences")().asInstanceOf[AppPreferencesData]

/**
  * Creates Disposable data to fill a newly created Disposable type object
  * @param callback Callback to run when disposed
  */
inline def newDisposable(): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("newDisposable")().asInstanceOf[Disposable]
inline def newDisposable(callback: js.Function0[Unit]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("newDisposable")(callback.asInstanceOf[js.Any]).asInstanceOf[Disposable]

/** Called when a client connects to the backend */
inline def onDidConnect: Event[Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("onDidConnect").asInstanceOf[Event[Unit]]

// Events
/** Called when the backend has fully initialized. Extension activation is earlier. */
inline def onDidInit: Event[Unit] = ^.asInstanceOf[js.Dynamic].selectDynamic("onDidInit").asInstanceOf[Event[Unit]]

/**
  * Fires when an extension configuration value changes
  */
inline def onExtConfigChange: Event[Key] = ^.asInstanceOf[js.Dynamic].selectDynamic("onExtConfigChange").asInstanceOf[Event[Key]]

/**
  * Updates the Preferences data with a partial change.
  * @param data Partial data to apply
  * @param onError Callback for error handling
  * @returns Updated Preferences data
  */
inline def overwritePreferenceData(data: DeepPartialAppPreferencesAppPathOverrides): js.Promise[AppPreferencesData] = ^.asInstanceOf[js.Dynamic].applyDynamic("overwritePreferenceData")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AppPreferencesData]]
inline def overwritePreferenceData(data: DeepPartialAppPreferencesAppPathOverrides, onError: js.Function1[/* error */ String, Unit]): js.Promise[AppPreferencesData] = (^.asInstanceOf[js.Dynamic].applyDynamic("overwritePreferenceData")(data.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AppPreferencesData]]

/**
  * Register a disposable to its parent. They must not be the same.
  * @param parent Parent to register to
  * @param child Child to register
  */
inline def registerDisposable(parent: Disposable, child: Disposable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerDisposable")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Gets an extension configuration value given its key and a new value
  */
inline def setExtConfigValue(key: String, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtConfigValue")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

/** Unload own extension */
inline def unload(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unload")().asInstanceOf[js.Promise[Unit]]

/**
  * Unzips a file into a given directory (7zip)
  * @param filePath Path to archive
  * @param outDir Directory to output into
  * @param onProgress Function called whenever a new file is extracted
  */
inline def unzipFile(filePath: String, outDir: String, opts: ZipExtractOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("unzipFile")(filePath.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

/** Version of the Flashpoint Launcher */
inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

/** Utility type. Recursively set all properties as optional. */
type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? T[K] extends flashpoint-launcher.flashpoint-launcher.ObjectLike? flashpoint-launcher.flashpoint-launcher.DeepPartial<T[K]> : T[K]}
  */ typings.flashpointLauncher.flashpointLauncherStrings.DeepPartial & TopLevel[Any]

type Event[T] = js.Function3[
/* listener */ js.Function1[/* e */ T, Any], 
/* thisArgs */ js.UndefOr[Any], 
/* disposables */ js.UndefOr[Disposable], 
Disposable]

/** Replacement of "object" type. Note: I'm not sure how effective it is though //obelisk */
type ObjectLike = Record[Double | String, Any]

type ProcessEnv = StringDictionary[js.UndefOr[String]]

type TagFilter = js.Array[String]
