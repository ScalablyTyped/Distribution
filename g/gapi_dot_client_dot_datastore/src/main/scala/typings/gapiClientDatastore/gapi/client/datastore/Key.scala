package typings.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  /**
    * Entities are partitioned into subsets, currently identified by a project
    * ID and namespace ID.
    * Queries are scoped to a single partition.
    */
  var partitionId: js.UndefOr[PartitionId] = js.native
  /**
    * The entity path.
    * An entity path consists of one or more elements composed of a kind and a
    * string or numerical identifier, which identify entities. The first
    * element identifies a _root entity_, the second element identifies
    * a _child_ of the root entity, the third element identifies a child of the
    * second entity, and so forth. The entities identified by all prefixes of
    * the path are called the element's _ancestors_.
    *
    * An entity path is always fully complete: &#42;all&#42; of the entity's ancestors
    * are required to be in the path along with the entity identifier itself.
    * The only exception is that in some documented cases, the identifier in the
    * last path element (for the entity) itself may be omitted. For example,
    * the last path element of the key of `Mutation.insert` may have no
    * identifier.
    *
    * A path can never be empty, and a path can have at most 100 elements.
    */
  var path: js.UndefOr[js.Array[PathElement]] = js.native
}

object Key {
  @scala.inline
  def apply(): Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPartitionId(value: PartitionId): Self = this.set("partitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartitionId: Self = this.set("partitionId", js.undefined)
    @scala.inline
    def setPathVarargs(value: PathElement*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[PathElement]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

