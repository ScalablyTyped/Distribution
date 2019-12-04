package typings.dojo.dojox.grid

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.noscroll
import typings.dojo.dojoStrings.padBorderWidth
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_RowSelector.html
  *
  * Custom grid view. If used in a grid structure, provides a small selectable region for grid rows.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.grid._RowSelector")
@js.native
class _RowSelector () extends _View {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    *
    */
  var noscroll: Boolean = js.native
  /**
    *
    */
  var padBorderWidth: Double = js.native
  /**
    *
    * @param e
    */
  def domouseout(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def domouseover(e: js.Any): Unit = js.native
  @JSName("get")
  def get_noscroll(property: noscroll): Boolean = js.native
  @JSName("get")
  def get_padBorderWidth(property: padBorderWidth): Double = js.native
  @JSName("set")
  def set_noscroll(property: noscroll, value: Boolean): Unit = js.native
  @JSName("set")
  def set_padBorderWidth(property: padBorderWidth, value: Double): Unit = js.native
  /**
    *
    */
  def updateRow(): Unit = js.native
  @JSName("watch")
  def watch_noscroll(
    property: noscroll,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_padBorderWidth(
    property: padBorderWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

