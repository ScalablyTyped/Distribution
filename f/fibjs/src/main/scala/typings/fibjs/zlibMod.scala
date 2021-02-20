package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief zlib 压缩解压模块
  * @detail 使用方法：,```JavaScript,var zlib = require('zlib');,```
  */
object zlibMod {
  
  @JSImport("zlib", "BEST_COMPRESSION")
  @js.native
  val BEST_COMPRESSION: /* 9 */ Double = js.native
  
  @JSImport("zlib", "BEST_SPEED")
  @js.native
  val BEST_SPEED: /* 1 */ Double = js.native
  
  @JSImport("zlib", "DEFAULT_COMPRESSION")
  @js.native
  val DEFAULT_COMPRESSION: /* -1 */ Double = js.native
  
  @JSImport("zlib", "NO_COMPRESSION")
  @js.native
  val NO_COMPRESSION: /* 0 */ Double = js.native
  
  @JSImport("zlib", "createDeflate")
  @js.native
  def createDeflate(to: ClassStream): ClassStream = js.native
  
  @JSImport("zlib", "createDeflateRaw")
  @js.native
  def createDeflateRaw(to: ClassStream): ClassStream = js.native
  
  @JSImport("zlib", "createGunzip")
  @js.native
  def createGunzip(to: ClassStream): ClassStream = js.native
  @JSImport("zlib", "createGunzip")
  @js.native
  def createGunzip(to: ClassStream, maxSize: Double): ClassStream = js.native
  
  @JSImport("zlib", "createGzip")
  @js.native
  def createGzip(to: ClassStream): ClassStream = js.native
  
  @JSImport("zlib", "createInflate")
  @js.native
  def createInflate(to: ClassStream): ClassStream = js.native
  @JSImport("zlib", "createInflate")
  @js.native
  def createInflate(to: ClassStream, maxSize: Double): ClassStream = js.native
  
  @JSImport("zlib", "createInflateRaw")
  @js.native
  def createInflateRaw(to: ClassStream): ClassStream = js.native
  @JSImport("zlib", "createInflateRaw")
  @js.native
  def createInflateRaw(to: ClassStream, maxSize: Double): ClassStream = js.native
  
  @JSImport("zlib", "deflate")
  @js.native
  def deflate(data: ClassBuffer): ClassBuffer = js.native
  @JSImport("zlib", "deflate")
  @js.native
  def deflate(data: ClassBuffer, level: Double): ClassBuffer = js.native
  
  @JSImport("zlib", "deflateRaw")
  @js.native
  def deflateRaw(data: ClassBuffer): ClassBuffer = js.native
  @JSImport("zlib", "deflateRaw")
  @js.native
  def deflateRaw(data: ClassBuffer, level: Double): ClassBuffer = js.native
  
  @JSImport("zlib", "deflateRawTo")
  @js.native
  def deflateRawTo(data: ClassBuffer, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "deflateRawTo")
  @js.native
  def deflateRawTo(data: ClassBuffer, stm: ClassStream, level: Double): Unit = js.native
  @JSImport("zlib", "deflateRawTo")
  @js.native
  def deflateRawTo(src: ClassStream, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "deflateRawTo")
  @js.native
  def deflateRawTo(src: ClassStream, stm: ClassStream, level: Double): Unit = js.native
  
  @JSImport("zlib", "deflateTo")
  @js.native
  def deflateTo(data: ClassBuffer, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "deflateTo")
  @js.native
  def deflateTo(data: ClassBuffer, stm: ClassStream, level: Double): Unit = js.native
  @JSImport("zlib", "deflateTo")
  @js.native
  def deflateTo(src: ClassStream, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "deflateTo")
  @js.native
  def deflateTo(src: ClassStream, stm: ClassStream, level: Double): Unit = js.native
  
  @JSImport("zlib", "gunzip")
  @js.native
  def gunzip(data: ClassBuffer): ClassBuffer = js.native
  @JSImport("zlib", "gunzip")
  @js.native
  def gunzip(data: ClassBuffer, maxSize: Double): ClassBuffer = js.native
  
  @JSImport("zlib", "gunzipTo")
  @js.native
  def gunzipTo(data: ClassBuffer, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "gunzipTo")
  @js.native
  def gunzipTo(data: ClassBuffer, stm: ClassStream, maxSize: Double): Unit = js.native
  @JSImport("zlib", "gunzipTo")
  @js.native
  def gunzipTo(src: ClassStream, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "gunzipTo")
  @js.native
  def gunzipTo(src: ClassStream, stm: ClassStream, maxSize: Double): Unit = js.native
  
  @JSImport("zlib", "gzip")
  @js.native
  def gzip(data: ClassBuffer): ClassBuffer = js.native
  
  @JSImport("zlib", "gzipTo")
  @js.native
  def gzipTo(data: ClassBuffer, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "gzipTo")
  @js.native
  def gzipTo(src: ClassStream, stm: ClassStream): Unit = js.native
  
  @JSImport("zlib", "inflate")
  @js.native
  def inflate(data: ClassBuffer): ClassBuffer = js.native
  @JSImport("zlib", "inflate")
  @js.native
  def inflate(data: ClassBuffer, maxSize: Double): ClassBuffer = js.native
  
  @JSImport("zlib", "inflateRaw")
  @js.native
  def inflateRaw(data: ClassBuffer): ClassBuffer = js.native
  @JSImport("zlib", "inflateRaw")
  @js.native
  def inflateRaw(data: ClassBuffer, maxSize: Double): ClassBuffer = js.native
  
  @JSImport("zlib", "inflateRawTo")
  @js.native
  def inflateRawTo(data: ClassBuffer, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "inflateRawTo")
  @js.native
  def inflateRawTo(data: ClassBuffer, stm: ClassStream, maxSize: Double): Unit = js.native
  @JSImport("zlib", "inflateRawTo")
  @js.native
  def inflateRawTo(src: ClassStream, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "inflateRawTo")
  @js.native
  def inflateRawTo(src: ClassStream, stm: ClassStream, maxSize: Double): Unit = js.native
  
  @JSImport("zlib", "inflateTo")
  @js.native
  def inflateTo(data: ClassBuffer, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "inflateTo")
  @js.native
  def inflateTo(data: ClassBuffer, stm: ClassStream, maxSize: Double): Unit = js.native
  @JSImport("zlib", "inflateTo")
  @js.native
  def inflateTo(src: ClassStream, stm: ClassStream): Unit = js.native
  @JSImport("zlib", "inflateTo")
  @js.native
  def inflateTo(src: ClassStream, stm: ClassStream, maxSize: Double): Unit = js.native
}
