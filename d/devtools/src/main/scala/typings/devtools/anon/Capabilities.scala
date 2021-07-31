package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capabilities extends StObject {
  
  var capabilities: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Capabilities */ js.Any
}
object Capabilities {
  
  @scala.inline
  def apply(
    capabilities: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Capabilities */ js.Any
  ): Capabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  
  @scala.inline
  implicit class CapabilitiesMutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebDriver.Capabilities */ js.Any
    ): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
  }
}
