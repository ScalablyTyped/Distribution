package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Panel is a GraphObject that holds other GraphObjects as its elements.
  * A Panel is responsible for sizing and positioning its elements.
  * Every Panel has a .type and establishes its own coordinate system. The .type of a Panel
  * determines how it will size and arrange its elements.
  */
@JSImport("go", "Panel")
@js.native
/**
  * Constructs an empty Panel of the given .type.
  * @param {EnumValue=} type If not supplied, the default Panel type is Panel.Position.
  */
class Panel ()
  extends goLib.goMod.goNs.Panel {
  def this(`type`: goLib.goMod.goNs.EnumValue) = this()
}

/* static members */
@JSImport("go", "Panel")
@js.native
object Panel extends js.Object {
  /**This value for .type resizes the main element to fit around the other elements; the main element is the first GraphObject with GraphObject.isPanelMain set to true, or else the first GraphObject if none have that property set to true.*/
  var Auto: goLib.goMod.goNs.EnumValue = js.native
  /**This value for .type is used to draw regular patterns of lines.*/
  var Grid: goLib.goMod.goNs.EnumValue = js.native
  /**This value for .type lays out the elements horizontally with their GraphObject.alignment property dictating their alignment on the Y-axis.*/
  var Horizontal: goLib.goMod.goNs.EnumValue = js.native
  /**This value for .type is used for Links and adornments that act as Links.*/
  var Link: goLib.goMod.goNs.EnumValue = js.native
  /**The default .type arranges each element according to their GraphObject.position.*/
  var Position: goLib.goMod.goNs.EnumValue = js.native
  /**This value for .type arranges GraphObjects about a main element using the GraphObject.alignment and GraphObject.alignmentFocus properties; the main element is the first GraphObject with GraphObject.isPanelMain set to true, or else the first GraphObject if none have that property set to true.*/
  var Spot: goLib.goMod.goNs.EnumValue = js.native
  /**This value for .type arranges GraphObjects into rows and columns; set the GraphObject.row and GraphObject.column properties on each element.*/
  var Table: goLib.goMod.goNs.EnumValue = js.native
  /**Organizational Panel type that is only valid inside of a Table panel.*/
  var TableColumn: goLib.goMod.goNs.EnumValue = js.native
  /**Organizational Panel type that is only valid inside of a Table panel.*/
  var TableRow: goLib.goMod.goNs.EnumValue = js.native
  /**This value for .type lays out the elements vertically with their GraphObject.alignment property dictating their alignment on the X-axis.*/
  var Vertical: goLib.goMod.goNs.EnumValue = js.native
  /**This value for .type rescales a single GraphObject to fit inside the panel depending on the element's GraphObject.stretch property.*/
  var Viewbox: goLib.goMod.goNs.EnumValue = js.native
}

