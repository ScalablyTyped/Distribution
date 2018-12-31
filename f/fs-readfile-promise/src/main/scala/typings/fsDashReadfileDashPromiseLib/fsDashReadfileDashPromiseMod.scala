package typings
package fsDashReadfileDashPromiseLib

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
  def apply(path: fsDashReadfileDashPromiseLib.PathType): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(path: fsDashReadfileDashPromiseLib.PathType, options: fsDashReadfileDashPromiseLib.OptionsType): js.Promise[java.lang.String] = js.native
}

