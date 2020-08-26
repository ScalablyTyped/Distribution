package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFolderDataRelationships extends js.Object {
  var parent: CreateFolderDataRelationshipsParent = js.native
}

object CreateFolderDataRelationships {
  @scala.inline
  def apply(parent: CreateFolderDataRelationshipsParent): CreateFolderDataRelationships = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataRelationships]
  }
  @scala.inline
  implicit class CreateFolderDataRelationshipsOps[Self <: CreateFolderDataRelationships] (val x: Self) extends AnyVal {
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
    def setParent(value: CreateFolderDataRelationshipsParent): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
  
}

