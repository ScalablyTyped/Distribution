package typings
package fibjsLib

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
  val BEST_COMPRESSION: fibjsLib.fibjsLibNumbers.`9` = js.native
  val BEST_SPEED: fibjsLib.fibjsLibNumbers.`1` = js.native
  val DEFAULT_COMPRESSION: fibjsLib.fibjsLibNumbers.`-1` = js.native
  val NO_COMPRESSION: fibjsLib.fibjsLibNumbers.`0` = js.native
  def createDeflate(to: fibjsLib.Class_Stream): fibjsLib.Class_Stream = js.native
  def createDeflateRaw(to: fibjsLib.Class_Stream): fibjsLib.Class_Stream = js.native
  def createGunzip(to: fibjsLib.Class_Stream): fibjsLib.Class_Stream = js.native
  def createGunzip(to: fibjsLib.Class_Stream, maxSize: scala.Double): fibjsLib.Class_Stream = js.native
  def createGzip(to: fibjsLib.Class_Stream): fibjsLib.Class_Stream = js.native
  def createInflate(to: fibjsLib.Class_Stream): fibjsLib.Class_Stream = js.native
  def createInflate(to: fibjsLib.Class_Stream, maxSize: scala.Double): fibjsLib.Class_Stream = js.native
  def createInflateRaw(to: fibjsLib.Class_Stream): fibjsLib.Class_Stream = js.native
  def createInflateRaw(to: fibjsLib.Class_Stream, maxSize: scala.Double): fibjsLib.Class_Stream = js.native
  def deflate(data: fibjsLib.Class_Buffer): fibjsLib.Class_Buffer = js.native
  def deflate(data: fibjsLib.Class_Buffer, level: scala.Double): fibjsLib.Class_Buffer = js.native
  def deflateRaw(data: fibjsLib.Class_Buffer): fibjsLib.Class_Buffer = js.native
  def deflateRaw(data: fibjsLib.Class_Buffer, level: scala.Double): fibjsLib.Class_Buffer = js.native
  def deflateRawTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def deflateRawTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream, level: scala.Double): scala.Unit = js.native
  def deflateRawTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def deflateRawTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream, level: scala.Double): scala.Unit = js.native
  def deflateTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def deflateTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream, level: scala.Double): scala.Unit = js.native
  def deflateTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def deflateTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream, level: scala.Double): scala.Unit = js.native
  def gunzip(data: fibjsLib.Class_Buffer): fibjsLib.Class_Buffer = js.native
  def gunzip(data: fibjsLib.Class_Buffer, maxSize: scala.Double): fibjsLib.Class_Buffer = js.native
  def gunzipTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def gunzipTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream, maxSize: scala.Double): scala.Unit = js.native
  def gunzipTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def gunzipTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream, maxSize: scala.Double): scala.Unit = js.native
  def gzip(data: fibjsLib.Class_Buffer): fibjsLib.Class_Buffer = js.native
  def gzipTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def gzipTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def inflate(data: fibjsLib.Class_Buffer): fibjsLib.Class_Buffer = js.native
  def inflate(data: fibjsLib.Class_Buffer, maxSize: scala.Double): fibjsLib.Class_Buffer = js.native
  def inflateRaw(data: fibjsLib.Class_Buffer): fibjsLib.Class_Buffer = js.native
  def inflateRaw(data: fibjsLib.Class_Buffer, maxSize: scala.Double): fibjsLib.Class_Buffer = js.native
  def inflateRawTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def inflateRawTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream, maxSize: scala.Double): scala.Unit = js.native
  def inflateRawTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def inflateRawTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream, maxSize: scala.Double): scala.Unit = js.native
  def inflateTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def inflateTo(data: fibjsLib.Class_Buffer, stm: fibjsLib.Class_Stream, maxSize: scala.Double): scala.Unit = js.native
  def inflateTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream): scala.Unit = js.native
  def inflateTo(src: fibjsLib.Class_Stream, stm: fibjsLib.Class_Stream, maxSize: scala.Double): scala.Unit = js.native
}

