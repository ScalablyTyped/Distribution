package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.headerClass
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.useHeader
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/_CalendarView.html
  *
  * Base implementation for all view mixins.
  * All calendar views should extend this widget.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.widget._CalendarView")
@js.native
class _CalendarView () extends _WidgetBase {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var headerClass: String = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style__CalendarView: String = js.native
  /**
    *
    */
  var useHeader: Boolean = js.native
  /**
    * Adds or subtracts values from a date.
    * The unit, e.g. "day", "month" or "year", is
    * specified in the "datePart" property of the
    * calendar view mixin.
    *
    * @param date
    * @param amount
    */
  def adjustDate(date: js.Any, amount: js.Any): js.Any = js.native
  /**
    * Clones all nodes with the class 'clazz' in a widget
    *
    * @param clazz
    * @param n
    * @param before
    */
  def cloneClass(clazz: js.Any, n: js.Any, before: js.Any): Unit = js.native
  /**
    * Returns the header node of a view. If none exists,
    * an empty DIV is created and returned.
    *
    */
  def getHeader(): js.Any = js.native
  @JSName("get")
  def get_headerClass(property: headerClass): String = js.native
  @JSName("get")
  def get_useHeader(property: useHeader): Boolean = js.native
  /**
    * Stub function that can be used to tell a view it is about to be shown.
    *
    */
  def onBeforeDisplay(): Unit = js.native
  /**
    * Stub function that can be used to tell
    * a view when it is no longer shown.
    *
    */
  def onBeforeUnDisplay(): Unit = js.native
  /**
    * Stub function that can be used to tell a view when it is shown.
    *
    */
  def onDisplay(): Unit = js.native
  /**
    *
    * @param date
    */
  def onValueSelected(date: js.Any): Unit = js.native
  /**
    * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
    * already removed/destroyed manually.
    *
    */
  def own(): js.Any = js.native
  @JSName("set")
  def set_headerClass(property: headerClass, value: String): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_useHeader(property: useHeader, value: Boolean): Unit = js.native
  @JSName("watch")
  def watch_headerClass(
    property: headerClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_useHeader(
    property: useHeader,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

