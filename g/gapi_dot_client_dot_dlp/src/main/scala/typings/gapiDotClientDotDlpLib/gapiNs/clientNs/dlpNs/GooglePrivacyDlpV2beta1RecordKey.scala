package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RecordKey extends js.Object {
  var cloudStorageKey: js.UndefOr[GooglePrivacyDlpV2beta1CloudStorageKey] = js.undefined
  var datastoreKey: js.UndefOr[GooglePrivacyDlpV2beta1DatastoreKey] = js.undefined
}

object GooglePrivacyDlpV2beta1RecordKey {
  @scala.inline
  def apply(
    cloudStorageKey: GooglePrivacyDlpV2beta1CloudStorageKey = null,
    datastoreKey: GooglePrivacyDlpV2beta1DatastoreKey = null
  ): GooglePrivacyDlpV2beta1RecordKey = {
    val __obj = js.Dynamic.literal()
    if (cloudStorageKey != null) __obj.updateDynamic("cloudStorageKey")(cloudStorageKey)
    if (datastoreKey != null) __obj.updateDynamic("datastoreKey")(datastoreKey)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RecordKey]
  }
}

