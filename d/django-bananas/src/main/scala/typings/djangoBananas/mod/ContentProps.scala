package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var contained: js.UndefOr[Boolean] = js.undefined
  
  var disablePadding: js.UndefOr[Boolean] = js.undefined
}
object ContentProps {
  
  inline def apply(): ContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentProps]
  }
  
  extension [Self <: ContentProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContained(value: Boolean): Self = StObject.set(x, "contained", value.asInstanceOf[js.Any])
    
    inline def setContainedUndefined: Self = StObject.set(x, "contained", js.undefined)
    
    inline def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
    
    inline def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
  }
}
