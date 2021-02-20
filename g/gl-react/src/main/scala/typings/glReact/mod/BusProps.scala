package typings.glReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusProps extends StObject {
  
  var children: js.UndefOr[js.Any] = js.native
  
  var index: Double = js.native
  
  var uniform: js.UndefOr[String] = js.native
}
object BusProps {
  
  @scala.inline
  def apply(index: Double): BusProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusProps]
  }
  
  @scala.inline
  implicit class BusPropsMutableBuilder[Self <: BusProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniform(value: String): Self = StObject.set(x, "uniform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformUndefined: Self = StObject.set(x, "uniform", js.undefined)
  }
}
