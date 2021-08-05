package typings.fsExtraPromiseEs6

import typings.fsExtraPromiseEs6.anon.AutoClose
import typings.fsExtraPromiseEs6.anon.Curr
import typings.fsExtraPromiseEs6.anon.Encoding
import typings.fsExtraPromiseEs6.anon.Interval
import typings.fsExtraPromiseEs6.anon.Persistent
import typings.node.Buffer
import typings.node.fsMod.symlink.Type
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-extra-promise-es6", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fs-extra-promise-es6", "ReadStream")
  @js.native
  class ReadStream () extends Readable {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("fs-extra-promise-es6", "WriteStream")
  @js.native
  class WriteStream () extends Writable {
    def this(opts: WritableOptions) = this()
  }
  
  inline def appendFile(filename: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFile(filename: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFile(filename: String, data: js.Any, option: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFile(filename: String, data: js.Any, option: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFile(filename: String, data: js.Any, option: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFile(filename: String, data: js.Any, option: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendFileAsync(filename: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFileAsync(filename: String, data: js.Any, option: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def appendFileAsync(filename: String, data: js.Any, option: OpenOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def appendFileSync(filename: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(filename: String, data: js.Any, option: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def appendFileSync(filename: String, data: js.Any, option: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chmod(path: String, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def chmod(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def chmod(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def chmod(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chmodAsync(path: String, mode: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def chmodAsync(path: String, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def chmodSync(path: String, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def chmodSync(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chown(path: String, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def chown(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chownAsync(path: String, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chownAsync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def chownSync(path: String, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def close(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def close(fd: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def closeAsync(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeAsync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def closeSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def copy(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copy(
    src: String,
    dest: String,
    callback: js.Function1[(/* err */ Error) | (/* src */ String), Boolean | Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copy(
    src: String,
    dest: String,
    filter: js.Function1[/* src */ String, Boolean],
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copyAsync(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def copyAsync(src: String, dest: String, filter: js.Function1[/* src */ String, Boolean]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def copySync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copySync(src: String, dest: String, filter: js.Function1[/* src */ String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createFile(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createFile(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFile")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createFileAsync(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def createFileSync(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createFileSync")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createReadStream(path: String): ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[ReadStream]
  inline def createReadStream(path: String, options: AutoClose): ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadStream]
  inline def createReadStream(path: Buffer): ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[ReadStream]
  inline def createReadStream(path: Buffer, options: AutoClose): ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReadStream]
  
  inline def createWriteStream(path: String): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[WriteStream]
  inline def createWriteStream(path: String, options: Encoding): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
  inline def createWriteStream(path: Buffer): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[WriteStream]
  inline def createWriteStream(path: Buffer, options: Encoding): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
  
  inline def ensureDir(path: String, cb: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureDir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ensureDirAsync(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def ensureDirSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def exists(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def exists(path: String, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def existsAsync(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("existsAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def existsSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def fchmod(fd: Double, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fchmod(fd: Double, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fchmod(fd: Double, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fchmod(fd: Double, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fchmodAsync(fd: Double, mode: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodAsync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def fchmodAsync(fd: Double, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodAsync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def fchmodSync(fd: Double, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fchmodSync(fd: Double, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fchown(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fchown(fd: Double, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fchownAsync(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownAsync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def fchownSync(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fstat(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fstat(fd: Double, callback: js.Function2[/* err */ Error, /* stats */ Stats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fstatAsync(fd: Double): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatAsync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  
  inline def fstatSync(fd: Double): Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("fstatSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Stats]
  
  inline def fsync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fsync(fd: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fsyncAsync(fd: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncAsync")(fd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def fsyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def futimes(fd: Double, atime: Double, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def futimes(fd: Double, atime: Double, mtime: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def futimesAsync(fd: Double, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesAsync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def futimesSync(fd: Double, atime: Double, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isDirectory(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectory")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def isDirectory(path: String, callback: js.Function2[/* err */ Error, /* isDirectory */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isDirectory")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isDirectoryAsync(path: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectoryAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isDirectorySync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectorySync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lchmod(path: String, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lchmod(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lchmod(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lchmod(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lchmodAsync(path: String, mode: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def lchmodAsync(path: String, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def lchmodSync(path: String, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lchmodSync(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lchown(path: String, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def lchown(path: String, uid: Double, gid: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lchownAsync(path: String, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownAsync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def lchownSync(path: String, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def link(srcpath: String, dstpath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def link(srcpath: String, dstpath: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def linkAsync(srcpath: String, dstpath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkAsync")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def linkSync(srcpath: String, dstpath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lstat(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def lstat(path: String, callback: js.Function2[/* err */ Error, /* stats */ Stats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lstatAsync(path: String): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstatAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  
  inline def lstatSync(path: String): Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("lstatSync")(path.asInstanceOf[js.Any]).asInstanceOf[Stats]
  
  inline def mkdir(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mkdir(path: String, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdir(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdir(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdir(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdir(path: String, mode: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirAsync(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def mkdirAsync(path: String, mode: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def mkdirAsync(path: String, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirAsync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def mkdirSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mkdirSync(path: String, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mkdirSync(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirp(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mkdirp(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirp")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirpAsync(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def mkdirpSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirpSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mkdirs(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mkdirs(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirs")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirsAsync(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirsAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def mkdirsSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirsSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def open(path: String, flags: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(path: String, flags: String, mode: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(
    path: String,
    flags: String,
    mode: String,
    callback: js.Function2[/* err */ Error, /* fs */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def open(
    path: String,
    flags: String,
    mode: Unit,
    callback: js.Function2[/* err */ Error, /* fs */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def openAsync(path: String, flags: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAsync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  inline def openAsync(path: String, flags: String, mode: String): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("openAsync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
  
  inline def openSync(path: String, flags: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def openSync(path: String, flags: String, mode: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def outputFile(file: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputFile(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputFileAsync(file: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileAsync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def outputFileSync(file: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJSONAsync(file: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONAsync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def outputJSONSync_(file: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSONSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJSON_(file: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputJSON_(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJSON")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJson(file: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def outputJson(file: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJson")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def outputJsonSync(file: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("outputJsonSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def read(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ Error, /* bytesRead */ Double, /* buffer */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readAsync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Buffer]]]
  
  inline def readFile(filename: String, callback: js.Function2[/* err */ Error, /* data */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(
    filename: String,
    options: String,
    callback: js.Function2[/* err */ Error, /* data */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readFile(
    filename: String,
    options: OpenOptions,
    callback: js.Function2[/* err */ Error, /* data */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readFileAsync(filename: String): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileAsync")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  inline def readFileAsync(filename: String, options: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileAsync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def readFileAsync(filename: String, options: OpenOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileAsync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def readFileSync(filename: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filename.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def readFileSync(filename: String, options: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def readFileSync(filename: String, options: OpenOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readJSONAsync(file: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONAsync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def readJSONAsync(file: String, options: OpenOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSONAsync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def readJSONSync_(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def readJSONSync_(file: String, options: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSONSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readJSON_(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def readJSON_(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJSON_(file: String, options: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJSON_(file: String, options: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJSON_(file: String, options: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJSON")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readJson(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def readJson(file: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJson(file: String, options: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJson(file: String, options: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readJson(file: String, options: OpenOptions, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJson")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readJsonSync(file: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def readJsonSync(file: String, options: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonSync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readdir(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def readdir(path: String, callback: js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readdirAsync(path: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def readdirSync(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def readlink(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def readlink(path: String, callback: js.Function2[/* err */ Error, /* linkString */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readlinkAsync(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def realpath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def realpath(
    path: String,
    cache: String,
    callback: js.Function2[/* err */ Error, /* resolvedPath */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def realpath(path: String, callback: js.Function2[/* err */ Error, /* resolvedPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def realpathAsync(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpathAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def realpathAsync(path: String, cache: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpathAsync")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def realpathSync(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("realpathSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def realpathSync(path: String, cache: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("realpathSync")(path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def remove(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(dir: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(dir.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeAsync(dir: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAsync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def removeSync(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSync")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def rename(oldPath: String, newPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def rename(oldPath: String, newPath: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renameAsync(oldPath: String, newPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("renameAsync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def renameSync(oldPath: String, newPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rmdir(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def rmdir(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rmdirAsync(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def rmdirSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stat(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def stat(path: String, callback: js.Function2[/* err */ Error, /* stats */ Stats, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def statAsync(path: String): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("statAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  
  inline def statSync(path: String): Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[Stats]
  
  inline def symlink(srcpath: String, dstpath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlink(srcpath: String, dstpath: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlink(srcpath: String, dstpath: String, `type`: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlink(srcpath: String, dstpath: String, `type`: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def symlinkAsync(srcpath: String, dstpath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkAsync")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def symlinkAsync(srcpath: String, dstpath: String, `type`: Type): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkAsync")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def symlinkSync(srcpath: String, dstpath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlinkSync(srcpath: String, dstpath: String, `type`: Type): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(srcpath.asInstanceOf[js.Any], dstpath.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def truncate(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def truncate(fd: Double, len: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def truncateAsync(fd: Double, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateAsync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def truncateSync(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlink(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unlink(path: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlinkAsync(path: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkAsync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def unlinkSync(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unwatchFile(filename: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unwatchFile(filename: String, listener: Stats): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def utimes(path: String, atime: Double, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def utimes(path: String, atime: Double, mtime: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def utimesAsync(path: String, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesAsync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def utimesSync(path: String, atime: Double, mtime: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def watch(filename: String): FSWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[FSWatcher]
  inline def watch(
    filename: String,
    options: Unit,
    listener: js.Function2[/* event */ String, /* filename */ String, js.Any]
  ): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(filename: String, options: Persistent): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  inline def watch(
    filename: String,
    options: Persistent,
    listener: js.Function2[/* event */ String, /* filename */ String, js.Any]
  ): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  
  inline def watchFile(filename: String, listener: Curr): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def watchFile(filename: String, options: Interval, listener: Curr): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def write(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(
    fd: Double,
    buffer: Buffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ Error, /* written */ Double, /* buffer */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeAsync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): js.Promise[js.Tuple2[Double, Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Double, Buffer]]]
  
  inline def writeFile(filename: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(filename: String, data: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(filename: String, data: js.Any, options: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(filename: String, data: js.Any, options: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(filename: String, data: js.Any, options: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFile(
    filename: String,
    data: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFileAsync(filename: String, data: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFileAsync(filename: String, data: js.Any, options: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeFileAsync(filename: String, data: js.Any, options: OpenOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileAsync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeFileSync(filename: String, data: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(filename: String, data: js.Any, option: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeFileSync(filename: String, data: js.Any, option: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJSONAsync_(file: String, `object`: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJSONAsync_(file: String, `object`: js.Any, options: OpenOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeJSONSync_(file: String, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSONSync_(file: String, `object`: js.Any, options: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSONSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJSON_(file: String, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSON_(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSON_(file: String, `object`: js.Any, options: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSON_(file: String, `object`: js.Any, options: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJSON_(
    file: String,
    `object`: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJSON")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJson(file: String, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJson(file: String, `object`: js.Any, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJson(file: String, `object`: js.Any, options: Unit, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJson(file: String, `object`: js.Any, options: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJson(
    file: String,
    `object`: js.Any,
    options: OpenOptions,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJson")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeJsonAsync(file: String, `object`: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeJsonAsync(file: String, `object`: js.Any, options: OpenOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeJsonSync(file: String, `object`: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeJsonSync(file: String, `object`: js.Any, options: OpenOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeJsonSync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeSync(fd: Double, buffer: Buffer, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait FSWatcher extends StObject {
    
    def close(): Unit
  }
  object FSWatcher {
    
    inline def apply(close: () => Unit): FSWatcher = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
      __obj.asInstanceOf[FSWatcher]
    }
    
    extension [Self <: FSWatcher](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    }
  }
  
  trait OpenOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var flag: js.UndefOr[String] = js.undefined
  }
  object OpenOptions {
    
    inline def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
    
    extension [Self <: OpenOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    }
  }
  
  type Stats = typings.node.fsMod.Stats
}
