package typings.eases.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eases extends js.Object {
  def backIn(t: Double): Double
  def backInOut(t: Double): Double
  def backOut(t: Double): Double
  def bounceIn(t: Double): Double
  def bounceInOut(t: Double): Double
  def bounceOut(t: Double): Double
  def circIn(t: Double): Double
  def circInOut(t: Double): Double
  def circOut(t: Double): Double
  def cubicIn(t: Double): Double
  def cubicInOut(t: Double): Double
  def cubicOut(t: Double): Double
  def elasticIn(t: Double): Double
  def elasticInOut(t: Double): Double
  def elasticOut(t: Double): Double
  def expoIn(t: Double): Double
  def expoInOut(t: Double): Double
  def expoOut(t: Double): Double
  def linear(t: Double): Double
  def quadIn(t: Double): Double
  def quadInOut(t: Double): Double
  def quadOut(t: Double): Double
  def quartIn(t: Double): Double
  def quartInOut(t: Double): Double
  def quartOut(t: Double): Double
  def quintIn(t: Double): Double
  def quintInOut(t: Double): Double
  def quintOut(t: Double): Double
  def sineIn(t: Double): Double
  def sineInOut(t: Double): Double
  def sineOut(t: Double): Double
}

object Eases {
  @scala.inline
  def apply(
    backIn: Double => Double,
    backInOut: Double => Double,
    backOut: Double => Double,
    bounceIn: Double => Double,
    bounceInOut: Double => Double,
    bounceOut: Double => Double,
    circIn: Double => Double,
    circInOut: Double => Double,
    circOut: Double => Double,
    cubicIn: Double => Double,
    cubicInOut: Double => Double,
    cubicOut: Double => Double,
    elasticIn: Double => Double,
    elasticInOut: Double => Double,
    elasticOut: Double => Double,
    expoIn: Double => Double,
    expoInOut: Double => Double,
    expoOut: Double => Double,
    linear: Double => Double,
    quadIn: Double => Double,
    quadInOut: Double => Double,
    quadOut: Double => Double,
    quartIn: Double => Double,
    quartInOut: Double => Double,
    quartOut: Double => Double,
    quintIn: Double => Double,
    quintInOut: Double => Double,
    quintOut: Double => Double,
    sineIn: Double => Double,
    sineInOut: Double => Double,
    sineOut: Double => Double
  ): Eases = {
    val __obj = js.Dynamic.literal(backIn = js.Any.fromFunction1(backIn), backInOut = js.Any.fromFunction1(backInOut), backOut = js.Any.fromFunction1(backOut), bounceIn = js.Any.fromFunction1(bounceIn), bounceInOut = js.Any.fromFunction1(bounceInOut), bounceOut = js.Any.fromFunction1(bounceOut), circIn = js.Any.fromFunction1(circIn), circInOut = js.Any.fromFunction1(circInOut), circOut = js.Any.fromFunction1(circOut), cubicIn = js.Any.fromFunction1(cubicIn), cubicInOut = js.Any.fromFunction1(cubicInOut), cubicOut = js.Any.fromFunction1(cubicOut), elasticIn = js.Any.fromFunction1(elasticIn), elasticInOut = js.Any.fromFunction1(elasticInOut), elasticOut = js.Any.fromFunction1(elasticOut), expoIn = js.Any.fromFunction1(expoIn), expoInOut = js.Any.fromFunction1(expoInOut), expoOut = js.Any.fromFunction1(expoOut), linear = js.Any.fromFunction1(linear), quadIn = js.Any.fromFunction1(quadIn), quadInOut = js.Any.fromFunction1(quadInOut), quadOut = js.Any.fromFunction1(quadOut), quartIn = js.Any.fromFunction1(quartIn), quartInOut = js.Any.fromFunction1(quartInOut), quartOut = js.Any.fromFunction1(quartOut), quintIn = js.Any.fromFunction1(quintIn), quintInOut = js.Any.fromFunction1(quintInOut), quintOut = js.Any.fromFunction1(quintOut), sineIn = js.Any.fromFunction1(sineIn), sineInOut = js.Any.fromFunction1(sineInOut), sineOut = js.Any.fromFunction1(sineOut))
  
    __obj.asInstanceOf[Eases]
  }
}

