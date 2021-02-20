package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** end of `module bson` */
/** module Or Internal Object */
/**
  * @brief bson 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var bson = encoding.bson;,```,或者,```JavaScript,var bson = require('bson');,```
  */
object bsonMod {
  
  @JSImport("bson", "decode")
  @js.native
  def decode(data: ClassBuffer): js.Object = js.native
  
  @JSImport("bson", "encode")
  @js.native
  def encode(data: js.Object): ClassBuffer = js.native
}
