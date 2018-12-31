package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Link is a Part that connects Nodes.
  * The link relationship is directional, going from Link.fromNode to Link.toNode.
  * A link can connect to a specific port element in a node, as named by the Link.fromPortId
  * and Link.toPortId properties.
  */
@JSImport("go", "Link")
@js.native
/**
  * Constructs an empty link that does not connect any nodes.
  */
class Link ()
  extends goLib.goMod.goNs.Link

/**
  * A Link is a Part that connects Nodes.
  * The link relationship is directional, going from Link.fromNode to Link.toNode.
  * A link can connect to a specific port element in a node, as named by the Link.fromPortId
  * and Link.toPortId properties.
  */
@JSImport("go", "Link")
@js.native
object Link extends js.Object {
  /**Used as a value for Link.routing: each segment is horizontal or vertical, but the route tries to avoid crossing over nodes.*/
  var AvoidsNodes: goLib.goMod.goNs.EnumValue = js.native
  /**Used as a value for Link.curve, to indicate that the link path uses Bezier curve segments.*/
  var Bezier: goLib.goMod.goNs.EnumValue = js.native
  /**Used as a value for Link.adjusting, to indicate that the link route computation should keep the intermediate points of the previous route, just modifying the first and/or last points; if the routing is orthogonal, it will only modify the first two and/or last two points.*/
  var End: goLib.goMod.goNs.EnumValue = js.native
  /**Used as a value for Link.curve, to indicate that orthogonal link segments will be discontinuous where they cross over other orthogonal link segments that have a Link.curve or JumpOver or JumpGap.*/
  var JumpGap: goLib.goMod.goNs.EnumValue = js.native
  /**Used as a value for Link.curve, to indicate that orthogonal link segments will veer around where they cross over other orthogonal link segments that have a Link.curve or JumpOver or JumpGap.*/
  var JumpOver: goLib.goMod.goNs.EnumValue = js.native
  /**This is the default value for Link.curve and Link.adjusting, to indicate that the path geometry consists of straight line segments and to indicate that the link route computation does not depend on any previous route points; this can also be used as a value for GraphObject.segmentOrientation to indicate that the object is never rotated along the link route -- its angle is unchanged.*/
  var None: goLib.goMod.goNs.EnumValue = js.native
  /**Used as the default value for Link.routing: the route goes fairly straight between ports.*/
  var Normal: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned to have the same angle as the route: the GraphObject's angle is always the same as the angle of the link's route at the segment where the GraphObject is attached; use this orientation for arrow heads.*/
  var OrientAlong: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.segmentOrientation results in the GraphObject being turned counter-clockwise to be perpendicular to the route: the GraphObject's angle is always 90 degrees less than the angle of the link's route at the segment where the GraphObject is attached.*/
  var OrientMinus90: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned counter-clockwise to be perpendicular to the route, just like Link.OrientMinus90, but is never upside down: the GraphObject's angle always being 90 degrees less than the angle of the link's route at the segment where the GraphObject is attached; this is typically only used for TextBlocks or Panels that contain text.*/
  var OrientMinus90Upright: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.segmentOrientation results in the GraphObject's angle always being 180 degrees opposite from the angle of the link's route at the segment where the GraphObject is attached.*/
  var OrientOpposite: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.segmentOrientation results in the GraphObject is turned clockwise to be perpendicular to the route: the GraphObject's angle is always 90 degrees more than the angle of the link's route at the segment where the GraphObject is attached.*/
  var OrientPlus90: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned clockwise to be perpendicular to the route, just like Link.OrientPlus90, but is never upside down: the GraphObject's angle always being 90 degrees more than the angle of the link's route at the segment where the GraphObject is attached; this is typically only used for TextBlocks or Panels that contain text.*/
  var OrientPlus90Upright: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.segmentOrientation results in the GraphObject turned to have the same angle as the route, just like Link.OrientAlong, but is never upside down: the GraphObject's angle always following the angle of the link's route at the segment where the GraphObject is attached; this is typically only used for TextBlocks or Panels that contain text.*/
  var OrientUpright: goLib.goMod.goNs.EnumValue = js.native
  /**This value for GraphObject.segmentOrientation results in the GraphObject's angle always following the angle of the link's route at the segment where the GraphObject is attached, but never upside down and never angled more than +/- 45 degrees: when the route's angle is within 45 degrees of vertical (90 or 270 degrees), the GraphObject's angle is set to zero; this is typically only used for TextBlocks or Panels that contain text.*/
  var OrientUpright45: goLib.goMod.goNs.EnumValue = js.native
  /**Used as a value for Link.routing: each segment is horizontal or vertical.*/
  var Orthogonal: goLib.goMod.goNs.EnumValue = js.native
  /**Used as a value for Link.adjusting, to indicate that the link route computation should scale and rotate the intermediate points so that the link's shape looks approximately the same; if the routing is orthogonal, this value is treated as if it were Link.End.*/
  var Scale: goLib.goMod.goNs.EnumValue = js.native
  /**Used as a value for Link.adjusting, to indicate that the link route computation should linearly interpolate the intermediate points so that the link's shape looks stretched; if the routing is orthogonal, this value is treated as if it were Link.End.*/
  var Stretch: goLib.goMod.goNs.EnumValue = js.native
}

