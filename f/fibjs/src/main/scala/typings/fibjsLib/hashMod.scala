package typings
package fibjsLib

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
  val MD2: /* 1 */ scala.Double = js.native
  val MD4: /* 2 */ scala.Double = js.native
  val MD5: /* 3 */ scala.Double = js.native
  val RIPEMD160: /* 9 */ scala.Double = js.native
  val SHA1: /* 4 */ scala.Double = js.native
  val SHA224: /* 5 */ scala.Double = js.native
  val SHA256: /* 6 */ scala.Double = js.native
  val SHA384: /* 7 */ scala.Double = js.native
  val SHA512: /* 8 */ scala.Double = js.native
  def digest(algo: scala.Double): fibjsLib.Class_Digest = js.native
  def digest(algo: scala.Double, data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac(algo: scala.Double, key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac_md2(key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac_md4(key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac_md5(key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac_ripemd160(key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac_sha1(key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac_sha224(key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac_sha256(key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac_sha384(key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def hmac_sha512(key: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def md2(data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def md4(data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def md5(data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def ripemd160(data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def sha1(data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def sha224(data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def sha256(data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def sha384(data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
  def sha512(data: fibjsLib.Class_Buffer): fibjsLib.Class_Digest = js.native
}

