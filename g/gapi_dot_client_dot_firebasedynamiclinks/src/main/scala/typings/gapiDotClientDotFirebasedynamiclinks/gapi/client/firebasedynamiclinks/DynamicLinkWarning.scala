package typings.gapiDotClientDotFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLinkWarning extends js.Object {
  /** The warning code. */
  var warningCode: js.UndefOr[String] = js.undefined
  /** The document describing the warning, and helps resolve. */
  var warningDocumentLink: js.UndefOr[String] = js.undefined
  /** The warning message to help developers improve their requests. */
  var warningMessage: js.UndefOr[String] = js.undefined
}

object DynamicLinkWarning {
  @scala.inline
  def apply(warningCode: String = null, warningDocumentLink: String = null, warningMessage: String = null): DynamicLinkWarning = {
    val __obj = js.Dynamic.literal()
    if (warningCode != null) __obj.updateDynamic("warningCode")(warningCode.asInstanceOf[js.Any])
    if (warningDocumentLink != null) __obj.updateDynamic("warningDocumentLink")(warningDocumentLink.asInstanceOf[js.Any])
    if (warningMessage != null) __obj.updateDynamic("warningMessage")(warningMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicLinkWarning]
  }
}

