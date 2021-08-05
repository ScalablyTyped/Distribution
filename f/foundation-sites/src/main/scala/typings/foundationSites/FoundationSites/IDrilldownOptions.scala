package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDrilldownOptions extends StObject {
  
  var backButton: js.UndefOr[String] = js.undefined
  
  var closeOnClick: js.UndefOr[Boolean] = js.undefined
  
  var parentLink: js.UndefOr[Boolean] = js.undefined
  
  var wrapper: js.UndefOr[String] = js.undefined
}
object IDrilldownOptions {
  
  inline def apply(): IDrilldownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrilldownOptions]
  }
  
  extension [Self <: IDrilldownOptions](x: Self) {
    
    inline def setBackButton(value: String): Self = StObject.set(x, "backButton", value.asInstanceOf[js.Any])
    
    inline def setBackButtonUndefined: Self = StObject.set(x, "backButton", js.undefined)
    
    inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    inline def setParentLink(value: Boolean): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setWrapper(value: String): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
