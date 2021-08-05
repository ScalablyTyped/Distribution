package typings.fuzzyset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): FuzzySet = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FuzzySet]
  inline def apply(source: js.Array[String]): FuzzySet = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[FuzzySet]
  inline def apply(source: js.Array[String], useLevenshtein: Boolean): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double, gramSizeUpper: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any], gramSizeUpper.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Unit, gramSizeUpper: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any], gramSizeUpper.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: js.Array[String], useLevenshtein: Unit, gramSizeLower: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: js.Array[String], useLevenshtein: Unit, gramSizeLower: Double, gramSizeUpper: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any], gramSizeUpper.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: js.Array[String], useLevenshtein: Unit, gramSizeLower: Unit, gramSizeUpper: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any], gramSizeUpper.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: Unit, useLevenshtein: Boolean): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: Unit, useLevenshtein: Boolean, gramSizeLower: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: Unit, useLevenshtein: Boolean, gramSizeLower: Double, gramSizeUpper: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any], gramSizeUpper.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: Unit, useLevenshtein: Boolean, gramSizeLower: Unit, gramSizeUpper: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any], gramSizeUpper.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: Unit, useLevenshtein: Unit, gramSizeLower: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: Unit, useLevenshtein: Unit, gramSizeLower: Double, gramSizeUpper: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any], gramSizeUpper.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  inline def apply(source: Unit, useLevenshtein: Unit, gramSizeLower: Unit, gramSizeUpper: Double): FuzzySet = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], useLevenshtein.asInstanceOf[js.Any], gramSizeLower.asInstanceOf[js.Any], gramSizeUpper.asInstanceOf[js.Any])).asInstanceOf[FuzzySet]
  
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FuzzySet extends StObject {
    
    def add(value: String): Boolean
    
    def get(candidate: String): js.Array[js.Tuple2[Double, String]]
    
    def isEmpty(): Boolean
    
    def length(): Double
    
    def values(): js.Array[String]
  }
  object FuzzySet {
    
    inline def apply(
      add: String => Boolean,
      get: String => js.Array[js.Tuple2[Double, String]],
      isEmpty: () => Boolean,
      length: () => Double,
      values: () => js.Array[String]
    ): FuzzySet = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), length = js.Any.fromFunction0(length), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[FuzzySet]
    }
    
    extension [Self <: FuzzySet](x: Self) {
      
      inline def setAdd(value: String => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => js.Array[js.Tuple2[Double, String]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
      
      inline def setValues(value: () => js.Array[String]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
