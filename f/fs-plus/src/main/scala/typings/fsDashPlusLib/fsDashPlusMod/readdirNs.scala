package typings
package fsDashPlusLib.fsDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-plus", "readdir")
@js.native
object readdirNs extends js.Object {
  /**
           * Asynchronous readdir(3) - read a directory.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
           * Asynchronous readdir(3) - read a directory.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: java.lang.String): stdLib.Promise[js.Array[java.lang.String] | js.Array[nodeLib.Buffer]] = js.native
  /**
           * Asynchronous readdir(3) - read a directory.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_WithFileTypes): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
           * Asynchronous readdir(3) - read a directory.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_WithFileTypesFalse): stdLib.Promise[js.Array[nodeLib.Buffer]] = js.native
  /**
           * Asynchronous readdir(3) - read a directory.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_WithFileTypesFalseEncoding): stdLib.Promise[js.Array[java.lang.String] | js.Array[nodeLib.Buffer]] = js.native
  /**
           * Asynchronous readdir(3) - read a directory.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options If called with `withFileTypes: true` the result data will be an array of Dirent
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_WithFileTypesTrue): stdLib.Promise[js.Array[nodeLib.fsMod.Dirent]] = js.native
  /**
           * Asynchronous readdir(3) - read a directory.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
           * Asynchronous readdir(3) - read a directory.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  @JSName("__promisify__")
  def __promisify___buffer(path: nodeLib.fsMod.PathLike, options: fsDashPlusLib.fsDashPlusLibStrings.buffer): stdLib.Promise[js.Array[nodeLib.Buffer]] = js.native
}

