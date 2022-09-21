package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeedsExternalId extends StObject {
  
  var ignoreHidden: js.UndefOr[Boolean] = js.undefined
  
  var needsExternalId: js.UndefOr[Boolean] = js.undefined
  
  var propFilter: js.UndefOr[js.Array[String]] = js.undefined
}
object NeedsExternalId {
  
  inline def apply(): NeedsExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NeedsExternalId]
  }
  
  extension [Self <: NeedsExternalId](x: Self) {
    
    inline def setIgnoreHidden(value: Boolean): Self = StObject.set(x, "ignoreHidden", value.asInstanceOf[js.Any])
    
    inline def setIgnoreHiddenUndefined: Self = StObject.set(x, "ignoreHidden", js.undefined)
    
    inline def setNeedsExternalId(value: Boolean): Self = StObject.set(x, "needsExternalId", value.asInstanceOf[js.Any])
    
    inline def setNeedsExternalIdUndefined: Self = StObject.set(x, "needsExternalId", js.undefined)
    
    inline def setPropFilter(value: js.Array[String]): Self = StObject.set(x, "propFilter", value.asInstanceOf[js.Any])
    
    inline def setPropFilterUndefined: Self = StObject.set(x, "propFilter", js.undefined)
    
    inline def setPropFilterVarargs(value: String*): Self = StObject.set(x, "propFilter", js.Array(value*))
  }
}
