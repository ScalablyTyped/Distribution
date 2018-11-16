package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A Diagram is associated with an HTML DIV element. Constructing a Diagram creates
    * an HTML Canvas element which it places inside of the given DIV element, in addition to several helper divs.
    * GoJS will manage the contents of this DIV, and the contents should not be modified otherwise,
    * though the given DIV may be styled (background, border, etc) and positioned as needed.
    */
@JSImport("go", "Diagram")
@js.native
class Diagram ()
  extends goLib.goMod.goNs.Diagram {
  /**
          * Construct an empty Diagram for a particular DIV HTML element.
          * @param {string=} div The ID of a DIV element in the DOM.
          * If no DIV identifier is supplied one will be created in memory. The Diagram's Diagram.div property
          * can then be set later on.
          */
  def this(div: java.lang.String) = this()
  /**
          * Construct an empty Diagram for a particular DIV HTML element.
          * @param {HTMLDivElement} div A reference to a DIV HTML element in the DOM.
          * If no DIV is supplied one will be created in memory. The Diagram's Diagram.div property
          * can then be set later on.
          */
  def this(div: stdLib.HTMLDivElement) = this()
}

/**
    * A Diagram is associated with an HTML DIV element. Constructing a Diagram creates
    * an HTML Canvas element which it places inside of the given DIV element, in addition to several helper divs.
    * GoJS will manage the contents of this DIV, and the contents should not be modified otherwise,
    * though the given DIV may be styled (background, border, etc) and positioned as needed.
    */
@JSImport("go", "Diagram")
@js.native
object Diagram extends js.Object {
    // undocumented
  /** This value for Diagram.treeCollapsePolicy states that all of the Node.findNodesInto or Node.findNodesOutOf, depending on Diagram.isTreePathToChildren being true or false, need to be not Node.isTreeExpanded in order for a "child" node to be not visible.*/
  var AllParentsCollapsed: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Diagram.validCycle states that there are no restrictions on making cycles of links.*/
  var CycleAll: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Diagram.validCycle states that any number of destination links may go out of a node, but at most one source link may come into a node, and there are no directed cycles.*/
  var CycleDestinationTree: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Diagram.validCycle states that a valid link from a node will not produce a directed cycle in the graph.*/
  var CycleNotDirected: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Diagram.validCycle states that a valid link from a node will not produce an undirected cycle in the graph.*/
  var CycleNotUndirected: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Diagram.validCycle states that any number of source links may come into a node, but at most one destination link may go out of a node, and there are no directed cycles.*/
  var CycleSourceTree: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Diagram.scrollMode states that the viewport constrains scrolling to the Diagram document bounds.*/
  var DocumentScroll: goLib.goMod.goNs.EnumValue = js.native
  /**This value for Diagram.scrollMode states that the viewport does not constrain scrolling to the Diagram document bounds.*/
  var InfiniteScroll: goLib.goMod.goNs.EnumValue = js.native
  /**The default autoScale type, used as the value of Diagram.autoScale: The Diagram does not attempt to scale its bounds to fit the view.*/
  var None: goLib.goMod.goNs.EnumValue = js.native
  /** This value for Diagram.treeCollapsePolicy states that only the Node.findTreeParentNode's Node.isTreeExpanded property determines whether a "child" node is visible.*/
  var TreeParentCollapsed: goLib.goMod.goNs.EnumValue = js.native
  /**Diagrams with this autoScale type, used as the value of Diagram.autoScale, are scaled uniformly until the documentBounds fits in the view.*/
  var Uniform: goLib.goMod.goNs.EnumValue = js.native
  /**Diagrams with this autoScale type, used as the value of Diagram.autoScale, are scaled uniformly until the documentBounds fits in the view.*/
  var UniformToFill: goLib.goMod.goNs.EnumValue = js.native
  /**
          * This static function gets the Diagram that is attached to an HTML DIV element.
          * @param {HTMLDivElement} div
          */
  def fromDiv(div: stdLib.HTMLDivElement): goLib.goMod.goNs.Diagram = js.native
  /**
          * This static function declares that a class (constructor function) derives from another class -- but please note that most classes do not support inheritance.
          * @param {Function} derivedclass
          * @param {Function} baseclass
          */
  def inherit(derivedclass: goLib.goMod.goNs.Constructor, baseclass: goLib.goMod.goNs.Constructor): scala.Unit = js.native
}

