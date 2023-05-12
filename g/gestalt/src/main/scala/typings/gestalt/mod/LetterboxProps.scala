package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterboxProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var contentAspectRatio: Double
  
  var height: Double
  
  var width: Double
}
object LetterboxProps {
  
  inline def apply(contentAspectRatio: Double, height: Double, width: Double): LetterboxProps = {
    val __obj = js.Dynamic.literal(contentAspectRatio = contentAspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterboxProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LetterboxProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContentAspectRatio(value: Double): Self = StObject.set(x, "contentAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
