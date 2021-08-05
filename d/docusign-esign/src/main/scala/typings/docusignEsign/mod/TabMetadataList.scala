package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabMetadataList extends StObject {
  
  /**
    * A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data.
    * They may also display data to the recipients.
    */
  var tabs: js.UndefOr[js.Array[TabMetadata]] = js.undefined
}
object TabMetadataList {
  
  inline def apply(): TabMetadataList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabMetadataList]
  }
  
  extension [Self <: TabMetadataList](x: Self) {
    
    inline def setTabs(value: js.Array[TabMetadata]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    inline def setTabsVarargs(value: TabMetadata*): Self = StObject.set(x, "tabs", js.Array(value :_*))
  }
}
