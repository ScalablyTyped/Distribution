package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** end of `module iconv` */
/** module Or Internal Object */
/**
  * @brief iconv 编码与解码模块
  * @detail 引用方式：,```JavaScript,var encoding = require('encoding');,var iconv = encoding.iconv;,```,或者,```JavaScript,var iconv = require('iconv');,```
  */
object iconvMod {
  
  @JSImport("iconv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(charset: String, data: ClassBuffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(charset.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def encode(charset: String, data: String): ClassBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(charset.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ClassBuffer]
  
  @scala.inline
  def isEncoding(charset: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(charset.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
