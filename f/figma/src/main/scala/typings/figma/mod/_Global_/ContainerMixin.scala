package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerMixin extends js.Object {
  var backgroundStyleId: String
  var backgrounds: js.Array[Paint]
  var clipsContent: Boolean
  var gridStyleId: String
  var guides: js.Array[Guide]
   // DEPRECATED: use 'fills' instead
  var layoutGrids: js.Array[LayoutGrid]
}

object ContainerMixin {
  @scala.inline
  def apply(
    backgroundStyleId: String,
    backgrounds: js.Array[Paint],
    clipsContent: Boolean,
    gridStyleId: String,
    guides: js.Array[Guide],
    layoutGrids: js.Array[LayoutGrid]
  ): ContainerMixin = {
    val __obj = js.Dynamic.literal(backgroundStyleId = backgroundStyleId.asInstanceOf[js.Any], backgrounds = backgrounds.asInstanceOf[js.Any], clipsContent = clipsContent.asInstanceOf[js.Any], gridStyleId = gridStyleId.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any], layoutGrids = layoutGrids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerMixin]
  }
}

