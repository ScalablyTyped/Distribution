package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsCardV1CardFixedFooter extends StObject {
  
  /**
    * The primary button of the fixed footer. The button must be a text button with text and color set.
    */
  var primaryButton: js.UndefOr[SchemaGoogleAppsCardV1Button] = js.undefined
  
  /**
    * The secondary button of the fixed footer. The button must be a text button with text and color set. `primaryButton` must be set if `secondaryButton` is set.
    */
  var secondaryButton: js.UndefOr[SchemaGoogleAppsCardV1Button] = js.undefined
}
object SchemaGoogleAppsCardV1CardFixedFooter {
  
  inline def apply(): SchemaGoogleAppsCardV1CardFixedFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsCardV1CardFixedFooter]
  }
  
  extension [Self <: SchemaGoogleAppsCardV1CardFixedFooter](x: Self) {
    
    inline def setPrimaryButton(value: SchemaGoogleAppsCardV1Button): Self = StObject.set(x, "primaryButton", value.asInstanceOf[js.Any])
    
    inline def setPrimaryButtonUndefined: Self = StObject.set(x, "primaryButton", js.undefined)
    
    inline def setSecondaryButton(value: SchemaGoogleAppsCardV1Button): Self = StObject.set(x, "secondaryButton", value.asInstanceOf[js.Any])
    
    inline def setSecondaryButtonUndefined: Self = StObject.set(x, "secondaryButton", js.undefined)
  }
}
