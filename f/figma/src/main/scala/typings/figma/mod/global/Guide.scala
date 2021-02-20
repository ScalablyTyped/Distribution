package typings.figma.mod.global

import typings.figma.figmaStrings.X
import typings.figma.figmaStrings.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Guide extends StObject {
  
  val axis: X | Y = js.native
  
  val offset: Double = js.native
}
object Guide {
  
  @scala.inline
  def apply(axis: X | Y, offset: Double): Guide = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guide]
  }
  
  @scala.inline
  implicit class GuideMutableBuilder[Self <: Guide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: X | Y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
