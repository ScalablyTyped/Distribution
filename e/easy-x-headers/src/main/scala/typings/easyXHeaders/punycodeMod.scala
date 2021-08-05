package typings.easyXHeaders

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object punycodeMod {
  
  @JSImport("punycode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encode(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toASCII(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASCII")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toUnicode(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnicode")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ucs2 extends StObject {
    
    def decode(string: String): String
    
    def encode(codePoints: js.Array[Double]): String
  }
  object ucs2 {
    
    @JSImport("punycode", "ucs2")
    @js.native
    val ^ : ucs2 = js.native
    
    extension [Self <: ucs2](x: Self) {
      
      inline def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: js.Array[Double] => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("punycode", "version")
  @js.native
  def version: js.Any = js.native
  inline def version_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
