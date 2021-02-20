package typings.divaJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionTolerance extends StObject {
  
  var intersectionTolerance: Double = js.native
}
object IntersectionTolerance {
  
  @scala.inline
  def apply(intersectionTolerance: Double): IntersectionTolerance = {
    val __obj = js.Dynamic.literal(intersectionTolerance = intersectionTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionTolerance]
  }
  
  @scala.inline
  implicit class IntersectionToleranceMutableBuilder[Self <: IntersectionTolerance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntersectionTolerance(value: Double): Self = StObject.set(x, "intersectionTolerance", value.asInstanceOf[js.Any])
  }
}
