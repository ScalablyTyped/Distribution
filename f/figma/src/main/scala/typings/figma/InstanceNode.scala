package typings.figma

import typings.figma.figmaStrings.INSTANCE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ChildrenMixin
     with FrameMixin
     with BlendMixin
     with ConstraintMixin
     with LayoutMixin
     with ExportMixin {
  var masterComponent: ComponentNode = js.native
  val `type`: INSTANCE = js.native
}

