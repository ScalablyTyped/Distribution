package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 文件系统处理模块
  * @detail 使用方法：,```JavaScript,var fs = require('fs');,```
  */
object fsMod {
  
  @JSImport("fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fs", "SEEK_CUR")
  @js.native
  val SEEK_CUR: /* 1 */ Double = js.native
  
  @JSImport("fs", "SEEK_END")
  @js.native
  val SEEK_END: /* 2 */ Double = js.native
  
  @JSImport("fs", "SEEK_SET")
  @js.native
  val SEEK_SET: /* 0 */ Double = js.native
  
  inline def access(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def access(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def appendFile(fname: String, data: ClassBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(fname.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chmod(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chown(path: String, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clearZipFS(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearZipFS")().asInstanceOf[Unit]
  inline def clearZipFS(fname: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearZipFS")(fname.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def close(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("fs", "constants")
  @js.native
  val constants: js.Object = js.native
  
  inline def copy(from: String, to: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def exists(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def fchmod(fd: Double, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fchown(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fdatasync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fsync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def lchmod(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lchown(path: String, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def link(oldPath: String, newPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def lstat(path: String): ClassStat = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[ClassStat]
  
  inline def mkdir(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mkdir(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def open(fname: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(fname.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def open(fname: String, flags: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(fname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def open(fname: String, flags: String, mode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(fname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def open(fname: String, flags: Unit, mode: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(fname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def openFile(fname: String): ClassSeekableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(fname.asInstanceOf[js.Any]).asInstanceOf[ClassSeekableStream]
  inline def openFile(fname: String, flags: String): ClassSeekableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(fname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[ClassSeekableStream]
  
  inline def openTextStream(fname: String): ClassBufferedStream = ^.asInstanceOf[js.Dynamic].applyDynamic("openTextStream")(fname.asInstanceOf[js.Any]).asInstanceOf[ClassBufferedStream]
  inline def openTextStream(fname: String, flags: String): ClassBufferedStream = (^.asInstanceOf[js.Dynamic].applyDynamic("openTextStream")(fname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[ClassBufferedStream]
  
  inline def read(fd: Double, buffer: ClassBuffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def read(fd: Double, buffer: ClassBuffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def read(fd: Double, buffer: ClassBuffer, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def read(fd: Double, buffer: ClassBuffer, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def read(fd: Double, buffer: ClassBuffer, offset: Double, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def read(fd: Double, buffer: ClassBuffer, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def read(fd: Double, buffer: ClassBuffer, offset: Unit, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def read(fd: Double, buffer: ClassBuffer, offset: Unit, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readFile(fname: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(fname.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def readFile(fname: String, encoding: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(fname.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def readLines(fname: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readLines")(fname.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def readLines(fname: String, maxlines: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("readLines")(fname.asInstanceOf[js.Any], maxlines.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def readTextFile(fname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readTextFile")(fname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readdir(path: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def readlink(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def realpath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def rename(from: String, to: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rmdir(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setZipFS(fname: String, data: ClassBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setZipFS")(fname.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stat(path: String): ClassStat = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[ClassStat]
  
  inline def symlink(target: String, linkpath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], linkpath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symlink(target: String, linkpath: String, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], linkpath.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def truncate(path: String, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unlink(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def writeFile(fname: String, data: ClassBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(fname.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeTextFile(fname: String, txt: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextFile")(fname.asInstanceOf[js.Any], txt.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
