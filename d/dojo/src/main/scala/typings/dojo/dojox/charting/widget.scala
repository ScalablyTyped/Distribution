package typings.dojo.dojox.charting

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit._WidgetBase
import typings.dojo.dojoStrings.chartRef
import typings.dojo.dojoStrings.horizontal
import typings.dojo.dojoStrings.legendBody
import typings.dojo.dojoStrings.margins
import typings.dojo.dojoStrings.outline
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.swatchSize
import typings.dojo.dojoStrings.theme
import typings.dojo.dojoStrings.transitionFill
import typings.dojo.dojoStrings.transitionStroke
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.charting.widget")
@js.native
object widget extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/widget/Chart.html
    *
    * A chart widget.  This is leveraging dojox/charting/Chart as a Dijit widget.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Chart () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * The margins around the chart. Default is { l:10, t:10, r:10, b:10 }.
      *
      */
    var margins: js.Object = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Chart: String = js.native
    /**
      * An optional theme to use for styling the chart.
      *
      */
    var theme: js.Object = js.native
    /**
      * The color for the chart.
      * An object with the following properties:type (String?, optional): The type of fill. One of 'linear', 'radial', 'pattern' or undefined. If not specified, a solid fill is assumed.
      * color (String|dojo/Color?, optional): The color of a solid fill type.
      *
      */
    def fill(): js.Any = js.native
    @JSName("get")
    def get_margins(property: margins): js.Object = js.native
    @JSName("get")
    def get_theme(property: theme): js.Object = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    /**
      * Resize the widget.
      * Resize the domNode and the widget surface to the dimensions of a box of the following form:
      * { l: 50, t: 200, w: 300: h: 150 }
      * If no box is provided, resize the surface to the marginBox of the domNode.
      *
      * @param box If passed, denotes the new size of the widget.
      */
    def resize(box: js.Any): Unit = js.native
    @JSName("set")
    def set_margins(property: margins, value: js.Object): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_theme(property: theme, value: js.Object): Unit = js.native
    /**
      * The outline of the chart (stroke in vector graphics terms).
      * An object with the following properties:color (String): The color of the stroke, default value 'black'.
      * style (String): The style of the stroke, one of 'solid', ... . Default value 'solid'.
      * width (Number): The width of a stroke, default value 1.
      * cap (String): The endcap style of the path. One of 'butt', 'round', ... . Default value 'butt'.
      * join (Number): The join style to use when combining path segments. Default value 4.
      *
      */
    def stroke(): js.Any = js.native
    @JSName("watch")
    def watch_margins(
      property: margins,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_theme(
      property: theme,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/widget/Chart2D.html
    *
    * A chart widget.  This is leveraging dojox/charting/Chart as a Dijit widget.
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Chart2D () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      * The margins around the chart. Default is { l:10, t:10, r:10, b:10 }.
      *
      */
    var margins: js.Object = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Chart2D: String = js.native
    /**
      * An optional theme to use for styling the chart.
      *
      */
    var theme: js.Object = js.native
    /**
      * The color for the chart.
      * An object with the following properties:type (String?, optional): The type of fill. One of 'linear', 'radial', 'pattern' or undefined. If not specified, a solid fill is assumed.
      * color (String|dojo/Color?, optional): The color of a solid fill type.
      *
      */
    def fill(): js.Any = js.native
    @JSName("get")
    def get_margins(property: margins): js.Object = js.native
    @JSName("get")
    def get_theme(property: theme): js.Object = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    /**
      * Resize the widget.
      * Resize the domNode and the widget surface to the dimensions of a box of the following form:
      * { l: 50, t: 200, w: 300: h: 150 }
      * If no box is provided, resize the surface to the marginBox of the domNode.
      *
      * @param box If passed, denotes the new size of the widget.
      */
    def resize(box: js.Any): Unit = js.native
    @JSName("set")
    def set_margins(property: margins, value: js.Object): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_theme(property: theme, value: js.Object): Unit = js.native
    /**
      * The outline of the chart (stroke in vector graphics terms).
      * An object with the following properties:color (String): The color of the stroke, default value 'black'.
      * style (String): The style of the stroke, one of 'solid', ... . Default value 'solid'.
      * width (Number): The width of a stroke, default value 1.
      * cap (String): The endcap style of the path. One of 'butt', 'round', ... . Default value 'butt'.
      * join (Number): The join style to use when combining path segments. Default value 4.
      *
      */
    def stroke(): js.Any = js.native
    @JSName("watch")
    def watch_margins(
      property: margins,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_theme(
      property: theme,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/widget/Legend.html
    *
    * A legend for a chart. A legend contains summary labels for
    * each series of data contained in the chart.
    *
    * Set the horizontal attribute to boolean false to layout legend labels vertically.
    * Set the horizontal attribute to a number to layout legend labels in horizontal
    * rows each containing that number of labels (except possibly the last row).
    *
    * (Line or Scatter charts (colored lines with shape symbols) )
    * -o- Series1     -X- Series2     -v- Series3
    *
    * (Area/Bar/Pie charts (letters represent colors))
    * [a] Series1     [b] Series2     [c] Series3
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class Legend () extends _WidgetBase {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      *
      */
    var chartRef: String = js.native
    /**
      *
      */
    var horizontal: Boolean = js.native
    /**
      *
      */
    var legendBody: js.Object = js.native
    /**
      * HTML style attributes as cssText string or name/value hash
      *
      */
    @JSName("style")
    var style_Legend: String = js.native
    /**
      *
      */
    var swatchSize: Double = js.native
    @JSName("get")
    def get_chartRef(property: chartRef): String = js.native
    @JSName("get")
    def get_horizontal(property: horizontal): Boolean = js.native
    @JSName("get")
    def get_legendBody(property: legendBody): js.Object = js.native
    @JSName("get")
    def get_swatchSize(property: swatchSize): Double = js.native
    /**
      * Track specified handles and remove/destroy them when this instance is destroyed, unless they were
      * already removed/destroyed manually.
      *
      */
    def own(): js.Any = js.native
    /**
      * regenerates the legend to reflect changes to the chart
      *
      */
    def refresh(): Unit = js.native
    @JSName("set")
    def set_chartRef(property: chartRef, value: String): Unit = js.native
    @JSName("set")
    def set_horizontal(property: horizontal, value: Boolean): Unit = js.native
    @JSName("set")
    def set_legendBody(property: legendBody, value: js.Object): Unit = js.native
    @JSName("set")
    def set_style(property: style, value: String): Unit = js.native
    @JSName("set")
    def set_swatchSize(property: swatchSize, value: Double): Unit = js.native
    @JSName("watch")
    def watch_chartRef(
      property: chartRef,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[String], 
          /* newValue */ js.UndefOr[String], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_horizontal(
      property: horizontal,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_legendBody(
      property: legendBody,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_swatchSize(
      property: swatchSize,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Double], 
          /* newValue */ js.UndefOr[Double], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/widget/SelectableLegend.html
    *
    * An enhanced chart legend supporting interactive events on data series
    *
    * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
    * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
    */
  @js.native
  class SelectableLegend () extends Legend {
    def this(params: js.Object) = this()
    def this(params: js.Object, srcNodeRef: HTMLElement) = this()
    /**
      *
      */
    var outline: Boolean = js.native
    /**
      *
      */
    var transitionFill: js.Object = js.native
    /**
      *
      */
    var transitionStroke: js.Object = js.native
    @JSName("get")
    def get_outline(property: outline): Boolean = js.native
    @JSName("get")
    def get_transitionFill(property: transitionFill): js.Object = js.native
    @JSName("get")
    def get_transitionStroke(property: transitionStroke): js.Object = js.native
    @JSName("set")
    def set_outline(property: outline, value: Boolean): Unit = js.native
    @JSName("set")
    def set_transitionFill(property: transitionFill, value: js.Object): Unit = js.native
    @JSName("set")
    def set_transitionStroke(property: transitionStroke, value: js.Object): Unit = js.native
    @JSName("watch")
    def watch_outline(
      property: outline,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[Boolean], 
          /* newValue */ js.UndefOr[Boolean], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_transitionFill(
      property: transitionFill,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_transitionStroke(
      property: transitionStroke,
      callback: js.Function3[
          /* property */ js.UndefOr[String], 
          /* oldValue */ js.UndefOr[js.Object], 
          /* newValue */ js.UndefOr[js.Object], 
          Unit
        ]
    ): Anon_Unwatch = js.native
  }
  
}

