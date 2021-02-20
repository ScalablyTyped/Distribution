package typings.devexpressUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod {
  
  @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils")
  @js.native
  class SearchUtils () extends StObject
  /* static members */
  object SearchUtils {
    
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.binaryIndexNormalizator")
    @js.native
    def binaryIndexNormalizator(index: Double): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.binaryIndexOf")
    @js.native
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double]): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.binaryIndexOf")
    @js.native
    def binaryIndexOf[T](
      array: js.Array[T],
      comparer: js.Function1[/* a */ T, Double],
      minIndex: js.UndefOr[scala.Nothing],
      maxIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.binaryIndexOf")
    @js.native
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.binaryIndexOf")
    @js.native
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double, maxIndex: Double): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.normedBinaryIndexOf")
    @js.native
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double]): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.normedBinaryIndexOf")
    @js.native
    def normedBinaryIndexOf[T](
      array: js.Array[T],
      comparer: js.Function1[/* a */ T, Double],
      minIndex: js.UndefOr[scala.Nothing],
      maxIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.normedBinaryIndexOf")
    @js.native
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.normedBinaryIndexOf")
    @js.native
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double, maxIndex: Double): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.normedInterpolationIndexOf")
    @js.native
    def normedInterpolationIndexOf[T](array: js.Array[T], getValue: js.Function1[/* obj */ T, Double], toFind: Double): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.normedInterpolationIndexOf")
    @js.native
    def normedInterpolationIndexOf[T](
      array: js.Array[T],
      getValue: js.Function1[/* obj */ T, Double],
      toFind: Double,
      lowIndex: js.UndefOr[scala.Nothing],
      highIndex: Double
    ): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.normedInterpolationIndexOf")
    @js.native
    def normedInterpolationIndexOf[T](array: js.Array[T], getValue: js.Function1[/* obj */ T, Double], toFind: Double, lowIndex: Double): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/search", "SearchUtils.normedInterpolationIndexOf")
    @js.native
    def normedInterpolationIndexOf[T](
      array: js.Array[T],
      getValue: js.Function1[/* obj */ T, Double],
      toFind: Double,
      lowIndex: Double,
      highIndex: Double
    ): Double = js.native
  }
}
