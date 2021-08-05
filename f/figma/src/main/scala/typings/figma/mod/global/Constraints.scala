package typings.figma.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constraints extends StObject {
  
  val horizontal: ConstraintType
  
  val vertical: ConstraintType
}
object Constraints {
  
  inline def apply(horizontal: ConstraintType, vertical: ConstraintType): Constraints = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraints]
  }
  
  extension [Self <: Constraints](x: Self) {
    
    inline def setHorizontal(value: ConstraintType): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: ConstraintType): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
