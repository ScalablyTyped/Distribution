package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fabric extends js.Object {
  var fabric: js.UndefOr[Anon_ApiKey] = js.undefined
  var googleMaps: js.UndefOr[Anon_ApiKeyString] = js.undefined
  var googleSignIn: js.UndefOr[Anon_ApiKeyCertificateHash] = js.undefined
}

object Anon_Fabric {
  @scala.inline
  def apply(
    fabric: Anon_ApiKey = null,
    googleMaps: Anon_ApiKeyString = null,
    googleSignIn: Anon_ApiKeyCertificateHash = null
  ): Anon_Fabric = {
    val __obj = js.Dynamic.literal()
    if (fabric != null) __obj.updateDynamic("fabric")(fabric)
    if (googleMaps != null) __obj.updateDynamic("googleMaps")(googleMaps)
    if (googleSignIn != null) __obj.updateDynamic("googleSignIn")(googleSignIn)
    __obj.asInstanceOf[Anon_Fabric]
  }
}

