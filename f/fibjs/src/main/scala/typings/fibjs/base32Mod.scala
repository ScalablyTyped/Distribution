package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief base32 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var base32 = encoding.base32;,```,或者,```JavaScript,var base32 = require('base32');,```
  */
object base32Mod {
  
  @JSImport("base32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(data: String): ClassBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[ClassBuffer]
  
  inline def encode(data: ClassBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
