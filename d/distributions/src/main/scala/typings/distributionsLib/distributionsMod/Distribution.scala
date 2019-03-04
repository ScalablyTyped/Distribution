package typings
package distributionsLib.distributionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distribution extends js.Object {
  def cdf(x: scala.Double): scala.Double
  def inv(p: scala.Double): scala.Double
  def mean(): scala.Double
  def median(): scala.Double
  def pdf(x: scala.Double): scala.Double
  def variance(): scala.Double
}

object Distribution {
  @scala.inline
  def apply(
    cdf: js.Function1[scala.Double, scala.Double],
    inv: js.Function1[scala.Double, scala.Double],
    mean: js.Function0[scala.Double],
    median: js.Function0[scala.Double],
    pdf: js.Function1[scala.Double, scala.Double],
    variance: js.Function0[scala.Double]
  ): Distribution = {
    val __obj = js.Dynamic.literal(cdf = cdf, inv = inv, mean = mean, median = median, pdf = pdf, variance = variance)
  
    __obj.asInstanceOf[Distribution]
  }
}

