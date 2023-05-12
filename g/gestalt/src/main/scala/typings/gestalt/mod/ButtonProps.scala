package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.gestalt.mod.ButtonLinkProps
  - typings.gestalt.mod.ButtonButtonProps
  - typings.gestalt.mod.ButtonSubmitProps
*/
trait ButtonProps extends StObject
object ButtonProps {
  
  inline def ButtonButtonProps(text: String): typings.gestalt.mod.ButtonButtonProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gestalt.mod.ButtonButtonProps]
  }
  
  inline def ButtonLinkProps(href: String, text: String): typings.gestalt.mod.ButtonLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], role = "link", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.gestalt.mod.ButtonLinkProps]
  }
  
  inline def ButtonSubmitProps(text: String): typings.gestalt.mod.ButtonSubmitProps = {
    val __obj = js.Dynamic.literal(role = "button", text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("submit")
    __obj.asInstanceOf[typings.gestalt.mod.ButtonSubmitProps]
  }
}
