package typings.dwt.anon

import typings.dwt.dwtNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconClassLocation extends StObject {
  
  // Example: 'viewMenu'
  var iconClass: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var onButtonClick: js.UndefOr[String] = js.undefined
  
  // Example: 'icon-redo'
  var sequence: js.UndefOr[`8`] = js.undefined
  
  var visibility: js.UndefOr[Boolean] = js.undefined
}
object IconClassLocation {
  
  inline def apply(): IconClassLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconClassLocation]
  }
  
  extension [Self <: IconClassLocation](x: Self) {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOnButtonClick(value: String): Self = StObject.set(x, "onButtonClick", value.asInstanceOf[js.Any])
    
    inline def setOnButtonClickUndefined: Self = StObject.set(x, "onButtonClick", js.undefined)
    
    inline def setSequence(value: `8`): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
