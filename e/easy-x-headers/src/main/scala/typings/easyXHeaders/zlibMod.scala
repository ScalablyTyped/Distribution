package typings.easyXHeaders

import typings.easyXHeaders.streamMod.Transform
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zlibMod {
  
  @JSImport("zlib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("zlib", "Z_ASCII")
  @js.native
  def Z_ASCII: Double = js.native
  @scala.inline
  def Z_ASCII_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_ASCII")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_BEST_COMPRESSION")
  @js.native
  def Z_BEST_COMPRESSION: Double = js.native
  @scala.inline
  def Z_BEST_COMPRESSION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_BEST_COMPRESSION")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_BEST_SPEED")
  @js.native
  def Z_BEST_SPEED: Double = js.native
  @scala.inline
  def Z_BEST_SPEED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_BEST_SPEED")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_BINARY")
  @js.native
  def Z_BINARY: Double = js.native
  @scala.inline
  def Z_BINARY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_BINARY")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_BLOCK")
  @js.native
  def Z_BLOCK: Double = js.native
  @scala.inline
  def Z_BLOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_BLOCK")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_BUF_ERROR")
  @js.native
  def Z_BUF_ERROR: Double = js.native
  @scala.inline
  def Z_BUF_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_BUF_ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_DATA_ERROR")
  @js.native
  def Z_DATA_ERROR: Double = js.native
  @scala.inline
  def Z_DATA_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_DATA_ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_DEFAULT_COMPRESSION")
  @js.native
  def Z_DEFAULT_COMPRESSION: Double = js.native
  @scala.inline
  def Z_DEFAULT_COMPRESSION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_DEFAULT_COMPRESSION")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_DEFAULT_STRATEGY")
  @js.native
  def Z_DEFAULT_STRATEGY: Double = js.native
  @scala.inline
  def Z_DEFAULT_STRATEGY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_DEFAULT_STRATEGY")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_DEFLATED")
  @js.native
  def Z_DEFLATED: Double = js.native
  @scala.inline
  def Z_DEFLATED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_DEFLATED")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_ERRNO")
  @js.native
  def Z_ERRNO: Double = js.native
  @scala.inline
  def Z_ERRNO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_ERRNO")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_FILTERED")
  @js.native
  def Z_FILTERED: Double = js.native
  @scala.inline
  def Z_FILTERED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_FILTERED")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_FINISH")
  @js.native
  def Z_FINISH: Double = js.native
  @scala.inline
  def Z_FINISH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_FINISH")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_FIXED")
  @js.native
  def Z_FIXED: Double = js.native
  @scala.inline
  def Z_FIXED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_FIXED")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_FULL_FLUSH")
  @js.native
  def Z_FULL_FLUSH: Double = js.native
  @scala.inline
  def Z_FULL_FLUSH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_FULL_FLUSH")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_HUFFMAN_ONLY")
  @js.native
  def Z_HUFFMAN_ONLY: Double = js.native
  @scala.inline
  def Z_HUFFMAN_ONLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_HUFFMAN_ONLY")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_MEM_ERROR")
  @js.native
  def Z_MEM_ERROR: Double = js.native
  @scala.inline
  def Z_MEM_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_MEM_ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_NEED_DICT")
  @js.native
  def Z_NEED_DICT: Double = js.native
  @scala.inline
  def Z_NEED_DICT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_NEED_DICT")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_NO_COMPRESSION")
  @js.native
  def Z_NO_COMPRESSION: Double = js.native
  @scala.inline
  def Z_NO_COMPRESSION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_NO_COMPRESSION")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_NO_FLUSH")
  @js.native
  def Z_NO_FLUSH: Double = js.native
  @scala.inline
  def Z_NO_FLUSH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_NO_FLUSH")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_NULL")
  @js.native
  def Z_NULL: Double = js.native
  @scala.inline
  def Z_NULL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_NULL")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_OK")
  @js.native
  def Z_OK: Double = js.native
  @scala.inline
  def Z_OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_OK")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_PARTIAL_FLUSH")
  @js.native
  def Z_PARTIAL_FLUSH: Double = js.native
  @scala.inline
  def Z_PARTIAL_FLUSH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_PARTIAL_FLUSH")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_RLE")
  @js.native
  def Z_RLE: Double = js.native
  @scala.inline
  def Z_RLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_RLE")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_STREAM_END")
  @js.native
  def Z_STREAM_END: Double = js.native
  @scala.inline
  def Z_STREAM_END_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_STREAM_END")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_STREAM_ERROR")
  @js.native
  def Z_STREAM_ERROR: Double = js.native
  @scala.inline
  def Z_STREAM_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_STREAM_ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_SYNC_FLUSH")
  @js.native
  def Z_SYNC_FLUSH: Double = js.native
  @scala.inline
  def Z_SYNC_FLUSH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_SYNC_FLUSH")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_TEXT")
  @js.native
  def Z_TEXT: Double = js.native
  @scala.inline
  def Z_TEXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_TEXT")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_TREES")
  @js.native
  def Z_TREES: Double = js.native
  @scala.inline
  def Z_TREES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_TREES")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_UNKNOWN")
  @js.native
  def Z_UNKNOWN: Double = js.native
  @scala.inline
  def Z_UNKNOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_UNKNOWN")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "Z_VERSION_ERROR")
  @js.native
  def Z_VERSION_ERROR: Double = js.native
  @scala.inline
  def Z_VERSION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Z_VERSION_ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("zlib", "createDeflate")
  @js.native
  def createDeflate(): Deflate_ = js.native
  @JSImport("zlib", "createDeflate")
  @js.native
  def createDeflate(options: ZlibOptions): Deflate_ = js.native
  
  @JSImport("zlib", "createDeflateRaw")
  @js.native
  def createDeflateRaw(): DeflateRaw_ = js.native
  @JSImport("zlib", "createDeflateRaw")
  @js.native
  def createDeflateRaw(options: ZlibOptions): DeflateRaw_ = js.native
  
  @JSImport("zlib", "createGunzip")
  @js.native
  def createGunzip(): Gunzip_ = js.native
  @JSImport("zlib", "createGunzip")
  @js.native
  def createGunzip(options: ZlibOptions): Gunzip_ = js.native
  
  @JSImport("zlib", "createGzip")
  @js.native
  def createGzip(): Gzip_ = js.native
  @JSImport("zlib", "createGzip")
  @js.native
  def createGzip(options: ZlibOptions): Gzip_ = js.native
  
  @JSImport("zlib", "createInflate")
  @js.native
  def createInflate(): Inflate_ = js.native
  @JSImport("zlib", "createInflate")
  @js.native
  def createInflate(options: ZlibOptions): Inflate_ = js.native
  
  @JSImport("zlib", "createInflateRaw")
  @js.native
  def createInflateRaw(): InflateRaw_ = js.native
  @JSImport("zlib", "createInflateRaw")
  @js.native
  def createInflateRaw(options: ZlibOptions): InflateRaw_ = js.native
  
  @JSImport("zlib", "createUnzip")
  @js.native
  def createUnzip(): Unzip_ = js.native
  @JSImport("zlib", "createUnzip")
  @js.native
  def createUnzip(options: ZlibOptions): Unzip_ = js.native
  
  @JSImport("zlib", "deflate")
  @js.native
  def deflate(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  
  @JSImport("zlib", "deflateRaw")
  @js.native
  def deflateRaw(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  
  @JSImport("zlib", "deflateRawSync")
  @js.native
  def deflateRawSync(buf: Buffer): js.Any = js.native
  @JSImport("zlib", "deflateRawSync")
  @js.native
  def deflateRawSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  
  @JSImport("zlib", "deflateSync")
  @js.native
  def deflateSync(buf: Buffer): js.Any = js.native
  @JSImport("zlib", "deflateSync")
  @js.native
  def deflateSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  
  @JSImport("zlib", "gunzip")
  @js.native
  def gunzip(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  
  @JSImport("zlib", "gunzipSync")
  @js.native
  def gunzipSync(buf: Buffer): js.Any = js.native
  @JSImport("zlib", "gunzipSync")
  @js.native
  def gunzipSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  
  @JSImport("zlib", "gzip")
  @js.native
  def gzip(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  
  @JSImport("zlib", "gzipSync")
  @js.native
  def gzipSync(buf: Buffer): js.Any = js.native
  @JSImport("zlib", "gzipSync")
  @js.native
  def gzipSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  
  @JSImport("zlib", "inflate")
  @js.native
  def inflate(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  
  @JSImport("zlib", "inflateRaw")
  @js.native
  def inflateRaw(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  
  @JSImport("zlib", "inflateRawSync")
  @js.native
  def inflateRawSync(buf: Buffer): js.Any = js.native
  @JSImport("zlib", "inflateRawSync")
  @js.native
  def inflateRawSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  
  @JSImport("zlib", "inflateSync")
  @js.native
  def inflateSync(buf: Buffer): js.Any = js.native
  @JSImport("zlib", "inflateSync")
  @js.native
  def inflateSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  
  @JSImport("zlib", "unzip")
  @js.native
  def unzip(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  
  @JSImport("zlib", "unzipSync")
  @js.native
  def unzipSync(buf: Buffer): js.Any = js.native
  @JSImport("zlib", "unzipSync")
  @js.native
  def unzipSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  
  type DeflateRaw_ = Transform
  
  type Deflate_ = Transform
  
  type Gunzip_ = Transform
  
  type Gzip_ = Transform
  
  type InflateRaw_ = Transform
  
  type Inflate_ = Transform
  
  type Unzip_ = Transform
  
  @js.native
  trait ZlibOptions extends StObject {
    
    var chunkSize: js.UndefOr[Double] = js.native
    
    var dictionary: js.UndefOr[js.Any] = js.native
    
    var level: js.UndefOr[Double] = js.native
    
    var memLevel: js.UndefOr[Double] = js.native
    
    var strategy: js.UndefOr[Double] = js.native
    
    var windowBits: js.UndefOr[Double] = js.native
  }
  object ZlibOptions {
    
    @scala.inline
    def apply(): ZlibOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZlibOptions]
    }
    
    @scala.inline
    implicit class ZlibOptionsMutableBuilder[Self <: ZlibOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setDictionary(value: js.Any): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
      
      @scala.inline
      def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      @scala.inline
      def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
    }
  }
}
