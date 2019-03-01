package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Key extends js.Object {
  /**
    * Entities are partitioned into subsets, currently identified by a project
    * ID and namespace ID.
    * Queries are scoped to a single partition.
    */
  var partitionId: js.UndefOr[GooglePrivacyDlpV2beta1PartitionId] = js.undefined
  /**
    * The entity path.
    * An entity path consists of one or more elements composed of a kind and a
    * string or numerical identifier, which identify entities. The first
    * element identifies a _root entity_, the second element identifies
    * a _child_ of the root entity, the third element identifies a child of the
    * second entity, and so forth. The entities identified by all prefixes of
    * the path are called the element's _ancestors_.
    *
    * A path can never be empty, and a path can have at most 100 elements.
    */
  var path: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1PathElement]] = js.undefined
}

object GooglePrivacyDlpV2beta1Key {
  @scala.inline
  def apply(
    partitionId: GooglePrivacyDlpV2beta1PartitionId = null,
    path: js.Array[GooglePrivacyDlpV2beta1PathElement] = null
  ): GooglePrivacyDlpV2beta1Key = {
    val __obj = js.Dynamic.literal()
    if (partitionId != null) __obj.updateDynamic("partitionId")(partitionId)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Key]
  }
}

