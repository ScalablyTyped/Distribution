package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHidden extends StObject {
  
  var searchHidden: Boolean
}
object SearchHidden {
  
  inline def apply(searchHidden: Boolean): SearchHidden = {
    val __obj = js.Dynamic.literal(searchHidden = searchHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchHidden]
  }
  
  extension [Self <: SearchHidden](x: Self) {
    
    inline def setSearchHidden(value: Boolean): Self = StObject.set(x, "searchHidden", value.asInstanceOf[js.Any])
  }
}
