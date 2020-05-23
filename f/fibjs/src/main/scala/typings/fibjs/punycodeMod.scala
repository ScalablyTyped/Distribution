package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief punycode 国际化域名转换模块
  * @detail Punycode 是由 RFC 3492 定义的主要用于国际化域名的字符编码方案。因为 URL 中主机名限制只能是 ASCII 字符，包括非 ASCII 字符的主机名必须使用 punycode 算法转化为ASCII。,,使用方法：,```JavaScript,var punycode = require('punycode');,```
  */
@JSImport("punycode", JSImport.Namespace)
@js.native
object punycodeMod extends js.Object {
  def decode(domain: String): String = js.native
  def encode(domain: String): String = js.native
  def toASCII(domain: String): String = js.native
  def toUnicode(domain: String): String = js.native
}

