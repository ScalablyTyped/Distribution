package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief json 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var json = encoding.json;,```,或者,```JavaScript,var json = require('json');,```
  */
object jsonMod {
  
  @JSImport("json", "decode")
  @js.native
  def decode(data: String): js.Any = js.native
  
  @JSImport("json", "encode")
  @js.native
  def encode(data: js.Any): String = js.native
}
