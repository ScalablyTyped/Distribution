package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief base64 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var base64 = encoding.base64;,```,或者,```JavaScript,var base64 = require('base64');,```
  */
object base64Mod {
  
  @JSImport("base64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(data: String): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  
  inline def encode(data: ClassBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(data: ClassBuffer, url: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[String]
}
