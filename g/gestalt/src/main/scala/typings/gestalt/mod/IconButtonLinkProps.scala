package typings.gestalt.mod

import typings.gestalt.gestaltStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconButtonLinkProps
  extends StObject
     with CommonIconButtonProps
     with IconButtonProps {
  
  var href: String
  
  var rel: js.UndefOr[RelType] = js.undefined
  
  var role: link
  
  var target: js.UndefOr[TargetType] = js.undefined
}
object IconButtonLinkProps {
  
  inline def apply(accessibilityLabel: String, href: String): IconButtonLinkProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], role = "link")
    __obj.asInstanceOf[IconButtonLinkProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconButtonLinkProps] (val x: Self) extends AnyVal {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setRel(value: RelType): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRole(value: link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
