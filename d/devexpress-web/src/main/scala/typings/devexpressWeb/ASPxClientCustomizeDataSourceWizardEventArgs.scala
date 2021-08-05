package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.CustomizeDataSourceWizard event.
  */
trait ASPxClientCustomizeDataSourceWizardEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the wizard's type.
    */
  var Type: String
  
  /**
    * Specifies the wizard.
    */
  var Wizard: js.Any
}
object ASPxClientCustomizeDataSourceWizardEventArgs {
  
  inline def apply(Type: String, Wizard: js.Any): ASPxClientCustomizeDataSourceWizardEventArgs = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Wizard = Wizard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCustomizeDataSourceWizardEventArgs]
  }
  
  extension [Self <: ASPxClientCustomizeDataSourceWizardEventArgs](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWizard(value: js.Any): Self = StObject.set(x, "Wizard", value.asInstanceOf[js.Any])
  }
}
