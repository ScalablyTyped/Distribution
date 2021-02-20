package typings.fuzzyset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: js.UndefOr[scala.Nothing],
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: Double,
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(source: js.UndefOr[scala.Nothing], useLevenshtein: Boolean): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: Boolean,
    gramSizeLower: js.UndefOr[scala.Nothing],
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(source: js.UndefOr[scala.Nothing], useLevenshtein: Boolean, gramSizeLower: Double): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: Boolean,
    gramSizeLower: Double,
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String]): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(
    source: js.Array[String],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: js.UndefOr[scala.Nothing],
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], useLevenshtein: js.UndefOr[scala.Nothing], gramSizeLower: Double): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(
    source: js.Array[String],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: Double,
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(
    source: js.Array[String],
    useLevenshtein: Boolean,
    gramSizeLower: js.UndefOr[scala.Nothing],
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double): FuzzySet = js.native
  @JSImport("fuzzyset", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double, gramSizeUpper: Double): FuzzySet = js.native
  
  @js.native
  trait FuzzySet extends StObject {
    
    def add(value: String): Boolean = js.native
    
    def get(candidate: String): js.Array[js.Tuple2[Double, String]] = js.native
    
    def isEmpty(): Boolean = js.native
    
    def length(): Double = js.native
    
    def values(): js.Array[String] = js.native
  }
  object FuzzySet {
    
    @scala.inline
    def apply(
      add: String => Boolean,
      get: String => js.Array[js.Tuple2[Double, String]],
      isEmpty: () => Boolean,
      length: () => Double,
      values: () => js.Array[String]
    ): FuzzySet = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), length = js.Any.fromFunction0(length), values = js.Any.fromFunction0(values))
      __obj.asInstanceOf[FuzzySet]
    }
    
    @scala.inline
    implicit class FuzzySetMutableBuilder[Self <: FuzzySet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: String => Boolean): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.Array[js.Tuple2[Double, String]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: () => Double): Self = StObject.set(x, "length", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValues(value: () => js.Array[String]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
    }
  }
}
