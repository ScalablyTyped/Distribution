package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.gestalt.mod.IconButtonLinkProps
  - typings.gestalt.mod.IconButtonButtonProps
  - typings.gestalt.mod.IconButtonSubmitProps
*/
trait IconButtonProps extends StObject
object IconButtonProps {
  
  inline def IconButtonButtonProps(accessibilityLabel: String): typings.gestalt.mod.IconButtonButtonProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gestalt.mod.IconButtonButtonProps]
  }
  
  inline def IconButtonLinkProps(accessibilityLabel: String, href: String): typings.gestalt.mod.IconButtonLinkProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], role = "link")
    __obj.asInstanceOf[typings.gestalt.mod.IconButtonLinkProps]
  }
  
  inline def IconButtonSubmitProps(accessibilityLabel: String): typings.gestalt.mod.IconButtonSubmitProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("submit")
    __obj.asInstanceOf[typings.gestalt.mod.IconButtonSubmitProps]
  }
}
