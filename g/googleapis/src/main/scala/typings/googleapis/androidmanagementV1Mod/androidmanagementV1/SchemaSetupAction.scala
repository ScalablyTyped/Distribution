package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSetupAction extends StObject {
  
  /**
    * Description of this action.
    */
  var description: js.UndefOr[SchemaUserFacingMessage] = js.undefined
  
  /**
    * An action to launch an app. The app will be launched with an intent containing an extra with key com.google.android.apps.work.clouddpc.EXTRA_LAUNCHED_AS_SETUP_ACTION set to the boolean value true to indicate that this is a setup action flow.
    */
  var launchApp: js.UndefOr[SchemaLaunchAppAction] = js.undefined
  
  /**
    * Title of this action.
    */
  var title: js.UndefOr[SchemaUserFacingMessage] = js.undefined
}
object SchemaSetupAction {
  
  inline def apply(): SchemaSetupAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetupAction]
  }
  
  extension [Self <: SchemaSetupAction](x: Self) {
    
    inline def setDescription(value: SchemaUserFacingMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLaunchApp(value: SchemaLaunchAppAction): Self = StObject.set(x, "launchApp", value.asInstanceOf[js.Any])
    
    inline def setLaunchAppUndefined: Self = StObject.set(x, "launchApp", js.undefined)
    
    inline def setTitle(value: SchemaUserFacingMessage): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
