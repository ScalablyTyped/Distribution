package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITogglerOptions extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
}
object ITogglerOptions {
  
  @scala.inline
  def apply(): ITogglerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITogglerOptions]
  }
  
  @scala.inline
  implicit class ITogglerOptionsMutableBuilder[Self <: ITogglerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
  }
}
