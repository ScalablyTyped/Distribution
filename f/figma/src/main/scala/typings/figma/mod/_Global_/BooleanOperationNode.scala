package typings.figma.mod._Global_

import typings.figma.figmaStrings.BOOLEAN_OPERATION
import typings.figma.figmaStrings.EXCLUDE
import typings.figma.figmaStrings.INTERSECT
import typings.figma.figmaStrings.SUBTRACT
import typings.figma.figmaStrings.UNION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanOperationNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with BlendMixin
     with GeometryMixin
     with LayoutMixin
     with ExportMixin
     with ChildrenMixin
     with CornerMixin {
  var booleanOperation: UNION | INTERSECT | SUBTRACT | EXCLUDE = js.native
  var expanded: Boolean = js.native
  val `type`: BOOLEAN_OPERATION = js.native
}

