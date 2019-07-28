package typings.fibjs

import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`1`
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
  val ZIP_DEFLATED: `1` = js.native
  val ZIP_STORED: `0` = js.native
  def isZipFile(filename: String): Boolean = js.native
  def open(data: Class_Buffer): Class_ZipFile = js.native
  def open(data: Class_Buffer, mod: String): Class_ZipFile = js.native
  def open(data: Class_Buffer, mod: String, compress_type: Double): Class_ZipFile = js.native
  def open(path: String): Class_ZipFile = js.native
  def open(path: String, mod: String): Class_ZipFile = js.native
  def open(path: String, mod: String, compress_type: Double): Class_ZipFile = js.native
  def open(strm: Class_SeekableStream): Class_ZipFile = js.native
  def open(strm: Class_SeekableStream, mod: String): Class_ZipFile = js.native
  def open(strm: Class_SeekableStream, mod: String, compress_type: Double): Class_ZipFile = js.native
}

