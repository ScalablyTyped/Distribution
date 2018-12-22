package typings
package fsDashPlusLib.fsDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-plus", "realpath")
@js.native
object realpathNs extends js.Object {
  /**
           * Asynchronous realpath(3) - return the canonicalized absolute pathname.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[java.lang.String] = js.native
  /**
           * Asynchronous realpath(3) - return the canonicalized absolute pathname.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
           * Asynchronous realpath(3) - return the canonicalized absolute pathname.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBufferEncodingNull): js.Promise[java.lang.String] = js.native
  /**
           * Asynchronous realpath(3) - return the canonicalized absolute pathname.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingBuffer_1560675869): js.Promise[nodeLib.Buffer] = js.native
  /**
           * Asynchronous realpath(3) - return the canonicalized absolute pathname.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingStringNull): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
           * Asynchronous realpath(3) - return the canonicalized absolute pathname.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Promise[java.lang.String] = js.native
  /**
           * Asynchronous realpath(3) - return the canonicalized absolute pathname.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
           */
  @JSName("__promisify__")
  def __promisify___buffer(path: nodeLib.fsMod.PathLike, options: fsDashPlusLib.fsDashPlusLibStrings.buffer): js.Promise[nodeLib.Buffer] = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.BufferEncoding | js.UndefOr[scala.Nothing],
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* resolvedPath */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingBufferEncodingNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingBuffer_1560675869,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingStringNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def native(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      nodeLib.Buffer | (/* resolvedPath */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("native")
  def native_buffer(
    path: nodeLib.fsMod.PathLike,
    options: fsDashPlusLib.fsDashPlusLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* resolvedPath */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

