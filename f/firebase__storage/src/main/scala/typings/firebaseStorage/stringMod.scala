package typings.firebaseStorage

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/string", JSImport.Namespace)
@js.native
object stringMod extends js.Object {
  
  @JSName("base64Bytes_")
  def base64Bytes(format: StringFormat, value: String): Uint8Array = js.native
  
  def dataFromString(format: StringFormat, stringData: String): StringData = js.native
  
  @JSName("dataURLBytes_")
  def dataURLBytes(dataUrl: String): Uint8Array = js.native
  
  @JSName("dataURLContentType_")
  def dataURLContentType(dataUrl: String): String | Null = js.native
  
  @JSName("percentEncodedBytes_")
  def percentEncodedBytes(value: String): Uint8Array = js.native
  
  @JSName("utf8Bytes_")
  def utf8Bytes(value: String): Uint8Array = js.native
  
  @js.native
  class StringData protected () extends js.Object {
    def this(data: Uint8Array) = this()
    def this(data: Uint8Array, contentType: String) = this()
    
    var contentType: String | Null = js.native
    
    var data: Uint8Array = js.native
  }
  
  @js.native
  object StringFormat extends js.Object {
    
    var BASE64: String = js.native
    
    var BASE64URL: String = js.native
    
    var DATA_URL: String = js.native
    
    var RAW: String = js.native
  }
  type StringFormat = String
}
