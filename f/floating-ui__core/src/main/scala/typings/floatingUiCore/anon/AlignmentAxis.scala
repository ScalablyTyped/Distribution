package typings.floatingUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignmentAxis extends StObject {
  
  /**
    * The same axis as `crossAxis` but applies only to aligned placements
    * and inverts the `end` alignment. When set to a number, it overrides the
    * `crossAxis` value.
    *
    * A positive number will move the floating element in the direction of
    * the opposite edge to the one that is aligned, while a negative number
    * the reverse.
    * @default null
    */
  var alignmentAxis: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The axis that runs along the alignment of the floating element.
    * Represents the skidding between the reference and floating element.
    * @default 0
    */
  var crossAxis: js.UndefOr[Double] = js.undefined
  
  /**
    * The axis that runs along the side of the floating element. Represents
    * the distance (gutter or margin) between the reference and floating
    * element.
    * @default 0
    */
  var mainAxis: js.UndefOr[Double] = js.undefined
}
object AlignmentAxis {
  
  inline def apply(): AlignmentAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignmentAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlignmentAxis] (val x: Self) extends AnyVal {
    
    inline def setAlignmentAxis(value: Double): Self = StObject.set(x, "alignmentAxis", value.asInstanceOf[js.Any])
    
    inline def setAlignmentAxisNull: Self = StObject.set(x, "alignmentAxis", null)
    
    inline def setAlignmentAxisUndefined: Self = StObject.set(x, "alignmentAxis", js.undefined)
    
    inline def setCrossAxis(value: Double): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setCrossAxisUndefined: Self = StObject.set(x, "crossAxis", js.undefined)
    
    inline def setMainAxis(value: Double): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
    
    inline def setMainAxisUndefined: Self = StObject.set(x, "mainAxis", js.undefined)
  }
}
