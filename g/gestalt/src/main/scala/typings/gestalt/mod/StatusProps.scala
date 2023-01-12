package typings.gestalt.mod

import typings.gestalt.gestaltStrings.canceled
import typings.gestalt.gestaltStrings.halted
import typings.gestalt.gestaltStrings.inProgress
import typings.gestalt.gestaltStrings.ok
import typings.gestalt.gestaltStrings.problem
import typings.gestalt.gestaltStrings.unstarted
import typings.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusProps extends StObject {
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var subtext: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: unstarted | inProgress | halted | ok | problem | canceled | warning
}
object StatusProps {
  
  inline def apply(`type`: unstarted | inProgress | halted | ok | problem | canceled | warning): StatusProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setSubtext(value: String): Self = StObject.set(x, "subtext", value.asInstanceOf[js.Any])
    
    inline def setSubtextUndefined: Self = StObject.set(x, "subtext", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: unstarted | inProgress | halted | ok | problem | canceled | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
