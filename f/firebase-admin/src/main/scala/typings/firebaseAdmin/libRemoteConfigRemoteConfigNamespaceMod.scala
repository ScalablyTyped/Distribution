package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRemoteConfigRemoteConfigNamespaceMod {
  
  object remoteConfig {
    
    inline def apply(): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RemoteConfig]
    inline def apply(app: App): RemoteConfig = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[RemoteConfig]
    
    @JSImport("firebase-admin/lib/remote-config/remote-config-namespace", "remoteConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ExplicitParameterValue}.
      */
    type ExplicitParameterValue = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.ExplicitParameterValue
    
    /**
      * Type alias to {@link firebase-admin.remote-config#InAppDefaultValue}.
      */
    type InAppDefaultValue = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.InAppDefaultValue
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ListVersionsOptions}.
      */
    type ListVersionsOptions = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.ListVersionsOptions
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ListVersionsResult}.
      */
    type ListVersionsResult = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.ListVersionsResult
    
    /**
      * Type alias to {@link firebase-admin.remote-config#ParameterValueType}.
      */
    type ParameterValueType = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.ParameterValueType
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfig}.
      */
    type RemoteConfig = typings.firebaseAdmin.libRemoteConfigRemoteConfigMod.RemoteConfig
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigCondition}.
      */
    type RemoteConfigCondition = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigCondition
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigParameter}.
      */
    type RemoteConfigParameter = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigParameter
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigParameterGroup}.
      */
    type RemoteConfigParameterGroup = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigParameterGroup
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigParameterValue}.
      */
    type RemoteConfigParameterValue = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigParameterValue
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigTemplate}.
      */
    type RemoteConfigTemplate = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigTemplate
    
    /**
      * Type alias to {@link firebase-admin.remote-config#RemoteConfigUser}.
      */
    type RemoteConfigUser = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.RemoteConfigUser
    
    /**
      * Type alias to {@link firebase-admin.remote-config#TagColor}.
      */
    type TagColor = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.TagColor
    
    /**
      * Type alias to {@link firebase-admin.remote-config#Version}.
      */
    type Version = typings.firebaseAdmin.libRemoteConfigRemoteConfigApiMod.Version
  }
}
