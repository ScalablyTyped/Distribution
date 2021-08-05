package typings.expressHandlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExphbsOptions extends StObject {
  
  var compilerOptions: js.UndefOr[js.Any] = js.undefined
  
  var defaultLayout: js.UndefOr[String] = js.undefined
  
  var extname: js.UndefOr[String] = js.undefined
  
  var handlebars: js.UndefOr[js.Any] = js.undefined
  
  var helpers: js.UndefOr[js.Any] = js.undefined
  
  var layoutsDir: js.UndefOr[String] = js.undefined
  
  var partialsDir: js.UndefOr[js.Any] = js.undefined
}
object ExphbsOptions {
  
  inline def apply(): ExphbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExphbsOptions]
  }
  
  extension [Self <: ExphbsOptions](x: Self) {
    
    inline def setCompilerOptions(value: js.Any): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    inline def setDefaultLayout(value: String): Self = StObject.set(x, "defaultLayout", value.asInstanceOf[js.Any])
    
    inline def setDefaultLayoutUndefined: Self = StObject.set(x, "defaultLayout", js.undefined)
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
    
    inline def setHandlebars(value: js.Any): Self = StObject.set(x, "handlebars", value.asInstanceOf[js.Any])
    
    inline def setHandlebarsUndefined: Self = StObject.set(x, "handlebars", js.undefined)
    
    inline def setHelpers(value: js.Any): Self = StObject.set(x, "helpers", value.asInstanceOf[js.Any])
    
    inline def setHelpersUndefined: Self = StObject.set(x, "helpers", js.undefined)
    
    inline def setLayoutsDir(value: String): Self = StObject.set(x, "layoutsDir", value.asInstanceOf[js.Any])
    
    inline def setLayoutsDirUndefined: Self = StObject.set(x, "layoutsDir", js.undefined)
    
    inline def setPartialsDir(value: js.Any): Self = StObject.set(x, "partialsDir", value.asInstanceOf[js.Any])
    
    inline def setPartialsDirUndefined: Self = StObject.set(x, "partialsDir", js.undefined)
  }
}
