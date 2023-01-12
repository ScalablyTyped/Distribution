package typings.fluentReact

import typings.fluentReact.esmLocalizationMod.ReactLocalization
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmProviderMod {
  
  @JSImport("@fluent/react/esm/provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LocalizationProvider(props: LocalizationProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("LocalizationProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait LocalizationProviderProps extends StObject {
    
    var children: ReactNode
    
    var l10n: ReactLocalization
  }
  object LocalizationProviderProps {
    
    inline def apply(l10n: ReactLocalization): LocalizationProviderProps = {
      val __obj = js.Dynamic.literal(l10n = l10n.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizationProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalizationProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setL10n(value: ReactLocalization): Self = StObject.set(x, "l10n", value.asInstanceOf[js.Any])
    }
  }
}
