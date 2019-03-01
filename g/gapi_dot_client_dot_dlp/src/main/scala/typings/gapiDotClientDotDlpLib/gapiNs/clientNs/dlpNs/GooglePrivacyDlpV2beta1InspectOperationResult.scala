package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InspectOperationResult extends js.Object {
  /**
    * The server-assigned name, which is only unique within the same service that
    * originally returns it. If you use the default HTTP mapping, the
    * `name` should have the format of `inspect/results/{id}`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1InspectOperationResult {
  @scala.inline
  def apply(name: java.lang.String = null): GooglePrivacyDlpV2beta1InspectOperationResult = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectOperationResult]
  }
}

