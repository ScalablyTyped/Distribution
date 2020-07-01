package typings.electronPackager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArchOption = typings.electronPackager.mod.TargetArch | typings.electronPackager.electronPackagerStrings.all
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
    */
  type HookFunction = /**
    * @param buildPath - For [[afterExtract]], the path to the temporary folder where the prebuilt
    * Electron binary has been extracted to. For [[afterCopy]] and [[afterPrune]], the path to the
    * folder where the Electron app has been copied to.
    * @param electronVersion - the version of Electron that is being bundled with the application.
    * @param platform - The target platform you are packaging for.
    * @param arch - The target architecture you are packaging for.
    * @param callback - Must be called once you have completed your actions.
    */
  js.Function5[
    /* buildPath */ java.lang.String, 
    /* electronVersion */ java.lang.String, 
    /* platform */ typings.electronPackager.mod.TargetArch, 
    /* arch */ typings.electronPackager.mod.TargetArch, 
    /* callback */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  /**
    * A predicate function that, given an absolute file `path`, returns `true` if the file should be
    * ignored, or `false` if the file should be kept. *This does not use any of the default ignored
    * files/directories listed for the [[ignore]] option.*
    */
  type IgnoreFunction = js.Function1[/* path */ java.lang.String, scala.Boolean]
  /**
    * See the documentation for [`electron-notarize`](https://npm.im/electron-notarize#method-notarizeopts-promisevoid)
    * for details.
    */
  type OsxNotarizeOptions = typings.std.Omit[
    typings.electronNotarize.mod.NotarizeOptions, 
    typings.electronPackager.electronPackagerStrings.appBundleId | typings.electronPackager.electronPackagerStrings.appPath
  ]
  type PlatformOption = typings.electronPackager.mod.TargetPlatform | typings.electronPackager.electronPackagerStrings.all
  type TargetArch = typings.electronPackager.mod.OfficialArch | java.lang.String
  type TargetPlatform = typings.electronPackager.mod.OfficialPlatform | java.lang.String
}
