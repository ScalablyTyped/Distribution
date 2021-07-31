package typings.fullpageJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullPageJSGlobalOptions extends StObject {
  
  var options: FullPageJsOptions
}
object FullPageJSGlobalOptions {
  
  @scala.inline
  def apply(options: FullPageJsOptions): FullPageJSGlobalOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullPageJSGlobalOptions]
  }
  
  @scala.inline
  implicit class FullPageJSGlobalOptionsMutableBuilder[Self <: FullPageJSGlobalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: FullPageJsOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
