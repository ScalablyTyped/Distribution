package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options defining a data set within Google Cloud Datastore.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DatastoreOptions extends js.Object {
  /**
    * The kind to process.
    */
  var kind: js.UndefOr[Schema$GooglePrivacyDlpV2KindExpression] = js.native
  /**
    * A partition ID identifies a grouping of entities. The grouping is always
    * by project and namespace, however the namespace ID may be empty.
    */
  var partitionId: js.UndefOr[Schema$GooglePrivacyDlpV2PartitionId] = js.native
}

object Schema$GooglePrivacyDlpV2DatastoreOptions {
  @scala.inline
  def apply(
    kind: Schema$GooglePrivacyDlpV2KindExpression = null,
    partitionId: Schema$GooglePrivacyDlpV2PartitionId = null
  ): Schema$GooglePrivacyDlpV2DatastoreOptions = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (partitionId != null) __obj.updateDynamic("partitionId")(partitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DatastoreOptions]
  }
}

