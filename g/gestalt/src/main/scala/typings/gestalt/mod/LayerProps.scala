package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerProps extends StObject {
  
  var children: ReactNode = js.native
  
  var zIndex: js.UndefOr[Indexable] = js.native
}
object LayerProps {
  
  @scala.inline
  def apply(): LayerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerProps]
  }
  
  @scala.inline
  implicit class LayerPropsMutableBuilder[Self <: LayerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
