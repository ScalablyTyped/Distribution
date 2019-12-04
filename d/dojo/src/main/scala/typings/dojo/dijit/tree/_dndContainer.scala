package typings.dojo.dijit.tree

import typings.dojo.dijit.Tree._TreeNode
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/tree/_dndContainer.html
  *
  * This is a base class for dijit/tree/_dndSelector, and isn't meant to be used directly.
  * It's modeled after dojo/dnd/Container.
  * 
  * @param tree Node or node's id to build the container on     
  * @param params A dict of parameters, which gets mixed into the object     
  */
@JSGlobal("dijit.tree._dndContainer")
@js.native
class _dndContainer protected () extends js.Object {
  def this(tree: HTMLElement, params: js.Object) = this()
  /**
    * The currently hovered TreeNode.  Not set to anything for keyboard operation.  (TODO: change?)
    * 
    */
  var current: js.Object = js.native
  /**
    * Prepares this object to be garbage-collected
    * 
    */
  def destroy(): Unit = js.native
  /**
    * Called when mouse is moved away from a TreeNode
    * 
    * @param widget             
    * @param evt             
    */
  def onMouseOut(widget: _TreeNode, evt: Event): Unit = js.native
  /**
    * Called when mouse is moved over a TreeNode
    * 
    * @param widget             
    * @param evt             
    */
  def onMouseOver(widget: _TreeNode, evt: Event): Unit = js.native
  /**
    * This function is called once, when mouse is out of our container
    * 
    */
  def onOutEvent(): Unit = js.native
  /**
    * This function is called once, when mouse is over our container
    * 
    */
  def onOverEvent(): Unit = js.native
}

