package typings.fibjs

import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import typings.fibjs.fibjsNumbers.`3`
import typings.fibjs.fibjsNumbers.`4`
import typings.fibjs.fibjsNumbers.`5`
import typings.fibjs.fibjsNumbers.`6`
import typings.fibjs.fibjsNumbers.`7`
import typings.fibjs.fibjsNumbers.`8`
import typings.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 信息摘要计算模块，可用于计算信息摘要和摘要签名
	* @detail 
	*/
@JSImport("hash", JSImport.Namespace)
@js.native
object hashMod extends js.Object {
  @JSName("MD2")
  val MD2_ : `1` = js.native
  @JSName("MD4")
  val MD4_ : `2` = js.native
  @JSName("MD5")
  val MD5_ : `3` = js.native
  @JSName("RIPEMD160")
  val RIPEMD160_ : `9` = js.native
  @JSName("SHA1")
  val SHA1_ : `4` = js.native
  @JSName("SHA224")
  val SHA224_ : `5` = js.native
  @JSName("SHA256")
  val SHA256_ : `6` = js.native
  @JSName("SHA384")
  val SHA384_ : `7` = js.native
  @JSName("SHA512")
  val SHA512_ : `8` = js.native
  def digest(algo: Double): ClassDigest = js.native
  def digest(algo: Double, data: ClassBuffer): ClassDigest = js.native
  def hmac(algo: Double, key: ClassBuffer): ClassDigest = js.native
  @JSName("hmac_md2")
  def hmacMd2(key: ClassBuffer): ClassDigest = js.native
  @JSName("hmac_md4")
  def hmacMd4(key: ClassBuffer): ClassDigest = js.native
  @JSName("hmac_md5")
  def hmacMd5(key: ClassBuffer): ClassDigest = js.native
  @JSName("hmac_ripemd160")
  def hmacRipemd160(key: ClassBuffer): ClassDigest = js.native
  @JSName("hmac_sha1")
  def hmacSha1(key: ClassBuffer): ClassDigest = js.native
  @JSName("hmac_sha224")
  def hmacSha224(key: ClassBuffer): ClassDigest = js.native
  @JSName("hmac_sha256")
  def hmacSha256(key: ClassBuffer): ClassDigest = js.native
  @JSName("hmac_sha384")
  def hmacSha384(key: ClassBuffer): ClassDigest = js.native
  @JSName("hmac_sha512")
  def hmacSha512(key: ClassBuffer): ClassDigest = js.native
  def md2(data: ClassBuffer): ClassDigest = js.native
  def md4(data: ClassBuffer): ClassDigest = js.native
  def md5(data: ClassBuffer): ClassDigest = js.native
  def ripemd160(data: ClassBuffer): ClassDigest = js.native
  def sha1(data: ClassBuffer): ClassDigest = js.native
  def sha224(data: ClassBuffer): ClassDigest = js.native
  def sha256(data: ClassBuffer): ClassDigest = js.native
  def sha384(data: ClassBuffer): ClassDigest = js.native
  def sha512(data: ClassBuffer): ClassDigest = js.native
}

