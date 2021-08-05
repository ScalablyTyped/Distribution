package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddPropertyOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var localizeCategory: Boolean
  
  var localizeProperty: Boolean
}
object AddPropertyOptions {
  
  inline def apply(localizeCategory: Boolean, localizeProperty: Boolean): AddPropertyOptions = {
    val __obj = js.Dynamic.literal(localizeCategory = localizeCategory.asInstanceOf[js.Any], localizeProperty = localizeProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPropertyOptions]
  }
  
  extension [Self <: AddPropertyOptions](x: Self) {
    
    inline def setLocalizeCategory(value: Boolean): Self = StObject.set(x, "localizeCategory", value.asInstanceOf[js.Any])
    
    inline def setLocalizeProperty(value: Boolean): Self = StObject.set(x, "localizeProperty", value.asInstanceOf[js.Any])
  }
}
