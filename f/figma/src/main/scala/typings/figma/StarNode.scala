package typings.figma

import typings.figma.figmaStrings.STAR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarNode
  extends DefaultShapeMixin
     with ConstraintMixin
     with CornerMixin
     with SceneNode {
  var innerRadius: Double = js.native
  var pointCount: Double = js.native
  val `type`: STAR = js.native
}

