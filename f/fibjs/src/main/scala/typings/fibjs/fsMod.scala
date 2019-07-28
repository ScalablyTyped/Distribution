package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 文件系统处理模块
	* @detail 使用方法：,```JavaScript,var fs = require('fs');,```
	*/
@JSImport("fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  val SEEK_CUR: `1` = js.native
  val SEEK_END: `2` = js.native
  val SEEK_SET: `0` = js.native
  val constants: js.Object = js.native
  def access(path: String): Unit = js.native
  def access(path: String, mode: Double): Unit = js.native
  def appendFile(fname: String, data: Class_Buffer): Unit = js.native
  def chmod(path: String, mode: Double): Unit = js.native
  def chown(path: String, uid: Double, gid: Double): Unit = js.native
  def clearZipFS(): Unit = js.native
  def clearZipFS(fname: String): Unit = js.native
  def close(fd: Double): Unit = js.native
  def copy(from: String, to: String): Unit = js.native
  def exists(path: String): Boolean = js.native
  def fchmod(fd: Double, mode: Double): Unit = js.native
  def fchown(fd: Double, uid: Double, gid: Double): Unit = js.native
  def fdatasync(fd: Double): Unit = js.native
  def fsync(fd: Double): Unit = js.native
  def lchmod(path: String, mode: Double): Unit = js.native
  def lchown(path: String, uid: Double, gid: Double): Unit = js.native
  def link(oldPath: String, newPath: String): Unit = js.native
  def lstat(path: String): Class_Stat = js.native
  def mkdir(path: String): Unit = js.native
  def mkdir(path: String, mode: Double): Unit = js.native
  def open(fname: String): Double = js.native
  def open(fname: String, flags: String): Double = js.native
  def open(fname: String, flags: String, mode: Double): Double = js.native
  def openFile(fname: String): Class_SeekableStream = js.native
  def openFile(fname: String, flags: String): Class_SeekableStream = js.native
  def openTextStream(fname: String): Class_BufferedStream = js.native
  def openTextStream(fname: String, flags: String): Class_BufferedStream = js.native
  def read(fd: Double, buffer: Class_Buffer): Double = js.native
  def read(fd: Double, buffer: Class_Buffer, offset: Double): Double = js.native
  def read(fd: Double, buffer: Class_Buffer, offset: Double, length: Double): Double = js.native
  def read(fd: Double, buffer: Class_Buffer, offset: Double, length: Double, position: Double): Double = js.native
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
  def setZipFS(fname: String, data: Class_Buffer): Unit = js.native
  def stat(path: String): Class_Stat = js.native
  def symlink(target: String, linkpath: String): Unit = js.native
  def symlink(target: String, linkpath: String, `type`: String): Unit = js.native
  def truncate(path: String, len: Double): Unit = js.native
  def unlink(path: String): Unit = js.native
  def writeFile(fname: String, data: Class_Buffer): Unit = js.native
  def writeTextFile(fname: String, txt: String): Unit = js.native
}

