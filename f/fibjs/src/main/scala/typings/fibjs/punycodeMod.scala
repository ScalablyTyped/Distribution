package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief punycode 国际化域名转换模块
  * @detail Punycode 是由 RFC 3492 定义的主要用于国际化域名的字符编码方案。因为 URL 中主机名限制只能是 ASCII 字符，包括非 ASCII 字符的主机名必须使用 punycode 算法转化为ASCII。,,使用方法：,```JavaScript,var punycode = require('punycode');,```
  */
object punycodeMod {
  
  @JSImport("punycode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def encode(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toASCII(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASCII")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toUnicode(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnicode")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
}
