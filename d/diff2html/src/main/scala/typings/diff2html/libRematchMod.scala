package typings.diff2html

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRematchMod {
  
  @JSImport("diff2html/lib/rematch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def levenshtein(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def newDistanceFn[T](str: js.Function1[/* value */ T, String]): DistanceFn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("newDistanceFn")(str.asInstanceOf[js.Any]).asInstanceOf[DistanceFn[T]]
  
  inline def newMatcherFn[T](distance: js.Function2[/* x */ T, /* y */ T, Double]): MatcherFn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("newMatcherFn")(distance.asInstanceOf[js.Any]).asInstanceOf[MatcherFn[T]]
  
  trait BestMatch extends StObject {
    
    var indexA: Double
    
    var indexB: Double
    
    var score: Double
  }
  object BestMatch {
    
    inline def apply(indexA: Double, indexB: Double, score: Double): BestMatch = {
      val __obj = js.Dynamic.literal(indexA = indexA.asInstanceOf[js.Any], indexB = indexB.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[BestMatch]
    }
    
    extension [Self <: BestMatch](x: Self) {
      
      inline def setIndexA(value: Double): Self = StObject.set(x, "indexA", value.asInstanceOf[js.Any])
      
      inline def setIndexB(value: Double): Self = StObject.set(x, "indexB", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
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
