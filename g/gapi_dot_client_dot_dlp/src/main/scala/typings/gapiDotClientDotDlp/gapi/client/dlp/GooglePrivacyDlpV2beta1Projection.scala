package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Projection extends js.Object {
  /** The property to project. */
  var property: js.UndefOr[GooglePrivacyDlpV2beta1PropertyReference] = js.undefined
}

object GooglePrivacyDlpV2beta1Projection {
  @scala.inline
  def apply(property: GooglePrivacyDlpV2beta1PropertyReference = null): GooglePrivacyDlpV2beta1Projection = {
    val __obj = js.Dynamic.literal()
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Projection]
  }
}

