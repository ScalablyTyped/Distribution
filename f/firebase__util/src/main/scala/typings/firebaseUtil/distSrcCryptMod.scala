package typings.firebaseUtil

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCryptMod {
  
  @JSImport("@firebase/util/dist/src/crypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/util/dist/src/crypt", "DecodeBase64StringError")
  @js.native
  open class DecodeBase64StringError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@firebase/util/dist/src/crypt", "base64")
  @js.native
  val base64: Base64_ = js.native
  
  inline def base64Decode(str: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Decode")(str.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def base64Encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64Encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def base64urlEncodeWithoutPadding(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlEncodeWithoutPadding")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait Base64_ extends StObject {
    
    val ENCODED_VALS: String = js.native
    
    var ENCODED_VALS_BASE: String = js.native
    
    val ENCODED_VALS_WEBSAFE: String = js.native
    
    var HAS_NATIVE_SUPPORT: Boolean = js.native
    
    var byteToCharMapWebSafe_ : NumberDictionary[String] | Null = js.native
    
    var byteToCharMap_ : NumberDictionary[String] | Null = js.native
    
    var charToByteMapWebSafe_ : StringDictionary[Double] | Null = js.native
    
    var charToByteMap_ : StringDictionary[Double] | Null = js.native
    
    def decodeString(input: String, webSafe: Boolean): String = js.native
    
    def decodeStringToByteArray(input: String, webSafe: Boolean): js.Array[Double] = js.native
    
    def encodeByteArray(input: js.Array[Double]): String = js.native
    def encodeByteArray(input: js.Array[Double], webSafe: Boolean): String = js.native
    def encodeByteArray(input: js.typedarray.Uint8Array): String = js.native
    def encodeByteArray(input: js.typedarray.Uint8Array, webSafe: Boolean): String = js.native
    
    def encodeString(input: String): String = js.native
    def encodeString(input: String, webSafe: Boolean): String = js.native
    
    def init_(): Unit = js.native
  }
}
