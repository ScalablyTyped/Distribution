package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPersistentPreferredActivity extends StObject {
  
  /**
    * The intent actions to match in the filter. If any actions are included in the filter, then an intent's action must be one of those values for it to match. If no actions are included, the intent action is ignored.
    */
  var actions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The intent categories to match in the filter. An intent includes the categories that it requires, all of which must be included in the filter in order to match. In other words, adding a category to the filter has no impact on matching unless that category is specified in the intent.
    */
  var categories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The activity that should be the default intent handler. This should be an Android component name, e.g. com.android.enterprise.app/.MainActivity. Alternatively, the value may be the package name of an app, which causes Android Device Policy to choose an appropriate activity from the app to handle the intent.
    */
  var receiverActivity: js.UndefOr[String | Null] = js.undefined
}
object SchemaPersistentPreferredActivity {
  
  inline def apply(): SchemaPersistentPreferredActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPersistentPreferredActivity]
  }
  
  extension [Self <: SchemaPersistentPreferredActivity](x: Self) {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsNull: Self = StObject.set(x, "actions", null)
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setReceiverActivity(value: String): Self = StObject.set(x, "receiverActivity", value.asInstanceOf[js.Any])
    
    inline def setReceiverActivityNull: Self = StObject.set(x, "receiverActivity", null)
    
    inline def setReceiverActivityUndefined: Self = StObject.set(x, "receiverActivity", js.undefined)
  }
}
