package typings.fsExtra.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fsExtra.anon.`2`
import typings.fsExtra.anon.`3`
import typings.fsExtra.fsExtraStrings.buffer
import typings.node.NodeJS.ErrnoException
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realpath {
  
  inline def apply(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(path: PathLike, cache: StringDictionary[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def apply(
    path: PathLike,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    path: PathLike,
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* resolvedPath */ String, Any | Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(
    path: PathLike,
    options: EncodingOption,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("fs-extra", "realpath")
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined {None (path : node.fs.PathLike, options : {  encoding :'buffer'} | 'buffer'): std.Promise<node.buffer.<global>.Buffer>, None (path : node.fs.PathLike, options : {  encoding :node.buffer.<global>.BufferEncoding | string | null} | node.buffer.<global>.BufferEncoding | string | undefined | null): std.Promise<string>, None (path : node.fs.PathLike, options : {  encoding :node.buffer.<global>.BufferEncoding | string | null} | string | undefined | null): std.Promise<string | node.buffer.<global>.Buffer>, None (path : node.fs.PathLike): std.Promise<string>} & {None (path : node.fs.PathLike, callback : (err : node.NodeJS.ErrnoException | null, resolvedPath : string): void): void, None (path : node.fs.PathLike, options : node.fs.EncodingOption, callback : (err : node.NodeJS.ErrnoException | null, resolvedPath : string | node.buffer.<global>.Buffer): void): void, None (path : node.fs.PathLike, options : node.fs.BufferEncodingOption, callback : (err : node.NodeJS.ErrnoException | null, resolvedPath : node.buffer.<global>.Buffer): void): void, None (path : node.fs.PathLike, options : node.fs.EncodingOption, callback : (err : node.NodeJS.ErrnoException | null, resolvedPath : string): void): void} */
  object native {
    
    inline def apply(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def apply(path: PathLike, callback: js.Function2[ErrnoException | Null, /* resolvedPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(path: PathLike, options: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def apply(path: PathLike, options: `2`): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def apply(path: PathLike, options: `3`): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def apply(path: PathLike, options: buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
    inline def apply(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def apply(
      path: PathLike,
      options: BufferEncodingOption,
      callback: js.Function2[ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Asynchronous [`realpath(3)`](http://man7.org/linux/man-pages/man3/realpath.3.html).
      *
      * The `callback` gets two arguments `(err, resolvedPath)`.
      *
      * Only paths that can be converted to UTF8 strings are supported.
      *
      * The optional `options` argument can be a string specifying an encoding, or an
      * object with an `encoding` property specifying the character encoding to use for
      * the path passed to the callback. If the `encoding` is set to `'buffer'`,
      * the path returned will be passed as a `Buffer` object.
      *
      * On Linux, when Node.js is linked against musl libc, the procfs file system must
      * be mounted on `/proc` in order for this function to work. Glibc does not have
      * this restriction.
      * @since v9.2.0
      */
    inline def apply(
      path: PathLike,
      options: EncodingOption,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("fs-extra", "realpath.native")
    @js.native
    val ^ : js.Any = js.native
  }
}
