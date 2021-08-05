package typings.expressHandlebars

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialTemplateOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var precompiled: js.UndefOr[Boolean] = js.undefined
}
object PartialTemplateOptions {
  
  inline def apply(): PartialTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTemplateOptions]
  }
  
  extension [Self <: PartialTemplateOptions](x: Self) {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setPrecompiled(value: Boolean): Self = StObject.set(x, "precompiled", value.asInstanceOf[js.Any])
    
    inline def setPrecompiledUndefined: Self = StObject.set(x, "precompiled", js.undefined)
  }
}
