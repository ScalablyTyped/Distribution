package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief json 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var json = encoding.json;,```,或者,```JavaScript,var json = require('json');,```
  */
@JSImport("json", JSImport.Namespace)
@js.native
object jsonMod extends js.Object {
  
  def decode(data: String): js.Any = js.native
  
  def encode(data: js.Any): String = js.native
}
