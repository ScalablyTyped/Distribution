package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfNoneMatch extends StObject {
  
  var acceptEncoding: js.UndefOr[String] = js.native
  
  var ifModifiedSince: js.UndefOr[String] = js.native
  
  var ifNoneMatch: js.UndefOr[String] = js.native
  
  var range: js.UndefOr[String] = js.native
  
  var region: js.UndefOr[String] = js.native
}
object IfNoneMatch {
  
  @scala.inline
  def apply(): IfNoneMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfNoneMatch]
  }
  
  @scala.inline
  implicit class IfNoneMatchMutableBuilder[Self <: IfNoneMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptEncoding(value: String): Self = StObject.set(x, "acceptEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptEncodingUndefined: Self = StObject.set(x, "acceptEncoding", js.undefined)
    
    @scala.inline
    def setIfModifiedSince(value: String): Self = StObject.set(x, "ifModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfModifiedSinceUndefined: Self = StObject.set(x, "ifModifiedSince", js.undefined)
    
    @scala.inline
    def setIfNoneMatch(value: String): Self = StObject.set(x, "ifNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfNoneMatchUndefined: Self = StObject.set(x, "ifNoneMatch", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
