package typings.fuzzyset

import typings.fuzzyset.fuzzysetBooleans.`false`
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
  
  @js.native
  trait FuzzySet extends StObject {
    
    def add(value: String): js.UndefOr[`false`] = js.native
    
    def get(candidate: String): (js.Array[js.Tuple2[Double, String]]) | Null = js.native
    def get[DEFAULT](candidate: String, `def`: DEFAULT): (js.Array[js.Tuple2[Double, String]]) | DEFAULT = js.native
    def get[DEFAULT](candidate: String, `def`: DEFAULT, minScore: Double): (js.Array[js.Tuple2[Double, String]]) | DEFAULT = js.native
    def get[DEFAULT](candidate: String, `def`: Unit, minScore: Double): (js.Array[js.Tuple2[Double, String]]) | DEFAULT = js.native
    @JSName("get")
    def get_DEFAULT[DEFAULT](candidate: String): (js.Array[js.Tuple2[Double, String]]) | DEFAULT = js.native
    
    def isEmpty(): Boolean = js.native
    
    def length(): Double = js.native
    
    def values(): js.Array[String] = js.native
  }
}
