package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 信息摘要计算模块，可用于计算信息摘要和摘要签名
  * @detail 
  */
object hashMod {
  
  @JSImport("hash", "MD2")
  @js.native
  val MD2_ : /* 1 */ Double = js.native
  
  @JSImport("hash", "MD4")
  @js.native
  val MD4_ : /* 2 */ Double = js.native
  
  @JSImport("hash", "MD5")
  @js.native
  val MD5_ : /* 3 */ Double = js.native
  
  @JSImport("hash", "RIPEMD160")
  @js.native
  val RIPEMD160_ : /* 9 */ Double = js.native
  
  @JSImport("hash", "SHA1")
  @js.native
  val SHA1_ : /* 4 */ Double = js.native
  
  @JSImport("hash", "SHA224")
  @js.native
  val SHA224_ : /* 5 */ Double = js.native
  
  @JSImport("hash", "SHA256")
  @js.native
  val SHA256_ : /* 6 */ Double = js.native
  
  @JSImport("hash", "SHA384")
  @js.native
  val SHA384_ : /* 7 */ Double = js.native
  
  @JSImport("hash", "SHA512")
  @js.native
  val SHA512_ : /* 8 */ Double = js.native
  
  @JSImport("hash", "digest")
  @js.native
  def digest(algo: Double): ClassDigest = js.native
  @JSImport("hash", "digest")
  @js.native
  def digest(algo: Double, data: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac")
  @js.native
  def hmac(algo: Double, key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac_md2")
  @js.native
  def hmacMd2(key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac_md4")
  @js.native
  def hmacMd4(key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac_md5")
  @js.native
  def hmacMd5(key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac_ripemd160")
  @js.native
  def hmacRipemd160(key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac_sha1")
  @js.native
  def hmacSha1(key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac_sha224")
  @js.native
  def hmacSha224(key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac_sha256")
  @js.native
  def hmacSha256(key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac_sha384")
  @js.native
  def hmacSha384(key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "hmac_sha512")
  @js.native
  def hmacSha512(key: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "md2")
  @js.native
  def md2(data: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "md4")
  @js.native
  def md4(data: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "md5")
  @js.native
  def md5(data: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "ripemd160")
  @js.native
  def ripemd160(data: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "sha1")
  @js.native
  def sha1(data: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "sha224")
  @js.native
  def sha224(data: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "sha256")
  @js.native
  def sha256(data: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "sha384")
  @js.native
  def sha384(data: ClassBuffer): ClassDigest = js.native
  
  @JSImport("hash", "sha512")
  @js.native
  def sha512(data: ClassBuffer): ClassDigest = js.native
}
