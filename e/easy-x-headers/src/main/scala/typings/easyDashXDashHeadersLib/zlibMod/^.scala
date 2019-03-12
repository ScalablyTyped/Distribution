package typings
package easyDashXDashHeadersLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Z_ASCII: scala.Double = js.native
  var Z_BEST_COMPRESSION: scala.Double = js.native
  var Z_BEST_SPEED: scala.Double = js.native
  var Z_BINARY: scala.Double = js.native
  var Z_BLOCK: scala.Double = js.native
  var Z_BUF_ERROR: scala.Double = js.native
  var Z_DATA_ERROR: scala.Double = js.native
  var Z_DEFAULT_COMPRESSION: scala.Double = js.native
  var Z_DEFAULT_STRATEGY: scala.Double = js.native
  var Z_DEFLATED: scala.Double = js.native
  var Z_ERRNO: scala.Double = js.native
  var Z_FILTERED: scala.Double = js.native
  var Z_FINISH: scala.Double = js.native
  var Z_FIXED: scala.Double = js.native
  var Z_FULL_FLUSH: scala.Double = js.native
  var Z_HUFFMAN_ONLY: scala.Double = js.native
  var Z_MEM_ERROR: scala.Double = js.native
  var Z_NEED_DICT: scala.Double = js.native
  var Z_NO_COMPRESSION: scala.Double = js.native
  var Z_NO_FLUSH: scala.Double = js.native
  var Z_NULL: scala.Double = js.native
  var Z_OK: scala.Double = js.native
  var Z_PARTIAL_FLUSH: scala.Double = js.native
  var Z_RLE: scala.Double = js.native
  var Z_STREAM_END: scala.Double = js.native
  var Z_STREAM_ERROR: scala.Double = js.native
  var Z_SYNC_FLUSH: scala.Double = js.native
  var Z_TEXT: scala.Double = js.native
  var Z_TREES: scala.Double = js.native
  var Z_UNKNOWN: scala.Double = js.native
  var Z_VERSION_ERROR: scala.Double = js.native
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
  def deflate(
    buf: easyDashXDashHeadersLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def deflateRaw(
    buf: easyDashXDashHeadersLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def deflateRawSync(buf: easyDashXDashHeadersLib.Buffer): js.Any = js.native
  def deflateRawSync(buf: easyDashXDashHeadersLib.Buffer, options: ZlibOptions): js.Any = js.native
  def deflateSync(buf: easyDashXDashHeadersLib.Buffer): js.Any = js.native
  def deflateSync(buf: easyDashXDashHeadersLib.Buffer, options: ZlibOptions): js.Any = js.native
  def gunzip(
    buf: easyDashXDashHeadersLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def gunzipSync(buf: easyDashXDashHeadersLib.Buffer): js.Any = js.native
  def gunzipSync(buf: easyDashXDashHeadersLib.Buffer, options: ZlibOptions): js.Any = js.native
  def gzip(
    buf: easyDashXDashHeadersLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def gzipSync(buf: easyDashXDashHeadersLib.Buffer): js.Any = js.native
  def gzipSync(buf: easyDashXDashHeadersLib.Buffer, options: ZlibOptions): js.Any = js.native
  def inflate(
    buf: easyDashXDashHeadersLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def inflateRaw(
    buf: easyDashXDashHeadersLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def inflateRawSync(buf: easyDashXDashHeadersLib.Buffer): js.Any = js.native
  def inflateRawSync(buf: easyDashXDashHeadersLib.Buffer, options: ZlibOptions): js.Any = js.native
  def inflateSync(buf: easyDashXDashHeadersLib.Buffer): js.Any = js.native
  def inflateSync(buf: easyDashXDashHeadersLib.Buffer, options: ZlibOptions): js.Any = js.native
  def unzip(
    buf: easyDashXDashHeadersLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def unzipSync(buf: easyDashXDashHeadersLib.Buffer): js.Any = js.native
  def unzipSync(buf: easyDashXDashHeadersLib.Buffer, options: ZlibOptions): js.Any = js.native
}

