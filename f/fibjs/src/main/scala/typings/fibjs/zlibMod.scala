package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief zlib 压缩解压模块
  * @detail 使用方法：,```JavaScript,var zlib = require('zlib');,```
  */
object zlibMod {
  
  @JSImport("zlib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def createDeflate(to: ClassStream): ClassStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflate")(to.asInstanceOf[js.Any]).asInstanceOf[ClassStream]
  
  inline def createDeflateRaw(to: ClassStream): ClassStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflateRaw")(to.asInstanceOf[js.Any]).asInstanceOf[ClassStream]
  
  inline def createGunzip(to: ClassStream): ClassStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createGunzip")(to.asInstanceOf[js.Any]).asInstanceOf[ClassStream]
  inline def createGunzip(to: ClassStream, maxSize: Double): ClassStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createGunzip")(to.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[ClassStream]
  
  inline def createGzip(to: ClassStream): ClassStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzip")(to.asInstanceOf[js.Any]).asInstanceOf[ClassStream]
  
  inline def createInflate(to: ClassStream): ClassStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflate")(to.asInstanceOf[js.Any]).asInstanceOf[ClassStream]
  inline def createInflate(to: ClassStream, maxSize: Double): ClassStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createInflate")(to.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[ClassStream]
  
  inline def createInflateRaw(to: ClassStream): ClassStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflateRaw")(to.asInstanceOf[js.Any]).asInstanceOf[ClassStream]
  inline def createInflateRaw(to: ClassStream, maxSize: Double): ClassStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createInflateRaw")(to.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[ClassStream]
  
  inline def deflate(data: ClassBuffer): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  inline def deflate(data: ClassBuffer, level: Double): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  inline def deflateRaw(data: ClassBuffer): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  inline def deflateRaw(data: ClassBuffer, level: Double): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  inline def deflateRawTo(data: ClassBuffer, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflateRawTo(data: ClassBuffer, stm: ClassStream, level: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflateRawTo(src: ClassStream, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflateRawTo(src: ClassStream, stm: ClassStream, level: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deflateTo(data: ClassBuffer, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflateTo(data: ClassBuffer, stm: ClassStream, level: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflateTo(src: ClassStream, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deflateTo(src: ClassStream, stm: ClassStream, level: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def gunzip(data: ClassBuffer): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  inline def gunzip(data: ClassBuffer, maxSize: Double): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(data.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  inline def gunzipTo(data: ClassBuffer, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzipTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gunzipTo(data: ClassBuffer, stm: ClassStream, maxSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzipTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gunzipTo(src: ClassStream, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzipTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gunzipTo(src: ClassStream, stm: ClassStream, maxSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzipTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def gzip(data: ClassBuffer): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  
  inline def gzipTo(data: ClassBuffer, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def gzipTo(src: ClassStream, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inflate(data: ClassBuffer): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  inline def inflate(data: ClassBuffer, maxSize: Double): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(data.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  inline def inflateRaw(data: ClassBuffer): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  inline def inflateRaw(data: ClassBuffer, maxSize: Double): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(data.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  inline def inflateRawTo(data: ClassBuffer, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflateRawTo(data: ClassBuffer, stm: ClassStream, maxSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflateRawTo(src: ClassStream, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflateRawTo(src: ClassStream, stm: ClassStream, maxSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def inflateTo(data: ClassBuffer, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflateTo(data: ClassBuffer, stm: ClassStream, maxSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateTo")(data.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflateTo(src: ClassStream, stm: ClassStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inflateTo(src: ClassStream, stm: ClassStream, maxSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateTo")(src.asInstanceOf[js.Any], stm.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
