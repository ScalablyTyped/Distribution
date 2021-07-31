package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileNotifierConfigurationInformation extends StObject {
  
  var mobileNotifierConfigurations: js.UndefOr[js.Array[MobileNotifierConfiguration]] = js.undefined
}
object MobileNotifierConfigurationInformation {
  
  @scala.inline
  def apply(): MobileNotifierConfigurationInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileNotifierConfigurationInformation]
  }
  
  @scala.inline
  implicit class MobileNotifierConfigurationInformationMutableBuilder[Self <: MobileNotifierConfigurationInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMobileNotifierConfigurations(value: js.Array[MobileNotifierConfiguration]): Self = StObject.set(x, "mobileNotifierConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileNotifierConfigurationsUndefined: Self = StObject.set(x, "mobileNotifierConfigurations", js.undefined)
    
    @scala.inline
    def setMobileNotifierConfigurationsVarargs(value: MobileNotifierConfiguration*): Self = StObject.set(x, "mobileNotifierConfigurations", js.Array(value :_*))
  }
}
