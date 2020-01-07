package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Record key for a finding in Cloud Datastore.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DatastoreKey extends js.Object {
  /**
    * Datastore entity key.
    */
  var entityKey: js.UndefOr[Schema$GooglePrivacyDlpV2Key] = js.native
}

object Schema$GooglePrivacyDlpV2DatastoreKey {
  @scala.inline
  def apply(entityKey: Schema$GooglePrivacyDlpV2Key = null): Schema$GooglePrivacyDlpV2DatastoreKey = {
    val __obj = js.Dynamic.literal()
    if (entityKey != null) __obj.updateDynamic("entityKey")(entityKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DatastoreKey]
  }
}

