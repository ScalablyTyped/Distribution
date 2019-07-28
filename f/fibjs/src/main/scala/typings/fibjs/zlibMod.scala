package typings.fibjs

import typings.fibjs.fibjsNumbers.`-1`
import typings.fibjs.fibjsNumbers.`0`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief zlib 压缩解压模块
	* @detail 使用方法：,```JavaScript,var zlib = require('zlib');,```
	*/
@JSImport("zlib", JSImport.Namespace)
@js.native
object zlibMod extends js.Object {
  val BEST_COMPRESSION: `9` = js.native
  val BEST_SPEED: `1` = js.native
  val DEFAULT_COMPRESSION: `-1` = js.native
  val NO_COMPRESSION: `0` = js.native
  def createDeflate(to: Class_Stream): Class_Stream = js.native
  def createDeflateRaw(to: Class_Stream): Class_Stream = js.native
  def createGunzip(to: Class_Stream): Class_Stream = js.native
  def createGunzip(to: Class_Stream, maxSize: Double): Class_Stream = js.native
  def createGzip(to: Class_Stream): Class_Stream = js.native
  def createInflate(to: Class_Stream): Class_Stream = js.native
  def createInflate(to: Class_Stream, maxSize: Double): Class_Stream = js.native
  def createInflateRaw(to: Class_Stream): Class_Stream = js.native
  def createInflateRaw(to: Class_Stream, maxSize: Double): Class_Stream = js.native
  def deflate(data: Class_Buffer): Class_Buffer = js.native
  def deflate(data: Class_Buffer, level: Double): Class_Buffer = js.native
  def deflateRaw(data: Class_Buffer): Class_Buffer = js.native
  def deflateRaw(data: Class_Buffer, level: Double): Class_Buffer = js.native
  def deflateRawTo(data: Class_Buffer, stm: Class_Stream): Unit = js.native
  def deflateRawTo(data: Class_Buffer, stm: Class_Stream, level: Double): Unit = js.native
  def deflateRawTo(src: Class_Stream, stm: Class_Stream): Unit = js.native
  def deflateRawTo(src: Class_Stream, stm: Class_Stream, level: Double): Unit = js.native
  def deflateTo(data: Class_Buffer, stm: Class_Stream): Unit = js.native
  def deflateTo(data: Class_Buffer, stm: Class_Stream, level: Double): Unit = js.native
  def deflateTo(src: Class_Stream, stm: Class_Stream): Unit = js.native
  def deflateTo(src: Class_Stream, stm: Class_Stream, level: Double): Unit = js.native
  def gunzip(data: Class_Buffer): Class_Buffer = js.native
  def gunzip(data: Class_Buffer, maxSize: Double): Class_Buffer = js.native
  def gunzipTo(data: Class_Buffer, stm: Class_Stream): Unit = js.native
  def gunzipTo(data: Class_Buffer, stm: Class_Stream, maxSize: Double): Unit = js.native
  def gunzipTo(src: Class_Stream, stm: Class_Stream): Unit = js.native
  def gunzipTo(src: Class_Stream, stm: Class_Stream, maxSize: Double): Unit = js.native
  def gzip(data: Class_Buffer): Class_Buffer = js.native
  def gzipTo(data: Class_Buffer, stm: Class_Stream): Unit = js.native
  def gzipTo(src: Class_Stream, stm: Class_Stream): Unit = js.native
  def inflate(data: Class_Buffer): Class_Buffer = js.native
  def inflate(data: Class_Buffer, maxSize: Double): Class_Buffer = js.native
  def inflateRaw(data: Class_Buffer): Class_Buffer = js.native
  def inflateRaw(data: Class_Buffer, maxSize: Double): Class_Buffer = js.native
  def inflateRawTo(data: Class_Buffer, stm: Class_Stream): Unit = js.native
  def inflateRawTo(data: Class_Buffer, stm: Class_Stream, maxSize: Double): Unit = js.native
  def inflateRawTo(src: Class_Stream, stm: Class_Stream): Unit = js.native
  def inflateRawTo(src: Class_Stream, stm: Class_Stream, maxSize: Double): Unit = js.native
  def inflateTo(data: Class_Buffer, stm: Class_Stream): Unit = js.native
  def inflateTo(data: Class_Buffer, stm: Class_Stream, maxSize: Double): Unit = js.native
  def inflateTo(src: Class_Stream, stm: Class_Stream): Unit = js.native
  def inflateTo(src: Class_Stream, stm: Class_Stream, maxSize: Double): Unit = js.native
}

