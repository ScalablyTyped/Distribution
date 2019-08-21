package typings.figma

import typings.figma.figmaStrings.POLYGON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonNode
  extends DefaultShapeMixin
     with ConstraintMixin
     with CornerMixin
     with SceneNode {
  var pointCount: Double = js.native
  val `type`: POLYGON = js.native
}

