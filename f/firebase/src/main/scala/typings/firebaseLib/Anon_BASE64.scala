package typings
package firebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BASE64 extends js.Object {
  var BASE64: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat
  var BASE64URL: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat
  var DATA_URL: firebaseLib.firebaseMod.firebaseNs.storageNs.StringFormat
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

