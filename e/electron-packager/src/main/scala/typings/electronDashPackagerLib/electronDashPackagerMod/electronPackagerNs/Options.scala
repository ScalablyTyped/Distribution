package typings
package electronDashPackagerLib.electronDashPackagerMod.electronPackagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Electron-packager Options. */
trait Options extends js.Object {
  /**
    * Optional list of methods to call on completion of each process
    */
  var afterCopy: js.UndefOr[js.Array[onCompleteFn]] = js.undefined
  var afterExtract: js.UndefOr[js.Array[onCompleteFn]] = js.undefined
  var afterPrune: js.UndefOr[js.Array[onCompleteFn]] = js.undefined
  /** Shortcut for `--arch=all --platform=all`. */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * OS X/Mac App Store targets only
    */
  /**
    * The bundle identifier to use in the application's plist.
    */
  var appBundleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The application category type, as shown in the Finder via View → Arrange by Application Category when viewing the Applications directory.
    */
  var appCategoryType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The human-readable copyright line for the app. Maps to the LegalCopyright metadata property on Windows, and NSHumanReadableCopyright on OS X.
    */
  var appCopyright: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The release version of the application. By default the version property in the package.json is used but it can be overridden with this argument.
    * If neither are provided, the version of Electron will be used. Maps to the ProductVersion metadata property on Windows, and CFBundleShortVersionString on OS X.
    */
  var appVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The target system architecture(s) to build for. Not required if the all option is set.
    * If arch is set to all, all supported architectures for the target platforms specified by platform will be built.
    * Arbitrary combinations of individual architectures are also supported via a comma-delimited string or array of strings.
    * The non-all values correspond to the architecture names used by Electron releases. This value is not restricted to the official set if download.mirror is set.
    */
  var arch: js.UndefOr[arch | js.Array[arch]] = js.undefined
  /**
    * Whether to package the application's source code into an archive, using Electron's archive format
    */
  var asar: js.UndefOr[scala.Boolean | AsarOptions] = js.undefined
  /**
    * The build version of the application. Defaults to the value of appVersion.
    * Maps to the FileVersion metadata property on Windows, and CFBundleVersion on OS X.
    */
  var buildVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Forces support for Mojave (macOS 10.14) dark mode in the packaged app.
    */
  var darwinDarkModeSupport: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether symlinks should be dereferenced during the copying of the application source.
    */
  var derefSymlinks: js.UndefOr[scala.Boolean] = js.undefined
  /** The source directory. */
  var dir: java.lang.String
  /**
    * If present, passes custom options to electron-download
    */
  var download: js.UndefOr[ElectronDownloadOptions] = js.undefined
  /**
    * The Electron version with which the app is built (without the leading 'v') - for example, 1.4.13
    */
  var electronVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the executable file, sans file extension. Defaults to the value for the name parameter
    */
  var executableName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When the value is a String, the filename of a plist file. Its contents are added to the app's plist.
    * When the value is an Object, an already-parsed plist data structure that is merged into the app's plist.
    */
  var extendInfo: js.UndefOr[java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * One or more files to be copied directly into the app's Contents/Resources directory for OS X target platforms, and the resources directory for other target platforms.
    */
  var extraResource: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The bundle identifier to use in the application helper's plist.
    */
  var helperBundleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The local path to the icon file, if the target platform supports setting embedding an icon.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * One or more additional regular expression patterns which specify which files to ignore when copying files to create the app bundle(s).
    * The regular expressions are matched against the absolute path of a given file/directory to be copied.
    */
  var ignore: js.UndefOr[stdLib.RegExp | js.Array[stdLib.RegExp] | ignoreFunction] = js.undefined
  /**
    * The application name. If omitted, it will use the productName or name value from the nearest package.json
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If present, notarizes OS X target apps when the host platform is OS X and XCode is installed.
    */
  var osxNotarize: js.UndefOr[ElectronNotarizeOptions] = js.undefined
  /**
    * If present, signs OS X target apps when the host platform is OS X and XCode is installed.
    */
  var osxSign: js.UndefOr[scala.Boolean | ElectronOsXSignOptions] = js.undefined
  /** The output directory. */
  var out: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to replace an already existing output directory for a given platform (true) or skip recreating it (false).
    */
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The target platform(s) to build for. Not required if the all option is set.
    */
  var platform: js.UndefOr[platform] = js.undefined
  /**
    * The path to a prebuilt ASAR file.
    */
  var prebuiltAsar: js.UndefOr[java.lang.String] = js.undefined
  /** The URL protocol schemes the app supports. */
  var protocols: js.UndefOr[js.Array[electronDashPackagerLib.Anon_Name]] = js.undefined
  /**
    * Runs the package manager command to remove all of the packages specified in the devDependencies section of package.json from the outputted Electron app.
    */
  var prune: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, disables printing informational and warning messages to the console when packaging the application. This does not disable errors.
    */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The base directory to use as a temp directory. Set to false to disable use of a temporary directory.
    */
  var tmpdir: js.UndefOr[
    java.lang.String | electronDashPackagerLib.electronDashPackagerLibNumbers.`false`
  ] = js.undefined
  /**
    * Windows targets only
    */
  var win32metadata: js.UndefOr[Win32Metadata] = js.undefined
}

