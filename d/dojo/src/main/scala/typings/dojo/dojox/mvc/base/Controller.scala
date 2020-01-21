package typings.dojo.dojox.mvc.base

import typings.dojo.AnonUnwatch
import typings.dojo.dojo.Stateful
import typings.dojo.dojoStrings.`data-mvc-bindings`
import typings.dojo.dojoStrings.dataBindAttr
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mvc/_base._Controller.html
  *
  *
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.mvc.atBindingMixin because Inheritance from two classes. Inlined `data-mvc-bindings`, dataBindAttr, mixin */ @JSGlobal("dojox.mvc._base._Controller")
@js.native
class Controller () extends Stateful {
  /**
    *
    */
  var `data-mvc-bindings`: String = js.native
  /**
    * The attribute name for data binding.
    *
    */
  var dataBindAttr: String = js.native
  /**
    * The mixin for dijit/_WidgetBase to support data binding.
    *
    */
  var mixin: js.Object = js.native
  /**
    * Stops data binding as this object is destroyed.
    *
    */
  def destroy(): Unit = js.native
  @JSName("get")
  def get_dataBindAttr(property: dataBindAttr): String = js.native
  @JSName("get")
  def get_datamvcbindings(property: `data-mvc-bindings`): String = js.native
  def postscript(params: js.Object, srcNodeRef: String): js.Any = js.native
  def postscript(params: js.Object, srcNodeRef: HTMLElement): js.Any = js.native
  /**
    * If the value given is dojox/mvc/at handle, use it for data binding.
    * Otherwise, if setter function is there, use it.
    * Otherwise, set the value to the data model or to this object.
    *
    * @param name The property name.
    * @param value The property value.
    */
  def set(name: String, value: js.Any): Unit = js.native
  @JSName("set")
  def set_dataBindAttr(property: dataBindAttr, value: String): Unit = js.native
  @JSName("set")
  def set_datamvcbindings(property: `data-mvc-bindings`, value: String): Unit = js.native
  /**
    * Starts up data binding as this object starts up.
    *
    */
  def startup(): Unit = js.native
  @JSName("watch")
  def watch_dataBindAttr(
    property: dataBindAttr,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_datamvcbindings(
    property: `data-mvc-bindings`,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

