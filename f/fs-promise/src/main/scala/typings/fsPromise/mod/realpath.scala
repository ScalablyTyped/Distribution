package typings.fsPromise.mod

import org.scalablytyped.runtime.StringDictionary
import typings.fsPromise.fsPromiseStrings.buffer
import typings.mz.anon.Encoding
import typings.mz.anon.`0`
import typings.mz.anon.`1`
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ErrnoException
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realpath {
  
  @scala.inline
  def apply(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(path: PathLike, cache: StringDictionary[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(
    path: PathLike,
    cache: StringDictionary[String],
    callback: js.Function2[/* err */ ErrnoException, /* resolvedPath */ String, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    path: PathLike,
    callback: js.Function2[(/* err */ ErrnoException) | Null, /* resolvedPath */ String, js.Any | Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(path: PathLike, options: String): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  @scala.inline
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    path: PathLike,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(path: PathLike, options: buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def apply(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(path: PathLike, options: Encoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(
    path: PathLike,
    options: Encoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(path: PathLike, options: `0`): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def apply(
    path: PathLike,
    options: `0`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(path: PathLike, options: `1`): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  @scala.inline
  def apply(
    path: PathLike,
    options: `1`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("fs-promise", "realpath")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def native(path: PathLike): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def native(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(path: PathLike, options: String): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  @scala.inline
  def native(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(
    path: PathLike,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(path: PathLike, options: Encoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def native(
    path: PathLike,
    options: Encoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(path: PathLike, options: `0`): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def native(
    path: PathLike,
    options: `0`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(path: PathLike, options: `1`): js.Promise[String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Buffer]]
  @scala.inline
  def native(
    path: PathLike,
    options: `1`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def native(path: PathLike, options: BufferEncoding): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def native(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def native_buffer(path: PathLike, options: buffer): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def native_buffer(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
