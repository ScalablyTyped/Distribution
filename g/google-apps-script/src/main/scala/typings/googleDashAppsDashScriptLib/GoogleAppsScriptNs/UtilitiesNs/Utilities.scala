package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utilities extends js.Object {
  var Charset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Charset */ js.Any = js.native
  var DigestAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DigestAlgorithm */ js.Any = js.native
  var MacAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MacAlgorithm */ js.Any = js.native
  var RsaAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RsaAlgorithm */ js.Any = js.native
  def base64Decode(encoded: java.lang.String): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def base64Decode(encoded: java.lang.String, charset: Charset): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def base64DecodeWebSafe(encoded: java.lang.String): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def base64DecodeWebSafe(encoded: java.lang.String, charset: Charset): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def base64Encode(data: java.lang.String): java.lang.String = js.native
  def base64Encode(data: java.lang.String, charset: Charset): java.lang.String = js.native
  def base64Encode(data: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]): java.lang.String = js.native
  def base64EncodeWebSafe(data: java.lang.String): java.lang.String = js.native
  def base64EncodeWebSafe(data: java.lang.String, charset: Charset): java.lang.String = js.native
  def base64EncodeWebSafe(data: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]): java.lang.String = js.native
  def computeDigest(algorithm: DigestAlgorithm, value: java.lang.String): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeDigest(algorithm: DigestAlgorithm, value: java.lang.String, charset: Charset): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeDigest(algorithm: DigestAlgorithm, value: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeHmacSha256Signature(value: java.lang.String, key: java.lang.String): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeHmacSha256Signature(value: java.lang.String, key: java.lang.String, charset: Charset): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeHmacSha256Signature(
    value: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte],
    key: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]
  ): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeHmacSignature(algorithm: MacAlgorithm, value: java.lang.String, key: java.lang.String): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeHmacSignature(algorithm: MacAlgorithm, value: java.lang.String, key: java.lang.String, charset: Charset): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeHmacSignature(
    algorithm: MacAlgorithm,
    value: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte],
    key: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]
  ): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeRsaSha1Signature(value: java.lang.String, key: java.lang.String): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeRsaSha1Signature(value: java.lang.String, key: java.lang.String, charset: Charset): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeRsaSha256Signature(value: java.lang.String, key: java.lang.String): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeRsaSha256Signature(value: java.lang.String, key: java.lang.String, charset: Charset): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeRsaSignature(algorithm: RsaAlgorithm, value: java.lang.String, key: java.lang.String): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def computeRsaSignature(algorithm: RsaAlgorithm, value: java.lang.String, key: java.lang.String, charset: Charset): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte] = js.native
  def formatDate(date: stdLib.Date, timeZone: java.lang.String, format: java.lang.String): java.lang.String = js.native
  def formatString(template: java.lang.String, args: js.Any*): java.lang.String = js.native
  def getUuid(): java.lang.String = js.native
  def gzip(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def gzip(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource, name: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def jsonParse(jsonString: java.lang.String): js.Object = js.native
  def jsonStringify(obj: js.Object): java.lang.String = js.native
  def newBlob(data: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def newBlob(data: java.lang.String, contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def newBlob(data: java.lang.String, contentType: java.lang.String, name: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def newBlob(data: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte]): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def newBlob(data: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte], contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def newBlob(
    data: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Byte],
    contentType: java.lang.String,
    name: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def parseCsv(csv: java.lang.String): js.Array[js.Array[java.lang.String]] = js.native
  def parseCsv(csv: java.lang.String, delimiter: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Char): js.Array[js.Array[java.lang.String]] = js.native
  def sleep(milliseconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Unit = js.native
  def ungzip(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def unzip(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob] = js.native
  def zip(blobs: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource]): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def zip(
    blobs: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource],
    name: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
}

