package typings.forgeViewer.Autodesk.Viewing.UI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayCategoryOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var localize: js.UndefOr[Boolean] = js.undefined
}
object DisplayCategoryOptions {
  
  @scala.inline
  def apply(): DisplayCategoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayCategoryOptions]
  }
  
  @scala.inline
  implicit class DisplayCategoryOptionsMutableBuilder[Self <: DisplayCategoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocalize(value: Boolean): Self = StObject.set(x, "localize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
  }
}
