package typings.figma.mod._Global_

import typings.figma.AnonEnd
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
  var backgrounds: js.Array[Paint] = js.native
  var guides: js.Array[Guide] = js.native
  val prototypeStartNode: FrameNode | GroupNode | ComponentNode | InstanceNode | Null = js.native
  var selectedTextRange: AnonEnd | Null = js.native
  var selection: js.Array[SceneNode] = js.native
  val `type`: PAGE = js.native
}

