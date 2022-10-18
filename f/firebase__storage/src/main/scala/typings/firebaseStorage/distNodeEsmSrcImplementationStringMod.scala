package typings.firebaseStorage

import typings.firebaseStorage.firebaseStorageStrings.base64
import typings.firebaseStorage.firebaseStorageStrings.base64url
import typings.firebaseStorage.firebaseStorageStrings.data_url
import typings.firebaseStorage.firebaseStorageStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcImplementationStringMod {
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/storage/dist/node-esm/src/implementation/string", "StringData")
  @js.native
  open class StringData protected () extends StObject {
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: js.typedarray.Uint8Array, contentType: String) = this()
    
    var contentType: String | Null = js.native
    
    var data: js.typedarray.Uint8Array = js.native
  }
  
  /* Inlined { readonly RAW :'raw',  readonly BASE64 :'base64',  readonly BASE64URL :'base64url',  readonly DATA_URL :'data_url'}[keyof { readonly RAW :'raw',  readonly BASE64 :'base64',  readonly BASE64URL :'base64url',  readonly DATA_URL :'data_url'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseStorage.firebaseStorageStrings.raw
    - typings.firebaseStorage.firebaseStorageStrings.base64
    - typings.firebaseStorage.firebaseStorageStrings.base64url
    - typings.firebaseStorage.firebaseStorageStrings.data_url
  */
  trait StringFormat extends StObject
  object StringFormat {
    
    /**
      * Indicates the string should be interpreted as base64-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO++E6t7/rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("@firebase/storage/dist/node-esm/src/implementation/string", "StringFormat.BASE64")
    @js.native
    val BASE64: base64 = js.native
    
    /**
      * Indicates the string should be interpreted as base64url-encoded data.
      * Padding characters (trailing '='s) are optional.
      * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
      * ad 69 8e fb e1 3a b7 bf eb 97
      */
    @JSImport("@firebase/storage/dist/node-esm/src/implementation/string", "StringFormat.BASE64URL")
    @js.native
    val BASE64URL: base64url = js.native
    
    /**
      * Indicates the string is a data URL, such as one obtained from
      * canvas.toDataURL().
      * Example: the string 'data:application/octet-stream;base64,aaaa'
      * becomes the byte sequence
      * 69 a6 9a
      * (the content-type "application/octet-stream" is also applied, but can
      * be overridden in the metadata object).
      */
    @JSImport("@firebase/storage/dist/node-esm/src/implementation/string", "StringFormat.DATA_URL")
    @js.native
    val DATA_URL: data_url = js.native
    
    /**
      * Indicates the string should be interpreted "raw", that is, as normal text.
      * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
      * sequence.
      * Example: The string 'Hello! \\\ud83d\\\ude0a' becomes the byte sequence
      * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
      */
    @JSImport("@firebase/storage/dist/node-esm/src/implementation/string", "StringFormat.RAW")
    @js.native
    val RAW: raw = js.native
  }
  
  inline def base64Bytes(format: StringFormat, value: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("base64Bytes_")(format.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def dataFromString(format: StringFormat, stringData: String): StringData = (^.asInstanceOf[js.Dynamic].applyDynamic("dataFromString")(format.asInstanceOf[js.Any], stringData.asInstanceOf[js.Any])).asInstanceOf[StringData]
  
  inline def dataURLBytes(dataUrl: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("dataURLBytes_")(dataUrl.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def dataURLContentType(dataUrl: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dataURLContentType_")(dataUrl.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def percentEncodedBytes(value: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("percentEncodedBytes_")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def utf8Bytes(value: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8Bytes_")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
