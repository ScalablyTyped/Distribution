package typings.firebaseStorage

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("@firebase/storage/dist/src/implementation/string", "StringData")
  @js.native
  class StringData protected () extends StObject {
    def this(data: Uint8Array) = this()
    def this(data: Uint8Array, contentType: String) = this()
    
    var contentType: String | Null = js.native
    
    var data: Uint8Array = js.native
  }
  
  object StringFormat {
    
    @JSImport("@firebase/storage/dist/src/implementation/string", "StringFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@firebase/storage/dist/src/implementation/string", "StringFormat.BASE64")
    @js.native
    def BASE64: String = js.native
    
    @JSImport("@firebase/storage/dist/src/implementation/string", "StringFormat.BASE64URL")
    @js.native
    def BASE64URL: String = js.native
    @scala.inline
    def BASE64URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE64URL")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def BASE64_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE64")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/string", "StringFormat.DATA_URL")
    @js.native
    def DATA_URL: String = js.native
    @scala.inline
    def DATA_URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_URL")(x.asInstanceOf[js.Any])
    
    @JSImport("@firebase/storage/dist/src/implementation/string", "StringFormat.RAW")
    @js.native
    def RAW: String = js.native
    @scala.inline
    def RAW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RAW")(x.asInstanceOf[js.Any])
  }
  type StringFormat = String
  
  @JSImport("@firebase/storage/dist/src/implementation/string", "base64Bytes_")
  @js.native
  def base64Bytes(format: StringFormat, value: String): Uint8Array = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/string", "dataFromString")
  @js.native
  def dataFromString(format: StringFormat, stringData: String): StringData = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/string", "dataURLBytes_")
  @js.native
  def dataURLBytes(dataUrl: String): Uint8Array = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/string", "dataURLContentType_")
  @js.native
  def dataURLContentType(dataUrl: String): String | Null = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/string", "percentEncodedBytes_")
  @js.native
  def percentEncodedBytes(value: String): Uint8Array = js.native
  
  @JSImport("@firebase/storage/dist/src/implementation/string", "utf8Bytes_")
  @js.native
  def utf8Bytes(value: String): Uint8Array = js.native
}
