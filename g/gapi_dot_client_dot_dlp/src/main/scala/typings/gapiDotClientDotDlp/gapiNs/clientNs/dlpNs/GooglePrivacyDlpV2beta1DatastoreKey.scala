package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1DatastoreKey extends js.Object {
  /** Datastore entity key. */
  var entityKey: js.UndefOr[GooglePrivacyDlpV2beta1Key] = js.undefined
}

object GooglePrivacyDlpV2beta1DatastoreKey {
  @scala.inline
  def apply(entityKey: GooglePrivacyDlpV2beta1Key = null): GooglePrivacyDlpV2beta1DatastoreKey = {
    val __obj = js.Dynamic.literal()
    if (entityKey != null) __obj.updateDynamic("entityKey")(entityKey)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DatastoreKey]
  }
}

