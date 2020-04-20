package typings.distributions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  def cdf(x: Double): Double
  def inv(p: Double): Double
  def mean(): Double
  def median(): Double
  def pdf(x: Double): Double
  def variance(): Double
}

object Distribution {
  @scala.inline
  def apply(
    cdf: Double => Double,
    inv: Double => Double,
    mean: () => Double,
    median: () => Double,
    pdf: Double => Double,
    variance: () => Double
  ): Distribution = {
    val __obj = js.Dynamic.literal(cdf = js.Any.fromFunction1(cdf), inv = js.Any.fromFunction1(inv), mean = js.Any.fromFunction0(mean), median = js.Any.fromFunction0(median), pdf = js.Any.fromFunction1(pdf), variance = js.Any.fromFunction0(variance))
    __obj.asInstanceOf[Distribution]
  }
}

