package typings.dojo.dijit

import typings.dojo.dojo.keys
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_KeyNavContainer.html
  *
  * A _Container with keyboard navigation of its children.
  * Provides normalized keyboard and focusing code for Container widgets.
  * To use this mixin, call connectKeyNavHandlers() in postCreate().
  * Also, child widgets must implement a focus() method.
  * 
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit.Container because Inheritance from two classes. Inlined addChild, addChild, buildRendering, getIndexOfChild, hasChildren, removeChild, removeChild */ @JSGlobal("dijit._KeyNavContainer")
@js.native
class KeyNavContainer () extends KeyNavMixin {
  /**
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  /**
    * Makes the given widget a child of this widget.
    * Inserts specified child widget's dom node as a child of this widget's
    * container node, and possibly does other processing (such as layout).
    * 
    * @param widget             
    * @param insertIndex               Optional            
    */
  def addChild(widget: WidgetBase): Unit = js.native
  def addChild(widget: WidgetBase, insertIndex: Double): Unit = js.native
  /**
    * 
    */
  def buildRendering(): Unit = js.native
  /**
    * 
    * @param node             
    */
  @JSName("childSelector")
  def childSelector_MKeyNavContainer(node: HTMLElement): js.Any = js.native
  /**
    * Deprecated.  You can call this in postCreate() to attach the keyboard handlers to the container,
    * but the preferred method is to override _onLeftArrow() and _onRightArrow(), or
    * _onUpArrow() and _onDownArrow(), to call focusPrev() and focusNext().
    * 
    * @param prevKeyCodes Key codes for navigating to the previous child.             
    * @param nextKeyCodes Key codes for navigating to the next child.             
    */
  def connectKeyNavHandlers(prevKeyCodes: keys, nextKeyCodes: keys): Unit = js.native
  /**
    * Focus the next widget
    * 
    */
  def focusNext(): Unit = js.native
  /**
    * Focus the last focusable node in the previous widget
    * (ex: go to the ComboButton icon section rather than button section)
    * 
    */
  def focusPrev(): Unit = js.native
  /**
    * Gets the index of the child in this container or -1 if not found
    * 
    * @param child             
    */
  def getIndexOfChild(child: WidgetBase): js.Any = js.native
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
  def removeChild(widget: WidgetBase): Unit = js.native
  /**
    * 
    */
  def startup(): Unit = js.native
  /**
    * 
    */
  def startupKeyNavChildren(): Unit = js.native
}

