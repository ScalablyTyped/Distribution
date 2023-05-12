package typings.gestalt.mod

import typings.gestalt.gestaltStrings.`false`
import typings.gestalt.gestaltStrings.`true`
import typings.gestalt.gestaltStrings.date
import typings.gestalt.gestaltStrings.link
import typings.gestalt.gestaltStrings.location
import typings.gestalt.gestaltStrings.page
import typings.gestalt.gestaltStrings.section
import typings.gestalt.gestaltStrings.step
import typings.gestalt.gestaltStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapAreaLinkProps
  extends StObject
     with CommonTapAreaProps
     with TapAreaProps {
  
  var accessibilityCurrent: js.UndefOr[page | step | location | date | time | `true` | `false` | section] = js.undefined
  
  var href: String
  
  var rel: js.UndefOr[RelType] = js.undefined
  
  var role: link
  
  var target: js.UndefOr[TargetType] = js.undefined
}
object TapAreaLinkProps {
  
  inline def apply(href: String): TapAreaLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], role = "link")
    __obj.asInstanceOf[TapAreaLinkProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TapAreaLinkProps] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityCurrent(value: page | step | location | date | time | `true` | `false` | section): Self = StObject.set(x, "accessibilityCurrent", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityCurrentUndefined: Self = StObject.set(x, "accessibilityCurrent", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setRel(value: RelType): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setRole(value: link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
