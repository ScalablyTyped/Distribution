package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief base32 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var base32 = encoding.base32;,```,或者,```JavaScript,var base32 = require('base32');,```
  */
@JSImport("base32", JSImport.Namespace)
@js.native
object base32Mod extends js.Object {
  
  def decode(data: String): ClassBuffer = js.native
  
  def encode(data: ClassBuffer): String = js.native
}
