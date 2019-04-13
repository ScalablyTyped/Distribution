package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief zip 格式文件压缩解压模块
	* @detail 使用方法：,```JavaScript,var zip = require('zip');,```
	*/
@JSImport("zip", JSImport.Namespace)
@js.native
object zipMod extends js.Object {
  val ZIP_DEFLATED: fibjsLib.fibjsLibNumbers.`1` = js.native
  val ZIP_STORED: fibjsLib.fibjsLibNumbers.`0` = js.native
  def isZipFile(filename: java.lang.String): scala.Boolean = js.native
  def open(data: fibjsLib.Class_Buffer): fibjsLib.Class_ZipFile = js.native
  def open(data: fibjsLib.Class_Buffer, mod: java.lang.String): fibjsLib.Class_ZipFile = js.native
  def open(data: fibjsLib.Class_Buffer, mod: java.lang.String, compress_type: scala.Double): fibjsLib.Class_ZipFile = js.native
  def open(path: java.lang.String): fibjsLib.Class_ZipFile = js.native
  def open(path: java.lang.String, mod: java.lang.String): fibjsLib.Class_ZipFile = js.native
  def open(path: java.lang.String, mod: java.lang.String, compress_type: scala.Double): fibjsLib.Class_ZipFile = js.native
  def open(strm: fibjsLib.Class_SeekableStream): fibjsLib.Class_ZipFile = js.native
  def open(strm: fibjsLib.Class_SeekableStream, mod: java.lang.String): fibjsLib.Class_ZipFile = js.native
  def open(strm: fibjsLib.Class_SeekableStream, mod: java.lang.String, compress_type: scala.Double): fibjsLib.Class_ZipFile = js.native
}

