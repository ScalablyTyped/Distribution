package typings.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mutation extends js.Object {
  /**
    * The version of the entity that this mutation is being applied to. If this
    * does not match the current version on the server, the mutation conflicts.
    */
  var baseVersion: js.UndefOr[String] = js.native
  /**
    * The key of the entity to delete. The entity may or may not already exist.
    * Must have a complete key path and must not be reserved/read-only.
    */
  var delete: js.UndefOr[Key] = js.native
  /**
    * The entity to insert. The entity must not already exist.
    * The entity key's final path element may be incomplete.
    */
  var insert: js.UndefOr[Entity] = js.native
  /**
    * The entity to update. The entity must already exist.
    * Must have a complete key path.
    */
  var update: js.UndefOr[Entity] = js.native
  /**
    * The entity to upsert. The entity may or may not already exist.
    * The entity key's final path element may be incomplete.
    */
  var upsert: js.UndefOr[Entity] = js.native
}

object Mutation {
  @scala.inline
  def apply(): Mutation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mutation]
  }
  @scala.inline
  implicit class MutationOps[Self <: Mutation] (val x: Self) extends AnyVal {
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
    def setBaseVersion(value: String): Self = this.set("baseVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseVersion: Self = this.set("baseVersion", js.undefined)
    @scala.inline
    def setDelete(value: Key): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setInsert(value: Entity): Self = this.set("insert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
    @scala.inline
    def setUpdate(value: Entity): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUpsert(value: Entity): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
  
}

