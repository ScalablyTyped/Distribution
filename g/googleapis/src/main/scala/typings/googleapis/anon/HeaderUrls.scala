package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.SchemaPagespeedApiFormatStringV4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderUrls extends StObject {
  
  var header: js.UndefOr[SchemaPagespeedApiFormatStringV4] = js.undefined
  
  var urls: js.UndefOr[js.Array[`6`]] = js.undefined
}
object HeaderUrls {
  
  @scala.inline
  def apply(): HeaderUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderUrls]
  }
  
  @scala.inline
  implicit class HeaderUrlsMutableBuilder[Self <: HeaderUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: SchemaPagespeedApiFormatStringV4): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[`6`]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: `6`*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
