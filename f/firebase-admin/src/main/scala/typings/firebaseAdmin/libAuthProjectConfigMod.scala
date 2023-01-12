package typings.firebaseAdmin

import typings.firebaseAdmin.libAuthAuthConfigMod.SmsRegionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthProjectConfigMod {
  
  @JSImport("firebase-admin/lib/auth/project-config", "ProjectConfig")
  @js.native
  open class ProjectConfig () extends StObject {
    
    /**
      * The SMS Regions Config for the project.
      * Configures the regions where users are allowed to send verification SMS.
      * This is based on the calling code of the destination phone number.
      */
    val smsRegionConfig: js.UndefOr[SmsRegionConfig] = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): js.Object = js.native
  }
  /* static members */
  object ProjectConfig {
    
    @JSImport("firebase-admin/lib/auth/project-config", "ProjectConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates a project config options object. Throws an error on failure.
      *
      * @param request - The project config options object to validate.
      */
    @JSImport("firebase-admin/lib/auth/project-config", "ProjectConfig.validate")
    @js.native
    def validate: Any = js.native
    inline def validate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validate")(x.asInstanceOf[js.Any])
  }
  
  trait ProjectConfigClientRequest extends StObject {
    
    var smsRegionConfig: js.UndefOr[SmsRegionConfig] = js.undefined
  }
  object ProjectConfigClientRequest {
    
    inline def apply(): ProjectConfigClientRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectConfigClientRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProjectConfigClientRequest] (val x: Self) extends AnyVal {
      
      inline def setSmsRegionConfig(value: SmsRegionConfig): Self = StObject.set(x, "smsRegionConfig", value.asInstanceOf[js.Any])
      
      inline def setSmsRegionConfigUndefined: Self = StObject.set(x, "smsRegionConfig", js.undefined)
    }
  }
  
  trait ProjectConfigServerResponse extends StObject {
    
    var smsRegionConfig: js.UndefOr[SmsRegionConfig] = js.undefined
  }
  object ProjectConfigServerResponse {
    
    inline def apply(): ProjectConfigServerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectConfigServerResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProjectConfigServerResponse] (val x: Self) extends AnyVal {
      
      inline def setSmsRegionConfig(value: SmsRegionConfig): Self = StObject.set(x, "smsRegionConfig", value.asInstanceOf[js.Any])
      
      inline def setSmsRegionConfigUndefined: Self = StObject.set(x, "smsRegionConfig", js.undefined)
    }
  }
  
  trait UpdateProjectConfigRequest extends StObject {
    
    /**
      * The SMS configuration to update on the project.
      */
    var smsRegionConfig: js.UndefOr[SmsRegionConfig] = js.undefined
  }
  object UpdateProjectConfigRequest {
    
    inline def apply(): UpdateProjectConfigRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProjectConfigRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateProjectConfigRequest] (val x: Self) extends AnyVal {
      
      inline def setSmsRegionConfig(value: SmsRegionConfig): Self = StObject.set(x, "smsRegionConfig", value.asInstanceOf[js.Any])
      
      inline def setSmsRegionConfigUndefined: Self = StObject.set(x, "smsRegionConfig", js.undefined)
    }
  }
}
