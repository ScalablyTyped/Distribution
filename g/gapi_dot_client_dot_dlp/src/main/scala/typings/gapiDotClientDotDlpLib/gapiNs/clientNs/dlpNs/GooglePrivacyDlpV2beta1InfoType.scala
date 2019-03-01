package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InfoType extends js.Object {
  /** Name of the information type. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1InfoType {
  @scala.inline
  def apply(name: java.lang.String = null): GooglePrivacyDlpV2beta1InfoType = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoType]
  }
}

