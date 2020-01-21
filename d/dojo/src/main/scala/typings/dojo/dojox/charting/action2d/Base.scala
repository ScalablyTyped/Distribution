package typings.dojo.dojox.charting.action2d

import typings.dojo.dojo.Evented
import typings.dojo.dojox.charting.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/action2d/Base.html
  *
  * Base action class for plot and chart actions.
  *
  * @param chart The chart this action applies to.
  * @param plot       OptionalOptional target plot for this action.  Default is "default".
  */
@JSGlobal("dojox.charting.action2d.Base")
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

