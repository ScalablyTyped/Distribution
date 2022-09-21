package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCrossProfilePolicies extends StObject {
  
  /**
    * Whether text copied from one profile (personal or work) can be pasted in the other profile.
    */
  var crossProfileCopyPaste: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether data from one profile (personal or work) can be shared with apps in the other profile. Specifically controls simple data sharing via intents. Management of other cross-profile communication channels, such as contact search, copy/paste, or connected work & personal apps, are configured separately.
    */
  var crossProfileDataSharing: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether contacts stored in the work profile can be shown in personal profile contact searches and incoming calls.
    */
  var showWorkContactsInPersonalProfile: js.UndefOr[String | Null] = js.undefined
}
object SchemaCrossProfilePolicies {
  
  inline def apply(): SchemaCrossProfilePolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCrossProfilePolicies]
  }
  
  extension [Self <: SchemaCrossProfilePolicies](x: Self) {
    
    inline def setCrossProfileCopyPaste(value: String): Self = StObject.set(x, "crossProfileCopyPaste", value.asInstanceOf[js.Any])
    
    inline def setCrossProfileCopyPasteNull: Self = StObject.set(x, "crossProfileCopyPaste", null)
    
    inline def setCrossProfileCopyPasteUndefined: Self = StObject.set(x, "crossProfileCopyPaste", js.undefined)
    
    inline def setCrossProfileDataSharing(value: String): Self = StObject.set(x, "crossProfileDataSharing", value.asInstanceOf[js.Any])
    
    inline def setCrossProfileDataSharingNull: Self = StObject.set(x, "crossProfileDataSharing", null)
    
    inline def setCrossProfileDataSharingUndefined: Self = StObject.set(x, "crossProfileDataSharing", js.undefined)
    
    inline def setShowWorkContactsInPersonalProfile(value: String): Self = StObject.set(x, "showWorkContactsInPersonalProfile", value.asInstanceOf[js.Any])
    
    inline def setShowWorkContactsInPersonalProfileNull: Self = StObject.set(x, "showWorkContactsInPersonalProfile", null)
    
    inline def setShowWorkContactsInPersonalProfileUndefined: Self = StObject.set(x, "showWorkContactsInPersonalProfile", js.undefined)
  }
}
