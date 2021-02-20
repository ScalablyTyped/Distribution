package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernedWidth extends StObject {
  
  var kernedWidth: Double = js.native
  
  var width: Double = js.native
}
object KernedWidth {
  
  @scala.inline
  def apply(kernedWidth: Double, width: Double): KernedWidth = {
    val __obj = js.Dynamic.literal(kernedWidth = kernedWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernedWidth]
  }
  
  @scala.inline
  implicit class KernedWidthMutableBuilder[Self <: KernedWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKernedWidth(value: Double): Self = StObject.set(x, "kernedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
