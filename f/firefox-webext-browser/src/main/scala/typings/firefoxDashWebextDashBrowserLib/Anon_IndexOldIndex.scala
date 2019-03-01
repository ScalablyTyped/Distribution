package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IndexOldIndex extends js.Object {
  var index: scala.Double
  var oldIndex: scala.Double
  var oldParentId: java.lang.String
  var parentId: java.lang.String
}

object Anon_IndexOldIndex {
  @scala.inline
  def apply(
    index: scala.Double,
    oldIndex: scala.Double,
    oldParentId: java.lang.String,
    parentId: java.lang.String
  ): Anon_IndexOldIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("oldIndex")(oldIndex)
    __obj.updateDynamic("oldParentId")(oldParentId)
    __obj.updateDynamic("parentId")(parentId)
    __obj.asInstanceOf[Anon_IndexOldIndex]
  }
}

