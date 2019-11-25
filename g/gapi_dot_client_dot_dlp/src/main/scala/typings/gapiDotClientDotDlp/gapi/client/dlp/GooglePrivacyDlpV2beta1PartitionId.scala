package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1PartitionId extends js.Object {
  /** If not empty, the ID of the namespace to which the entities belong. */
  var namespaceId: js.UndefOr[String] = js.undefined
  /** The ID of the project to which the entities belong. */
  var projectId: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1PartitionId {
  @scala.inline
  def apply(namespaceId: String = null, projectId: String = null): GooglePrivacyDlpV2beta1PartitionId = {
    val __obj = js.Dynamic.literal()
    if (namespaceId != null) __obj.updateDynamic("namespaceId")(namespaceId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1PartitionId]
  }
}

