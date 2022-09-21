package typings.fluentuiStyleUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait EdgeChromiumHighContrastSelector extends StObject
  
  /* Inlined std.Partial<@fluentui/style-utilities.@fluentui/style-utilities/lib/utilities/icons.IIconOptions> */
  trait PartialIIconOptions extends StObject {
    
    var disableWarnings: js.UndefOr[Boolean] = js.undefined
    
    var warnOnMissingIcons: js.UndefOr[Boolean] = js.undefined
  }
  object PartialIIconOptions {
    
    inline def apply(): PartialIIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIIconOptions]
    }
    
    extension [Self <: PartialIIconOptions](x: Self) {
      
      inline def setDisableWarnings(value: Boolean): Self = StObject.set(x, "disableWarnings", value.asInstanceOf[js.Any])
      
      inline def setDisableWarningsUndefined: Self = StObject.set(x, "disableWarnings", js.undefined)
      
      inline def setWarnOnMissingIcons(value: Boolean): Self = StObject.set(x, "warnOnMissingIcons", value.asInstanceOf[js.Any])
      
      inline def setWarnOnMissingIconsUndefined: Self = StObject.set(x, "warnOnMissingIcons", js.undefined)
    }
  }
}
