package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLinkWarning extends js.Object {
  /** The warning code. */
  var warningCode: js.UndefOr[java.lang.String] = js.undefined
  /** The document describing the warning, and helps resolve. */
  var warningDocumentLink: js.UndefOr[java.lang.String] = js.undefined
  /** The warning message to help developers improve their requests. */
  var warningMessage: js.UndefOr[java.lang.String] = js.undefined
}

object DynamicLinkWarning {
  @scala.inline
  def apply(
    warningCode: java.lang.String = null,
    warningDocumentLink: java.lang.String = null,
    warningMessage: java.lang.String = null
  ): DynamicLinkWarning = {
    val __obj = js.Dynamic.literal()
    if (warningCode != null) __obj.updateDynamic("warningCode")(warningCode)
    if (warningDocumentLink != null) __obj.updateDynamic("warningDocumentLink")(warningDocumentLink)
    if (warningMessage != null) __obj.updateDynamic("warningMessage")(warningMessage)
    __obj.asInstanceOf[DynamicLinkWarning]
  }
}

