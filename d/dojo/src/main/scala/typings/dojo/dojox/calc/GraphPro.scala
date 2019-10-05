package typings.dojo.dojox.calc

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.dojoStrings.aFloatingPane
import typings.dojo.dojoStrings.funcMaker
import typings.dojo.dojoStrings.grapher
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/calc/GraphPro.html
  *
  * The dialog widget for a graphing, scientific calculator
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.calc.GraphPro")
@js.native
class GraphPro () extends Standard {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var aFloatingPane: js.Object = js.native
  /**
    *
    */
  var funcMaker: js.Object = js.native
  /**
    *
    */
  var grapher: js.Object = js.native
  @JSName("get")
  def get_aFloatingPane(property: aFloatingPane): js.Object = js.native
  @JSName("get")
  def get_funcMaker(property: funcMaker): js.Object = js.native
  @JSName("get")
  def get_grapher(property: grapher): js.Object = js.native
  /**
    * use this function to create a function window (with the button on the layout)
    *
    */
  def makeFunctionWindow(): Unit = js.native
  /**
    * use this to make a Grapher window appear with a button
    *
    */
  def makeGrapherWindow(): Unit = js.native
  @JSName("set")
  def set_aFloatingPane(property: aFloatingPane, value: js.Object): Unit = js.native
  @JSName("set")
  def set_funcMaker(property: funcMaker, value: js.Object): Unit = js.native
  @JSName("set")
  def set_grapher(property: grapher, value: js.Object): Unit = js.native
  @JSName("watch")
  def watch_aFloatingPane(property: aFloatingPane, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_funcMaker(property: funcMaker, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_grapher(property: grapher, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
}

