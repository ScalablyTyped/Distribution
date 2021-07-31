package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyOptions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var ignoreHidden: js.UndefOr[Boolean] = js.undefined
  
  var propFilter: js.UndefOr[js.Array[String]] = js.undefined
}
object PropertyOptions {
  
  @scala.inline
  def apply(): PropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyOptions]
  }
  
  @scala.inline
  implicit class PropertyOptionsMutableBuilder[Self <: PropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreHidden(value: Boolean): Self = StObject.set(x, "ignoreHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreHiddenUndefined: Self = StObject.set(x, "ignoreHidden", js.undefined)
    
    @scala.inline
    def setPropFilter(value: js.Array[String]): Self = StObject.set(x, "propFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropFilterUndefined: Self = StObject.set(x, "propFilter", js.undefined)
    
    @scala.inline
    def setPropFilterVarargs(value: String*): Self = StObject.set(x, "propFilter", js.Array(value :_*))
  }
}
