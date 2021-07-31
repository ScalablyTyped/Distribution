package typings.easyXapiSupertest

import typings.easyXapiSupertest.streamMod.Transform
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def createDeflate(): Deflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflate")().asInstanceOf[Deflate_]
  @scala.inline
  def createDeflate(options: ZlibOptions): Deflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflate")(options.asInstanceOf[js.Any]).asInstanceOf[Deflate_]
  
  @scala.inline
  def createDeflateRaw(): DeflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflateRaw")().asInstanceOf[DeflateRaw_]
  @scala.inline
  def createDeflateRaw(options: ZlibOptions): DeflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeflateRaw")(options.asInstanceOf[js.Any]).asInstanceOf[DeflateRaw_]
  
  @scala.inline
  def createGunzip(): Gunzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGunzip")().asInstanceOf[Gunzip_]
  @scala.inline
  def createGunzip(options: ZlibOptions): Gunzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGunzip")(options.asInstanceOf[js.Any]).asInstanceOf[Gunzip_]
  
  @scala.inline
  def createGzip(): Gzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzip")().asInstanceOf[Gzip_]
  @scala.inline
  def createGzip(options: ZlibOptions): Gzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createGzip")(options.asInstanceOf[js.Any]).asInstanceOf[Gzip_]
  
  @scala.inline
  def createInflate(): Inflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflate")().asInstanceOf[Inflate_]
  @scala.inline
  def createInflate(options: ZlibOptions): Inflate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflate")(options.asInstanceOf[js.Any]).asInstanceOf[Inflate_]
  
  @scala.inline
  def createInflateRaw(): InflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflateRaw")().asInstanceOf[InflateRaw_]
  @scala.inline
  def createInflateRaw(options: ZlibOptions): InflateRaw_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflateRaw")(options.asInstanceOf[js.Any]).asInstanceOf[InflateRaw_]
  
  @scala.inline
  def createUnzip(): Unzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnzip")().asInstanceOf[Unzip_]
  @scala.inline
  def createUnzip(options: ZlibOptions): Unzip_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnzip")(options.asInstanceOf[js.Any]).asInstanceOf[Unzip_]
  
  @scala.inline
  def deflate(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deflateRaw(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def deflateRawSync(buf: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawSync")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def deflateRawSync(buf: Buffer, options: ZlibOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRawSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def deflateSync(buf: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def deflateSync(buf: Buffer, options: ZlibOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def gunzip(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzip")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def gunzipSync(buf: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def gunzipSync(buf: Buffer, options: ZlibOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gunzipSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def gzip(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("gzip")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def gzipSync(buf: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def gzipSync(buf: Buffer, options: ZlibOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gzipSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def inflate(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def inflateRaw(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def inflateRawSync(buf: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawSync")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def inflateRawSync(buf: Buffer, options: ZlibOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRawSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def inflateSync(buf: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def inflateSync(buf: Buffer, options: ZlibOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def unzip(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unzip")(buf.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unzipSync(buf: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def unzipSync(buf: Buffer, options: ZlibOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unzipSync")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type DeflateRaw_ = Transform
  
  type Deflate_ = Transform
  
  type Gunzip_ = Transform
  
  type Gzip_ = Transform
  
  type InflateRaw_ = Transform
  
  type Inflate_ = Transform
  
  type Unzip_ = Transform
  
  trait ZlibOptions extends StObject {
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var dictionary: js.UndefOr[js.Any] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var memLevel: js.UndefOr[Double] = js.undefined
    
    var strategy: js.UndefOr[Double] = js.undefined
    
    var windowBits: js.UndefOr[Double] = js.undefined
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
