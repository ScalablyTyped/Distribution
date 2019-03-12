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
    cdf: scala.Double => scala.Double,
    inv: scala.Double => scala.Double,
    mean: () => scala.Double,
    median: () => scala.Double,
    pdf: scala.Double => scala.Double,
    variance: () => scala.Double
  ): Distribution = {
    val __obj = js.Dynamic.literal(cdf = js.Any.fromFunction1(cdf), inv = js.Any.fromFunction1(inv), mean = js.Any.fromFunction0(mean), median = js.Any.fromFunction0(median), pdf = js.Any.fromFunction1(pdf), variance = js.Any.fromFunction0(variance))
  
    __obj.asInstanceOf[Distribution]
  }
}

