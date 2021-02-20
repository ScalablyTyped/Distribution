package typings.easyXapiSupertest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object punycodeMod {
  
  @JSImport("punycode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("punycode", "decode")
  @js.native
  def decode(string: String): String = js.native
  
  @JSImport("punycode", "encode")
  @js.native
  def encode(string: String): String = js.native
  
  @JSImport("punycode", "toASCII")
  @js.native
  def toASCII(domain: String): String = js.native
  
  @JSImport("punycode", "toUnicode")
  @js.native
  def toUnicode(domain: String): String = js.native
  
  @js.native
  trait ucs2 extends StObject {
    
    def decode(string: String): String = js.native
    
    def encode(codePoints: js.Array[Double]): String = js.native
  }
  object ucs2 {
    
    @JSImport("punycode", "ucs2")
    @js.native
    val ^ : ucs2 = js.native
    
    @scala.inline
    implicit class ucs2MutableBuilder[Self <: ucs2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: js.Array[Double] => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  @JSImport("punycode", "version")
  @js.native
  def version: js.Any = js.native
  @scala.inline
  def version_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
