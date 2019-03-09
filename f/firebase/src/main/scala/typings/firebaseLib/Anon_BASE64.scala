package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BASE64 extends js.Object {
  /**
    * Indicates the string should be interpreted as base64-encoded data.
    * Padding characters (trailing '='s) are optional.
    * Example: The string 'rWmO++E6t7/rlw==' becomes the byte sequence
    * ad 69 8e fb e1 3a b7 bf eb 97
    */
  var BASE64: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat
  /**
    * Indicates the string should be interpreted as base64url-encoded data.
    * Padding characters (trailing '='s) are optional.
    * Example: The string 'rWmO--E6t7_rlw==' becomes the byte sequence
    * ad 69 8e fb e1 3a b7 bf eb 97
    */
  var BASE64URL: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat
  /**
    * Indicates the string is a data URL, such as one obtained from
    * canvas.toDataURL().
    * Example: the string 'data:application/octet-stream;base64,aaaa'
    * becomes the byte sequence
    * 69 a6 9a
    * (the content-type "application/octet-stream" is also applied, but can
    * be overridden in the metadata object).
    */
  var DATA_URL: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat
  /**
    * Indicates the string should be interpreted "raw", that is, as normal text.
    * The string will be interpreted as UTF-16, then uploaded as a UTF-8 byte
    * sequence.
    * Example: The string 'Hello! \\ud83d\\ude0a' becomes the byte sequence
    * 48 65 6c 6c 6f 21 20 f0 9f 98 8a
    */
  var RAW: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat
}

object Anon_BASE64 {
  @scala.inline
  def apply(
    BASE64: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat,
    BASE64URL: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat,
    DATA_URL: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat,
    RAW: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat
  ): Anon_BASE64 = {
    val __obj = js.Dynamic.literal(BASE64 = BASE64, BASE64URL = BASE64URL, DATA_URL = DATA_URL, RAW = RAW)
  
    __obj.asInstanceOf[Anon_BASE64]
  }
}

