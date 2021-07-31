package typings.expressHandlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[js.Object] = js.undefined
  
  var helpers: js.UndefOr[js.Any] = js.undefined
  
  var partials: js.UndefOr[js.Any] = js.undefined
}
object RenderOptions {
  
  @scala.inline
  def apply(): RenderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderOptions]
  }
  
  @scala.inline
  implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHelpers(value: js.Any): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
    
    @scala.inline
    def setPartials(value: js.Any): Self = StObject.set(x, "partials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialsUndefined: Self = StObject.set(x, "partials", js.undefined)
  }
}
