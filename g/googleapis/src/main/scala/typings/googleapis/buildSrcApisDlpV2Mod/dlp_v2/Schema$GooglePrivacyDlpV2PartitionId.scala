package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Datastore partition ID. A partition ID identifies a grouping of entities.
  * The grouping is always by project and namespace, however the namespace ID
  * may be empty.  A partition ID contains several dimensions: project ID and
  * namespace ID.
  */
@js.native
trait Schema$GooglePrivacyDlpV2PartitionId extends js.Object {
  /**
    * If not empty, the ID of the namespace to which the entities belong.
    */
  var namespaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the project to which the entities belong.
    */
  var projectId: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2PartitionId {
  @scala.inline
  def apply(namespaceId: String = null, projectId: String = null): Schema$GooglePrivacyDlpV2PartitionId = {
    val __obj = js.Dynamic.literal()
    if (namespaceId != null) __obj.updateDynamic("namespaceId")(namespaceId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2PartitionId]
  }
}

