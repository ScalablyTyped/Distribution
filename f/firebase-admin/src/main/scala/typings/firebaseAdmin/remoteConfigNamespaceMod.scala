package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConfigNamespaceMod {
  
  object remoteConfig {
    
    inline def apply(): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RemoteConfig]
    inline def apply(app: App): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[RemoteConfig]
    
    @JSImport("firebase-admin/lib/remote-config/remote-config-namespace", "remoteConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ExplicitParameterValue}.
      */
    type ExplicitParameterValue = typings.firebaseAdmin.remoteConfigApiMod.ExplicitParameterValue
    
    /**
      * Type alias to {@link firebase-admin.remote-config#InAppDefaultValue}.
      */
    type InAppDefaultValue = typings.firebaseAdmin.remoteConfigApiMod.InAppDefaultValue
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ListVersionsOptions}.
      */
    type ListVersionsOptions = typings.firebaseAdmin.remoteConfigApiMod.ListVersionsOptions
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ListVersionsResult}.
      */
    type ListVersionsResult = typings.firebaseAdmin.remoteConfigApiMod.ListVersionsResult
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ParameterValueType}.
      */
    type ParameterValueType = typings.firebaseAdmin.remoteConfigApiMod.ParameterValueType
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfig}.
      */
    type RemoteConfig = typings.firebaseAdmin.remoteConfigRemoteConfigMod.RemoteConfig
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigCondition}.
      */
    type RemoteConfigCondition = typings.firebaseAdmin.remoteConfigApiMod.RemoteConfigCondition
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigParameter}.
      */
    type RemoteConfigParameter = typings.firebaseAdmin.remoteConfigApiMod.RemoteConfigParameter
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigParameterGroup}.
      */
    type RemoteConfigParameterGroup = typings.firebaseAdmin.remoteConfigApiMod.RemoteConfigParameterGroup
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigParameterValue}.
      */
    type RemoteConfigParameterValue = typings.firebaseAdmin.remoteConfigApiMod.RemoteConfigParameterValue
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigTemplate}.
      */
    type RemoteConfigTemplate = typings.firebaseAdmin.remoteConfigApiMod.RemoteConfigTemplate
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigUser}.
      */
    type RemoteConfigUser = typings.firebaseAdmin.remoteConfigApiMod.RemoteConfigUser
    
    /**
      * Type alias to {@link firebase-admin.remote-config#TagColor}.
      */
    type TagColor = typings.firebaseAdmin.remoteConfigApiMod.TagColor
    
    /**
      * Type alias to {@link firebase-admin.remote-config#Version}.
      */
    type Version = typings.firebaseAdmin.remoteConfigApiMod.Version
  }
}
