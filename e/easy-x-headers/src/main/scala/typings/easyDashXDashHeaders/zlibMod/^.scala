package typings.easyDashXDashHeaders.zlibMod

import typings.easyDashXDashHeaders.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Z_ASCII: Double = js.native
  var Z_BEST_COMPRESSION: Double = js.native
  var Z_BEST_SPEED: Double = js.native
  var Z_BINARY: Double = js.native
  var Z_BLOCK: Double = js.native
  var Z_BUF_ERROR: Double = js.native
  var Z_DATA_ERROR: Double = js.native
  var Z_DEFAULT_COMPRESSION: Double = js.native
  var Z_DEFAULT_STRATEGY: Double = js.native
  var Z_DEFLATED: Double = js.native
  var Z_ERRNO: Double = js.native
  var Z_FILTERED: Double = js.native
  var Z_FINISH: Double = js.native
  var Z_FIXED: Double = js.native
  var Z_FULL_FLUSH: Double = js.native
  var Z_HUFFMAN_ONLY: Double = js.native
  var Z_MEM_ERROR: Double = js.native
  var Z_NEED_DICT: Double = js.native
  var Z_NO_COMPRESSION: Double = js.native
  var Z_NO_FLUSH: Double = js.native
  var Z_NULL: Double = js.native
  var Z_OK: Double = js.native
  var Z_PARTIAL_FLUSH: Double = js.native
  var Z_RLE: Double = js.native
  var Z_STREAM_END: Double = js.native
  var Z_STREAM_ERROR: Double = js.native
  var Z_SYNC_FLUSH: Double = js.native
  var Z_TEXT: Double = js.native
  var Z_TREES: Double = js.native
  var Z_UNKNOWN: Double = js.native
  var Z_VERSION_ERROR: Double = js.native
  def createDeflate(): Deflate = js.native
  def createDeflate(options: ZlibOptions): Deflate = js.native
  def createDeflateRaw(): DeflateRaw = js.native
  def createDeflateRaw(options: ZlibOptions): DeflateRaw = js.native
  def createGunzip(): Gunzip = js.native
  def createGunzip(options: ZlibOptions): Gunzip = js.native
  def createGzip(): Gzip = js.native
  def createGzip(options: ZlibOptions): Gzip = js.native
  def createInflate(): Inflate = js.native
  def createInflate(options: ZlibOptions): Inflate = js.native
  def createInflateRaw(): InflateRaw = js.native
  def createInflateRaw(options: ZlibOptions): InflateRaw = js.native
  def createUnzip(): Unzip = js.native
  def createUnzip(options: ZlibOptions): Unzip = js.native
  def deflate(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def deflateRaw(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def deflateRawSync(buf: Buffer): js.Any = js.native
  def deflateRawSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  def deflateSync(buf: Buffer): js.Any = js.native
  def deflateSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  def gunzip(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def gunzipSync(buf: Buffer): js.Any = js.native
  def gunzipSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  def gzip(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def gzipSync(buf: Buffer): js.Any = js.native
  def gzipSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  def inflate(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def inflateRaw(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def inflateRawSync(buf: Buffer): js.Any = js.native
  def inflateRawSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  def inflateSync(buf: Buffer): js.Any = js.native
  def inflateSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
  def unzip(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def unzipSync(buf: Buffer): js.Any = js.native
  def unzipSync(buf: Buffer, options: ZlibOptions): js.Any = js.native
}

