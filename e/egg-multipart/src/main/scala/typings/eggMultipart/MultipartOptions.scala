package typings.eggMultipart

import typings.eggMultipart.anon.FieldNameSize
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartOptions extends StObject {
  
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
object MultipartOptions {
  
  @scala.inline
  def apply(): MultipartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartOptions]
  }
  
  @scala.inline
  implicit class MultipartOptionsMutableBuilder[Self <: MultipartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckFile(
      value: (/* fieldname */ String, /* file */ js.Any, /* filename */ String, /* encoding */ String, /* mimetype */ String) => Unit | Error
    ): Self = StObject.set(x, "checkFile", js.Any.fromFunction5(value))
    
    @scala.inline
    def setCheckFileUndefined: Self = StObject.set(x, "checkFile", js.undefined)
    
    @scala.inline
    def setDefCharset(value: String): Self = StObject.set(x, "defCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefCharsetUndefined: Self = StObject.set(x, "defCharset", js.undefined)
    
    @scala.inline
    def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    @scala.inline
    def setRequireFile(value: Boolean): Self = StObject.set(x, "requireFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireFileUndefined: Self = StObject.set(x, "requireFile", js.undefined)
  }
}
