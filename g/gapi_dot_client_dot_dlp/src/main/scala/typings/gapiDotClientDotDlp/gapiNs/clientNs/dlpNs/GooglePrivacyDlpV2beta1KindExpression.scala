package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1KindExpression extends js.Object {
  /** The name of the kind. */
  var name: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1KindExpression {
  @scala.inline
  def apply(name: String = null): GooglePrivacyDlpV2beta1KindExpression = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KindExpression]
  }
}

