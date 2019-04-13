package typings
package gaussianLib.gaussianMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gaussian extends js.Object {
  /**
  		 * the mean (μ) of the distribution
  		 */
  var mean: scala.Double = js.native
  /**
  		 * the standard deviation (σ) of the distribution
  		 */
  var standardDeviation: scala.Double = js.native
  /**
  		 * the variance (σ^2) of the distribution
  		 */
  var variance: scala.Double = js.native
  /**
  		 * returns the result of adding this and the given
  		 * distribution's means and variances
  		 */
  def add(x: Gaussian): scala.Double = js.native
  /**
  		 * the cumulative distribution function, which describes the
  		 * probability of a random variable falling in the interval (−∞, x]
  		 */
  def cdf(x: scala.Double): scala.Double = js.native
  def div(x: Gaussian): scala.Double = js.native
  /**
  		 * returns the quotient distribution of this and the given
  		 * distribution; equivalent to scale(1/d) when d is a constant
  		 */
  def div(x: scala.Double): scala.Double = js.native
  def mul(x: Gaussian): scala.Double = js.native
  /**
  		 * returns the product distribution of this and the given
  		 * distribution; equivalent to scale(d) when d is a constant
  		 */
  def mul(x: scala.Double): scala.Double = js.native
  /**
  		 * the probability density function, which describes the
  		 * probability of a random variable taking on the value x
  		 */
  def pdf(x: scala.Double): scala.Double = js.native
  /**
  		 * the percent point function, the inverse of cdf
  		 */
  def ppf(x: scala.Double): scala.Double = js.native
  /**
  		 * returns the result of scaling this distribution by the
  		 * given constant
  		 */
  def scale(x: scala.Double): scala.Double = js.native
  /**
  		 * returns the result of subtracting this and the given
  		 * distribution's means and variances
  		 */
  def sub(x: Gaussian): scala.Double = js.native
}

