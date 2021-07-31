package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterboxProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var contentAspectRatio: Double
  
  var height: Double
  
  var width: Double
}
object LetterboxProps {
  
  @scala.inline
  def apply(contentAspectRatio: Double, height: Double, width: Double): LetterboxProps = {
    val __obj = js.Dynamic.literal(contentAspectRatio = contentAspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterboxProps]
  }
  
  @scala.inline
  implicit class LetterboxPropsMutableBuilder[Self <: LetterboxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContentAspectRatio(value: Double): Self = StObject.set(x, "contentAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
