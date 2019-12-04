package typings.dojo.dojox.charting.scaler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/scaler/primitive.html
  *
  *
  */
trait primitive extends js.Object {
  /**
    *
    * @param min
    * @param max
    * @param span
    * @param kwArgs
    */
  def buildScaler(min: Double, max: Double, span: Double, kwArgs: js.Object): js.Object
  /**
    *
    * @param scaler
    * @param kwArgs
    */
  def buildTicks(scaler: js.Object, kwArgs: js.Object): js.Object
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

object primitive {
  @scala.inline
  def apply(
    buildScaler: (Double, Double, Double, js.Object) => js.Object,
    buildTicks: (js.Object, js.Object) => js.Object,
    getTransformerFromModel: js.Object => js.Function,
    getTransformerFromPlot: js.Object => js.Function
  ): primitive = {
    val __obj = js.Dynamic.literal(buildScaler = js.Any.fromFunction4(buildScaler), buildTicks = js.Any.fromFunction2(buildTicks), getTransformerFromModel = js.Any.fromFunction1(getTransformerFromModel), getTransformerFromPlot = js.Any.fromFunction1(getTransformerFromPlot))
  
    __obj.asInstanceOf[primitive]
  }
}

