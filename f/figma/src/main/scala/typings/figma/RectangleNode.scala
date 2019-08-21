package typings.figma

import typings.figma.figmaStrings.RECTANGLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectangleNode
  extends DefaultShapeMixin
     with ConstraintMixin
     with CornerMixin
     with SceneNode {
  var bottomLeftRadius: Double = js.native
  var bottomRightRadius: Double = js.native
  var topLeftRadius: Double = js.native
  var topRightRadius: Double = js.native
  val `type`: RECTANGLE = js.native
}

