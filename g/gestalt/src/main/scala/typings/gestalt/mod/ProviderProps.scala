package typings.gestalt.mod

import typings.gestalt.gestaltStrings.dark
import typings.gestalt.gestaltStrings.light
import typings.gestalt.gestaltStrings.userPreference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderProps extends StObject {
  
  var colorScheme: js.UndefOr[light | dark | userPreference] = js.native
  
  var id: js.UndefOr[String] = js.native
}
object ProviderProps {
  
  @scala.inline
  def apply(): ProviderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderProps]
  }
  
  @scala.inline
  implicit class ProviderPropsMutableBuilder[Self <: ProviderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorScheme(value: light | dark | userPreference): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
