package typings.dojo.dojox.charting

import typings.dojo.dojo.Evented
import typings.dojo.dojox.charting.action2d.Base
import typings.dojo.dojox.charting.action2d.ChartAction
import typings.dojo.dojox.charting.action2d.PlotAction
import typings.dojo.dojox.charting.plot2d.Indicator
import typings.dojo.dojox.gfx.Surface
import typings.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.charting.action2d")
@js.native
object action2d extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/Base.html
    *
    * Base action class for plot and chart actions.
    *
    * @param chart The chart this action applies to.
    * @param plot       OptionalOptional target plot for this action.  Default is "default".
    */
  @js.native
  class Base protected () extends Evented {
    def this(chart: Chart) = this()
    def this(chart: Chart, plot: String) = this()
    /**
      * Connect this action to the plot or the chart.
      *
      */
    def connect(): Unit = js.native
    /**
      * Do any cleanup needed when destroying parent elements.
      *
      */
    def destroy(): Unit = js.native
    /**
      * Disconnect this action from the plot or the chart.
      *
      */
    def disconnect(): Unit = js.native
    /**
      *
      * @param type
      * @param event
      */
    def emit(`type`: js.Any, event: js.Any): js.Any = js.native
    /**
      *
      * @param type
      * @param listener
      */
    def on(`type`: js.Any, listener: js.Any): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/ChartAction.html
    *
    * Base action class for chart actions.
    *
    * @param chart The chart this action applies to.
    * @param plot       OptionalOptional target plot for this chart action.  Default is "default".
    */
  @js.native
  class ChartAction protected () extends Base {
    def this(chart: Chart) = this()
    def this(chart: Chart, plot: String) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/Highlight.html
    *
    * Creates a highlighting action on a plot, where an element on that plot
    * has a highlight on it.
    *
    * @param chart The chart this action belongs to.
    * @param plot       OptionalThe plot this action is attached to.  If not passed, "default" is assumed.
    * @param kwArgs       OptionalOptional keyword arguments object for setting parameters.
    */
  @js.native
  class Highlight protected () extends PlotAction {
    def this(chart: Chart) = this()
    def this(chart: Chart, plot: String) = this()
    def this(chart: Chart, plot: String, kwArgs: js.Object) = this()
    /**
      *
      */
    var defaultParams: js.Object = js.native
    /**
      *
      */
    var optionalParams: js.Object = js.native
    /**
      * Process the action on the given object.
      *
      * @param o The object on which to process the highlighting action.
      */
    def process(o: Shape): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/Magnify.html
    *
    * Create an action that magnifies the object the action is applied to.
    *
    * @param chart The chart this action belongs to.
    * @param plot       OptionalThe plot to apply the action to. If not passed, "default" is assumed.
    * @param kwArgs       OptionalOptional keyword arguments for this action.
    */
  @js.native
  class Magnify protected () extends PlotAction {
    def this(chart: Chart) = this()
    def this(chart: Chart, plot: String) = this()
    def this(chart: Chart, plot: String, kwArgs: js.Object) = this()
    /**
      *
      */
    var defaultParams: js.Object = js.native
    /**
      *
      */
    var optionalParams: js.Object = js.native
    /**
      * Process the action on the given object.
      *
      * @param o The object on which to process the magnifying action.
      */
    def process(o: Shape): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/MouseIndicator.html
    *
    * Create a mouse indicator action. You can drag mouse over the chart to display a data indicator.
    *
    * @param chart The chart this action applies to.
    * @param plot
    * @param kwArgs       OptionalOptional arguments for the chart action.
    */
  @js.native
  class MouseIndicator protected () extends ChartAction {
    def this(chart: Chart, plot: js.Any) = this()
    def this(chart: Chart, plot: js.Any, kwArgs: js.Object) = this()
    /**
      *
      */
    var defaultParams: js.Object = js.native
    /**
      *
      */
    var optionalParams: js.Object = js.native
    /**
      * Called when the indicator value changed.
      *
      * @param event An event with a start property containing the {x, y} data points of the mouse indicator. It alsocontains a label property containing the displayed text.
      */
    def onChange(event: js.Any): Unit = js.native
    /**
      * Called when mouse is down on the chart.
      *
      * @param event
      */
    def onMouseDown(event: js.Any): Unit = js.native
    /**
      * Called when the mouse is moved on the chart.
      *
      * @param event
      */
    def onMouseMove(event: js.Any): Unit = js.native
    /**
      * Called when mouse is up on the chart.
      *
      * @param event
      */
    def onMouseUp(event: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/MouseZoomAndPan.html
    *
    * Create an mouse zoom and pan action.
    * You can zoom in or out the data window with mouse wheel. You can scroll using mouse drag gesture.
    * You can toggle between zoom and fit view using double click on the chart.
    *
    * @param chart The chart this action applies to.
    * @param plot
    * @param kwArgs       OptionalOptional arguments for the chart action.
    */
  @js.native
  class MouseZoomAndPan protected () extends ChartAction {
    def this(chart: Chart, plot: js.Any) = this()
    def this(chart: Chart, plot: js.Any, kwArgs: js.Object) = this()
    /**
      *
      */
    var defaultParams: js.Object = js.native
    /**
      *
      */
    var optionalParams: js.Object = js.native
    /**
      * Called when the mouse is double is double clicked on the chart. Toggle between zoom and fit chart.
      *
      * @param event
      */
    def onDoubleClick(event: js.Any): Unit = js.native
    /**
      * Called when a key is pressed on the chart.
      *
      * @param event
      */
    def onKeyPress(event: js.Any): Unit = js.native
    /**
      * Called when mouse is down on the chart.
      *
      * @param event
      */
    def onMouseDown(event: js.Any): Unit = js.native
    /**
      * Called when mouse is moved on the chart.
      *
      * @param event
      */
    def onMouseMove(event: js.Any): Unit = js.native
    /**
      * Called when mouse is up on the chart.
      *
      * @param event
      */
    def onMouseUp(event: js.Any): Unit = js.native
    /**
      * Called when mouse wheel is used on the chart.
      *
      * @param event
      */
    def onMouseWheel(event: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/MoveSlice.html
    *
    * Create an action for a pie chart that moves and scales a pie slice.
    *
    * @param chart The chart this action belongs to.
    * @param plot       OptionalThe plot this action is attached to.  If not passed, "default" is assumed.
    * @param kwArgs       OptionalOptional keyword arguments object for setting parameters.
    */
  @js.native
  class MoveSlice protected () extends PlotAction {
    def this(chart: Chart) = this()
    def this(chart: Chart, plot: String) = this()
    def this(chart: Chart, plot: String, kwArgs: js.Object) = this()
    /**
      *
      */
    var defaultParams: js.Object = js.native
    /**
      *
      */
    var optionalParams: js.Object = js.native
    /**
      * Process the action on the given object.
      *
      * @param o The object on which to process the slice moving action.
      */
    def process(o: Shape): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/PlotAction.html
    *
    * Base action class for plot actions.
    *
    * @param chart The chart this action applies to.
    * @param plot       OptionalThe name of the plot this action belongs to.  If none is passed "default" is assumed.
    * @param kwargs       OptionalOptional arguments for the action.
    */
  @js.native
  class PlotAction protected () extends Base {
    def this(chart: Chart) = this()
    def this(chart: Chart, plot: String) = this()
    def this(chart: Chart, plot: String, kwargs: js.Object) = this()
    /**
      *
      */
    var overOutEvents: js.Object = js.native
    /**
      * Reset the action.
      *
      */
    def reset(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/Shake.html
    *
    * Create a shaking action for use on an element in a chart.
    *
    * @param chart The chart this action belongs to.
    * @param plot       OptionalThe plot this action is attached to.  If not passed, "default" is assumed.
    * @param kwArgs       OptionalOptional keyword arguments object for setting parameters.
    */
  @js.native
  class Shake protected () extends PlotAction {
    def this(chart: Chart) = this()
    def this(chart: Chart, plot: String) = this()
    def this(chart: Chart, plot: String, kwArgs: js.Object) = this()
    /**
      *
      */
    var defaultParams: js.Object = js.native
    /**
      *
      */
    var optionalParams: js.Object = js.native
    /**
      * Process the action on the given object.
      *
      * @param o The object on which to process the slice moving action.
      */
    def process(o: Shape): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/Tooltip.html
    *
    * Create an action on a plot where a tooltip is shown when hovering over an element.
    *
    * @param chart The chart this action belongs to.
    * @param plot       OptionalThe plot this action is attached to.  If not passed, "default" is assumed.
    * @param kwArgs       OptionalOptional keyword arguments object for setting parameters.
    */
  @js.native
  class Tooltip protected () extends PlotAction {
    def this(chart: Chart) = this()
    def this(chart: Chart, plot: String) = this()
    def this(chart: Chart, plot: String, kwArgs: js.Object) = this()
    /**
      *
      */
    var defaultParams: js.Object = js.native
    /**
      *
      */
    var optionalParams: js.Object = js.native
    /**
      *
      */
    def onClick(): Unit = js.native
    /**
      * Process the action on the given object.
      *
      * @param o The object on which to process the highlighting action.
      */
    def process(o: Shape): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/TouchIndicator.html
    *
    * Create a touch indicator action. You can touch over the chart to display a data indicator.
    *
    * @param chart The chart this action applies to.
    * @param plot
    * @param kwArgs       OptionalOptional arguments for the chart action.
    */
  @js.native
  class TouchIndicator protected () extends ChartAction {
    def this(chart: Chart, plot: js.Any) = this()
    def this(chart: Chart, plot: js.Any, kwArgs: js.Object) = this()
    /**
      *
      */
    var defaultParams: js.Object = js.native
    /**
      *
      */
    var optionalParams: js.Object = js.native
    /**
      * Called when the indicator value changed.
      *
      * @param event An event with a start and end properties containing the {x, y} data points of the first andsecond (if available) touch indicators. It also contains a label property containing the displayedtext.
      */
    def onChange(event: js.Any): Unit = js.native
    /**
      * Called when touch is ended or canceled on the chart.
      *
      * @param event
      */
    def onTouchEnd(event: js.Any): Unit = js.native
    /**
      * Called when touch is moved on the chart.
      *
      * @param event
      */
    def onTouchMove(event: js.Any): Unit = js.native
    /**
      * Called when touch is started on the chart.
      *
      * @param event
      */
    def onTouchStart(event: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/TouchZoomAndPan.html
    *
    * Create a touch zoom and pan action.
    * You can zoom out or in the data window with pinch and spread gestures except on Android 2.x and WP8 devices.
    * You can scroll using drag gesture.
    * Finally this is possible to navigate between a fit window and a zoom one using double tap gesture.
    *
    * @param chart The chart this action applies to.
    * @param plot
    * @param kwArgs       OptionalOptional arguments for the action.
    */
  @js.native
  class TouchZoomAndPan protected () extends ChartAction {
    def this(chart: Chart, plot: js.Any) = this()
    def this(chart: Chart, plot: js.Any, kwArgs: js.Object) = this()
    /**
      *
      */
    var defaultParams: js.Object = js.native
    /**
      *
      */
    var optionalParams: js.Object = js.native
    /**
      * Called when double tap is performed on the chart.
      *
      * @param event
      */
    def onDoubleTap(event: js.Any): Unit = js.native
    /**
      * Called when touch is ended on the chart.
      *
      * @param event
      */
    def onTouchEnd(event: js.Any): Unit = js.native
    /**
      * Called when touch is moved on the chart.
      *
      * @param event
      */
    def onTouchMove(event: js.Any): Unit = js.native
    /**
      * Called when touch is started on the chart.
      *
      * @param event
      */
    def onTouchStart(event: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/_IndicatorElement.html
    *
    * Internal element used by indicator actions.
    *
    * @param chart
    * @param kwArgs
    */
  @js.native
  class _IndicatorElement protected () extends Indicator {
    def this(chart: js.Any, kwArgs: js.Any) = this()
    /**
      * Clean any elements (HTML or GFX-based) out of our group, and create a new one.
      *
      * @param creator               OptionalAn optional surface to work with.
      */
    def cleanGroup(creator: Surface): js.Any = js.native
    /**
      *
      */
    def render(): Unit = js.native
    /**
      *
      */
    def stopTrack(): Unit = js.native
  }
  
}

