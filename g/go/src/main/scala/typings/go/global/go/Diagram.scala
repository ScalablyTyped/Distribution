package typings.go.global.go

import typings.go.mod.Constructor
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Diagram is associated with an HTML DIV element. Constructing a Diagram creates
  * an HTML Canvas element which it places inside of the given DIV element, in addition to several helper divs.
  * GoJS will manage the contents of this DIV, and the contents should not be modified otherwise,
  * though the given DIV may be styled (background, border, etc) and positioned as needed.
  */
@JSGlobal("go.Diagram")
@js.native
/**
  * Construct an empty Diagram for a particular DIV HTML element.
  * @param {string=} div The ID of a DIV element in the DOM.
  * If no DIV identifier is supplied one will be created in memory. The Diagram's Diagram.div property
  * can then be set later on.
  */
class Diagram ()
  extends typings.go.mod.Diagram {
  def this(div: String) = this()
  /**
    * Construct an empty Diagram for a particular DIV HTML element.
    * @param {HTMLDivElement} div A reference to a DIV HTML element in the DOM.
    * If no DIV is supplied one will be created in memory. The Diagram's Diagram.div property
    * can then be set later on.
    */
  def this(div: HTMLDivElement) = this()
}
object Diagram {
  
  @JSGlobal("go.Diagram")
  @js.native
  val ^ : js.Any = js.native
  
  // undocumented
  /** This value for Diagram.treeCollapsePolicy states that all of the Node.findNodesInto or Node.findNodesOutOf, depending on Diagram.isTreePathToChildren being true or false, need to be not Node.isTreeExpanded in order for a "child" node to be not visible.*/
  /* static member */
  @JSGlobal("go.Diagram.AllParentsCollapsed")
  @js.native
  def AllParentsCollapsed: typings.go.mod.EnumValue = js.native
  inline def AllParentsCollapsed_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AllParentsCollapsed")(x.asInstanceOf[js.Any])
  
  /**This value for Diagram.validCycle states that there are no restrictions on making cycles of links.*/
  /* static member */
  @JSGlobal("go.Diagram.CycleAll")
  @js.native
  def CycleAll: typings.go.mod.EnumValue = js.native
  inline def CycleAll_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CycleAll")(x.asInstanceOf[js.Any])
  
  /**This value for Diagram.validCycle states that any number of destination links may go out of a node, but at most one source link may come into a node, and there are no directed cycles.*/
  /* static member */
  @JSGlobal("go.Diagram.CycleDestinationTree")
  @js.native
  def CycleDestinationTree: typings.go.mod.EnumValue = js.native
  inline def CycleDestinationTree_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CycleDestinationTree")(x.asInstanceOf[js.Any])
  
  /**This value for Diagram.validCycle states that a valid link from a node will not produce a directed cycle in the graph.*/
  /* static member */
  @JSGlobal("go.Diagram.CycleNotDirected")
  @js.native
  def CycleNotDirected: typings.go.mod.EnumValue = js.native
  inline def CycleNotDirected_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CycleNotDirected")(x.asInstanceOf[js.Any])
  
  /**This value for Diagram.validCycle states that a valid link from a node will not produce an undirected cycle in the graph.*/
  /* static member */
  @JSGlobal("go.Diagram.CycleNotUndirected")
  @js.native
  def CycleNotUndirected: typings.go.mod.EnumValue = js.native
  inline def CycleNotUndirected_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CycleNotUndirected")(x.asInstanceOf[js.Any])
  
  /**This value for Diagram.validCycle states that any number of source links may come into a node, but at most one destination link may go out of a node, and there are no directed cycles.*/
  /* static member */
  @JSGlobal("go.Diagram.CycleSourceTree")
  @js.native
  def CycleSourceTree: typings.go.mod.EnumValue = js.native
  inline def CycleSourceTree_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CycleSourceTree")(x.asInstanceOf[js.Any])
  
  /**This value for Diagram.scrollMode states that the viewport constrains scrolling to the Diagram document bounds.*/
  /* static member */
  @JSGlobal("go.Diagram.DocumentScroll")
  @js.native
  def DocumentScroll: typings.go.mod.EnumValue = js.native
  inline def DocumentScroll_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DocumentScroll")(x.asInstanceOf[js.Any])
  
  /**This value for Diagram.scrollMode states that the viewport does not constrain scrolling to the Diagram document bounds.*/
  /* static member */
  @JSGlobal("go.Diagram.InfiniteScroll")
  @js.native
  def InfiniteScroll: typings.go.mod.EnumValue = js.native
  inline def InfiniteScroll_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InfiniteScroll")(x.asInstanceOf[js.Any])
  
  /**The default autoScale type, used as the value of Diagram.autoScale: The Diagram does not attempt to scale its bounds to fit the view.*/
  /* static member */
  @JSGlobal("go.Diagram.None")
  @js.native
  def None: typings.go.mod.EnumValue = js.native
  inline def None_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  
  /** This value for Diagram.treeCollapsePolicy states that only the Node.findTreeParentNode's Node.isTreeExpanded property determines whether a "child" node is visible.*/
  /* static member */
  @JSGlobal("go.Diagram.TreeParentCollapsed")
  @js.native
  def TreeParentCollapsed: typings.go.mod.EnumValue = js.native
  inline def TreeParentCollapsed_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TreeParentCollapsed")(x.asInstanceOf[js.Any])
  
  /**Diagrams with this autoScale type, used as the value of Diagram.autoScale, are scaled uniformly until the documentBounds fits in the view.*/
  /* static member */
  @JSGlobal("go.Diagram.Uniform")
  @js.native
  def Uniform: typings.go.mod.EnumValue = js.native
  
  /**Diagrams with this autoScale type, used as the value of Diagram.autoScale, are scaled uniformly until the documentBounds fits in the view.*/
  /* static member */
  @JSGlobal("go.Diagram.UniformToFill")
  @js.native
  def UniformToFill: typings.go.mod.EnumValue = js.native
  inline def UniformToFill_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniformToFill")(x.asInstanceOf[js.Any])
  
  inline def Uniform_=(x: typings.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uniform")(x.asInstanceOf[js.Any])
  
  /**
    * This static function gets the Diagram that is attached to an HTML DIV element.
    * @param {HTMLDivElement} div
    */
  /* static member */
  inline def fromDiv(div: HTMLDivElement): typings.go.mod.Diagram = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDiv")(div.asInstanceOf[js.Any]).asInstanceOf[typings.go.mod.Diagram]
  
  /**
    * This static function declares that a class (constructor function) derives from another class -- but please note that most classes do not support inheritance.
    * @param {Function} derivedclass
    * @param {Function} baseclass
    */
  /* static member */
  inline def inherit(derivedclass: Constructor, baseclass: Constructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(derivedclass.asInstanceOf[js.Any], baseclass.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
