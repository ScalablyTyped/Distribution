package typings.expoConfigPlugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosProvisioningProfileMod {
  
  @JSImport("@expo/config-plugins/build/ios/ProvisioningProfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setProvisioningProfileForPbxproj(projectRoot: String, param1: ProvisioningProfileSettings): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setProvisioningProfileForPbxproj")(projectRoot.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ProvisioningProfileSettings extends StObject {
    
    var appleTeamId: String
    
    var buildConfiguration: js.UndefOr[String] = js.undefined
    
    var profileName: String
    
    var targetName: js.UndefOr[String] = js.undefined
  }
  object ProvisioningProfileSettings {
    
    inline def apply(appleTeamId: String, profileName: String): ProvisioningProfileSettings = {
      val __obj = js.Dynamic.literal(appleTeamId = appleTeamId.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvisioningProfileSettings]
    }
    
    extension [Self <: ProvisioningProfileSettings](x: Self) {
      
      inline def setAppleTeamId(value: String): Self = StObject.set(x, "appleTeamId", value.asInstanceOf[js.Any])
      
      inline def setBuildConfiguration(value: String): Self = StObject.set(x, "buildConfiguration", value.asInstanceOf[js.Any])
      
      inline def setBuildConfigurationUndefined: Self = StObject.set(x, "buildConfiguration", js.undefined)
      
      inline def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
      
      inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      inline def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
    }
  }
}
