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
  val MD2: `1` = js.native
  val MD4: `2` = js.native
  val MD5: `3` = js.native
  val RIPEMD160: `9` = js.native
  val SHA1: `4` = js.native
  val SHA224: `5` = js.native
  val SHA256: `6` = js.native
  val SHA384: `7` = js.native
  val SHA512: `8` = js.native
  def digest(algo: Double): Class_Digest = js.native
  def digest(algo: Double, data: Class_Buffer): Class_Digest = js.native
  def hmac(algo: Double, key: Class_Buffer): Class_Digest = js.native
  def hmac_md2(key: Class_Buffer): Class_Digest = js.native
  def hmac_md4(key: Class_Buffer): Class_Digest = js.native
  def hmac_md5(key: Class_Buffer): Class_Digest = js.native
  def hmac_ripemd160(key: Class_Buffer): Class_Digest = js.native
  def hmac_sha1(key: Class_Buffer): Class_Digest = js.native
  def hmac_sha224(key: Class_Buffer): Class_Digest = js.native
  def hmac_sha256(key: Class_Buffer): Class_Digest = js.native
  def hmac_sha384(key: Class_Buffer): Class_Digest = js.native
  def hmac_sha512(key: Class_Buffer): Class_Digest = js.native
  def md2(data: Class_Buffer): Class_Digest = js.native
  def md4(data: Class_Buffer): Class_Digest = js.native
  def md5(data: Class_Buffer): Class_Digest = js.native
  def ripemd160(data: Class_Buffer): Class_Digest = js.native
  def sha1(data: Class_Buffer): Class_Digest = js.native
  def sha224(data: Class_Buffer): Class_Digest = js.native
  def sha256(data: Class_Buffer): Class_Digest = js.native
  def sha384(data: Class_Buffer): Class_Digest = js.native
  def sha512(data: Class_Buffer): Class_Digest = js.native
}

