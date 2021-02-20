package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 解码 Buffer 到字符串
  * @detail 使用方法：,```JavaScript, const { StringDecoder } = require('string_decoder');, const decoder = new StringDecoder('utf8');,, const cent = Buffer.from([0xC2, 0xA2]);, console.log(decoder.write(cent));,, const euro = Buffer.from([0xE2, 0x82, 0xAC]);, console.log(decoder.write(euro));,```
  */
object stringDecoderMod {
  
  @JSImport("string_decoder", "StringDecoder")
  @js.native
  class StringDecoder () extends ClassStringDecoder
}
