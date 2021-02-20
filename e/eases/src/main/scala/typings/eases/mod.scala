package typings.eases

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("eases", JSImport.Namespace)
  @js.native
  val ^ : Eases = js.native
  
  @js.native
  trait Eases extends StObject {
    
    def backIn(t: Double): Double = js.native
    
    def backInOut(t: Double): Double = js.native
    
    def backOut(t: Double): Double = js.native
    
    def bounceIn(t: Double): Double = js.native
    
    def bounceInOut(t: Double): Double = js.native
    
    def bounceOut(t: Double): Double = js.native
    
    def circIn(t: Double): Double = js.native
    
    def circInOut(t: Double): Double = js.native
    
    def circOut(t: Double): Double = js.native
    
    def cubicIn(t: Double): Double = js.native
    
    def cubicInOut(t: Double): Double = js.native
    
    def cubicOut(t: Double): Double = js.native
    
    def elasticIn(t: Double): Double = js.native
    
    def elasticInOut(t: Double): Double = js.native
    
    def elasticOut(t: Double): Double = js.native
    
    def expoIn(t: Double): Double = js.native
    
    def expoInOut(t: Double): Double = js.native
    
    def expoOut(t: Double): Double = js.native
    
    def linear(t: Double): Double = js.native
    
    def quadIn(t: Double): Double = js.native
    
    def quadInOut(t: Double): Double = js.native
    
    def quadOut(t: Double): Double = js.native
    
    def quartIn(t: Double): Double = js.native
    
    def quartInOut(t: Double): Double = js.native
    
    def quartOut(t: Double): Double = js.native
    
    def quintIn(t: Double): Double = js.native
    
    def quintInOut(t: Double): Double = js.native
    
    def quintOut(t: Double): Double = js.native
    
    def sineIn(t: Double): Double = js.native
    
    def sineInOut(t: Double): Double = js.native
    
    def sineOut(t: Double): Double = js.native
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
    
    @scala.inline
    implicit class EasesMutableBuilder[Self <: Eases] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackIn(value: Double => Double): Self = StObject.set(x, "backIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBackInOut(value: Double => Double): Self = StObject.set(x, "backInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBackOut(value: Double => Double): Self = StObject.set(x, "backOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceIn(value: Double => Double): Self = StObject.set(x, "bounceIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceInOut(value: Double => Double): Self = StObject.set(x, "bounceInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceOut(value: Double => Double): Self = StObject.set(x, "bounceOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCircIn(value: Double => Double): Self = StObject.set(x, "circIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCircInOut(value: Double => Double): Self = StObject.set(x, "circInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCircOut(value: Double => Double): Self = StObject.set(x, "circOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCubicIn(value: Double => Double): Self = StObject.set(x, "cubicIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCubicInOut(value: Double => Double): Self = StObject.set(x, "cubicInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCubicOut(value: Double => Double): Self = StObject.set(x, "cubicOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElasticIn(value: Double => Double): Self = StObject.set(x, "elasticIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElasticInOut(value: Double => Double): Self = StObject.set(x, "elasticInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElasticOut(value: Double => Double): Self = StObject.set(x, "elasticOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpoIn(value: Double => Double): Self = StObject.set(x, "expoIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpoInOut(value: Double => Double): Self = StObject.set(x, "expoInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpoOut(value: Double => Double): Self = StObject.set(x, "expoOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinear(value: Double => Double): Self = StObject.set(x, "linear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuadIn(value: Double => Double): Self = StObject.set(x, "quadIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuadInOut(value: Double => Double): Self = StObject.set(x, "quadInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuadOut(value: Double => Double): Self = StObject.set(x, "quadOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuartIn(value: Double => Double): Self = StObject.set(x, "quartIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuartInOut(value: Double => Double): Self = StObject.set(x, "quartInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuartOut(value: Double => Double): Self = StObject.set(x, "quartOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuintIn(value: Double => Double): Self = StObject.set(x, "quintIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuintInOut(value: Double => Double): Self = StObject.set(x, "quintInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setQuintOut(value: Double => Double): Self = StObject.set(x, "quintOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSineIn(value: Double => Double): Self = StObject.set(x, "sineIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSineInOut(value: Double => Double): Self = StObject.set(x, "sineInOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSineOut(value: Double => Double): Self = StObject.set(x, "sineOut", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Eases
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Eases = ^
}
