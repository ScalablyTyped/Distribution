package typings.expressHandlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExphbsOptions extends StObject {
  
  var compilerOptions: js.UndefOr[js.Any] = js.native
  
  var defaultLayout: js.UndefOr[String] = js.native
  
  var extname: js.UndefOr[String] = js.native
  
  var handlebars: js.UndefOr[js.Any] = js.native
  
  var helpers: js.UndefOr[js.Any] = js.native
  
  var layoutsDir: js.UndefOr[String] = js.native
  
  var partialsDir: js.UndefOr[js.Any] = js.native
}
object ExphbsOptions {
  
  @scala.inline
  def apply(): ExphbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExphbsOptions]
  }
  
  @scala.inline
  implicit class ExphbsOptionsMutableBuilder[Self <: ExphbsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilerOptions(value: js.Any): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    @scala.inline
    def setDefaultLayout(value: String): Self = StObject.set(x, "defaultLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLayoutUndefined: Self = StObject.set(x, "defaultLayout", js.undefined)
    
    @scala.inline
    def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
    
    @scala.inline
    def setHandlebars(value: js.Any): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlebarsUndefined: Self = StObject.set(x, "handlebars", js.undefined)
    
    @scala.inline
    def setHelpers(value: js.Any): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
    
    @scala.inline
    def setLayoutsDir(value: String): Self = StObject.set(x, "layoutsDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutsDirUndefined: Self = StObject.set(x, "layoutsDir", js.undefined)
    
    @scala.inline
    def setPartialsDir(value: js.Any): Self = StObject.set(x, "partialsDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialsDirUndefined: Self = StObject.set(x, "partialsDir", js.undefined)
  }
}
