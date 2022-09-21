package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Base.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Utilities {
  
  @js.native
  sealed trait Charset extends StObject
  /**
    * A typesafe enum for character sets.
    */
  @JSGlobal("GoogleAppsScript.Utilities.Charset")
  @js.native
  object Charset extends StObject {
    
    @js.native
    sealed trait US_ASCII
      extends StObject
         with Charset
    
    @js.native
    sealed trait UTF_8
      extends StObject
         with Charset
  }
  
  @js.native
  sealed trait DigestAlgorithm extends StObject
  /**
    * Selector of Digest algorithm.
    */
  @JSGlobal("GoogleAppsScript.Utilities.DigestAlgorithm")
  @js.native
  object DigestAlgorithm extends StObject {
    
    @js.native
    sealed trait MD2
      extends StObject
         with DigestAlgorithm
    
    @js.native
    sealed trait MD5
      extends StObject
         with DigestAlgorithm
    
    @js.native
    sealed trait SHA_1
      extends StObject
         with DigestAlgorithm
    
    @js.native
    sealed trait SHA_256
      extends StObject
         with DigestAlgorithm
    
    @js.native
    sealed trait SHA_384
      extends StObject
         with DigestAlgorithm
    
    @js.native
    sealed trait SHA_512
      extends StObject
         with DigestAlgorithm
  }
  
  @js.native
  sealed trait MacAlgorithm extends StObject
  /**
    * Selector of MAC algorithm
    */
  @JSGlobal("GoogleAppsScript.Utilities.MacAlgorithm")
  @js.native
  object MacAlgorithm extends StObject {
    
    @js.native
    sealed trait HMAC_MD5
      extends StObject
         with MacAlgorithm
    
    @js.native
    sealed trait HMAC_SHA_1
      extends StObject
         with MacAlgorithm
    
    @js.native
    sealed trait HMAC_SHA_256
      extends StObject
         with MacAlgorithm
    
    @js.native
    sealed trait HMAC_SHA_384
      extends StObject
         with MacAlgorithm
    
    @js.native
    sealed trait HMAC_SHA_512
      extends StObject
         with MacAlgorithm
  }
  
  @js.native
  sealed trait RsaAlgorithm extends StObject
  /**
    * Selector of RSA algorithm
    */
  @JSGlobal("GoogleAppsScript.Utilities.RsaAlgorithm")
  @js.native
  object RsaAlgorithm extends StObject {
    
    @js.native
    sealed trait RSA_SHA_1
      extends StObject
         with RsaAlgorithm
    
    @js.native
    sealed trait RSA_SHA_256
      extends StObject
         with RsaAlgorithm
  }
  
  /**
    * This service provides utilities for string encoding/decoding, date formatting, JSON manipulation,
    * and other miscellaneous tasks.
    */
  @js.native
  trait Utilities extends StObject {
    
    var Charset: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Charset */ Any = js.native
    
    var DigestAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DigestAlgorithm */ Any = js.native
    
    var MacAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MacAlgorithm */ Any = js.native
    
    var RsaAlgorithm: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RsaAlgorithm */ Any = js.native
    
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
    
    def formatString(template: String, args: Any*): String = js.native
    
    def getUuid(): String = js.native
    
    def gzip(blob: BlobSource): Blob = js.native
    def gzip(blob: BlobSource, name: String): Blob = js.native
    
    /** @deprecated DO NOT USE */ def jsonParse(jsonString: String): Any = js.native
    
    /** @deprecated DO NOT USE */ def jsonStringify(obj: Any): String = js.native
    
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
}
