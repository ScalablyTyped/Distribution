package typings.electronPackager

import org.scalablytyped.runtime.StringDictionary
import typings.electronAsar.mod.CreateOptions
import typings.electronNotarize.libTypesMod.LegacyNotarizeCredentials
import typings.electronNotarize.libTypesMod.NotaryToolCredentials
import typings.electronNotarize.libTypesMod.TransporterOptions
import typings.electronOsxSign.distEsmTypesMod.PerFileSignOptions
import typings.electronOsxSign.distEsmTypesMod.SigningDistributionType
import typings.electronPackager.anon.Tool
import typings.electronPackager.anon.`0`
import typings.electronPackager.electronPackagerBooleans.`false`
import typings.electronPackager.electronPackagerBooleans.`true`
import typings.electronPackager.electronPackagerStrings.all
import typings.electronPackager.electronPackagerStrings.arm64AppPath
import typings.electronPackager.electronPackagerStrings.asInvoker
import typings.electronPackager.electronPackagerStrings.force
import typings.electronPackager.electronPackagerStrings.highestAvailable
import typings.electronPackager.electronPackagerStrings.outAppPath
import typings.electronPackager.electronPackagerStrings.requireAdministrator
import typings.electronPackager.electronPackagerStrings.x64AppPath
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Bundles Electron-based application source code with a renamed/customized Electron executable and
    * its supporting files into folders ready for distribution.
    *
    * Briefly, this function:
    * - finds or downloads the correct release of Electron
    * - uses that version of Electron to create a app in `<out>/<appname>-<platform>-<arch>`
    *
    * Short example:
    *
    * ```javascript
    * const packager = require('electron-packager')
    *
    * async function bundleElectronApp(options) {
    *   const appPaths = await packager(options)
    *   console.log(`Electron app bundles created:\n${appPaths.join("\n")}`)
    * }
    * ```
    *
    * @param opts - Options to configure packaging.
    *
    * @returns A Promise containing the paths to the newly created application bundles.
    */
  inline def apply(opts: Options): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  @JSImport("electron-packager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ArchOption = TargetArch | all
  
  type FinalizePackageTargetsHookFunction = js.Function2[
    /* targets */ js.Array[TargetDefinition], 
    /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
    Unit
  ]
  
  /**
    * A function that is called on the completion of a packaging stage.
    *
    * By default, the functions are called in parallel (via
    * [`Promise.all`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise/all)).
    * If you need the functions called serially, there is a utility function provided. Please note that
    * **callback-style functions are not supported by `serialHooks`.** For example:
    *
    * ```javascript
    * const packager = require('electron-packager')
    * const { serialHooks } = require('electron-packager/src/hooks')
    *
    * packager({
    *   // ...
    *   afterCopy: [serialHooks([
    *     (buildPath, electronVersion, platform, arch) => {
    *       return new Promise((resolve, reject) => {
    *         setTimeout(() => {
    *           console.log('first function')
    *           resolve()
    *         }, 1000)
    *       })
    *     },
    *     (buildPath, electronVersion, platform, arch) => {
    *       console.log('second function')
    *     }
    *   ])],
    *   // ...
    * })
    * ```
    *
    * For real-world examples of `HookFunction`s, see the [list of related
    * plugins](https://github.com/electron/electron-packager#plugins).
    */
  type HookFunction = /**
    * @param buildPath - For [[afterExtract]], the path to the temporary folder where the prebuilt
    * Electron binary has been extracted to. For [[afterCopy]] and [[afterPrune]], the path to the
    * folder where the Electron app has been copied to. For [[afterComplete]], the final directory
    * of the packaged application.
    * @param electronVersion - the version of Electron that is being bundled with the application.
    * @param platform - The target platform you are packaging for.
    * @param arch - The target architecture you are packaging for.
    * @param callback - Must be called once you have completed your actions.
    */
  js.Function5[
    /* buildPath */ String, 
    /* electronVersion */ String, 
    /* platform */ TargetArch, 
    /* arch */ TargetArch, 
    /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
    Unit
  ]
  
  /**
    * A predicate function that, given an absolute file `path`, returns `true` if the file should be
    * ignored, or `false` if the file should be kept. *This does not use any of the default ignored
    * files/directories listed for the [[ignore]] option.*
    */
  type IgnoreFunction = js.Function1[/* path */ String, Boolean]
  
  /**
    * Defines URL protocol schemes to be used on macOS.
    */
  trait MacOSProtocol extends StObject {
    
    /**
      * The descriptive name. Maps to the `CFBundleURLName` metadata property.
      */
    var name: String
    
    /**
      * One or more protocol schemes associated with the app. For example, specifying `myapp`
      * would cause URLs such as `myapp://path` to be opened with the app. Maps to the
      * `CFBundleURLSchemes` metadata property.
      */
    var schemes: js.Array[String]
  }
  object MacOSProtocol {
    
    inline def apply(name: String, schemes: js.Array[String]): MacOSProtocol = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
      __obj.asInstanceOf[MacOSProtocol]
    }
    
    extension [Self <: MacOSProtocol](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
      
      inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
    }
  }
  
  type MakeUniversalOpts = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof makeUniversalApp * / any>[0] */ js.Any
  
  type NotarizeLegacyOptions = LegacyNotarizeCredentials & TransporterOptions
  
  /**
    * Architectures that have been supported by the official Electron prebuilt binaries, past
    * and present.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.electronPackager.electronPackagerStrings.ia32
    - typings.electronPackager.electronPackagerStrings.x64
    - typings.electronPackager.electronPackagerStrings.armv7l
    - typings.electronPackager.electronPackagerStrings.arm64
    - typings.electronPackager.electronPackagerStrings.mips64el
    - typings.electronPackager.electronPackagerStrings.universal
  */
  trait OfficialArch extends StObject
  object OfficialArch {
    
    inline def arm64: typings.electronPackager.electronPackagerStrings.arm64 = "arm64".asInstanceOf[typings.electronPackager.electronPackagerStrings.arm64]
    
    inline def armv7l: typings.electronPackager.electronPackagerStrings.armv7l = "armv7l".asInstanceOf[typings.electronPackager.electronPackagerStrings.armv7l]
    
    inline def ia32: typings.electronPackager.electronPackagerStrings.ia32 = "ia32".asInstanceOf[typings.electronPackager.electronPackagerStrings.ia32]
    
    inline def mips64el: typings.electronPackager.electronPackagerStrings.mips64el = "mips64el".asInstanceOf[typings.electronPackager.electronPackagerStrings.mips64el]
    
    inline def universal: typings.electronPackager.electronPackagerStrings.universal = "universal".asInstanceOf[typings.electronPackager.electronPackagerStrings.universal]
    
    inline def x64: typings.electronPackager.electronPackagerStrings.x64 = "x64".asInstanceOf[typings.electronPackager.electronPackagerStrings.x64]
  }
  
  /**
    * Platforms that have been supported by the official Electron prebuilt binaries, past and present.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.electronPackager.electronPackagerStrings.linux
    - typings.electronPackager.electronPackagerStrings.win32
    - typings.electronPackager.electronPackagerStrings.darwin
    - typings.electronPackager.electronPackagerStrings.mas
  */
  trait OfficialPlatform extends StObject
  object OfficialPlatform {
    
    inline def darwin: typings.electronPackager.electronPackagerStrings.darwin = "darwin".asInstanceOf[typings.electronPackager.electronPackagerStrings.darwin]
    
    inline def linux: typings.electronPackager.electronPackagerStrings.linux = "linux".asInstanceOf[typings.electronPackager.electronPackagerStrings.linux]
    
    inline def mas: typings.electronPackager.electronPackagerStrings.mas = "mas".asInstanceOf[typings.electronPackager.electronPackagerStrings.mas]
    
    inline def win32: typings.electronPackager.electronPackagerStrings.win32 = "win32".asInstanceOf[typings.electronPackager.electronPackagerStrings.win32]
  }
  
  /** Options passed to the `packager()` function. */
  trait Options extends StObject {
    
    /**
      * Functions to be called after your app directory has been packaged into an .asar file.
      *
      * **Note**: `afterAsar` will only be called if the [[asar]] option is set.
      */
    var afterAsar: js.UndefOr[js.Array[HookFunction]] = js.undefined
    
    /** Functions to be called after the packaged application has been moved to the final directory. */
    var afterComplete: js.UndefOr[js.Array[HookFunction]] = js.undefined
    
    /**
      * Functions to be called after your app directory has been copied to a temporary directory.
      *
      * **Note**: `afterCopy` will not be called if the [[prebuiltAsar]] option is set.
      */
    var afterCopy: js.UndefOr[js.Array[HookFunction]] = js.undefined
    
    /**
      * Functions to be called after the files specified in the [[extraResource]] option have been copied.
      **/
    var afterCopyExtraResources: js.UndefOr[js.Array[HookFunction]] = js.undefined
    
    /** Functions to be called after the prebuilt Electron binary has been extracted to a temporary directory. */
    var afterExtract: js.UndefOr[js.Array[HookFunction]] = js.undefined
    
    /**
      * Functions to be called after the final matrix of platform/arch combination is determined.  Use this to
      * learn what archs/platforms packager is targetting when you pass "all" as a value.
      */
    var afterFinalizePackageTargets: js.UndefOr[js.Array[FinalizePackageTargetsHookFunction]] = js.undefined
    
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
      * - `arm64` _(Linux: Electron 1.8.0 and above; Windows: 6.0.8 and above; macOS: 11.0.0-beta.1 and above)_
      * - `mips64el` _(Electron 1.8.2-beta.5 to 1.8.8)_
      */
    var arch: js.UndefOr[ArchOption | js.Array[ArchOption]] = js.undefined
    
    /**
      * Whether to package the application's source code into an archive, using [Electron's
      * archive format](https://github.com/electron/asar). Reasons why you may want to enable
      * this feature include mitigating issues around long path names on Windows, slightly speeding
      * up `require`, and concealing your source code from cursory inspection. When the value
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
      * Functions to be called before your app directory is packaged into an .asar file.
      *
      * **Note**: `beforeAsar` will only be called if the [[asar]] option is set.
      */
    var beforeAsar: js.UndefOr[js.Array[HookFunction]] = js.undefined
    
    /**
      * Functions to be called before your app directory is copied to a temporary directory.
      *
      * **Note**: `beforeCopy` will not be called if the [[prebuiltAsar]] option is set.
      */
    var beforeCopy: js.UndefOr[js.Array[HookFunction]] = js.undefined
    
    /**
      * Functions to be called before the files specified in the [[extraResource]] option are copied.
      **/
    var beforeCopyExtraResources: js.UndefOr[js.Array[HookFunction]] = js.undefined
    
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ Any
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
    
    // eslint-disable-line @typescript-eslint/no-explicit-any
    /**
      * When the value is a string, specifies the filename of a `plist` file. Its contents are merged
      * into all the Helper apps' `Info.plist` files.
      * When the value is an `Object`, it specifies an already-parsed `plist` data structure that is
      * merged into all the Helper apps' `Info.plist` files.
      *
      * Entries from `extendHelperInfo` override entries in the helper apps' `Info.plist` file supplied by
      * `electron`, `electron-prebuilt-compile`, or `electron-prebuilt`, but are overridden by other
      * options such as [[appVersion]] or [[appBundleId]].
      *
      * @category macOS
      */
    var extendHelperInfo: js.UndefOr[String | StringDictionary[Any]] = js.undefined
    
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
    var extendInfo: js.UndefOr[String | StringDictionary[Any]] = js.undefined
    
    // eslint-disable-line @typescript-eslint/no-explicit-any
    /**
      * One or more files to be copied directly into the app's `Contents/Resources` directory for
      * macOS target platforms, and the `resources` directory for other target platforms. The
      * resources directory can be referenced in the packaged app via the
      * [`process.resourcesPath`](https://www.electronjs.org/docs/api/process#processresourcespath-readonly) value.
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
    var ignore: js.UndefOr[js.RegExp | js.Array[js.RegExp] | IgnoreFunction] = js.undefined
    
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
      * See [`@electron/notarize`](https://github.com/electron/notarize#method-notarizeopts-promisevoid)
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
      * [@electron/osx-sign](https://npm.im/@electron/osx-sign#opts---options) for sub-option descriptions and
      * their defaults. Options include, but are not limited to:
      * - `identity` (*string*): The identity used when signing the package via `codesign`.
      * - `binaries` (*array<string>*): Path to additional binaries that will be signed along with built-ins of Electron/
      *
      * @category macOS
      */
    var osxSign: js.UndefOr[`true` | OsxSignOptions] = js.undefined
    
    /**
      * Used to provide custom options to the internal call to `@electron/universal` when building a macOS
      * app with the target architecture of "universal".  Unused otherwise, providing a value does not imply
      * a universal app is built.
      */
    var osxUniversal: js.UndefOr[OsxUniversalOptions] = js.undefined
    
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
    
    inline def apply(dir: String): Options = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAfterAsar(value: js.Array[HookFunction]): Self = StObject.set(x, "afterAsar", value.asInstanceOf[js.Any])
      
      inline def setAfterAsarUndefined: Self = StObject.set(x, "afterAsar", js.undefined)
      
      inline def setAfterAsarVarargs(value: HookFunction*): Self = StObject.set(x, "afterAsar", js.Array(value*))
      
      inline def setAfterComplete(value: js.Array[HookFunction]): Self = StObject.set(x, "afterComplete", value.asInstanceOf[js.Any])
      
      inline def setAfterCompleteUndefined: Self = StObject.set(x, "afterComplete", js.undefined)
      
      inline def setAfterCompleteVarargs(value: HookFunction*): Self = StObject.set(x, "afterComplete", js.Array(value*))
      
      inline def setAfterCopy(value: js.Array[HookFunction]): Self = StObject.set(x, "afterCopy", value.asInstanceOf[js.Any])
      
      inline def setAfterCopyExtraResources(value: js.Array[HookFunction]): Self = StObject.set(x, "afterCopyExtraResources", value.asInstanceOf[js.Any])
      
      inline def setAfterCopyExtraResourcesUndefined: Self = StObject.set(x, "afterCopyExtraResources", js.undefined)
      
      inline def setAfterCopyExtraResourcesVarargs(value: HookFunction*): Self = StObject.set(x, "afterCopyExtraResources", js.Array(value*))
      
      inline def setAfterCopyUndefined: Self = StObject.set(x, "afterCopy", js.undefined)
      
      inline def setAfterCopyVarargs(value: HookFunction*): Self = StObject.set(x, "afterCopy", js.Array(value*))
      
      inline def setAfterExtract(value: js.Array[HookFunction]): Self = StObject.set(x, "afterExtract", value.asInstanceOf[js.Any])
      
      inline def setAfterExtractUndefined: Self = StObject.set(x, "afterExtract", js.undefined)
      
      inline def setAfterExtractVarargs(value: HookFunction*): Self = StObject.set(x, "afterExtract", js.Array(value*))
      
      inline def setAfterFinalizePackageTargets(value: js.Array[FinalizePackageTargetsHookFunction]): Self = StObject.set(x, "afterFinalizePackageTargets", value.asInstanceOf[js.Any])
      
      inline def setAfterFinalizePackageTargetsUndefined: Self = StObject.set(x, "afterFinalizePackageTargets", js.undefined)
      
      inline def setAfterFinalizePackageTargetsVarargs(value: FinalizePackageTargetsHookFunction*): Self = StObject.set(x, "afterFinalizePackageTargets", js.Array(value*))
      
      inline def setAfterPrune(value: js.Array[HookFunction]): Self = StObject.set(x, "afterPrune", value.asInstanceOf[js.Any])
      
      inline def setAfterPruneUndefined: Self = StObject.set(x, "afterPrune", js.undefined)
      
      inline def setAfterPruneVarargs(value: HookFunction*): Self = StObject.set(x, "afterPrune", js.Array(value*))
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setAppBundleId(value: String): Self = StObject.set(x, "appBundleId", value.asInstanceOf[js.Any])
      
      inline def setAppBundleIdUndefined: Self = StObject.set(x, "appBundleId", js.undefined)
      
      inline def setAppCategoryType(value: String): Self = StObject.set(x, "appCategoryType", value.asInstanceOf[js.Any])
      
      inline def setAppCategoryTypeUndefined: Self = StObject.set(x, "appCategoryType", js.undefined)
      
      inline def setAppCopyright(value: String): Self = StObject.set(x, "appCopyright", value.asInstanceOf[js.Any])
      
      inline def setAppCopyrightUndefined: Self = StObject.set(x, "appCopyright", js.undefined)
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      inline def setArch(value: ArchOption | js.Array[ArchOption]): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      inline def setArchVarargs(value: ArchOption*): Self = StObject.set(x, "arch", js.Array(value*))
      
      inline def setAsar(value: Boolean | CreateOptions): Self = StObject.set(x, "asar", value.asInstanceOf[js.Any])
      
      inline def setAsarUndefined: Self = StObject.set(x, "asar", js.undefined)
      
      inline def setBeforeAsar(value: js.Array[HookFunction]): Self = StObject.set(x, "beforeAsar", value.asInstanceOf[js.Any])
      
      inline def setBeforeAsarUndefined: Self = StObject.set(x, "beforeAsar", js.undefined)
      
      inline def setBeforeAsarVarargs(value: HookFunction*): Self = StObject.set(x, "beforeAsar", js.Array(value*))
      
      inline def setBeforeCopy(value: js.Array[HookFunction]): Self = StObject.set(x, "beforeCopy", value.asInstanceOf[js.Any])
      
      inline def setBeforeCopyExtraResources(value: js.Array[HookFunction]): Self = StObject.set(x, "beforeCopyExtraResources", value.asInstanceOf[js.Any])
      
      inline def setBeforeCopyExtraResourcesUndefined: Self = StObject.set(x, "beforeCopyExtraResources", js.undefined)
      
      inline def setBeforeCopyExtraResourcesVarargs(value: HookFunction*): Self = StObject.set(x, "beforeCopyExtraResources", js.Array(value*))
      
      inline def setBeforeCopyUndefined: Self = StObject.set(x, "beforeCopy", js.undefined)
      
      inline def setBeforeCopyVarargs(value: HookFunction*): Self = StObject.set(x, "beforeCopy", js.Array(value*))
      
      inline def setBuildVersion(value: String): Self = StObject.set(x, "buildVersion", value.asInstanceOf[js.Any])
      
      inline def setBuildVersionUndefined: Self = StObject.set(x, "buildVersion", js.undefined)
      
      inline def setDarwinDarkModeSupport(value: Boolean): Self = StObject.set(x, "darwinDarkModeSupport", value.asInstanceOf[js.Any])
      
      inline def setDarwinDarkModeSupportUndefined: Self = StObject.set(x, "darwinDarkModeSupport", js.undefined)
      
      inline def setDerefSymlinks(value: Boolean): Self = StObject.set(x, "derefSymlinks", value.asInstanceOf[js.Any])
      
      inline def setDerefSymlinksUndefined: Self = StObject.set(x, "derefSymlinks", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDownload(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElectronDownloadOptions */ Any
      ): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setElectronVersion(value: String): Self = StObject.set(x, "electronVersion", value.asInstanceOf[js.Any])
      
      inline def setElectronVersionUndefined: Self = StObject.set(x, "electronVersion", js.undefined)
      
      inline def setElectronZipDir(value: String): Self = StObject.set(x, "electronZipDir", value.asInstanceOf[js.Any])
      
      inline def setElectronZipDirUndefined: Self = StObject.set(x, "electronZipDir", js.undefined)
      
      inline def setExecutableName(value: String): Self = StObject.set(x, "executableName", value.asInstanceOf[js.Any])
      
      inline def setExecutableNameUndefined: Self = StObject.set(x, "executableName", js.undefined)
      
      inline def setExtendHelperInfo(value: String | StringDictionary[Any]): Self = StObject.set(x, "extendHelperInfo", value.asInstanceOf[js.Any])
      
      inline def setExtendHelperInfoUndefined: Self = StObject.set(x, "extendHelperInfo", js.undefined)
      
      inline def setExtendInfo(value: String | StringDictionary[Any]): Self = StObject.set(x, "extendInfo", value.asInstanceOf[js.Any])
      
      inline def setExtendInfoUndefined: Self = StObject.set(x, "extendInfo", js.undefined)
      
      inline def setExtraResource(value: String | js.Array[String]): Self = StObject.set(x, "extraResource", value.asInstanceOf[js.Any])
      
      inline def setExtraResourceUndefined: Self = StObject.set(x, "extraResource", js.undefined)
      
      inline def setExtraResourceVarargs(value: String*): Self = StObject.set(x, "extraResource", js.Array(value*))
      
      inline def setHelperBundleId(value: String): Self = StObject.set(x, "helperBundleId", value.asInstanceOf[js.Any])
      
      inline def setHelperBundleIdUndefined: Self = StObject.set(x, "helperBundleId", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIgnore(value: js.RegExp | js.Array[js.RegExp] | IgnoreFunction): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunction1(value: /* path */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: js.RegExp*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setJunk(value: Boolean): Self = StObject.set(x, "junk", value.asInstanceOf[js.Any])
      
      inline def setJunkUndefined: Self = StObject.set(x, "junk", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOsxNotarize(value: OsxNotarizeOptions): Self = StObject.set(x, "osxNotarize", value.asInstanceOf[js.Any])
      
      inline def setOsxNotarizeUndefined: Self = StObject.set(x, "osxNotarize", js.undefined)
      
      inline def setOsxSign(value: `true` | OsxSignOptions): Self = StObject.set(x, "osxSign", value.asInstanceOf[js.Any])
      
      inline def setOsxSignUndefined: Self = StObject.set(x, "osxSign", js.undefined)
      
      inline def setOsxUniversal(value: OsxUniversalOptions): Self = StObject.set(x, "osxUniversal", value.asInstanceOf[js.Any])
      
      inline def setOsxUniversalUndefined: Self = StObject.set(x, "osxUniversal", js.undefined)
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setPlatform(value: PlatformOption | js.Array[PlatformOption]): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setPlatformVarargs(value: PlatformOption*): Self = StObject.set(x, "platform", js.Array(value*))
      
      inline def setPrebuiltAsar(value: String): Self = StObject.set(x, "prebuiltAsar", value.asInstanceOf[js.Any])
      
      inline def setPrebuiltAsarUndefined: Self = StObject.set(x, "prebuiltAsar", js.undefined)
      
      inline def setProtocols(value: js.Array[MacOSProtocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: MacOSProtocol*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
      
      inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setTmpdir(value: String | `false`): Self = StObject.set(x, "tmpdir", value.asInstanceOf[js.Any])
      
      inline def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
      
      inline def setUsageDescription(value: StringDictionary[String]): Self = StObject.set(x, "usageDescription", value.asInstanceOf[js.Any])
      
      inline def setUsageDescriptionUndefined: Self = StObject.set(x, "usageDescription", js.undefined)
      
      inline def setWin32metadata(value: Win32MetadataOptions): Self = StObject.set(x, "win32metadata", value.asInstanceOf[js.Any])
      
      inline def setWin32metadataUndefined: Self = StObject.set(x, "win32metadata", js.undefined)
    }
  }
  
  /**
    * See the documentation for [`@electron/notarize`](https://npm.im/@electron/notarize#method-notarizeopts-promisevoid)
    * for details.
    */
  type OsxNotarizeOptions = (Tool & NotarizeLegacyOptions) | (`0` & NotaryToolCredentials)
  
  /** See the documentation for [`@electron/osx-sign`](https://npm.im/@electron/osx-sign#opts) for details. */
  /* Inlined std.Omit<@electron/osx-sign.@electron/osx-sign/dist/esm/types.SignOptions, 'app' | 'binaries' | 'platform' | 'version'> */
  trait OsxSignOptions extends StObject {
    
    var identity: js.UndefOr[String] = js.undefined
    
    var identityValidation: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[String | js.Array[String] | (js.Function1[/* file */ String, Boolean])] = js.undefined
    
    var keychain: js.UndefOr[String] = js.undefined
    
    var optionsForFile: js.UndefOr[js.Function1[/* filePath */ String, PerFileSignOptions]] = js.undefined
    
    var preAutoEntitlements: js.UndefOr[Boolean] = js.undefined
    
    var preEmbedProvisioningProfile: js.UndefOr[Boolean] = js.undefined
    
    var provisioningProfile: js.UndefOr[String] = js.undefined
    
    var strictVerify: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[SigningDistributionType] = js.undefined
  }
  object OsxSignOptions {
    
    inline def apply(): OsxSignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OsxSignOptions]
    }
    
    extension [Self <: OsxSignOptions](x: Self) {
      
      inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
      
      inline def setIdentityValidation(value: Boolean): Self = StObject.set(x, "identityValidation", value.asInstanceOf[js.Any])
      
      inline def setIdentityValidationUndefined: Self = StObject.set(x, "identityValidation", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String] | (js.Function1[/* file */ String, Boolean])): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFunction1(value: /* file */ String => Boolean): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setKeychain(value: String): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
      
      inline def setKeychainUndefined: Self = StObject.set(x, "keychain", js.undefined)
      
      inline def setOptionsForFile(value: /* filePath */ String => PerFileSignOptions): Self = StObject.set(x, "optionsForFile", js.Any.fromFunction1(value))
      
      inline def setOptionsForFileUndefined: Self = StObject.set(x, "optionsForFile", js.undefined)
      
      inline def setPreAutoEntitlements(value: Boolean): Self = StObject.set(x, "preAutoEntitlements", value.asInstanceOf[js.Any])
      
      inline def setPreAutoEntitlementsUndefined: Self = StObject.set(x, "preAutoEntitlements", js.undefined)
      
      inline def setPreEmbedProvisioningProfile(value: Boolean): Self = StObject.set(x, "preEmbedProvisioningProfile", value.asInstanceOf[js.Any])
      
      inline def setPreEmbedProvisioningProfileUndefined: Self = StObject.set(x, "preEmbedProvisioningProfile", js.undefined)
      
      inline def setProvisioningProfile(value: String): Self = StObject.set(x, "provisioningProfile", value.asInstanceOf[js.Any])
      
      inline def setProvisioningProfileUndefined: Self = StObject.set(x, "provisioningProfile", js.undefined)
      
      inline def setStrictVerify(value: Boolean): Self = StObject.set(x, "strictVerify", value.asInstanceOf[js.Any])
      
      inline def setStrictVerifyUndefined: Self = StObject.set(x, "strictVerify", js.undefined)
      
      inline def setType(value: SigningDistributionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * See the documentation for [`@electron/universal`](https://github.com/electron/universal)
    * for details.
    */
  type OsxUniversalOptions = Omit[MakeUniversalOpts, x64AppPath | arm64AppPath | outAppPath | force]
  
  type PlatformOption = TargetPlatform | all
  
  type TargetArch = OfficialArch | String
  
  trait TargetDefinition extends StObject {
    
    var arch: TargetArch
    
    var platform: TargetPlatform
  }
  object TargetDefinition {
    
    inline def apply(arch: TargetArch, platform: TargetPlatform): TargetDefinition = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetDefinition]
    }
    
    extension [Self <: TargetDefinition](x: Self) {
      
      inline def setArch(value: TargetArch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: TargetPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  type TargetPlatform = OfficialPlatform | String
  
  /**
    * A collection of application metadata to embed into the Windows executable.
    *
    * For more information, read the [`rcedit` Node module documentation](https://github.com/electron/node-rcedit#docs).
    */
  trait Win32MetadataOptions extends StObject {
    
    /** Defaults to the `author` name from the nearest `package.json`. */
    var CompanyName: js.UndefOr[String] = js.undefined
    
    /** Defaults to either `productName` or `name` from the nearest `package.json`. */
    var FileDescription: js.UndefOr[String] = js.undefined
    
    /** Defaults to either `productName` or `name` from the nearest `package.json`. */
    var InternalName: js.UndefOr[String] = js.undefined
    
    /** Defaults to the renamed Electron `.exe` file. */
    var OriginalFilename: js.UndefOr[String] = js.undefined
    
    /** Defaults to either `productName` or `name` from the nearest `package.json`. */
    var ProductName: js.UndefOr[String] = js.undefined
    
    /**
      * Path to a local manifest file.
      *
      * See [MSDN](https://msdn.microsoft.com/en-us/library/windows/desktop/aa374191.aspx) for more details.
      */
    var `application-manifest`: js.UndefOr[String] = js.undefined
    
    /** See [MSDN](https://msdn.microsoft.com/en-us/library/6ad1fshk.aspx#Anchor_9) for details. */
    var `requested-execution-level`: js.UndefOr[asInvoker | highestAvailable | requireAdministrator] = js.undefined
  }
  object Win32MetadataOptions {
    
    inline def apply(): Win32MetadataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Win32MetadataOptions]
    }
    
    extension [Self <: Win32MetadataOptions](x: Self) {
      
      inline def `setApplication-manifest`(value: String): Self = StObject.set(x, "application-manifest", value.asInstanceOf[js.Any])
      
      inline def `setApplication-manifestUndefined`: Self = StObject.set(x, "application-manifest", js.undefined)
      
      inline def setCompanyName(value: String): Self = StObject.set(x, "CompanyName", value.asInstanceOf[js.Any])
      
      inline def setCompanyNameUndefined: Self = StObject.set(x, "CompanyName", js.undefined)
      
      inline def setFileDescription(value: String): Self = StObject.set(x, "FileDescription", value.asInstanceOf[js.Any])
      
      inline def setFileDescriptionUndefined: Self = StObject.set(x, "FileDescription", js.undefined)
      
      inline def setInternalName(value: String): Self = StObject.set(x, "InternalName", value.asInstanceOf[js.Any])
      
      inline def setInternalNameUndefined: Self = StObject.set(x, "InternalName", js.undefined)
      
      inline def setOriginalFilename(value: String): Self = StObject.set(x, "OriginalFilename", value.asInstanceOf[js.Any])
      
      inline def setOriginalFilenameUndefined: Self = StObject.set(x, "OriginalFilename", js.undefined)
      
      inline def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
      
      inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
      
      inline def `setRequested-execution-level`(value: asInvoker | highestAvailable | requireAdministrator): Self = StObject.set(x, "requested-execution-level", value.asInstanceOf[js.Any])
      
      inline def `setRequested-execution-levelUndefined`: Self = StObject.set(x, "requested-execution-level", js.undefined)
    }
  }
}
