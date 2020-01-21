package typings.figma.mod._Global_

import typings.figma.figmaStrings.AUTO
import typings.figma.figmaStrings.FIXED
import typings.figma.figmaStrings.HORIZONTAL
import typings.figma.figmaStrings.NONE
import typings.figma.figmaStrings.VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultFrameMixin
  extends BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with ChildrenMixin
     with ContainerMixin
     with GeometryMixin
     with CornerMixin
     with RectangleCornerMixin
     with BlendMixin
     with ConstraintMixin
     with LayoutMixin
     with ExportMixin {
  var counterAxisSizingMode: FIXED | AUTO = js.native
   // applicable only if layoutMode != "NONE"
  var horizontalPadding: Double = js.native
   // applicable only if layoutMode != "NONE"
  var itemSpacing: Double = js.native
  var layoutMode: NONE | HORIZONTAL | VERTICAL = js.native
   // PROPOSED API ONLY
  var numberOfFixedChildren: Double = js.native
   // applicable only if layoutMode != "NONE"
  var overflowDirection: OverflowDirection = js.native
   // PROPOSED API ONLY
  val overlayBackground: OverlayBackground = js.native
   // PROPOSED API ONLY
  val overlayBackgroundInteraction: OverlayBackgroundInteraction = js.native
   // PROPOSED API ONLY
  val overlayPositionType: OverlayPositionType = js.native
   // applicable only if layoutMode != "NONE"
  var verticalPadding: Double = js.native
}

