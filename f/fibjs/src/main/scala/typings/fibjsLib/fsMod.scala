package typings
package fibjsLib

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
  val SEEK_CUR: /* 1 */ scala.Double = js.native
  val SEEK_END: /* 2 */ scala.Double = js.native
  val SEEK_SET: /* 0 */ scala.Double = js.native
  val constants: js.Object = js.native
  def access(path: java.lang.String): scala.Unit = js.native
  def access(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def appendFile(fname: java.lang.String, data: fibjsLib.Class_Buffer): scala.Unit = js.native
  def chmod(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def chown(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def clearZipFS(): scala.Unit = js.native
  def clearZipFS(fname: java.lang.String): scala.Unit = js.native
  def close(fd: scala.Double): scala.Unit = js.native
  def copy(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def exists(path: java.lang.String): scala.Boolean = js.native
  def fchmod(fd: scala.Double, mode: scala.Double): scala.Unit = js.native
  def fchown(fd: scala.Double, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def fdatasync(fd: scala.Double): scala.Unit = js.native
  def fsync(fd: scala.Double): scala.Unit = js.native
  def lchmod(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def lchown(path: java.lang.String, uid: scala.Double, gid: scala.Double): scala.Unit = js.native
  def link(oldPath: java.lang.String, newPath: java.lang.String): scala.Unit = js.native
  def lstat(path: java.lang.String): fibjsLib.Class_Stat = js.native
  def mkdir(path: java.lang.String): scala.Unit = js.native
  def mkdir(path: java.lang.String, mode: scala.Double): scala.Unit = js.native
  def open(fname: java.lang.String): scala.Double = js.native
  def open(fname: java.lang.String, flags: java.lang.String): scala.Double = js.native
  def open(fname: java.lang.String, flags: java.lang.String, mode: scala.Double): scala.Double = js.native
  def openFile(fname: java.lang.String): fibjsLib.Class_SeekableStream = js.native
  def openFile(fname: java.lang.String, flags: java.lang.String): fibjsLib.Class_SeekableStream = js.native
  def openTextStream(fname: java.lang.String): fibjsLib.Class_BufferedStream = js.native
  def openTextStream(fname: java.lang.String, flags: java.lang.String): fibjsLib.Class_BufferedStream = js.native
  def read(fd: scala.Double, buffer: fibjsLib.Class_Buffer): scala.Double = js.native
  def read(fd: scala.Double, buffer: fibjsLib.Class_Buffer, offset: scala.Double): scala.Double = js.native
  def read(fd: scala.Double, buffer: fibjsLib.Class_Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def read(
    fd: scala.Double,
    buffer: fibjsLib.Class_Buffer,
    offset: scala.Double,
    length: scala.Double,
    position: scala.Double
  ): scala.Double = js.native
  def readFile(fname: java.lang.String): js.Any = js.native
  def readFile(fname: java.lang.String, encoding: java.lang.String): js.Any = js.native
  def readLines(fname: java.lang.String): js.Array[_] = js.native
  def readLines(fname: java.lang.String, maxlines: scala.Double): js.Array[_] = js.native
  def readTextFile(fname: java.lang.String): java.lang.String = js.native
  def readdir(path: java.lang.String): js.Array[_] = js.native
  def readlink(path: java.lang.String): java.lang.String = js.native
  def realpath(path: java.lang.String): java.lang.String = js.native
  def rename(from: java.lang.String, to: java.lang.String): scala.Unit = js.native
  def rmdir(path: java.lang.String): scala.Unit = js.native
  def setZipFS(fname: java.lang.String, data: fibjsLib.Class_Buffer): scala.Unit = js.native
  def stat(path: java.lang.String): fibjsLib.Class_Stat = js.native
  def symlink(target: java.lang.String, linkpath: java.lang.String): scala.Unit = js.native
  def symlink(target: java.lang.String, linkpath: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def truncate(path: java.lang.String, len: scala.Double): scala.Unit = js.native
  def unlink(path: java.lang.String): scala.Unit = js.native
  def writeFile(fname: java.lang.String, data: fibjsLib.Class_Buffer): scala.Unit = js.native
  def writeTextFile(fname: java.lang.String, txt: java.lang.String): scala.Unit = js.native
}

