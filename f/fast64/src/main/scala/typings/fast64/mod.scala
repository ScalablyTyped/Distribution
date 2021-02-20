package typings.fast64

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast64", "decode")
  @js.native
  def decode(base64: String): String = js.native
  @JSImport("fast64", "decode")
  @js.native
  def decode(base64: String, options: Options): Uint8Array = js.native
  
  @JSImport("fast64", "encode")
  @js.native
  def encode(value: String): String = js.native
  
  @JSImport("fast64", "urldecode")
  @js.native
  def urldecode(base64: String): String = js.native
  @JSImport("fast64", "urldecode")
  @js.native
  def urldecode(base64: String, options: Options): Uint8Array = js.native
  
  @JSImport("fast64", "urlencode")
  @js.native
  def urlencode(value: String): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var uint8Array: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(uint8Array: Boolean): Options = {
      val __obj = js.Dynamic.literal(uint8Array = uint8Array.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUint8Array(value: Boolean): Self = StObject.set(x, "uint8Array", value.asInstanceOf[js.Any])
    }
  }
}
