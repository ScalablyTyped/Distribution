package typings.ftpd.ftpdMod

import typings.ftpd.Anon_BufferSize
import typings.ftpd.Anon_Encoding
import typings.ftpd.Anon_EncodingFlag
import typings.ftpd.Anon_EncodingFlagMode
import typings.ftpd.Anon_EncodingFlagModeString
import typings.ftpd.Anon_Flag
import typings.node.Buffer
import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.ReadStream
import typings.node.fsMod.Stats
import typings.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FtpFileSystem extends js.Object {
  /**
    * if useReadFile option is not set or is false
    */
  var createReadStream: js.UndefOr[
    js.Function2[/* path */ String, /* options */ js.UndefOr[Anon_BufferSize], ReadStream]
  ] = js.native
  /**
    * if useWriteFile option is not set or is false
    */
  var createWriteStream: js.UndefOr[
    js.Function2[/* path */ String, /* options */ js.UndefOr[Anon_Encoding], WriteStream]
  ] = js.native
  var mkdir: (js.Function2[
    /* path */ String, 
    /* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]], 
    Unit
  ]) | (js.Function3[
    /* path */ String, 
    (/* mode */ Double) | (/* mode */ String), 
    js.UndefOr[js.Function1[js.UndefOr[ErrnoException], Unit]], 
    Unit
  ]) = js.native
  var open: (js.Function3[
    /* path */ String, 
    /* flags */ String, 
    /* callback */ js.UndefOr[
      js.Function2[/* err */ js.UndefOr[ErrnoException], /* fd */ js.UndefOr[Double], _]
    ], 
    Unit
  ]) | (js.Function4[
    /* path */ String, 
    /* flags */ String, 
    (/* mode */ Double) | (/* mode */ String), 
    js.UndefOr[js.Function2[js.UndefOr[ErrnoException], js.UndefOr[Double], _]], 
    Unit
  ]) = js.native
  /**
    * if useReadFile option is set to 'true'
    */
  var readFile: js.UndefOr[
    (js.Function3[
      /* filename */ String, 
      (/* options */ Anon_EncodingFlag) | (/* options */ Anon_Flag) | (/* encoding */ String), 
      /* callback */ js.Function2[/* err */ ErrnoException, (/* data */ Buffer) | (/* data */ String), Unit], 
      Unit
    ]) | (js.Function2[
      /* filename */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit], 
      Unit
    ])
  ] = js.native
  /**
    * if useWriteFile option is set to 'true'
    */
  var writeFile: js.UndefOr[
    (js.Function3[
      /* filename */ String, 
      /* data */ js.Any, 
      /* callback */ js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]], 
      Unit
    ]) | (js.Function4[
      /* filename */ String, 
      /* data */ js.Any, 
      (/* options */ Anon_EncodingFlagMode) | (/* options */ Anon_EncodingFlagModeString), 
      js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]], 
      Unit
    ])
  ] = js.native
  def close(fd: Double): Unit = js.native
  def close(fd: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def readdir(path: String): Unit = js.native
  def readdir(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[ErrnoException], /* files */ js.UndefOr[js.Array[String]], Unit]
  ): Unit = js.native
  def rename(oldPath: String, newPath: String): Unit = js.native
  def rename(
    oldPath: String,
    newPath: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
  def rmdir(path: String): Unit = js.native
  def rmdir(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  /**
    * specific object properties: { mode, isDirectory(), size, mtime }
    */
  def stat(path: String): Unit = js.native
  def stat(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[ErrnoException], /* stats */ js.UndefOr[Stats], _]
  ): Unit = js.native
  def unlink(path: String): Unit = js.native
  def unlink(path: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
}

