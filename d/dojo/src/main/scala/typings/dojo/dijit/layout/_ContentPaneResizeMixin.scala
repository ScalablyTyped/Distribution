package typings.dojo.dijit.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/_ContentPaneResizeMixin.html
  *
  * Resize() functionality of ContentPane.   If there's a single layout widget
  * child then it will call resize() with the same dimensions as the ContentPane.
  * Otherwise just calls resize on each child.
  * 
  * Also implements basic startup() functionality, where starting the parent
  * will start the children
  * 
  */
@JSGlobal("dijit.layout._ContentPaneResizeMixin")
@js.native
class _ContentPaneResizeMixin () extends js.Object {
  /**
    * 
    * false - don't adjust size of children
    * true - if there is a single visible child widget, set it's size to however big the ContentPane is
    * 
    */
  var doLayout: Boolean = js.native
  /**
    * Indicates that this widget will call resize() on it's child widgets
    * when they become visible.
    * 
    */
  var isLayoutContainer: Boolean = js.native
  /**
    * See dijit/layout/_LayoutWidget.resize() for description.
    * Although ContentPane doesn't extend _LayoutWidget, it does implement
    * the same API.
    * 
    * @param changeSize             
    * @param resultSize             
    */
  def resize(changeSize: js.Any, resultSize: js.Any): Unit = js.native
  /**
    * See dijit/layout/_LayoutWidget.startup() for description.
    * Although ContentPane doesn't extend _LayoutWidget, it does implement
    * the same API.
    * 
    */
  def startup(): Unit = js.native
}

