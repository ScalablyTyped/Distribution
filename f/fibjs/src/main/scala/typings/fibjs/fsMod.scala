package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 文件系统处理模块
  * @detail 使用方法：,```JavaScript,var fs = require('fs');,```
  */
@JSImport("fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  
  val SEEK_CUR: /* 1 */ Double = js.native
  
  val SEEK_END: /* 2 */ Double = js.native
  
  val SEEK_SET: /* 0 */ Double = js.native
  
  def access(path: String): Unit = js.native
  def access(path: String, mode: Double): Unit = js.native
  
  def appendFile(fname: String, data: ClassBuffer): Unit = js.native
  
  def chmod(path: String, mode: Double): Unit = js.native
  
  def chown(path: String, uid: Double, gid: Double): Unit = js.native
  
  def clearZipFS(): Unit = js.native
  def clearZipFS(fname: String): Unit = js.native
  
  def close(fd: Double): Unit = js.native
  
  val constants: js.Object = js.native
  
  def copy(from: String, to: String): Unit = js.native
  
  def exists(path: String): Boolean = js.native
  
  def fchmod(fd: Double, mode: Double): Unit = js.native
  
  def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
  
  def fdatasync(fd: Double): Unit = js.native
  
  def fsync(fd: Double): Unit = js.native
  
  def lchmod(path: String, mode: Double): Unit = js.native
  
  def lchown(path: String, uid: Double, gid: Double): Unit = js.native
  
  def link(oldPath: String, newPath: String): Unit = js.native
  
  def lstat(path: String): ClassStat = js.native
  
  def mkdir(path: String): Unit = js.native
  def mkdir(path: String, mode: Double): Unit = js.native
  
  def open(fname: String): Double = js.native
  def open(fname: String, flags: js.UndefOr[scala.Nothing], mode: Double): Double = js.native
  def open(fname: String, flags: String): Double = js.native
  def open(fname: String, flags: String, mode: Double): Double = js.native
  
  def openFile(fname: String): ClassSeekableStream = js.native
  def openFile(fname: String, flags: String): ClassSeekableStream = js.native
  
  def openTextStream(fname: String): ClassBufferedStream = js.native
  def openTextStream(fname: String, flags: String): ClassBufferedStream = js.native
  
  def read(fd: Double, buffer: ClassBuffer): Double = js.native
  def read(
    fd: Double,
    buffer: ClassBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  def read(fd: Double, buffer: ClassBuffer, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
  def read(
    fd: Double,
    buffer: ClassBuffer,
    offset: js.UndefOr[scala.Nothing],
    length: Double,
    position: Double
  ): Double = js.native
  def read(fd: Double, buffer: ClassBuffer, offset: Double): Double = js.native
  def read(
    fd: Double,
    buffer: ClassBuffer,
    offset: Double,
    length: js.UndefOr[scala.Nothing],
    position: Double
  ): Double = js.native
  def read(fd: Double, buffer: ClassBuffer, offset: Double, length: Double): Double = js.native
  def read(fd: Double, buffer: ClassBuffer, offset: Double, length: Double, position: Double): Double = js.native
  
  def readFile(fname: String): js.Any = js.native
  def readFile(fname: String, encoding: String): js.Any = js.native
  
  def readLines(fname: String): js.Array[_] = js.native
  def readLines(fname: String, maxlines: Double): js.Array[_] = js.native
  
  def readTextFile(fname: String): String = js.native
  
  def readdir(path: String): js.Array[_] = js.native
  
  def readlink(path: String): String = js.native
  
  def realpath(path: String): String = js.native
  
  def rename(from: String, to: String): Unit = js.native
  
  def rmdir(path: String): Unit = js.native
  
  def setZipFS(fname: String, data: ClassBuffer): Unit = js.native
  
  def stat(path: String): ClassStat = js.native
  
  def symlink(target: String, linkpath: String): Unit = js.native
  def symlink(target: String, linkpath: String, `type`: String): Unit = js.native
  
  def truncate(path: String, len: Double): Unit = js.native
  
  def unlink(path: String): Unit = js.native
  
  def writeFile(fname: String, data: ClassBuffer): Unit = js.native
  
  def writeTextFile(fname: String, txt: String): Unit = js.native
}
