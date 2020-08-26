package typings.distributions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  def cdf(x: Double): Double = js.native
  def inv(p: Double): Double = js.native
  def mean(): Double = js.native
  def median(): Double = js.native
  def pdf(x: Double): Double = js.native
  def variance(): Double = js.native
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
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCdf(value: Double => Double): Self = this.set("cdf", js.Any.fromFunction1(value))
    @scala.inline
    def setInv(value: Double => Double): Self = this.set("inv", js.Any.fromFunction1(value))
    @scala.inline
    def setMean(value: () => Double): Self = this.set("mean", js.Any.fromFunction0(value))
    @scala.inline
    def setMedian(value: () => Double): Self = this.set("median", js.Any.fromFunction0(value))
    @scala.inline
    def setPdf(value: Double => Double): Self = this.set("pdf", js.Any.fromFunction1(value))
    @scala.inline
    def setVariance(value: () => Double): Self = this.set("variance", js.Any.fromFunction0(value))
  }
  
}

