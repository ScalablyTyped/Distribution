package typings.diff2html

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rematchMod {
  
  @JSImport("diff2html/lib/rematch", "levenshtein")
  @js.native
  def levenshtein(a: String, b: String): Double = js.native
  
  @JSImport("diff2html/lib/rematch", "newDistanceFn")
  @js.native
  def newDistanceFn[T](str: js.Function1[/* value */ T, String]): DistanceFn[T] = js.native
  
  @JSImport("diff2html/lib/rematch", "newMatcherFn")
  @js.native
  def newMatcherFn[T](distance: js.Function2[/* x */ T, /* y */ T, Double]): MatcherFn[T] = js.native
  
  @js.native
  trait BestMatch extends StObject {
    
    var indexA: Double = js.native
    
    var indexB: Double = js.native
    
    var score: Double = js.native
  }
  object BestMatch {
    
    @scala.inline
    def apply(indexA: Double, indexB: Double, score: Double): BestMatch = {
      val __obj = js.Dynamic.literal(indexA = indexA.asInstanceOf[js.Any], indexB = indexB.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[BestMatch]
    }
    
    @scala.inline
    implicit class BestMatchMutableBuilder[Self <: BestMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndexA(value: Double): Self = StObject.set(x, "indexA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexB(value: Double): Self = StObject.set(x, "indexB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  type DistanceFn[T] = js.Function2[/* x */ T, /* y */ T, Double]
  
  type MatcherFn[T] = js.Function4[
    /* a */ js.Array[T], 
    /* b */ js.Array[T], 
    /* level */ js.UndefOr[Double], 
    /* cache */ js.UndefOr[Map[String, Double]], 
    js.Array[js.Array[js.Array[T]]]
  ]
}
