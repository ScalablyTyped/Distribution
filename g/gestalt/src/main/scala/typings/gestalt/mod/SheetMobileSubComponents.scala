package typings.gestalt.mod

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetMobileSubComponents extends StObject {
  
  var DismissingElement: FunctionComponent[SheetMobileDismissingElementProps]
}
object SheetMobileSubComponents {
  
  inline def apply(DismissingElement: FunctionComponent[SheetMobileDismissingElementProps]): SheetMobileSubComponents = {
    val __obj = js.Dynamic.literal(DismissingElement = DismissingElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetMobileSubComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetMobileSubComponents] (val x: Self) extends AnyVal {
    
    inline def setDismissingElement(value: FunctionComponent[SheetMobileDismissingElementProps]): Self = StObject.set(x, "DismissingElement", value.asInstanceOf[js.Any])
  }
}
