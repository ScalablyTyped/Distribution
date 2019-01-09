package typings
package fsDashExtraLib.fsDashExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra", "readdir")
@js.native
object readdirNs extends js.Object {
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[js.Array[java.lang.String]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Promise[js.Array[java.lang.String] | js.Array[nodeLib.Buffer]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncodingFalse): js.Promise[js.Array[nodeLib.Buffer]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalse): js.Promise[js.Array[java.lang.String]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalseWithFileTypes): js.Promise[js.Array[java.lang.String] | js.Array[nodeLib.Buffer]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_True): js.Promise[js.Array[nodeLib.fsMod.Dirent]] = js.native
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def __promisify___buffer(path: nodeLib.fsMod.PathLike, options: fsDashExtraLib.fsDashExtraLibStrings.buffer): js.Promise[js.Array[nodeLib.Buffer]] = js.native
}

