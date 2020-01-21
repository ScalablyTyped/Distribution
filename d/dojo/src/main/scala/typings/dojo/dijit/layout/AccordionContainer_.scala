package typings.dojo.dijit.layout

import typings.dojo.AnonUnwatch
import typings.dojo.dojoStrings.duration
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/layout/AccordionContainer.html
  *
  * Holds a set of panes where every pane's title is visible, but only one pane's content is visible at a time,
  * and switching between panes is visualized by sliding the other panes up/down.
  * 
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.     
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree     
  */
@JSGlobal("dijit.layout.AccordionContainer")
@js.native
class AccordionContainer_ () extends StackContainer {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Amount of time (in ms) it takes to slide panes
    * 
    */
  var duration: Double = js.native
  /**
    * The name of the widget used to display the title of each pane
    * 
    */
  def buttonWidget(): Unit = js.native
  @JSName("get")
  def get_duration(property: duration): Double = js.native
  /**
    * 
    * @param child             
    */
  def removeChild(child: js.Any): Unit = js.native
  @JSName("set")
  def set_duration(property: duration, value: Double): Unit = js.native
  @JSName("watch")
  def watch_duration(
    property: duration,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

