package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** end of `module bson` */
/** module Or Internal Object */
/**
	* @brief bson 编码与解码模块
	* @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var bson = encoding.bson;,```,或者,```JavaScript,var bson = require('bson');,```
	*/
@JSImport("bson", JSImport.Namespace)
@js.native
object bsonMod extends js.Object {
  def decode(data: Class_Buffer): js.Object = js.native
  def encode(data: js.Object): Class_Buffer = js.native
}

