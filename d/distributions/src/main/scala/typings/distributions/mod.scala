package typings.distributions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("distributions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Binomial(properbility: Double, size: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Binomial")(properbility.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  
  @scala.inline
  def Normal(): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Normal")().asInstanceOf[Distribution]
  @scala.inline
  def Normal(mean: Double): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Normal")(mean.asInstanceOf[js.Any]).asInstanceOf[Distribution]
  @scala.inline
  def Normal(mean: Double, sd: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Normal")(mean.asInstanceOf[js.Any], sd.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  @scala.inline
  def Normal(mean: Unit, sd: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Normal")(mean.asInstanceOf[js.Any], sd.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  
  @scala.inline
  def Studentt(df: Double): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Studentt")(df.asInstanceOf[js.Any]).asInstanceOf[Distribution]
  
  @scala.inline
  def Uniform(): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Uniform")().asInstanceOf[Distribution]
  @scala.inline
  def Uniform(a: Double): Distribution = ^.asInstanceOf[js.Dynamic].applyDynamic("Uniform")(a.asInstanceOf[js.Any]).asInstanceOf[Distribution]
  @scala.inline
  def Uniform(a: Double, b: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Uniform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  @scala.inline
  def Uniform(a: Unit, b: Double): Distribution = (^.asInstanceOf[js.Dynamic].applyDynamic("Uniform")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Distribution]
  
  trait Distribution extends StObject {
    
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
