package typings.gestalt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.gestalt.mod.TapAreaLinkProps
  - typings.gestalt.mod.TapAreaButtonProps
*/
trait TapAreaProps extends StObject
object TapAreaProps {
  
  inline def TapAreaButtonProps(): typings.gestalt.mod.TapAreaButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.gestalt.mod.TapAreaButtonProps]
  }
  
  inline def TapAreaLinkProps(href: String): typings.gestalt.mod.TapAreaLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], role = "link")
    __obj.asInstanceOf[typings.gestalt.mod.TapAreaLinkProps]
  }
}
