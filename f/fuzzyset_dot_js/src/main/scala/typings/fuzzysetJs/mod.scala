package typings.fuzzysetJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: js.UndefOr[scala.Nothing],
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: Double,
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(source: js.UndefOr[scala.Nothing], useLevenshtein: Boolean): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: Boolean,
    gramSizeLower: js.UndefOr[scala.Nothing],
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(source: js.UndefOr[scala.Nothing], useLevenshtein: Boolean, gramSizeLower: Double): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(
    source: js.UndefOr[scala.Nothing],
    useLevenshtein: Boolean,
    gramSizeLower: Double,
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String]): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(
    source: js.Array[String],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: js.UndefOr[scala.Nothing],
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], useLevenshtein: js.UndefOr[scala.Nothing], gramSizeLower: Double): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(
    source: js.Array[String],
    useLevenshtein: js.UndefOr[scala.Nothing],
    gramSizeLower: Double,
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(
    source: js.Array[String],
    useLevenshtein: Boolean,
    gramSizeLower: js.UndefOr[scala.Nothing],
    gramSizeUpper: Double
  ): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double): FuzzySet = js.native
  @JSImport("fuzzyset.js", JSImport.Namespace)
  @js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double, gramSizeUpper: Double): FuzzySet = js.native
  
  @js.native
  trait FuzzySet extends StObject {
    
    def add(value: String): Boolean = js.native
    
    def get[T](candidate: String): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
    def get[T](candidate: String, defaultValue: T): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
    def get[T](candidate: String, defaultValue: T, minScore: Double): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
    def get[T](candidate: String, defaultValue: js.UndefOr[scala.Nothing], minScore: Double): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
    
    def isEmpty(): Boolean = js.native
    
    def length(): Double = js.native
    
    def values(): js.Array[String] = js.native
  }
}
