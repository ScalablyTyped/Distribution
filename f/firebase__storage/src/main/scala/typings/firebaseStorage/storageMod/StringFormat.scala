package typings.firebaseStorage.storageMod

import typings.firebaseStorage.firebaseStorageStrings.base64
import typings.firebaseStorage.firebaseStorageStrings.base64url
import typings.firebaseStorage.firebaseStorageStrings.data_url
import typings.firebaseStorage.firebaseStorageStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @JSImport("@firebase/storage/dist/storage", "StringFormat.BASE64")
  @js.native
  val BASE64: base64 = js.native
  
  /**
    * Indicates the string should be interpreted as base64url-encoded data.
    * Padding characters (trailing '='s) are optional.
    * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
    * ad 69 8e fb e1 3a b7 bf eb 97
    */
  @JSImport("@firebase/storage/dist/storage", "StringFormat.BASE64URL")
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
  @JSImport("@firebase/storage/dist/storage", "StringFormat.DATA_URL")
  @js.native
  val DATA_URL: data_url = js.native
  
  /**
    * Indicates the string should be interpreted "raw", that is, as normal text.
    * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
    * sequence.
    * Example: The string 'Hello! \\\ud83d\\\ude0a' becomes the byte sequence
    * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
    */
  @JSImport("@firebase/storage/dist/storage", "StringFormat.RAW")
  @js.native
  val RAW: raw = js.native
}
