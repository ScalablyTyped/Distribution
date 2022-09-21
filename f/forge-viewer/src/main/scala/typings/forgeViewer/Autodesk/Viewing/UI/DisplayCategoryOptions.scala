package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayCategoryOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var localize: js.UndefOr[Boolean] = js.undefined
}
object DisplayCategoryOptions {
  
  inline def apply(): DisplayCategoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayCategoryOptions]
  }
  
  extension [Self <: DisplayCategoryOptions](x: Self) {
    
    inline def setLocalize(value: Boolean): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
    
    inline def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
  }
}
