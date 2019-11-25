package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameMixin extends js.Object {
  var backgroundStyleId: String
  var backgrounds: js.Array[Paint]
  var clipsContent: Boolean
  var gridStyleId: String
  var guides: js.Array[Guide]
  var layoutGrids: js.Array[LayoutGrid]
}

object FrameMixin {
  @scala.inline
  def apply(
    backgroundStyleId: String,
    backgrounds: js.Array[Paint],
    clipsContent: Boolean,
    gridStyleId: String,
    guides: js.Array[Guide],
    layoutGrids: js.Array[LayoutGrid]
  ): FrameMixin = {
    val __obj = js.Dynamic.literal(backgroundStyleId = backgroundStyleId.asInstanceOf[js.Any], backgrounds = backgrounds.asInstanceOf[js.Any], clipsContent = clipsContent.asInstanceOf[js.Any], gridStyleId = gridStyleId.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any], layoutGrids = layoutGrids.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FrameMixin]
  }
}

