package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** end of `module iconv` */
/** module Or Internal Object */
/**
  * @brief iconv 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var iconv = encoding.iconv;,```,或者,```JavaScript,var iconv = require('iconv');,```
  */
object iconvMod {
  
  @JSImport("iconv", "decode")
  @js.native
  def decode(charset: String, data: ClassBuffer): String = js.native
  
  @JSImport("iconv", "encode")
  @js.native
  def encode(charset: String, data: String): ClassBuffer = js.native
  
  @JSImport("iconv", "isEncoding")
  @js.native
  def isEncoding(charset: String): Boolean = js.native
}
