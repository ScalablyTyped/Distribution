package typings.distributions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("distributions", "Binomial")
  @js.native
  def Binomial(properbility: Double, size: Double): Distribution = js.native
  
  @JSImport("distributions", "Normal")
  @js.native
  def Normal(): Distribution = js.native
  @JSImport("distributions", "Normal")
  @js.native
  def Normal(mean: js.UndefOr[scala.Nothing], sd: Double): Distribution = js.native
  @JSImport("distributions", "Normal")
  @js.native
  def Normal(mean: Double): Distribution = js.native
  @JSImport("distributions", "Normal")
  @js.native
  def Normal(mean: Double, sd: Double): Distribution = js.native
  
  @JSImport("distributions", "Studentt")
  @js.native
  def Studentt(df: Double): Distribution = js.native
  
  @JSImport("distributions", "Uniform")
  @js.native
  def Uniform(): Distribution = js.native
  @JSImport("distributions", "Uniform")
  @js.native
  def Uniform(a: js.UndefOr[scala.Nothing], b: Double): Distribution = js.native
  @JSImport("distributions", "Uniform")
  @js.native
  def Uniform(a: Double): Distribution = js.native
  @JSImport("distributions", "Uniform")
  @js.native
  def Uniform(a: Double, b: Double): Distribution = js.native
  
  @js.native
  trait Distribution extends StObject {
    
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
    implicit class DistributionMutableBuilder[Self <: Distribution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCdf(value: Double => Double): Self = StObject.set(x, "cdf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInv(value: Double => Double): Self = StObject.set(x, "inv", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMean(value: () => Double): Self = StObject.set(x, "mean", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMedian(value: () => Double): Self = StObject.set(x, "median", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPdf(value: Double => Double): Self = StObject.set(x, "pdf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVariance(value: () => Double): Self = StObject.set(x, "variance", js.Any.fromFunction0(value))
    }
  }
}
