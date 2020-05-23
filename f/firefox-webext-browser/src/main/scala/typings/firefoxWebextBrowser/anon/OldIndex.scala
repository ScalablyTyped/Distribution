package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldIndex extends js.Object {
  var index: Double
  var oldIndex: Double
  var oldParentId: String
  var parentId: String
}

object OldIndex {
  @scala.inline
  def apply(index: Double, oldIndex: Double, oldParentId: String, parentId: String): OldIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], oldParentId = oldParentId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldIndex]
  }
}

