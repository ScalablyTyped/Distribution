package typings.googleapis.anon

import typings.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Urls extends StObject {
  
  var header: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.native
  
  var urls: js.UndefOr[js.Array[DetailsResult]] = js.native
}
object Urls {
  
  @scala.inline
  def apply(): Urls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Urls]
  }
  
  @scala.inline
  implicit class UrlsMutableBuilder[Self <: Urls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: SchemaPagespeedApiFormatStringV2): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[DetailsResult]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: DetailsResult*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
