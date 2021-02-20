package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 文件系统处理模块
  * @detail 使用方法：,```JavaScript,var fs = require('fs');,```
  */
object fsMod {
  
  @JSImport("fs", "SEEK_CUR")
  @js.native
  val SEEK_CUR: /* 1 */ Double = js.native
  
  @JSImport("fs", "SEEK_END")
  @js.native
  val SEEK_END: /* 2 */ Double = js.native
  
  @JSImport("fs", "SEEK_SET")
  @js.native
  val SEEK_SET: /* 0 */ Double = js.native
  
  @JSImport("fs", "access")
  @js.native
  def access(path: String): Unit = js.native
  @JSImport("fs", "access")
  @js.native
  def access(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs", "appendFile")
  @js.native
  def appendFile(fname: String, data: ClassBuffer): Unit = js.native
  
  @JSImport("fs", "chmod")
  @js.native
  def chmod(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs", "chown")
  @js.native
  def chown(path: String, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("fs", "clearZipFS")
  @js.native
  def clearZipFS(): Unit = js.native
  @JSImport("fs", "clearZipFS")
  @js.native
  def clearZipFS(fname: String): Unit = js.native
  
  @JSImport("fs", "close")
  @js.native
  def close(fd: Double): Unit = js.native
  
  @JSImport("fs", "constants")
  @js.native
  val constants: js.Object = js.native
  
  @JSImport("fs", "copy")
  @js.native
  def copy(from: String, to: String): Unit = js.native
  
  @JSImport("fs", "exists")
  @js.native
  def exists(path: String): Boolean = js.native
  
  @JSImport("fs", "fchmod")
  @js.native
  def fchmod(fd: Double, mode: Double): Unit = js.native
  
  @JSImport("fs", "fchown")
  @js.native
  def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("fs", "fdatasync")
  @js.native
  def fdatasync(fd: Double): Unit = js.native
  
  @JSImport("fs", "fsync")
  @js.native
  def fsync(fd: Double): Unit = js.native
  
  @JSImport("fs", "lchmod")
  @js.native
  def lchmod(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs", "lchown")
  @js.native
  def lchown(path: String, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("fs", "link")
  @js.native
  def link(oldPath: String, newPath: String): Unit = js.native
  
  @JSImport("fs", "lstat")
  @js.native
  def lstat(path: String): ClassStat = js.native
  
  @JSImport("fs", "mkdir")
  @js.native
  def mkdir(path: String): Unit = js.native
  @JSImport("fs", "mkdir")
  @js.native
  def mkdir(path: String, mode: Double): Unit = js.native
  
  @JSImport("fs", "open")
  @js.native
  def open(fname: String): Double = js.native
  @JSImport("fs", "open")
  @js.native
  def open(fname: String, flags: js.UndefOr[scala.Nothing], mode: Double): Double = js.native
  @JSImport("fs", "open")
  @js.native
  def open(fname: String, flags: String): Double = js.native
  @JSImport("fs", "open")
  @js.native
  def open(fname: String, flags: String, mode: Double): Double = js.native
  
  @JSImport("fs", "openFile")
  @js.native
  def openFile(fname: String): ClassSeekableStream = js.native
  @JSImport("fs", "openFile")
  @js.native
  def openFile(fname: String, flags: String): ClassSeekableStream = js.native
  
  @JSImport("fs", "openTextStream")
  @js.native
  def openTextStream(fname: String): ClassBufferedStream = js.native
  @JSImport("fs", "openTextStream")
  @js.native
  def openTextStream(fname: String, flags: String): ClassBufferedStream = js.native
  
  @JSImport("fs", "read")
  @js.native
  def read(fd: Double, buffer: ClassBuffer): Double = js.native
  @JSImport("fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: ClassBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("fs", "read")
  @js.native
  def read(fd: Double, buffer: ClassBuffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
  @JSImport("fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: ClassBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): Double = js.native
  @JSImport("fs", "read")
  @js.native
  def read(fd: Double, buffer: ClassBuffer, offset: Double): Double = js.native
  @JSImport("fs", "read")
  @js.native
  def read(
    fd: Double,
    buffer: ClassBuffer,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  @JSImport("fs", "read")
  @js.native
  def read(fd: Double, buffer: ClassBuffer, offset: Double, length: Double): Double = js.native
  @JSImport("fs", "read")
  @js.native
  def read(fd: Double, buffer: ClassBuffer, offset: Double, length: Double, position: Double): Double = js.native
  
  @JSImport("fs", "readFile")
  @js.native
  def readFile(fname: String): js.Any = js.native
  @JSImport("fs", "readFile")
  @js.native
  def readFile(fname: String, encoding: String): js.Any = js.native
  
  @JSImport("fs", "readLines")
  @js.native
  def readLines(fname: String): js.Array[_] = js.native
  @JSImport("fs", "readLines")
  @js.native
  def readLines(fname: String, maxlines: Double): js.Array[_] = js.native
  
  @JSImport("fs", "readTextFile")
  @js.native
  def readTextFile(fname: String): String = js.native
  
  @JSImport("fs", "readdir")
  @js.native
  def readdir(path: String): js.Array[_] = js.native
  
  @JSImport("fs", "readlink")
  @js.native
  def readlink(path: String): String = js.native
  
  @JSImport("fs", "realpath")
  @js.native
  def realpath(path: String): String = js.native
  
  @JSImport("fs", "rename")
  @js.native
  def rename(from: String, to: String): Unit = js.native
  
  @JSImport("fs", "rmdir")
  @js.native
  def rmdir(path: String): Unit = js.native
  
  @JSImport("fs", "setZipFS")
  @js.native
  def setZipFS(fname: String, data: ClassBuffer): Unit = js.native
  
  @JSImport("fs", "stat")
  @js.native
  def stat(path: String): ClassStat = js.native
  
  @JSImport("fs", "symlink")
  @js.native
  def symlink(target: String, linkpath: String): Unit = js.native
  @JSImport("fs", "symlink")
  @js.native
  def symlink(target: String, linkpath: String, `type`: String): Unit = js.native
  
  @JSImport("fs", "truncate")
  @js.native
  def truncate(path: String, len: Double): Unit = js.native
  
  @JSImport("fs", "unlink")
  @js.native
  def unlink(path: String): Unit = js.native
  
  @JSImport("fs", "writeFile")
  @js.native
  def writeFile(fname: String, data: ClassBuffer): Unit = js.native
  
  @JSImport("fs", "writeTextFile")
  @js.native
  def writeTextFile(fname: String, txt: String): Unit = js.native
}
