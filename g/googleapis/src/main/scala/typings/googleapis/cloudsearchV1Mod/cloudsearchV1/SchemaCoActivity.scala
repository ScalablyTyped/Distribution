package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCoActivity extends StObject {
  
  /**
    * The title of the activity in this co-activity session. For example, this might be the title of the video being co-watched, or the name of the round of a game being co-played.
    */
  var activityTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the app handling this co-activity.
    */
  var coActivityApp: js.UndefOr[String | Null] = js.undefined
}
object SchemaCoActivity {
  
  inline def apply(): SchemaCoActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCoActivity]
  }
  
  extension [Self <: SchemaCoActivity](x: Self) {
    
    inline def setActivityTitle(value: String): Self = StObject.set(x, "activityTitle", value.asInstanceOf[js.Any])
    
    inline def setActivityTitleNull: Self = StObject.set(x, "activityTitle", null)
    
    inline def setActivityTitleUndefined: Self = StObject.set(x, "activityTitle", js.undefined)
    
    inline def setCoActivityApp(value: String): Self = StObject.set(x, "coActivityApp", value.asInstanceOf[js.Any])
    
    inline def setCoActivityAppNull: Self = StObject.set(x, "coActivityApp", null)
    
    inline def setCoActivityAppUndefined: Self = StObject.set(x, "coActivityApp", js.undefined)
  }
}
