package typings.fast64

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def decode(base64: String, options: Options): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base64.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urldecode(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urldecode")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def urldecode(base64: String, options: Options): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("urldecode")(base64.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def urlencode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlencode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var uint8Array: Boolean
  }
  object Options {
    
    inline def apply(uint8Array: Boolean): Options = {
      val __obj = js.Dynamic.literal(uint8Array = uint8Array.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setUint8Array(value: Boolean): Self = StObject.set(x, "uint8Array", value.asInstanceOf[js.Any])
    }
  }
}
