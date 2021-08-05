package typings.gestalt.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var htmlFor: String
}
object LabelProps {
  
  inline def apply(htmlFor: String): LabelProps = {
    val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
  
  extension [Self <: LabelProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
  }
}
