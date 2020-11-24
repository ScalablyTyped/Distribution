package typings.devexpressUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/search", JSImport.Namespace)
@js.native
object searchMod extends js.Object {
  
  @js.native
  class SearchUtils () extends js.Object
  /* static members */
  @js.native
  object SearchUtils extends js.Object {
    
    def binaryIndexNormalizator(index: Double): Double = js.native
    
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double]): Double = js.native
    def binaryIndexOf[T](
      array: js.Array[T],
      comparer: js.Function1[/* a */ T, Double],
      minIndex: js.UndefOr[scala.Nothing],
      maxIndex: Double
    ): Double = js.native
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double): Double = js.native
    def binaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double, maxIndex: Double): Double = js.native
    
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double]): Double = js.native
    def normedBinaryIndexOf[T](
      array: js.Array[T],
      comparer: js.Function1[/* a */ T, Double],
      minIndex: js.UndefOr[scala.Nothing],
      maxIndex: Double
    ): Double = js.native
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double): Double = js.native
    def normedBinaryIndexOf[T](array: js.Array[T], comparer: js.Function1[/* a */ T, Double], minIndex: Double, maxIndex: Double): Double = js.native
    
    def normedInterpolationIndexOf[T](array: js.Array[T], getValue: js.Function1[/* obj */ T, Double], toFind: Double): Double = js.native
    def normedInterpolationIndexOf[T](
      array: js.Array[T],
      getValue: js.Function1[/* obj */ T, Double],
      toFind: Double,
      lowIndex: js.UndefOr[scala.Nothing],
      highIndex: Double
    ): Double = js.native
    def normedInterpolationIndexOf[T](array: js.Array[T], getValue: js.Function1[/* obj */ T, Double], toFind: Double, lowIndex: Double): Double = js.native
    def normedInterpolationIndexOf[T](
      array: js.Array[T],
      getValue: js.Function1[/* obj */ T, Double],
      toFind: Double,
      lowIndex: Double,
      highIndex: Double
    ): Double = js.native
  }
}
