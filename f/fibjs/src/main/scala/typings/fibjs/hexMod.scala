package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief hex 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var hex = encoding.hex;,```,或者,```JavaScript,var hex = require('hex');,```
  */
object hexMod {
  
  @JSImport("hex", "decode")
  @js.native
  def decode(data: String): ClassBuffer = js.native
  
  @JSImport("hex", "encode")
  @js.native
  def encode(data: ClassBuffer): String = js.native
}
