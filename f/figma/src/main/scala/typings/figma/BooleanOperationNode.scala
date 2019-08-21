package typings.figma

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
  extends DefaultShapeMixin
     with ChildrenMixin
     with CornerMixin
     with SceneNode {
  var booleanOperation: UNION | INTERSECT | SUBTRACT | EXCLUDE = js.native
  val `type`: BOOLEAN_OPERATION = js.native
}

