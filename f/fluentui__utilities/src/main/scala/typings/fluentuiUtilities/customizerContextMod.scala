package typings.fluentuiUtilities

import typings.fluentuiUtilities.customizationsMod.ICustomizations
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customizerContextMod {
  
  @JSImport("@fluentui/utilities/lib/customizations/CustomizerContext", "CustomizerContext")
  @js.native
  val CustomizerContext: Context[ICustomizerContext] = js.native
  
  trait ICustomizerContext extends StObject {
    
    var customizations: ICustomizations
  }
  object ICustomizerContext {
    
    inline def apply(customizations: ICustomizations): ICustomizerContext = {
      val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomizerContext]
    }
    
    extension [Self <: ICustomizerContext](x: Self) {
      
      inline def setCustomizations(value: ICustomizations): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    }
  }
}
