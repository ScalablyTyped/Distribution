package typings.gestalt.mod

import typings.gestalt.anon.OnDismissStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetMobileDismissingElementProps extends StObject {
  
  var children: DismissingElementChildrenType
}
object SheetMobileDismissingElementProps {
  
  inline def apply(children: /* arg */ OnDismissStart => Node): SheetMobileDismissingElementProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[SheetMobileDismissingElementProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetMobileDismissingElementProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: /* arg */ OnDismissStart => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
