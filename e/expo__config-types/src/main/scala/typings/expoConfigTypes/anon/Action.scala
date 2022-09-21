package typings.expoConfigTypes.anon

import typings.expoConfigTypes.mod.AndroidIntentFiltersData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: String
  
  /**
    * You may also use an intent filter to set your app as the default handler for links (without showing the user a dialog with options). To do so use `true` and then configure your server to serve a JSON file verifying that you own the domain. [Learn more](https://developer.android.com/training/app-links)
    */
  var autoVerify: js.UndefOr[Boolean] = js.undefined
  
  var category: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var data: js.UndefOr[AndroidIntentFiltersData | js.Array[AndroidIntentFiltersData]] = js.undefined
}
object Action {
  
  inline def apply(action: String): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAutoVerify(value: Boolean): Self = StObject.set(x, "autoVerify", value.asInstanceOf[js.Any])
    
    inline def setAutoVerifyUndefined: Self = StObject.set(x, "autoVerify", js.undefined)
    
    inline def setCategory(value: String | js.Array[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: String*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setData(value: AndroidIntentFiltersData | js.Array[AndroidIntentFiltersData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: AndroidIntentFiltersData*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
