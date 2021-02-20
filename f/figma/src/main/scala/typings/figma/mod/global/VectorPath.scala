package typings.figma.mod.global

import typings.figma.figmaStrings.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorPath extends StObject {
  
  val data: String = js.native
  
  val windingRule: WindingRule | NONE = js.native
}
object VectorPath {
  
  @scala.inline
  def apply(data: String, windingRule: WindingRule | NONE): VectorPath = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], windingRule = windingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorPath]
  }
  
  @scala.inline
  implicit class VectorPathMutableBuilder[Self <: VectorPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindingRule(value: WindingRule | NONE): Self = StObject.set(x, "windingRule", value.asInstanceOf[js.Any])
  }
}
