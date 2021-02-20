package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfMatch extends StObject {
  
  var contentDisposition: js.UndefOr[String] = js.native
  
  var ifMatch: js.UndefOr[String] = js.native
  
  var xAdsRegion: js.UndefOr[String] = js.native
}
object IfMatch {
  
  @scala.inline
  def apply(): IfMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfMatch]
  }
  
  @scala.inline
  implicit class IfMatchMutableBuilder[Self <: IfMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "ifMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "ifMatch", js.undefined)
    
    @scala.inline
    def setXAdsRegion(value: String): Self = StObject.set(x, "xAdsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAdsRegionUndefined: Self = StObject.set(x, "xAdsRegion", js.undefined)
  }
}
