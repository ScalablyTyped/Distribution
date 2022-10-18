package typings.fuzzysetJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object fuzzysetMod {
  
  inline def apply(
    source: js.UndefOr[js.Array[String]],
    useLevenshtein: js.UndefOr[Boolean],
    gramSizeLower: js.UndefOr[Double],
    gramSizeUpper: js.UndefOr[Double]
  ): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any], gramSizeUpper.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait FuzzySet extends StObject {
    
    def add(value: String): Boolean = js.native
    
    def get[T](candidate: String): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
    def get[T](candidate: String, defaultValue: T): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
    def get[T](candidate: String, defaultValue: T, minScore: Double): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
    def get[T](candidate: String, defaultValue: Unit, minScore: Double): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
    
    def isEmpty(): Boolean = js.native
    
    def length(): Double = js.native
    
    def values(): js.Array[String] = js.native
  }
}
