package typings.dojo.dojo.dnd

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/Selector.html
  *
  * a Selector object, which knows how to select its children
  *
  * @param node node or node's id to build the selector on
  * @param params       Optionala dictionary of parameters
  */
@JSGlobal("dojo.dnd.Selector")
@js.native
class Selector protected () extends Container {
  def this(node: HTMLElement) = this()
  def this(node: HTMLElement, params: js.Object) = this()
  /**
    * The set of id's that are currently selected, such that this.selection[id] == 1
    * if the node w/that id is selected.  Can iterate over selected node's id's like:
    *
    * for(var id in this.selection)
    *
    */
  var selection: js.Object = js.native
  /**
    *
    */
  var singular: Boolean = js.native
  /**
    * deletes all selected items
    *
    */
  def deleteSelectedNodes(): js.Function = js.native
  /**
    * iterates over a data map skipping members that
    * are present in the empty object (IE and/or 3rd-party libraries).
    *
    * @param f
    * @param o               Optional
    */
  def forInItems(f: js.Function): String = js.native
  /**
    * iterates over selected items;
    * see dojo/dnd/Container.forInItems() for details
    *
    * @param f
    * @param o               Optional
    */
  def forInSelectedItems(f: js.Function): Unit = js.native
  def forInSelectedItems(f: js.Function, o: js.Object): Unit = js.native
  /**
    * returns a list (an array) of selected nodes
    *
    */
  def getSelectedNodes(): js.Any = js.native
  /**
    * event processor for onmousedown
    *
    * @param e mouse event
    */
  def onMouseDown(e: Event): Unit = js.native
  /**
    * event processor for onmousemove
    *
    * @param e mouse event
    */
  def onMouseMove(e: Event): Unit = js.native
  /**
    * event processor for onmouseup
    *
    * @param e mouse event
    */
  def onMouseUp(e: Event): Unit = js.native
  /**
    * selects all items
    *
    */
  def selectAll(): js.Any = js.native
  /**
    * unselects all items
    *
    */
  def selectNone(): js.Any = js.native
}

