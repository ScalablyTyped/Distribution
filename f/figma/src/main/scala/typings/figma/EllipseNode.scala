package typings.figma

import typings.figma.figmaStrings.ELLIPSE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipseNode
  extends DefaultShapeMixin
     with ConstraintMixin
     with CornerMixin
     with SceneNode {
  var arcData: ArcData = js.native
  val `type`: ELLIPSE = js.native
}

