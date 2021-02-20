package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief base64 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var base64 = encoding.base64;,```,或者,```JavaScript,var base64 = require('base64');,```
  */
object base64Mod {
  
  @JSImport("base64", "decode")
  @js.native
  def decode(data: String): ClassBuffer = js.native
  
  @JSImport("base64", "encode")
  @js.native
  def encode(data: ClassBuffer): String = js.native
  @JSImport("base64", "encode")
  @js.native
  def encode(data: ClassBuffer, url: Boolean): String = js.native
}
