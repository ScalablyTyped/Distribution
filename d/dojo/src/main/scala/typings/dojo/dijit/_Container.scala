package typings.dojo.dijit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_Container.html
  *
  * Mixin for widgets that contain HTML and/or a set of widget children.
  * 
  */
@JSGlobal("dijit._Container")
@js.native
class _Container () extends js.Object {
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: _WidgetBase): Unit = js.native
  def addChild(widget: _WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * 
    */
  def buildRendering(): Unit = js.native
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: _WidgetBase): js.Any = js.native
  /**
    * Returns true if widget has child widgets, i.e. if this.containerNode contains widgets.
    * 
    */
  def hasChildren(): Boolean = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: Double): Unit = js.native
  /**
    * Removes the passed widget instance from this widget but does
    * not destroy it.  You can also pass in an integer indicating
    * the index within the container to remove (ie, removeChild(5) removes the sixth widget).
    * 
    * @param widget             
    */
  def removeChild(widget: _WidgetBase): Unit = js.native
}

