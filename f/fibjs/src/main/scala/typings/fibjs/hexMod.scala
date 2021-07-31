package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief hex 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var hex = encoding.hex;,```,或者,```JavaScript,var hex = require('hex');,```
  */
object hexMod {
  
  @JSImport("hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(data: String): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  
  @scala.inline
  def encode(data: ClassBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
