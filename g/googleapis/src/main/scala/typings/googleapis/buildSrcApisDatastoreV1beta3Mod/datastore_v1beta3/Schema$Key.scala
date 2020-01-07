package typings.googleapis.buildSrcApisDatastoreV1beta3Mod.datastore_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A unique identifier for an entity. If a key&#39;s partition ID or any of
  * its path kinds or names are reserved/read-only, the key is
  * reserved/read-only. A reserved/read-only key is forbidden in certain
  * documented contexts.
  */
@js.native
trait Schema$Key extends js.Object {
  /**
    * Entities are partitioned into subsets, currently identified by a project
    * ID and namespace ID. Queries are scoped to a single partition.
    */
  var partitionId: js.UndefOr[Schema$PartitionId] = js.native
  /**
    * The entity path. An entity path consists of one or more elements composed
    * of a kind and a string or numerical identifier, which identify entities.
    * The first element identifies a _root entity_, the second element
    * identifies a _child_ of the root entity, the third element identifies a
    * child of the second entity, and so forth. The entities identified by all
    * prefixes of the path are called the element&#39;s _ancestors_.  An entity
    * path is always fully complete: *all* of the entity&#39;s ancestors are
    * required to be in the path along with the entity identifier itself. The
    * only exception is that in some documented cases, the identifier in the
    * last path element (for the entity) itself may be omitted. For example,
    * the last path element of the key of `Mutation.insert` may have no
    * identifier.  A path can never be empty, and a path can have at most 100
    * elements.
    */
  var path: js.UndefOr[js.Array[Schema$PathElement]] = js.native
}

object Schema$Key {
  @scala.inline
  def apply(partitionId: Schema$PartitionId = null, path: js.Array[Schema$PathElement] = null): Schema$Key = {
    val __obj = js.Dynamic.literal()
    if (partitionId != null) __obj.updateDynamic("partitionId")(partitionId.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Key]
  }
}

