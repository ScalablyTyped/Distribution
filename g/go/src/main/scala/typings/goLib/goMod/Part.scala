package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the base class for all user-manipulated top-level objects.
  * Because it inherits from Panel, it is automatically a visual container
  * of other GraphObjects.
  * Because it thus also inherits from GraphObject, it also has properties such as
  * GraphObject.actualBounds, GraphObject.contextMenu, and GraphObject.visible.
  */
@JSImport("go", "Part")
@js.native
/**
  * The constructor builds an empty Part.
  * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
  */
class Part ()
  extends goLib.goMod.goNs.Part {
  def this(`type`: goLib.goMod.goNs.EnumValue) = this()
}

/* static members */
@JSImport("go", "Part")
@js.native
object Part extends js.Object {
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part is added to a Diagram or Group, it invalidates the Layout responsible for the Part.*/
  var LayoutAdded: scala.Double = js.native
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Group has been laid out, it invalidates the Layout responsible for that Group; this flag is ignored for Parts that are not Groups.*/
  var LayoutGroupLayout: scala.Double = js.native
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part's GraphObject.visible becomes false, it invalidates the Layout responsible for the Part.*/
  var LayoutHidden: scala.Double = js.native
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Node or simple Part's .category changes, it invalidates the Layout responsible for the Part; this flag is ignored for Parts that are Links.*/
  var LayoutNodeReplaced: scala.Double = js.native
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part's GraphObject.actualBounds changes size, it invalidates the Layout responsible for the Part; this flag is ignored for Parts that are Links.*/
  var LayoutNodeSized: scala.Double = js.native
  /**This value may be used as the value of the Part.layoutConditions property to indicate that no operation on this Part causes invalidation of the Layout responsible for this Part.*/
  var LayoutNone: scala.Double = js.native
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part is removed from a Diagram or Group, it invalidates the Layout responsible for the Part.*/
  var LayoutRemoved: scala.Double = js.native
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part's GraphObject.visible becomes true, it invalidates the Layout responsible for the Part.*/
  var LayoutShown: scala.Double = js.native
  /**This is the default value for the Part.layoutConditions property: the Layout responsible for the Part is invalidated when the Part is added or removed from the Diagram or Group or when it changes visibility or size or when a Group's layout has been performed.*/
  var LayoutStandard: scala.Double = js.native
}

