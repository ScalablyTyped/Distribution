package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileNotifierConfigurationInformation extends StObject {
  
  var mobileNotifierConfigurations: js.UndefOr[js.Array[MobileNotifierConfiguration]] = js.undefined
}
object MobileNotifierConfigurationInformation {
  
  inline def apply(): MobileNotifierConfigurationInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileNotifierConfigurationInformation]
  }
  
  extension [Self <: MobileNotifierConfigurationInformation](x: Self) {
    
    inline def setMobileNotifierConfigurations(value: js.Array[MobileNotifierConfiguration]): Self = StObject.set(x, "mobileNotifierConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMobileNotifierConfigurationsUndefined: Self = StObject.set(x, "mobileNotifierConfigurations", js.undefined)
    
    inline def setMobileNotifierConfigurationsVarargs(value: MobileNotifierConfiguration*): Self = StObject.set(x, "mobileNotifierConfigurations", js.Array(value*))
  }
}
