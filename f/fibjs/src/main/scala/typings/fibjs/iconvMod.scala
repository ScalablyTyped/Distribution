package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** end of `module iconv` */
/** module Or Internal Object */
/**
  * @brief iconv 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var iconv = encoding.iconv;,```,或者,```JavaScript,var iconv = require('iconv');,```
  */
@JSImport("iconv", JSImport.Namespace)
@js.native
object iconvMod extends js.Object {
  
  def decode(charset: String, data: ClassBuffer): String = js.native
  
  def encode(charset: String, data: String): ClassBuffer = js.native
  
  def isEncoding(charset: String): Boolean = js.native
}
