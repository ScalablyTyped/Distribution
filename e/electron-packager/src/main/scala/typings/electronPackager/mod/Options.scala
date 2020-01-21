package typings.electronPackager.mod

import org.scalablytyped.runtime.StringDictionary
import typings.electronPackager.AnonName
import typings.electronPackager.electronPackagerBooleans.`false`
import typings.std.RegExp
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
  var all: js.UndefOr[Boolean] = js.undefined
  /**
    * OS X/Mac App Store targets only
    */
  /**
    * The bundle identifier to use in the application's plist.
    */
  var appBundleId: js.UndefOr[String] = js.undefined
  /**
    * The application category type, as shown in the Finder via View → Arrange by Application Category when viewing the Applications directory.
    */
  var appCategoryType: js.UndefOr[String] = js.undefined
  /**
    * The human-readable copyright line for the app. Maps to the LegalCopyright metadata property on Windows, and NSHumanReadableCopyright on OS X.
    */
  var appCopyright: js.UndefOr[String] = js.undefined
  /**
    * The release version of the application. By default the version property in the package.json is used but it can be overridden with this argument.
    * If neither are provided, the version of Electron will be used. Maps to the ProductVersion metadata property on Windows, and CFBundleShortVersionString on OS X.
    */
  var appVersion: js.UndefOr[String] = js.undefined
  /**
    * The target system architecture(s) to build for. Not required if the all option is set.
    * If arch is set to all, all supported architectures for the target platforms specified by platform will be built.
    * Arbitrary combinations of individual architectures are also supported via a comma-delimited string or array of strings.
    * The non-all values correspond to the architecture names used by Electron releases. This value is not restricted to the official set if download.mirror is set.
    */
  var arch: js.UndefOr[typings.electronPackager.mod.arch | js.Array[typings.electronPackager.mod.arch]] = js.undefined
  /**
    * Whether to package the application's source code into an archive, using Electron's archive format
    */
  var asar: js.UndefOr[Boolean | AsarOptions] = js.undefined
  /**
    * The build version of the application. Defaults to the value of appVersion.
    * Maps to the FileVersion metadata property on Windows, and CFBundleVersion on OS X.
    */
  var buildVersion: js.UndefOr[String] = js.undefined
  /**
    * Forces support for Mojave (macOS 10.14) dark mode in the packaged app.
    */
  var darwinDarkModeSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether symlinks should be dereferenced during the copying of the application source.
    */
  var derefSymlinks: js.UndefOr[Boolean] = js.undefined
  /** The source directory. */
  var dir: String
  /**
    * If present, passes custom options to `@electron/get`
    */
  var download: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ js.Any
  ] = js.undefined
  /**
    * The Electron version with which the app is built (without the leading 'v') - for example, 1.4.13
    */
  var electronVersion: js.UndefOr[String] = js.undefined
  /**
    * The name of the executable file, sans file extension. Defaults to the value for the name parameter
    */
  var executableName: js.UndefOr[String] = js.undefined
  /**
    * When the value is a String, the filename of a plist file. Its contents are added to the app's plist.
    * When the value is an Object, an already-parsed plist data structure that is merged into the app's plist.
    */
  var extendInfo: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
  /**
    * One or more files to be copied directly into the app's Contents/Resources directory for OS X target platforms, and the resources directory for other target platforms.
    */
  var extraResource: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The bundle identifier to use in the application helper's plist.
    */
  var helperBundleId: js.UndefOr[String] = js.undefined
  /**
    * The local path to the icon file, if the target platform supports setting embedding an icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * One or more additional regular expression patterns which specify which files to ignore when copying files to create the app bundle(s).
    * The regular expressions are matched against the absolute path of a given file/directory to be copied.
    */
  var ignore: js.UndefOr[RegExp | js.Array[RegExp] | ignoreFunction] = js.undefined
  /**
    * The application name. If omitted, it will use the productName or name value from the nearest package.json
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * If present, notarizes OS X target apps when the host platform is OS X and XCode is installed.
    */
  var osxNotarize: js.UndefOr[ElectronNotarizeOptions] = js.undefined
  /**
    * If present, signs OS X target apps when the host platform is OS X and XCode is installed.
    */
  var osxSign: js.UndefOr[Boolean | ElectronOsXSignOptions] = js.undefined
  /** The output directory. */
  var out: js.UndefOr[String] = js.undefined
  /**
    * Whether to replace an already existing output directory for a given platform (true) or skip recreating it (false).
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  /**
    * The target platform(s) to build for. Not required if the all option is set.
    */
  var platform: js.UndefOr[typings.electronPackager.mod.platform] = js.undefined
  /**
    * The path to a prebuilt ASAR file.
    */
  var prebuiltAsar: js.UndefOr[String] = js.undefined
  /** The URL protocol schemes the app supports. */
  var protocols: js.UndefOr[js.Array[AnonName]] = js.undefined
  /**
    * Runs the package manager command to remove all of the packages specified in the devDependencies section of package.json from the outputted Electron app.
    */
  var prune: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, disables printing informational and warning messages to the console when packaging the application. This does not disable errors.
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
  /**
    * The base directory to use as a temp directory. Set to false to disable use of a temporary directory.
    */
  var tmpdir: js.UndefOr[String | `false`] = js.undefined
  /**
    * Windows targets only
    */
  var win32metadata: js.UndefOr[Win32Metadata] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dir: String,
    afterCopy: js.Array[onCompleteFn] = null,
    afterExtract: js.Array[onCompleteFn] = null,
    afterPrune: js.Array[onCompleteFn] = null,
    all: js.UndefOr[Boolean] = js.undefined,
    appBundleId: String = null,
    appCategoryType: String = null,
    appCopyright: String = null,
    appVersion: String = null,
    arch: arch | js.Array[arch] = null,
    asar: Boolean | AsarOptions = null,
    buildVersion: String = null,
    darwinDarkModeSupport: js.UndefOr[Boolean] = js.undefined,
    derefSymlinks: js.UndefOr[Boolean] = js.undefined,
    download: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ js.Any = null,
    electronVersion: String = null,
    executableName: String = null,
    extendInfo: String | StringDictionary[js.Any] = null,
    extraResource: String | js.Array[String] = null,
    helperBundleId: String = null,
    icon: String = null,
    ignore: RegExp | js.Array[RegExp] | ignoreFunction = null,
    name: String = null,
    osxNotarize: ElectronNotarizeOptions = null,
    osxSign: Boolean | ElectronOsXSignOptions = null,
    out: String = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    platform: platform = null,
    prebuiltAsar: String = null,
    protocols: js.Array[AnonName] = null,
    prune: js.UndefOr[Boolean] = js.undefined,
    quiet: js.UndefOr[Boolean] = js.undefined,
    tmpdir: String | `false` = null,
    win32metadata: Win32Metadata = null
  ): Options = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    if (afterCopy != null) __obj.updateDynamic("afterCopy")(afterCopy.asInstanceOf[js.Any])
    if (afterExtract != null) __obj.updateDynamic("afterExtract")(afterExtract.asInstanceOf[js.Any])
    if (afterPrune != null) __obj.updateDynamic("afterPrune")(afterPrune.asInstanceOf[js.Any])
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (appBundleId != null) __obj.updateDynamic("appBundleId")(appBundleId.asInstanceOf[js.Any])
    if (appCategoryType != null) __obj.updateDynamic("appCategoryType")(appCategoryType.asInstanceOf[js.Any])
    if (appCopyright != null) __obj.updateDynamic("appCopyright")(appCopyright.asInstanceOf[js.Any])
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (asar != null) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (buildVersion != null) __obj.updateDynamic("buildVersion")(buildVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(darwinDarkModeSupport)) __obj.updateDynamic("darwinDarkModeSupport")(darwinDarkModeSupport.asInstanceOf[js.Any])
    if (!js.isUndefined(derefSymlinks)) __obj.updateDynamic("derefSymlinks")(derefSymlinks.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (electronVersion != null) __obj.updateDynamic("electronVersion")(electronVersion.asInstanceOf[js.Any])
    if (executableName != null) __obj.updateDynamic("executableName")(executableName.asInstanceOf[js.Any])
    if (extendInfo != null) __obj.updateDynamic("extendInfo")(extendInfo.asInstanceOf[js.Any])
    if (extraResource != null) __obj.updateDynamic("extraResource")(extraResource.asInstanceOf[js.Any])
    if (helperBundleId != null) __obj.updateDynamic("helperBundleId")(helperBundleId.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (osxNotarize != null) __obj.updateDynamic("osxNotarize")(osxNotarize.asInstanceOf[js.Any])
    if (osxSign != null) __obj.updateDynamic("osxSign")(osxSign.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (prebuiltAsar != null) __obj.updateDynamic("prebuiltAsar")(prebuiltAsar.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(prune)) __obj.updateDynamic("prune")(prune.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (tmpdir != null) __obj.updateDynamic("tmpdir")(tmpdir.asInstanceOf[js.Any])
    if (win32metadata != null) __obj.updateDynamic("win32metadata")(win32metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

