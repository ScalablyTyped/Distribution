package typings.dojo.dojox.charting.scaler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/scaler/linear.html
  *
  *
  */
trait linear extends js.Object {
  /**
    *
    * @param min
    * @param max
    * @param span
    * @param kwArgs
    * @param delta               Optional
    * @param minorDelta               Optional
    */
  def buildScaler(min: Double, max: Double, span: Double, kwArgs: js.Object, delta: Double, minorDelta: Double): js.Any
  /**
    *
    * @param scaler
    * @param kwArgs
    */
  def buildTicks(scaler: js.Object, kwArgs: js.Object): js.Any
  /**
    *
    * @param scaler
    */
  def getTransformerFromModel(scaler: js.Object): js.Function
  /**
    *
    * @param scaler
    */
  def getTransformerFromPlot(scaler: js.Object): js.Function
}

object linear {
  @scala.inline
  def apply(
    buildScaler: (Double, Double, Double, js.Object, Double, Double) => js.Any,
    buildTicks: (js.Object, js.Object) => js.Any,
    getTransformerFromModel: js.Object => js.Function,
    getTransformerFromPlot: js.Object => js.Function
  ): linear = {
    val __obj = js.Dynamic.literal(buildScaler = js.Any.fromFunction6(buildScaler), buildTicks = js.Any.fromFunction2(buildTicks), getTransformerFromModel = js.Any.fromFunction1(getTransformerFromModel), getTransformerFromPlot = js.Any.fromFunction1(getTransformerFromPlot))
    __obj.asInstanceOf[linear]
  }
}

