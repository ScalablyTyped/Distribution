package typings.figma.mod._Global_

import typings.figma.figmaStrings.STAR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with BlendMixin
     with GeometryMixin
     with LayoutMixin
     with ExportMixin
     with ConstraintMixin
     with CornerMixin {
  var innerRadius: Double = js.native
  var pointCount: Double = js.native
  val `type`: STAR = js.native
}

