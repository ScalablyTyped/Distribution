package typings.dojo.dojox.charting.plot2d

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/common.html
  *
  *
  */
@JSName("common")
@js.native
trait common_ extends js.Object {
  /**
    *
    */
  var defaultStats: js.Object = js.native
  /**
    *
    * @param target
    * @param color
    */
  def augmentColor(target: js.Any, color: js.Any): js.Any = js.native
  /**
    *
    * @param fill
    * @param color
    */
  def augmentFill(fill: js.Any, color: js.Any): js.Any = js.native
  /**
    *
    * @param stroke
    * @param color
    */
  def augmentStroke(stroke: js.Any, color: js.Any): js.Any = js.native
  /**
    *
    * @param availableSize
    * @param opt
    * @param clusterSize               Optional
    */
  def calculateBarSize(availableSize: Double, opt: js.Object, clusterSize: Double): js.Object = js.native
  /**
    *
    * @param series
    */
  def collectSimpleStats(series: js.Any): js.Any = js.native
  /**
    *
    * @param series
    */
  def collectStackedStats(series: js.Any): js.Any = js.native
  /**
    *
    * @param a
    * @param tension
    */
  def curve(a: js.Array[Double], tension: String): js.Any = js.native
  /**
    *
    * @param a
    * @param tension
    */
  def curve(a: js.Array[Double], tension: Double): js.Any = js.native
  /**
    *
    * @param moduleName
    * @param ifloaded
    * @param ifnotloaded
    */
  def doIfLoaded(moduleName: js.Any, ifloaded: js.Any, ifnotloaded: js.Any): js.Any = js.native
  /**
    *
    * @param number
    * @param fixed
    * @param precision
    */
  def getLabel(number: Double, fixed: Boolean, precision: Double): js.Any = js.native
  /**
    *
    * @param stroke
    */
  def makeStroke(stroke: js.Any): js.Any = js.native
}

