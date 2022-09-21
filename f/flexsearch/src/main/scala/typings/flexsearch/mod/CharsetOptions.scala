package typings.flexsearch.mod

import typings.flexsearch.flexsearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharsetOptions extends StObject {
  
  def encode(x: String): js.Array[String]
  
  var rtl: Boolean
  
  var split: `false` | String | js.RegExp
}
object CharsetOptions {
  
  inline def apply(encode: String => js.Array[String], rtl: Boolean, split: `false` | String | js.RegExp): CharsetOptions = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode), rtl = rtl.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharsetOptions]
  }
  
  extension [Self <: CharsetOptions](x: Self) {
    
    inline def setEncode(value: String => js.Array[String]): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
    
    inline def setSplit(value: `false` | String | js.RegExp): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
  }
}
