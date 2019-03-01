package typings
package easesLib.easesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eases extends js.Object {
  def backIn(t: scala.Double): scala.Double
  def backInOut(t: scala.Double): scala.Double
  def backOut(t: scala.Double): scala.Double
  def bounceIn(t: scala.Double): scala.Double
  def bounceInOut(t: scala.Double): scala.Double
  def bounceOut(t: scala.Double): scala.Double
  def circIn(t: scala.Double): scala.Double
  def circInOut(t: scala.Double): scala.Double
  def circOut(t: scala.Double): scala.Double
  def cubicIn(t: scala.Double): scala.Double
  def cubicInOut(t: scala.Double): scala.Double
  def cubicOut(t: scala.Double): scala.Double
  def elasticIn(t: scala.Double): scala.Double
  def elasticInOut(t: scala.Double): scala.Double
  def elasticOut(t: scala.Double): scala.Double
  def expoIn(t: scala.Double): scala.Double
  def expoInOut(t: scala.Double): scala.Double
  def expoOut(t: scala.Double): scala.Double
  def linear(t: scala.Double): scala.Double
  def quadIn(t: scala.Double): scala.Double
  def quadInOut(t: scala.Double): scala.Double
  def quadOut(t: scala.Double): scala.Double
  def quartIn(t: scala.Double): scala.Double
  def quartInOut(t: scala.Double): scala.Double
  def quartOut(t: scala.Double): scala.Double
  def quintIn(t: scala.Double): scala.Double
  def quintInOut(t: scala.Double): scala.Double
  def quintOut(t: scala.Double): scala.Double
  def sineIn(t: scala.Double): scala.Double
  def sineInOut(t: scala.Double): scala.Double
  def sineOut(t: scala.Double): scala.Double
}

object Eases {
  @scala.inline
  def apply(
    backIn: js.Function1[scala.Double, scala.Double],
    backInOut: js.Function1[scala.Double, scala.Double],
    backOut: js.Function1[scala.Double, scala.Double],
    bounceIn: js.Function1[scala.Double, scala.Double],
    bounceInOut: js.Function1[scala.Double, scala.Double],
    bounceOut: js.Function1[scala.Double, scala.Double],
    circIn: js.Function1[scala.Double, scala.Double],
    circInOut: js.Function1[scala.Double, scala.Double],
    circOut: js.Function1[scala.Double, scala.Double],
    cubicIn: js.Function1[scala.Double, scala.Double],
    cubicInOut: js.Function1[scala.Double, scala.Double],
    cubicOut: js.Function1[scala.Double, scala.Double],
    elasticIn: js.Function1[scala.Double, scala.Double],
    elasticInOut: js.Function1[scala.Double, scala.Double],
    elasticOut: js.Function1[scala.Double, scala.Double],
    expoIn: js.Function1[scala.Double, scala.Double],
    expoInOut: js.Function1[scala.Double, scala.Double],
    expoOut: js.Function1[scala.Double, scala.Double],
    linear: js.Function1[scala.Double, scala.Double],
    quadIn: js.Function1[scala.Double, scala.Double],
    quadInOut: js.Function1[scala.Double, scala.Double],
    quadOut: js.Function1[scala.Double, scala.Double],
    quartIn: js.Function1[scala.Double, scala.Double],
    quartInOut: js.Function1[scala.Double, scala.Double],
    quartOut: js.Function1[scala.Double, scala.Double],
    quintIn: js.Function1[scala.Double, scala.Double],
    quintInOut: js.Function1[scala.Double, scala.Double],
    quintOut: js.Function1[scala.Double, scala.Double],
    sineIn: js.Function1[scala.Double, scala.Double],
    sineInOut: js.Function1[scala.Double, scala.Double],
    sineOut: js.Function1[scala.Double, scala.Double]
  ): Eases = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backIn")(backIn)
    __obj.updateDynamic("backInOut")(backInOut)
    __obj.updateDynamic("backOut")(backOut)
    __obj.updateDynamic("bounceIn")(bounceIn)
    __obj.updateDynamic("bounceInOut")(bounceInOut)
    __obj.updateDynamic("bounceOut")(bounceOut)
    __obj.updateDynamic("circIn")(circIn)
    __obj.updateDynamic("circInOut")(circInOut)
    __obj.updateDynamic("circOut")(circOut)
    __obj.updateDynamic("cubicIn")(cubicIn)
    __obj.updateDynamic("cubicInOut")(cubicInOut)
    __obj.updateDynamic("cubicOut")(cubicOut)
    __obj.updateDynamic("elasticIn")(elasticIn)
    __obj.updateDynamic("elasticInOut")(elasticInOut)
    __obj.updateDynamic("elasticOut")(elasticOut)
    __obj.updateDynamic("expoIn")(expoIn)
    __obj.updateDynamic("expoInOut")(expoInOut)
    __obj.updateDynamic("expoOut")(expoOut)
    __obj.updateDynamic("linear")(linear)
    __obj.updateDynamic("quadIn")(quadIn)
    __obj.updateDynamic("quadInOut")(quadInOut)
    __obj.updateDynamic("quadOut")(quadOut)
    __obj.updateDynamic("quartIn")(quartIn)
    __obj.updateDynamic("quartInOut")(quartInOut)
    __obj.updateDynamic("quartOut")(quartOut)
    __obj.updateDynamic("quintIn")(quintIn)
    __obj.updateDynamic("quintInOut")(quintInOut)
    __obj.updateDynamic("quintOut")(quintOut)
    __obj.updateDynamic("sineIn")(sineIn)
    __obj.updateDynamic("sineInOut")(sineInOut)
    __obj.updateDynamic("sineOut")(sineOut)
    __obj.asInstanceOf[Eases]
  }
}

