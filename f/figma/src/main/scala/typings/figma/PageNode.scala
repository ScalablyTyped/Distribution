package typings.figma

import typings.figma.figmaStrings.PAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageNode
  extends BaseNodeMixin
     with ChildrenMixin
     with ExportMixin
     with BaseNode {
  var guides: js.Array[Guide] = js.native
  var selection: js.Array[SceneNode] = js.native
  val `type`: PAGE = js.native
}

