package typings.eloRank

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("elo-rank", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with EloRank {
    def this(kFactor: Double) = this()
    
    /* CompleteClass */
    override def getExpected(a: Double, b: Double): Double = js.native
    
    /* CompleteClass */
    override def getKFactor(): Double = js.native
    
    /* CompleteClass */
    override def setKFactor(kFactor: Double): Unit = js.native
    
    /* CompleteClass */
    override def updateRating(expected: Double, actual: Double, current: Double): Double = js.native
  }
  
  trait EloRank extends StObject {
    
    def getExpected(a: Double, b: Double): Double
    
    def getKFactor(): Double
    
    def setKFactor(kFactor: Double): Unit
    
    def updateRating(expected: Double, actual: Double, current: Double): Double
  }
  object EloRank {
    
    @scala.inline
    def apply(
      getExpected: (Double, Double) => Double,
      getKFactor: () => Double,
      setKFactor: Double => Unit,
      updateRating: (Double, Double, Double) => Double
    ): EloRank = {
      val __obj = js.Dynamic.literal(getExpected = js.Any.fromFunction2(getExpected), getKFactor = js.Any.fromFunction0(getKFactor), setKFactor = js.Any.fromFunction1(setKFactor), updateRating = js.Any.fromFunction3(updateRating))
      __obj.asInstanceOf[EloRank]
    }
    
    @scala.inline
    implicit class EloRankMutableBuilder[Self <: EloRank] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetExpected(value: (Double, Double) => Double): Self = StObject.set(x, "getExpected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetKFactor(value: () => Double): Self = StObject.set(x, "getKFactor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetKFactor(value: Double => Unit): Self = StObject.set(x, "setKFactor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateRating(value: (Double, Double, Double) => Double): Self = StObject.set(x, "updateRating", js.Any.fromFunction3(value))
    }
  }
}
