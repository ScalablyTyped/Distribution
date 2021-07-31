package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod {
  
  @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils")
  @js.native
  class SearchUtils () extends StObject
  /* static members */
  object SearchUtils {
    
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def binaryIndexNormalizator(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("binaryIndexNormalizator")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryIndexOf")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryIndexOf")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any], minIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double, maxIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryIndexOf")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any], minIndex.asInstanceOf[js.Any], maxIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Unit, maxIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryIndexOf")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any], minIndex.asInstanceOf[js.Any], maxIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normedBinaryIndexOf")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normedBinaryIndexOf")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any], minIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double, maxIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normedBinaryIndexOf")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any], minIndex.asInstanceOf[js.Any], maxIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Unit, maxIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normedBinaryIndexOf")(array.asInstanceOf[js.Any], comparer.asInstanceOf[js.Any], minIndex.asInstanceOf[js.Any], maxIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def normedInterpolationIndexOf[T](array: js.Array[T], getValue: js.Function1[/* obj */ T, Double], toFind: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normedInterpolationIndexOf")(array.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], toFind.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def normedInterpolationIndexOf[T](array: js.Array[T], getValue: js.Function1[/* obj */ T, Double], toFind: Double, lowIndex: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normedInterpolationIndexOf")(array.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], toFind.asInstanceOf[js.Any], lowIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def normedInterpolationIndexOf[T](
      array: js.Array[T],
      getValue: js.Function1[/* obj */ T, Double],
      toFind: Double,
      lowIndex: Double,
      highIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normedInterpolationIndexOf")(array.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], toFind.asInstanceOf[js.Any], lowIndex.asInstanceOf[js.Any], highIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
    @scala.inline
    def normedInterpolationIndexOf[T](
      array: js.Array[T],
      getValue: js.Function1[/* obj */ T, Double],
      toFind: Double,
      lowIndex: Unit,
      highIndex: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("normedInterpolationIndexOf")(array.asInstanceOf[js.Any], getValue.asInstanceOf[js.Any], toFind.asInstanceOf[js.Any], lowIndex.asInstanceOf[js.Any], highIndex.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
