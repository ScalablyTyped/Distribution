package typings.figma

import typings.figma.figmaStrings.COMPONENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ChildrenMixin
     with FrameMixin
     with BlendMixin
     with ConstraintMixin
     with LayoutMixin
     with ExportMixin {
  var description: String = js.native
  val key: String = js.native
  val remote: Boolean = js.native
  val `type`: COMPONENT = js.native
  def createInstance(): InstanceNode = js.native
}

