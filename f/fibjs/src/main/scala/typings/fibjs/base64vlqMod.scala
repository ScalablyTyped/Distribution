package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief base64vlq 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var base64vlq = encoding.base64vlq;,```,或者,```JavaScript,var base64vlq = require('base64vlq');,```
  */
object base64vlqMod {
  
  @JSImport("base64vlq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(data: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def encode(data: js.Array[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(data: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[String]
}
