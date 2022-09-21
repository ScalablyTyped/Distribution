package typings.gaussian

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(mean: Double, variance: Double): Gaussian = (^.asInstanceOf[js.Dynamic].apply(mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[Gaussian]
  
  @JSImport("gaussian", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Gaussian extends StObject {
    
    /**
      * returns the result of adding this and the given
      * distribution's means and variances
      */
    def add(x: Gaussian): Gaussian = js.native
    
    /**
      * the cumulative distribution function, which describes the
      * probability of a random variable falling in the interval (−∞, x]
      */
    def cdf(x: Double): Double = js.native
    
    /**
      * returns the quotient distribution of this and the given
      * distribution; equivalent to scale(1/d) when d is a constant
      */
    def div(x: Double): Gaussian = js.native
    def div(x: Gaussian): Gaussian = js.native
    
    /**
      * the mean (μ) of the distribution
      */
    var mean: Double = js.native
    
    /**
      * returns the product distribution of this and the given
      * distribution; equivalent to scale(d) when d is a constant
      */
    def mul(x: Double): Gaussian = js.native
    def mul(x: Gaussian): Gaussian = js.native
    
    /**
      * the probability density function, which describes the
      * probability of a random variable taking on the value x
      */
    def pdf(x: Double): Double = js.native
    
    /**
      * the percent point function, the inverse of cdf
      */
    def ppf(x: Double): Double = js.native
    
    /**
      * generates given number of samples of the distribution
      */
    def random(x: Double): js.Array[Double] = js.native
    def random(x: Double, randFn: js.Function0[Double]): js.Array[Double] = js.native
    
    /**
      * returns the result of scaling this distribution by the
      * given constant
      */
    def scale(x: Double): Gaussian = js.native
    
    /**
      * the standard deviation (σ) of the distribution
      */
    var standardDeviation: Double = js.native
    
    /**
      * returns the result of subtracting this and the given
      * distribution's means and variances
      */
    def sub(x: Gaussian): Gaussian = js.native
    
    /**
      * the variance (σ^2) of the distribution
      */
    var variance: Double = js.native
  }
}
