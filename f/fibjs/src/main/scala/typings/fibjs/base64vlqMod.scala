package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief base64vlq 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var base64vlq = encoding.base64vlq;,```,或者,```JavaScript,var base64vlq = require('base64vlq');,```
  */
object base64vlqMod {
  
  @JSImport("base64vlq", "decode")
  @js.native
  def decode(data: String): js.Array[_] = js.native
  
  @JSImport("base64vlq", "encode")
  @js.native
  def encode(data: js.Array[_]): String = js.native
  @JSImport("base64vlq", "encode")
  @js.native
  def encode(data: Double): String = js.native
}
