package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFolderDataRelationships extends js.Object {
  var parent: CreateFolderDataRelationshipsParent
}

object CreateFolderDataRelationships {
  @scala.inline
  def apply(parent: CreateFolderDataRelationshipsParent): CreateFolderDataRelationships = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataRelationships]
  }
}

