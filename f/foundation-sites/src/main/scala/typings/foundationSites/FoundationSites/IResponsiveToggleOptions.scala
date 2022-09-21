package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResponsiveToggleOptions extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var hideFor: js.UndefOr[String] = js.undefined
}
object IResponsiveToggleOptions {
  
  inline def apply(): IResponsiveToggleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResponsiveToggleOptions]
  }
  
  extension [Self <: IResponsiveToggleOptions](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setHideFor(value: String): Self = StObject.set(x, "hideFor", value.asInstanceOf[js.Any])
    
    inline def setHideForUndefined: Self = StObject.set(x, "hideFor", js.undefined)
  }
}
