package typings.electronPackager.mod

import org.scalablytyped.runtime.StringDictionary
import typings.asar.mod.CreateOptions
import typings.electronPackager.electronPackagerBooleans.`false`
import typings.electronPackager.electronPackagerBooleans.`true`
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options passed to the `packager()` function. */
trait Options extends js.Object {
  /**
    * Functions to be called after your app directory has been copied to a temporary directory.
    *
    * **Note**: `afterCopy` will not be called if the [[prebuiltAsar]] option is set.
    */
  var afterCopy: js.UndefOr[js.Array[HookFunction]] = js.undefined
  /** Functions to be called after the prebuilt Electron binary has been extracted to a temporary directory. */
  var afterExtract: js.UndefOr[js.Array[HookFunction]] = js.undefined
  /**
    * Functions to be called after Node module pruning has been applied to the application.
    *
    * **Note**: None of these functions will be called if the [[prune]] option is `false` or
    * the [[prebuiltAsar]] option is set.
    */
  var afterPrune: js.UndefOr[js.Array[HookFunction]] = js.undefined
  /** When `true`, sets both [[arch]] and [[platform]] to `all`. */
  var all: js.UndefOr[Boolean] = js.undefined
  /*
    * The bundle identifier to use in the application's `Info.plist`.
    *
    * @category macOS
    */
  var appBundleId: js.UndefOr[String] = js.undefined
  /**
    * The application category type, as shown in the Finder via *View → Arrange by Application
    * Category* when viewing the Applications directory.
    *
    * For example, `app-category-type=public.app-category.developer-tools` will set the
    * application category to *Developer Tools*.
    *
    * Valid values are listed in [Apple's documentation](https://developer.apple.com/library/ios/documentation/General/Reference/InfoPlistKeyReference/Articles/LaunchServicesKeys.html#//apple_ref/doc/uid/TP40009250-SW8).
    *
    * @category macOS
    */
  var appCategoryType: js.UndefOr[String] = js.undefined
  /**
    * The human-readable copyright line for the app. Maps to the `LegalCopyright` metadata
    * property on Windows, and `NSHumanReadableCopyright` on macOS.
    */
  var appCopyright: js.UndefOr[String] = js.undefined
  /**
    * The release version of the application.
    *
    * By default the `version` property in the `package.json` is used, but it can be overridden
    * with this argument. If neither are provided, the version of Electron will be used. Maps
    * to the `ProductVersion` metadata property on Windows, and `CFBundleShortVersionString`
    * on macOS.
    */
  var appVersion: js.UndefOr[String] = js.undefined
  /**
    * The target system architecture(s) to build for.
    *
    * Not required if the [[all]] option is set. If `arch` is set to `all`, all supported
    * architectures for the target platforms specified by [[platform]] will be built.
    * Arbitrary combinations of individual architectures are also supported via a comma-delimited
    * string or array of strings. The non-`all` values correspond to the architecture names used
    * by [Electron releases](https://github.com/electron/electron/releases). This value
    * is not restricted to the official set if [[download|`download.mirrorOptions`]] is set.
    *
    * Defaults to the arch of the host computer running Electron Packager.
    *
    * Arch values for the official prebuilt Electron binaries:
    * - `ia32`
    * - `x64`
    * - `armv7l`
    * - `arm64` _(Electron 1.8.0 and above)_
    * - `mips64el` _(Electron 1.8.2-beta.5 to 1.8.8)_
    */
  var arch: js.UndefOr[ArchOption | js.Array[ArchOption]] = js.undefined
  /**
    * Whether to package the application's source code into an archive, using [Electron's
    * archive format](https://github.com/electron/asar). Reasons why you may want to enable
    * this feature are described in [an application packaging tutorial in Electron's
    * documentation](https://electronjs.org/docs/tutorial/application-packaging/). When the value
    * is `true`, it passes the default configuration to the `asar` module. The configuration
    * values can be customized when the value is an `Object`. Supported sub-options include, but
    * are not limited to:
    * - `ordering` (*string*): A path to an ordering file for packing files. An explanation can be
    *   found on the [Atom issue tracker](https://github.com/atom/atom/issues/10163).
    * - `unpack` (*string*): A [glob expression](https://github.com/isaacs/minimatch#features),
    *   when specified, unpacks the file with matching names to the `app.asar.unpacked` directory.
    * - `unpackDir` (*string*): Unpacks the dir to the `app.asar.unpacked` directory whose names
    *   exactly or pattern match this string. The `asar.unpackDir` is relative to [[dir]].
    *
    * Defaults to `false`.
    *
    * Some examples:
    *
    * - `asar.unpackDir = 'sub_dir'` will unpack the directory `/<dir>/sub_dir`
    * - `asar.unpackDir = path.join('**', '{sub_dir1/sub_sub_dir,sub_dir2}', '*')` will unpack the directories `/<dir>/sub_dir1/sub_sub_dir` and `/<dir>/sub_dir2`, but it will not include their subdirectories.
    * - `asar.unpackDir = path.join('**', '{sub_dir1/sub_sub_dir,sub_dir2}', '**')` will unpack the subdirectories of the directories `/<dir>/sub_dir1/sub_sub_dir` and `/<dir>/sub_dir2`.
    * - `asar.unpackDir = path.join('**', '{sub_dir1/sub_sub_dir,sub_dir2}', '**', '*')` will unpack the directories `/<dir>/sub_dir1/sub_sub_dir` and `/<dir>/sub_dir2` and their subdirectories.
    *
    * **Note:** `asar` will have no effect if the [[prebuiltAsar]] option is set.
    */
  var asar: js.UndefOr[Boolean | CreateOptions] = js.undefined
  /**
    * The build version of the application. Defaults to the value of the [[appVersion]] option.
    * Maps to the `FileVersion` metadata property on Windows, and `CFBundleVersion` on macOS.
    */
  var buildVersion: js.UndefOr[String] = js.undefined
  /**
    * Forces support for Mojave (macOS 10.14) dark mode in your packaged app. This sets the
    * `NSRequiresAquaSystemAppearance` key to `false` in your app's `Info.plist`.  For more information,
    * see the [Electron documentation](https://www.electronjs.org/docs/tutorial/mojave-dark-mode-guide)
    * and the [Apple developer documentation](https://developer.apple.com/documentation/appkit/nsappearancecustomization/choosing_a_specific_appearance_for_your_app).
    *
    * @category macOS
    */
  var darwinDarkModeSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether symlinks should be dereferenced during the copying of the application source.
    * Defaults to `true`.
    *
    * **Note:** `derefSymlinks` will have no effect if the [[prebuiltAsar]] option is set.
    */
  var derefSymlinks: js.UndefOr[Boolean] = js.undefined
  /** The source directory. */
  var dir: String
  /**
    * If present, passes custom options to [`@electron/get`](https://npm.im/@electron/get). See
    * the module for option descriptions, proxy support, and defaults. Supported parameters
    * include, but are not limited to:
    * - `cacheRoot` (*string*): The directory where prebuilt, pre-packaged Electron downloads are cached.
    * - `mirrorOptions` (*Object*): Options to override the default Electron download location.
    * - `rejectUnauthorized` (*boolean* - default: `true`): Whether SSL certificates are required to be
    *   valid when downloading Electron.
    *
    * **Note:** `download` sub-options will have no effect if the [[electronZipDir]] option is set.
    */
  var download: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ js.Any
  ] = js.undefined
  /**
    * The Electron version with which the app is built (without the leading 'v') - for example,
    * [`1.4.13`](https://github.com/electron/electron/releases/tag/v1.4.13). See [Electron
    * releases](https://github.com/electron/electron/releases) for valid versions. If omitted, it
    * will use the version of the nearest local installation of `electron`,
    * `electron-prebuilt-compile`, or `electron-prebuilt`, defined in `package.json` in either
    * `devDependencies` or `dependencies`.
    */
  var electronVersion: js.UndefOr[String] = js.undefined
  /**
    * The local path to a directory containing Electron ZIP files for Electron Packager to unzip, instead
    * of downloading them. The ZIP filenames should be in the same format as the ones downloaded from the
    * [Electron releases](https://github.com/electron/electron/releases) site.
    *
    * **Note:** Setting this option prevents the [[download]] sub-options from being used, as
    * the functionality gets skipped over.
    */
  var electronZipDir: js.UndefOr[String] = js.undefined
  /**
    * The name of the executable file, sans file extension. Defaults to the value for the [[name]]
    * option. For `darwin` or `mas` target platforms, this does not affect the name of the
    * `.app` folder - this will use the [[name]] option instead.
    */
  var executableName: js.UndefOr[String] = js.undefined
  /**
    * When the value is a string, specifies the filename of a `plist` file. Its contents are merged
    * into the app's `Info.plist`.
    * When the value is an `Object`, it specifies an already-parsed `plist` data structure that is
    * merged into the app's `Info.plist`.
    *
    * Entries from `extendInfo` override entries in the base `Info.plist` file supplied by
    * `electron`, `electron-prebuilt-compile`, or `electron-prebuilt`, but are overridden by other
    * options such as [[appVersion]] or [[appBundleId]].
    *
    * @category macOS
    */
  var extendInfo: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
   // eslint-disable-line @typescript-eslint/no-explicit-any
  /**
    * One or more files to be copied directly into the app's `Contents/Resources` directory for
    * macOS target platforms, and the `resources` directory for other target platforms.
    */
  var extraResource: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The bundle identifier to use in the application helper's `Info.plist`.
    *
    * @category macOS
    */
  var helperBundleId: js.UndefOr[String] = js.undefined
  /**
    * The local path to the icon file, if the target platform supports setting embedding an icon.
    *
    * Currently you must look for conversion tools in order to supply an icon in the format required by the platform:
    *
    * - macOS: `.icns`
    * - Windows: `.ico` ([See the readme](https://github.com/electron/electron-packager#building-windows-apps-from-non-windows-platforms) for details on non-Windows platforms)
    * - Linux: this option is not supported, as the dock/window list icon is set via
    *   [the `icon` option in the `BrowserWindow` constructor](https://electronjs.org/docs/api/browser-window/#new-browserwindowoptions).
    *   *Please note that you need to use a PNG, and not the macOS or Windows icon formats, in order for it
    *   to show up in the dock/window list.* Setting the icon in the file manager is not currently supported.
    *
    * If the file extension is omitted, it is auto-completed to the correct extension based on the
    * platform, including when [[platform|`platform: 'all'`]] is in effect.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * One or more additional [regular expression](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_Expressions)
    * patterns which specify which files to ignore when copying files to create the app bundle(s). The
    * regular expressions are matched against the absolute path of a given file/directory to be copied.
    *
    * **Please note that [glob patterns](https://en.wikipedia.org/wiki/Glob_%28programming%29) will not work.**
    *
    * The following paths are always ignored (*when you aren't using an [[IgnoreFunction]]*):
    *
    * - the directory specified by the [[out]] option
    * - the temporary directory used to build the Electron app
    * - `node_modules/.bin`
    * - `node_modules/electron`
    * - `node_modules/electron-prebuilt`
    * - `node_modules/electron-prebuilt-compile`
    * - `.git`
    * - files and folders ending in `.o` and `.obj`
    *
    * **Note**: Node modules specified in `devDependencies` are ignored by default, via the
    * [[prune]] option.
    *
    * **Note:** `ignore` will have no effect if the [[prebuiltAsar]] option is set.
    */
  var ignore: js.UndefOr[RegExp | js.Array[RegExp] | IgnoreFunction] = js.undefined
  /**
    * Ignores [system junk files](https://github.com/sindresorhus/junk) when copying the Electron app,
    * regardless of the [[ignore]] option.
    *
    * **Note:** `junk` will have no effect if the [[prebuiltAsar]] option is set.
    */
  var junk: js.UndefOr[Boolean] = js.undefined
  /**
    * The application name. If omitted, it will use the `productName` or `name` value from the
    * nearest `package.json`.
    *
    * **Regardless of source, characters in the Electron app name which are not allowed in all target
    * platforms' filenames (e.g., `/`), will be replaced by hyphens (`-`).**
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * If present, notarizes macOS target apps when the host platform is macOS and XCode is installed.
    * See [`electron-notarize`](https://github.com/electron/electron-notarize#method-notarizeopts-promisevoid)
    * for option descriptions, such as how to use `appleIdPassword` safely or obtain an API key.
    *
    * **Requires the [[osxSign]] option to be set.**
    *
    * @category macOS
    */
  var osxNotarize: js.UndefOr[OsxNotarizeOptions] = js.undefined
  /**
    * If present, signs macOS target apps when the host platform is macOS and XCode is installed.
    * When the value is `true`, pass default configuration to the signing module. See
    * [electron-osx-sign](https://npm.im/electron-osx-sign#opts---options) for sub-option descriptions and
    * their defaults. Options include, but are not limited to:
    * - `identity` (*string*): The identity used when signing the package via `codesign`.
    * - `entitlements` (*string*): The path to the 'parent' entitlements.
    * - `entitlements-inherit` (*string*): The path to the 'child' entitlements.
    *
    * @category macOS
    */
  var osxSign: js.UndefOr[`true` | OsxSignOptions] = js.undefined
  /**
    * The base directory where the finished package(s) are created.
    *
    * Defaults to the current working directory.
    */
  var out: js.UndefOr[String] = js.undefined
  /**
    * Whether to replace an already existing output directory for a given platform (`true`) or
    * skip recreating it (`false`). Defaults to `false`.
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
  /**
    * The target platform(s) to build for.
    *
    * Not required if the [[all]] option is set. If `platform` is set to `all`, all officially
    * supported target platforms for the target architectures specified by the [[arch]] option
    * will be built. Arbitrary combinations of individual platforms are also supported via a
    * comma-delimited string or array of strings.
    *
    * The official non-`all` values correspond to the platform names used by [Electron
    * releases](https://github.com/electron/electron/releases). This value is not restricted to
    * the official set if [[download|`download.mirrorOptions]] is set.
    *
    * Defaults to the platform of the host computer running Electron Packager.
    *
    * Platform values for the official prebuilt Electron binaries:
    * - `darwin` (macOS)
    * - `linux`
    * - `mas` (macOS, specifically for submitting to the Mac App Store)
    * - `win32`
    */
  var platform: js.UndefOr[PlatformOption | js.Array[PlatformOption]] = js.undefined
  /**
    * The path to a prebuilt ASAR file.
    *
    * **Note:** Setting this option prevents the following options from being used, as the functionality
    * gets skipped over:
    *
    * - [[asar]]
    * - [[afterCopy]]
    * - [[afterPrune]]
    * - [[derefSymlinks]]
    * - [[ignore]]
    * - [[junk]]
    * - [[prune]]
    */
  var prebuiltAsar: js.UndefOr[String] = js.undefined
  /**
    * The URL protocol schemes associated with the Electron app.
    *
    * @category macOS
    */
  var protocols: js.UndefOr[js.Array[MacOSProtocol]] = js.undefined
  /**
    * Walks the `node_modules` dependency tree to remove all of the packages specified in the
    * `devDependencies` section of `package.json` from the outputted Electron app.
    *
    * Defaults to `true`.
    *
    * **Note:** `prune` will have no effect if the [[prebuiltAsar]] option is set.
    */
  var prune: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, disables printing informational and warning messages to the console when
    * packaging the application. This does not disable errors.
    *
    * Defaults to `false`.
    */
  var quiet: js.UndefOr[Boolean] = js.undefined
  /**
    * The base directory to use as a temporary directory. Set to `false` to disable use of a
    * temporary directory. Defaults to the system's temporary directory.
    */
  var tmpdir: js.UndefOr[String | `false`] = js.undefined
  /**
    * Human-readable descriptions of how the Electron app uses certain macOS features. These are displayed
    * in the App Store. A non-exhaustive list of available properties:
    *
    * * `Camera` - required for media access API usage in macOS Catalina
    * * `Microphone` - required for media access API usage in macOS Catalina
    *
    * Valid properties are the [Cocoa keys for MacOS](https://developer.apple.com/library/archive/documentation/General/Reference/InfoPlistKeyReference/Articles/CocoaKeys.html)
    * of the pattern `NS(.*)UsageDescription`, where the captured group is the key to use.
    *
    * Example:
    *
    * ```javascript
    * {
    *   usageDescription: {
    *     Camera: 'Needed for video calls',
    *     Microphone: 'Needed for voice calls'
    *   }
    * }
    * ```
    *
    * @category macOS
    */
  var usageDescription: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Application metadata to embed into the Windows executable.
    * @category Windows
    */
  var win32metadata: js.UndefOr[Win32MetadataOptions] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dir: String,
    afterCopy: js.Array[HookFunction] = null,
    afterExtract: js.Array[HookFunction] = null,
    afterPrune: js.Array[HookFunction] = null,
    all: js.UndefOr[Boolean] = js.undefined,
    appBundleId: String = null,
    appCategoryType: String = null,
    appCopyright: String = null,
    appVersion: String = null,
    arch: ArchOption | js.Array[ArchOption] = null,
    asar: Boolean | CreateOptions = null,
    buildVersion: String = null,
    darwinDarkModeSupport: js.UndefOr[Boolean] = js.undefined,
    derefSymlinks: js.UndefOr[Boolean] = js.undefined,
    download: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ js.Any = null,
    electronVersion: String = null,
    electronZipDir: String = null,
    executableName: String = null,
    extendInfo: String | StringDictionary[js.Any] = null,
    extraResource: String | js.Array[String] = null,
    helperBundleId: String = null,
    icon: String = null,
    ignore: RegExp | js.Array[RegExp] | IgnoreFunction = null,
    junk: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    osxNotarize: OsxNotarizeOptions = null,
    osxSign: `true` | OsxSignOptions = null,
    out: String = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    platform: PlatformOption | js.Array[PlatformOption] = null,
    prebuiltAsar: String = null,
    protocols: js.Array[MacOSProtocol] = null,
    prune: js.UndefOr[Boolean] = js.undefined,
    quiet: js.UndefOr[Boolean] = js.undefined,
    tmpdir: String | `false` = null,
    usageDescription: StringDictionary[String] = null,
    win32metadata: Win32MetadataOptions = null
  ): Options = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
    if (afterCopy != null) __obj.updateDynamic("afterCopy")(afterCopy.asInstanceOf[js.Any])
    if (afterExtract != null) __obj.updateDynamic("afterExtract")(afterExtract.asInstanceOf[js.Any])
    if (afterPrune != null) __obj.updateDynamic("afterPrune")(afterPrune.asInstanceOf[js.Any])
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.get.asInstanceOf[js.Any])
    if (appBundleId != null) __obj.updateDynamic("appBundleId")(appBundleId.asInstanceOf[js.Any])
    if (appCategoryType != null) __obj.updateDynamic("appCategoryType")(appCategoryType.asInstanceOf[js.Any])
    if (appCopyright != null) __obj.updateDynamic("appCopyright")(appCopyright.asInstanceOf[js.Any])
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (asar != null) __obj.updateDynamic("asar")(asar.asInstanceOf[js.Any])
    if (buildVersion != null) __obj.updateDynamic("buildVersion")(buildVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(darwinDarkModeSupport)) __obj.updateDynamic("darwinDarkModeSupport")(darwinDarkModeSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(derefSymlinks)) __obj.updateDynamic("derefSymlinks")(derefSymlinks.get.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (electronVersion != null) __obj.updateDynamic("electronVersion")(electronVersion.asInstanceOf[js.Any])
    if (electronZipDir != null) __obj.updateDynamic("electronZipDir")(electronZipDir.asInstanceOf[js.Any])
    if (executableName != null) __obj.updateDynamic("executableName")(executableName.asInstanceOf[js.Any])
    if (extendInfo != null) __obj.updateDynamic("extendInfo")(extendInfo.asInstanceOf[js.Any])
    if (extraResource != null) __obj.updateDynamic("extraResource")(extraResource.asInstanceOf[js.Any])
    if (helperBundleId != null) __obj.updateDynamic("helperBundleId")(helperBundleId.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(junk)) __obj.updateDynamic("junk")(junk.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (osxNotarize != null) __obj.updateDynamic("osxNotarize")(osxNotarize.asInstanceOf[js.Any])
    if (osxSign != null) __obj.updateDynamic("osxSign")(osxSign.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.get.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (prebuiltAsar != null) __obj.updateDynamic("prebuiltAsar")(prebuiltAsar.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(prune)) __obj.updateDynamic("prune")(prune.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (tmpdir != null) __obj.updateDynamic("tmpdir")(tmpdir.asInstanceOf[js.Any])
    if (usageDescription != null) __obj.updateDynamic("usageDescription")(usageDescription.asInstanceOf[js.Any])
    if (win32metadata != null) __obj.updateDynamic("win32metadata")(win32metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

