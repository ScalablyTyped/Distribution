package typings.fsDashReadfileDashPromise

import typings.fsDashReadfileDashPromise.fsDashReadfileDashPromiseMod.OptionsType
import typings.fsDashReadfileDashPromise.fsDashReadfileDashPromiseMod.PathType
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-readfile-promise", JSImport.Namespace)
@js.native
object fsDashReadfileDashPromiseMod extends js.Object {
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    */
  def apply(path: PathType): js.Promise[Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(path: PathType, options: OptionsType): js.Promise[String] = js.native
  type OptionsType = Anon_Encoding | String
  type PathType = PathLike | Double
}

