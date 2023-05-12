package typings.gestalt.mod

import typings.gestalt.gestaltStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonLinkProps
  extends StObject
     with CommonButtonProps
     with ButtonProps {
  
  var href: String
  
  var rel: js.UndefOr[RelType] = js.undefined
  
  var role: link
  
  var target: js.UndefOr[TargetType] = js.undefined
}
object ButtonLinkProps {
  
  inline def apply(href: String, text: String): ButtonLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], role = "link", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonLinkProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonLinkProps] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setRel(value: RelType): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRole(value: link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
