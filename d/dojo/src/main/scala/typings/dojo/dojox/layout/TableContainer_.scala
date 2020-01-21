package typings.dojo.dojox.layout

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.layout.LayoutWidget
import typings.dojo.dojoStrings.ChildWidgetProperties
import typings.dojo.dojoStrings.cols
import typings.dojo.dojoStrings.customClass
import typings.dojo.dojoStrings.labelWidth
import typings.dojo.dojoStrings.orientation
import typings.dojo.dojoStrings.showLabels
import typings.dojo.dojoStrings.spacing
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/layout/TableContainer.html
  *
  * A container that lays out its child widgets in a table layout.
  * The TableContainer lays out child widgets in a Table layout.
  * Each widget can specify a "label" or a "title" parameter.
  * This label is displayed either above or to the left of
  * a widget depending on whether the "orientation" attribute
  * is "horiz" or "vert", for horizontal and vertical respectively.
  * The number of columns is configured using the "cols" attribute.
  * The width of labels can be configured using the "labelWidth" parameter.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
@JSGlobal("dojox.layout.TableContainer")
@js.native
class TableContainer_ () extends LayoutWidget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Properties to be set on children of TableContainer
    *
    */
  var ChildWidgetProperties: js.Object = js.native
  /**
    *
    */
  var cols: Double = js.native
  /**
    * A CSS class that will be applied to child elements.  For example, if
    * the class is "myClass", the table will have "myClass-table" applied to it,
    * each label TD will have "myClass-labelCell" applied, and each
    * widget TD will have "myClass-valueCell" applied.
    *
    */
  var customClass: String = js.native
  /**
    * Defines the width of a label.  If the value is a number, it is
    * treated as a pixel value.  The other valid value is a percentage,
    * e.g. "50%"
    *
    */
  var labelWidth: Double = js.native
  /**
    * Either "horiz" or "vert" for label orientation.
    *
    */
  var orientation: String = js.native
  /**
    * True if labels should be displayed, false otherwise.
    *
    */
  var showLabels: Boolean = js.native
  /**
    * The cell spacing to apply to the table.
    *
    */
  var spacing: Double = js.native
  @JSName("get")
  def get_ChildWidgetProperties(property: ChildWidgetProperties): js.Object = js.native
  @JSName("get")
  def get_cols(property: cols): Double = js.native
  @JSName("get")
  def get_customClass(property: customClass): String = js.native
  @JSName("get")
  def get_labelWidth(property: labelWidth): Double = js.native
  @JSName("get")
  def get_orientation(property: orientation): String = js.native
  @JSName("get")
  def get_showLabels(property: showLabels): Boolean = js.native
  @JSName("get")
  def get_spacing(property: spacing): Double = js.native
  /**
    * Resizes all children.  This widget itself
    * does not resize, as it takes up 100% of the
    * available width.
    *
    */
  def resize(): Unit = js.native
  @JSName("set")
  def set_ChildWidgetProperties(property: ChildWidgetProperties, value: js.Object): Unit = js.native
  @JSName("set")
  def set_cols(property: cols, value: Double): Unit = js.native
  @JSName("set")
  def set_customClass(property: customClass, value: String): Unit = js.native
  @JSName("set")
  def set_labelWidth(property: labelWidth, value: Double): Unit = js.native
  @JSName("set")
  def set_orientation(property: orientation, value: String): Unit = js.native
  @JSName("set")
  def set_showLabels(property: showLabels, value: Boolean): Unit = js.native
  @JSName("set")
  def set_spacing(property: spacing, value: Double): Unit = js.native
  @JSName("watch")
  def watch_ChildWidgetProperties(
    property: ChildWidgetProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_cols(
    property: cols,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_customClass(
    property: customClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_labelWidth(
    property: labelWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_orientation(
    property: orientation,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_showLabels(
    property: showLabels,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_spacing(
    property: spacing,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

