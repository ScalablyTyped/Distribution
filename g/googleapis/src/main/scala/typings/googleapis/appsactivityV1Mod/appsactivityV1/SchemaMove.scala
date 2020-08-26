package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about changes in an object&#39;s parents as a result
  * of a move type event.
  */
@js.native
trait SchemaMove extends js.Object {
  /**
    * The added parent(s).
    */
  var addedParents: js.UndefOr[js.Array[SchemaParent]] = js.native
  /**
    * The removed parent(s).
    */
  var removedParents: js.UndefOr[js.Array[SchemaParent]] = js.native
}

object SchemaMove {
  @scala.inline
  def apply(): SchemaMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMove]
  }
  @scala.inline
  implicit class SchemaMoveOps[Self <: SchemaMove] (val x: Self) extends AnyVal {
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
    def setAddedParentsVarargs(value: SchemaParent*): Self = this.set("addedParents", js.Array(value :_*))
    @scala.inline
    def setAddedParents(value: js.Array[SchemaParent]): Self = this.set("addedParents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddedParents: Self = this.set("addedParents", js.undefined)
    @scala.inline
    def setRemovedParentsVarargs(value: SchemaParent*): Self = this.set("removedParents", js.Array(value :_*))
    @scala.inline
    def setRemovedParents(value: js.Array[SchemaParent]): Self = this.set("removedParents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovedParents: Self = this.set("removedParents", js.undefined)
  }
  
}

