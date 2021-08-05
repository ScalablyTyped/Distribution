package typings.egg.mod

import typings.egg.anon.FieldNameSize
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileStreamOptions extends StObject {
  
  var checkFile: js.UndefOr[
    js.Function5[
      /* fieldname */ String, 
      /* file */ js.Any, 
      /* filename */ String, 
      /* encoding */ String, 
      /* mimetype */ String, 
      Unit | Error
    ]
  ] = js.undefined
  
  // required file submit, default is true
  var defCharset: js.UndefOr[String] = js.undefined
  
  var limits: js.UndefOr[FieldNameSize] = js.undefined
  
  var requireFile: js.UndefOr[Boolean] = js.undefined
}
object GetFileStreamOptions {
  
  inline def apply(): GetFileStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileStreamOptions]
  }
  
  extension [Self <: GetFileStreamOptions](x: Self) {
    
    inline def setCheckFile(
      value: (/* fieldname */ String, /* file */ js.Any, /* filename */ String, /* encoding */ String, /* mimetype */ String) => Unit | Error
    ): Self = StObject.set(x, "checkFile", js.Any.fromFunction5(value))
    
    inline def setCheckFileUndefined: Self = StObject.set(x, "checkFile", js.undefined)
    
    inline def setDefCharset(value: String): Self = StObject.set(x, "defCharset", value.asInstanceOf[js.Any])
    
    inline def setDefCharsetUndefined: Self = StObject.set(x, "defCharset", js.undefined)
    
    inline def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setRequireFile(value: Boolean): Self = StObject.set(x, "requireFile", value.asInstanceOf[js.Any])
    
    inline def setRequireFileUndefined: Self = StObject.set(x, "requireFile", js.undefined)
  }
}
