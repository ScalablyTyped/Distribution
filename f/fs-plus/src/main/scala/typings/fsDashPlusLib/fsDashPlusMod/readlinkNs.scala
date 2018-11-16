package typings
package fsDashPlusLib.fsDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-plus", "readlink")
@js.native
object readlinkNs extends js.Object {
  /**
           * Asynchronous readlink(2) - read value of a symbolic link.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): stdLib.Promise[java.lang.String] = js.native
  /**
           * Asynchronous readlink(2) - read value of a symbolic link.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: java.lang.String): stdLib.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
           * Asynchronous readlink(2) - read value of a symbolic link.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncodingNull): stdLib.Promise[java.lang.String] = js.native
  /**
           * Asynchronous readlink(2) - read value of a symbolic link.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBuffer_1560675869): stdLib.Promise[nodeLib.Buffer] = js.native
  /**
           * Asynchronous readlink(2) - read value of a symbolic link.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingStringNull): stdLib.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
           * Asynchronous readlink(2) - read value of a symbolic link.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): stdLib.Promise[java.lang.String] = js.native
  /**
           * Asynchronous readlink(2) - read value of a symbolic link.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  @JSName("__promisify__")
  def __promisify___buffer(path: nodeLib.fsMod.PathLike, options: fsDashPlusLib.fsDashPlusLibStrings.buffer): stdLib.Promise[nodeLib.Buffer] = js.native
}

