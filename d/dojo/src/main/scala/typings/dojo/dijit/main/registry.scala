package typings.dojo.dijit.main

import typings.dojo.dijit.WidgetBase
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/main.registry.html
  *
  * Registry of existing widget on page, plus some utility methods.
  * 
  */
@js.native
trait registry extends js.Object {
  /**
    * Number of registered widgets
    * 
    */
  var length: Double = js.native
  /**
    * Add a widget to the registry. If a duplicate ID is detected, a error is thrown.
    * 
    * @param widget Any dijit/_WidgetBase subclass.             
    */
  def add(widget: WidgetBase): Unit = js.native
  /**
    * Find a widget by it's id.
    * If passed a widget then just returns the widget.
    * 
    * @param id             
    */
  def byId(id: String): WidgetBase = js.native
  /**
    * Find a widget by it's id.
    * If passed a widget then just returns the widget.
    * 
    * @param id             
    */
  def byId(id: WidgetBase): WidgetBase = js.native
  /**
    * Returns the widget corresponding to the given DOMNode
    * 
    * @param node             
    */
  def byNode(node: HTMLElement): js.Any = js.native
  /**
    * Search subtree under root returning widgets found.
    * Doesn't search for nested widgets (ie, widgets inside other widgets).
    * 
    * @param root Node to search under.             
    * @param skipNode If specified, don't search beneath this node (usually containerNode).             
    */
  def findWidgets(root: HTMLElement, skipNode: HTMLElement): js.Array[_] = js.native
  /**
    * Returns the widget whose DOM tree contains the specified DOMNode, or null if
    * the node is not contained within the DOM tree of any widget
    * 
    * @param node             
    */
  def getEnclosingWidget(node: HTMLElement): js.Any = js.native
  /**
    * Generates a unique id for a given widgetType
    * 
    * @param widgetType             
    */
  def getUniqueId(widgetType: String): String = js.native
  /**
    * Remove a widget from the registry. Does not destroy the widget; simply
    * removes the reference.
    * 
    * @param id             
    */
  def remove(id: String): Unit = js.native
  /**
    * Convert registry into a true Array
    * 
    */
  def toArray(): js.Array[_] = js.native
}

