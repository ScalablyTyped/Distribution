package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1PropertyReference extends js.Object {
  /**
    * The name of the property.
    * If name includes "."s, it may be interpreted as a property name path.
    */
  var name: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1PropertyReference {
  @scala.inline
  def apply(name: String = null): GooglePrivacyDlpV2beta1PropertyReference = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PropertyReference]
  }
}

