package typings.electronPackager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-packager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * This will:
    * - Find or download the correct release of Electron
    * - Use that version of electron to create a app in <out>/<appname>-<platform>-<arch>
    *
    * You should be able to launch the app on the platform you built for. If not, check your settings and try again.
    *
    * @param opts - Options to configure packaging.
    *
    * @returns A promise containing the path(s) to the newly created application(s)
    */
  def apply(opts: Options): js.Promise[String | js.Array[String]] = js.native
}

