package typings
package atFirebaseStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BASE64 extends js.Object {
  var BASE64: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.StringFormat
  var BASE64URL: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.StringFormat
  var DATA_URL: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.StringFormat
  var RAW: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.StringFormat
}

object Anon_BASE64 {
  @scala.inline
  def apply(
    BASE64: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.StringFormat,
    BASE64URL: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.StringFormat,
    DATA_URL: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.StringFormat,
    RAW: atFirebaseStorageDashTypesLib.atFirebaseStorageDashTypesMod.StringFormat
  ): Anon_BASE64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BASE64")(BASE64)
    __obj.updateDynamic("BASE64URL")(BASE64URL)
    __obj.updateDynamic("DATA_URL")(DATA_URL)
    __obj.updateDynamic("RAW")(RAW)
    __obj.asInstanceOf[Anon_BASE64]
  }
}

