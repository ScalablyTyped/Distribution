package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionId extends js.Object {
  /** If not empty, the ID of the namespace to which the entities belong. */
  var namespaceId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the project to which the entities belong. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
}

object PartitionId {
  @scala.inline
  def apply(namespaceId: java.lang.String = null, projectId: java.lang.String = null): PartitionId = {
    val __obj = js.Dynamic.literal()
    if (namespaceId != null) __obj.updateDynamic("namespaceId")(namespaceId)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    __obj.asInstanceOf[PartitionId]
  }
}

