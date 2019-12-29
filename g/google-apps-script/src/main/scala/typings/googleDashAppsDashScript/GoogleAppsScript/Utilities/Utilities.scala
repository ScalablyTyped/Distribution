package typings.googleDashAppsDashScript.GoogleAppsScript.Utilities

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Date
import typings.googleDashAppsDashScript.GoogleAppsScript.Byte
import typings.googleDashAppsDashScript.GoogleAppsScript.Char
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service provides utilities for string encoding/decoding, date formatting, JSON manipulation,
  * and other miscellaneous tasks.
  */
@js.native
trait Utilities extends js.Object {
  var Charset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Charset */ js.Any = js.native
  var DigestAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DigestAlgorithm */ js.Any = js.native
  var MacAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MacAlgorithm */ js.Any = js.native
  var RsaAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RsaAlgorithm */ js.Any = js.native
  def base64Decode(encoded: String): js.Array[Byte] = js.native
  def base64Decode(encoded: String, charset: Charset): js.Array[Byte] = js.native
  def base64DecodeWebSafe(encoded: String): js.Array[Byte] = js.native
  def base64DecodeWebSafe(encoded: String, charset: Charset): js.Array[Byte] = js.native
  def base64Encode(data: String): String = js.native
  def base64Encode(data: String, charset: Charset): String = js.native
  def base64Encode(data: js.Array[Byte]): String = js.native
  def base64EncodeWebSafe(data: String): String = js.native
  def base64EncodeWebSafe(data: String, charset: Charset): String = js.native
  def base64EncodeWebSafe(data: js.Array[Byte]): String = js.native
  def computeDigest(algorithm: DigestAlgorithm, value: String): js.Array[Byte] = js.native
  def computeDigest(algorithm: DigestAlgorithm, value: String, charset: Charset): js.Array[Byte] = js.native
  def computeDigest(algorithm: DigestAlgorithm, value: js.Array[Byte]): js.Array[Byte] = js.native
  def computeHmacSha256Signature(value: String, key: String): js.Array[Byte] = js.native
  def computeHmacSha256Signature(value: String, key: String, charset: Charset): js.Array[Byte] = js.native
  def computeHmacSha256Signature(value: js.Array[Byte], key: js.Array[Byte]): js.Array[Byte] = js.native
  def computeHmacSignature(algorithm: MacAlgorithm, value: String, key: String): js.Array[Byte] = js.native
  def computeHmacSignature(algorithm: MacAlgorithm, value: String, key: String, charset: Charset): js.Array[Byte] = js.native
  def computeHmacSignature(algorithm: MacAlgorithm, value: js.Array[Byte], key: js.Array[Byte]): js.Array[Byte] = js.native
  def computeRsaSha1Signature(value: String, key: String): js.Array[Byte] = js.native
  def computeRsaSha1Signature(value: String, key: String, charset: Charset): js.Array[Byte] = js.native
  def computeRsaSha256Signature(value: String, key: String): js.Array[Byte] = js.native
  def computeRsaSha256Signature(value: String, key: String, charset: Charset): js.Array[Byte] = js.native
  def computeRsaSignature(algorithm: RsaAlgorithm, value: String, key: String): js.Array[Byte] = js.native
  def computeRsaSignature(algorithm: RsaAlgorithm, value: String, key: String, charset: Charset): js.Array[Byte] = js.native
  def formatDate(date: Date, timeZone: String, format: String): String = js.native
  def formatString(template: String, args: js.Any*): String = js.native
  def getUuid(): String = js.native
  def gzip(blob: BlobSource): Blob = js.native
  def gzip(blob: BlobSource, name: String): Blob = js.native
  /** @deprecated DO NOT USE */ def jsonParse(jsonString: String): js.Any = js.native
  /** @deprecated DO NOT USE */ def jsonStringify(obj: js.Any): String = js.native
  def newBlob(data: String): Blob = js.native
  def newBlob(data: String, contentType: String): Blob = js.native
  def newBlob(data: String, contentType: String, name: String): Blob = js.native
  def newBlob(data: js.Array[Byte]): Blob = js.native
  def newBlob(data: js.Array[Byte], contentType: String): Blob = js.native
  def newBlob(data: js.Array[Byte], contentType: String, name: String): Blob = js.native
  def parseCsv(csv: String): js.Array[js.Array[String]] = js.native
  def parseCsv(csv: String, delimiter: Char): js.Array[js.Array[String]] = js.native
  def sleep(milliseconds: Integer): Unit = js.native
  def ungzip(blob: BlobSource): Blob = js.native
  def unzip(blob: BlobSource): js.Array[Blob] = js.native
  def zip(blobs: js.Array[BlobSource]): Blob = js.native
  def zip(blobs: js.Array[BlobSource], name: String): Blob = js.native
}

