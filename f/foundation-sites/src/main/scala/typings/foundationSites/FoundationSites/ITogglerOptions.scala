package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITogglerOptions extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var toggler: js.UndefOr[String] = js.undefined
}
object ITogglerOptions {
  
  inline def apply(): ITogglerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITogglerOptions]
  }
  
  extension [Self <: ITogglerOptions](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setToggler(value: String): Self = StObject.set(x, "toggler", value.asInstanceOf[js.Any])
    
    inline def setTogglerUndefined: Self = StObject.set(x, "toggler", js.undefined)
  }
}
