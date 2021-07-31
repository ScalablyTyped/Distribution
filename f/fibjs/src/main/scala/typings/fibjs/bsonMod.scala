package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** end of `module bson` */
/** module Or Internal Object */
/**
  * @brief bson 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var bson = encoding.bson;,```,或者,```JavaScript,var bson = require('bson');,```
  */
object bsonMod {
  
  @JSImport("bson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(data: ClassBuffer): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  @scala.inline
  def encode(data: js.Object): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
}
