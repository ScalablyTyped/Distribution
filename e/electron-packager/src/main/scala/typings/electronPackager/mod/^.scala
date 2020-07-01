package typings.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-packager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply(opts: Options): js.Promise[js.Array[String]] = js.native
}

