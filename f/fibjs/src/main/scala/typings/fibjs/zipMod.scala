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
  def open(data: ClassBuffer): ClassZipFile = js.native
  def open(data: ClassBuffer, mod: String): ClassZipFile = js.native
  def open(data: ClassBuffer, mod: String, compress_type: Double): ClassZipFile = js.native
  def open(path: String): ClassZipFile = js.native
  def open(path: String, mod: String): ClassZipFile = js.native
  def open(path: String, mod: String, compress_type: Double): ClassZipFile = js.native
  def open(strm: ClassSeekableStream): ClassZipFile = js.native
  def open(strm: ClassSeekableStream, mod: String): ClassZipFile = js.native
  def open(strm: ClassSeekableStream, mod: String, compress_type: Double): ClassZipFile = js.native
}

