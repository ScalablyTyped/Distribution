package typings.eggMultipart

import typings.eggMultipart.anon.FieldNameSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartOptions extends StObject {
  
  var autoFields: js.UndefOr[Boolean] = js.undefined
  
  var checkFile: js.UndefOr[
    js.Function5[
      /* fieldname */ String, 
      /* file */ Any, 
      /* filename */ String, 
      /* encoding */ String, 
      /* mimetype */ String, 
      Unit | js.Error
    ]
  ] = js.undefined
  
  var defCharset: js.UndefOr[String] = js.undefined
  
  // required file submit, default is true
  var defaultCharset: js.UndefOr[String] = js.undefined
  
  var defaultParamCharset: js.UndefOr[String] = js.undefined
  
  // compatible with defaultCharset, use `defaultCharset` instead
  var limits: js.UndefOr[FieldNameSize] = js.undefined
  
  var requireFile: js.UndefOr[Boolean] = js.undefined
}
object MultipartOptions {
  
  inline def apply(): MultipartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartOptions]
  }
  
  extension [Self <: MultipartOptions](x: Self) {
    
    inline def setAutoFields(value: Boolean): Self = StObject.set(x, "autoFields", value.asInstanceOf[js.Any])
    
    inline def setAutoFieldsUndefined: Self = StObject.set(x, "autoFields", js.undefined)
    
    inline def setCheckFile(
      value: (/* fieldname */ String, /* file */ Any, /* filename */ String, /* encoding */ String, /* mimetype */ String) => Unit | js.Error
    ): Self = StObject.set(x, "checkFile", js.Any.fromFunction5(value))
    
    inline def setCheckFileUndefined: Self = StObject.set(x, "checkFile", js.undefined)
    
    inline def setDefCharset(value: String): Self = StObject.set(x, "defCharset", value.asInstanceOf[js.Any])
    
    inline def setDefCharsetUndefined: Self = StObject.set(x, "defCharset", js.undefined)
    
    inline def setDefaultCharset(value: String): Self = StObject.set(x, "defaultCharset", value.asInstanceOf[js.Any])
    
    inline def setDefaultCharsetUndefined: Self = StObject.set(x, "defaultCharset", js.undefined)
    
    inline def setDefaultParamCharset(value: String): Self = StObject.set(x, "defaultParamCharset", value.asInstanceOf[js.Any])
    
    inline def setDefaultParamCharsetUndefined: Self = StObject.set(x, "defaultParamCharset", js.undefined)
    
    inline def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setRequireFile(value: Boolean): Self = StObject.set(x, "requireFile", value.asInstanceOf[js.Any])
    
    inline def setRequireFileUndefined: Self = StObject.set(x, "requireFile", js.undefined)
  }
}
