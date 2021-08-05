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
  
  inline def apply(): PropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyOptions]
  }
  
  extension [Self <: PropertyOptions](x: Self) {
    
    inline def setIgnoreHidden(value: Boolean): Self = StObject.set(x, "ignoreHidden", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHiddenUndefined: Self = StObject.set(x, "ignoreHidden", js.undefined)
    
    inline def setPropFilter(value: js.Array[String]): Self = StObject.set(x, "propFilter", value.asInstanceOf[js.Any])
    
    inline def setPropFilterUndefined: Self = StObject.set(x, "propFilter", js.undefined)
    
    inline def setPropFilterVarargs(value: String*): Self = StObject.set(x, "propFilter", js.Array(value :_*))
  }
}
