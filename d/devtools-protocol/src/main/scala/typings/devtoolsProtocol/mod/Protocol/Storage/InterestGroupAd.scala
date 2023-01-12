package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterestGroupAd extends StObject {
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var renderUrl: String
}
object InterestGroupAd {
  
  inline def apply(renderUrl: String): InterestGroupAd = {
    val __obj = js.Dynamic.literal(renderUrl = renderUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterestGroupAd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterestGroupAd] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRenderUrl(value: String): Self = StObject.set(x, "renderUrl", value.asInstanceOf[js.Any])
  }
}
