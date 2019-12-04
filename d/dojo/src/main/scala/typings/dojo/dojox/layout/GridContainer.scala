package typings.dojo.dojox.layout

import typings.dojo.Anon_Unwatch
import typings.dojo.dojoStrings.hasResizableColumns
import typings.dojo.dojoStrings.isLeftFixed
import typings.dojo.dojoStrings.isRightFixed
import typings.dojo.dojoStrings.liveResizeColumns
import typings.dojo.dojoStrings.minChildWidth
import typings.dojo.dojoStrings.minColWidth
import typings.dojo.dojoStrings.mode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/GridContainer.html
  *
  * A grid containing any kind of objects and acting like web portals.
  * This component inherits of all features of gridContainerLite plus :
  *
  * Resize colums
  * Add / remove columns
  * Fix columns at left or at right.
  *
  * @param props
  * @param node
  */
@JSGlobal("dojox.layout.GridContainer")
@js.native
class GridContainer protected () extends GridContainerLite {
  def this(props: js.Object, node: HTMLElement) = this()
  /**
    * Allow or not resizing of columns by a grip handle.
    *
    */
  var hasResizableColumns: Boolean = js.native
  /**
    * Define if the last left column is fixed.
    * Used when you add or remove columns by calling setColumns method.
    *
    */
  var isLeftFixed: Boolean = js.native
  /**
    * Define if the last right column is fixed.
    * Used when you add or remove columns by calling setColumns method.
    *
    */
  var isRightFixed: Boolean = js.native
  /**
    * Specifies whether columns resize as you drag (true) or only upon mouseup (false)
    *
    */
  var liveResizeColumns: Boolean = js.native
  /**
    * Minimum children width in pixel (only used for IE6 which doesn't handle min-width css property)
    *
    */
  var minChildWidth: Double = js.native
  /**
    * Minimum column width in percentage.
    *
    */
  var minColWidth: Double = js.native
  /**
    * Location to add/remove columns, must be set to 'left' or 'right' (default).
    *
    */
  var mode: String = js.native
  @JSName("get")
  def get_hasResizableColumns(property: hasResizableColumns): Boolean = js.native
  @JSName("get")
  def get_isLeftFixed(property: isLeftFixed): Boolean = js.native
  @JSName("get")
  def get_isRightFixed(property: isRightFixed): Boolean = js.native
  @JSName("get")
  def get_liveResizeColumns(property: liveResizeColumns): Boolean = js.native
  @JSName("get")
  def get_minChildWidth(property: minChildWidth): Double = js.native
  @JSName("get")
  def get_minColWidth(property: minColWidth): Double = js.native
  @JSName("get")
  def get_mode(property: mode): String = js.native
  /**
    * Resize the GridContainer widget and columns.
    * Replace grips if it's necessary.
    *
    */
  def resize(): Unit = js.native
  /**
    * Set the number of columns.
    *
    * @param nbColumns Number of columns
    */
  def setColumns(nbColumns: Double): Unit = js.native
  @JSName("set")
  def set_hasResizableColumns(property: hasResizableColumns, value: Boolean): Unit = js.native
  @JSName("set")
  def set_isLeftFixed(property: isLeftFixed, value: Boolean): Unit = js.native
  @JSName("set")
  def set_isRightFixed(property: isRightFixed, value: Boolean): Unit = js.native
  @JSName("set")
  def set_liveResizeColumns(property: liveResizeColumns, value: Boolean): Unit = js.native
  @JSName("set")
  def set_minChildWidth(property: minChildWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_minColWidth(property: minColWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_mode(property: mode, value: String): Unit = js.native
  @JSName("watch")
  def watch_hasResizableColumns(
    property: hasResizableColumns,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isLeftFixed(
    property: isLeftFixed,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_isRightFixed(
    property: isRightFixed,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_liveResizeColumns(
    property: liveResizeColumns,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minChildWidth(
    property: minChildWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_minColWidth(
    property: minColWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_mode(
    property: mode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

