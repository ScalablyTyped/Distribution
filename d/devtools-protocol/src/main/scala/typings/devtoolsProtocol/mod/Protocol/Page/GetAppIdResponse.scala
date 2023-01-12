package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppIdResponse extends StObject {
  
  /**
    * App id, either from manifest's id attribute or computed from start_url
    */
  var appId: js.UndefOr[String] = js.undefined
  
  /**
    * Recommendation for manifest's id attribute to match current id computed from start_url
    */
  var recommendedId: js.UndefOr[String] = js.undefined
}
object GetAppIdResponse {
  
  inline def apply(): GetAppIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppIdResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAppIdResponse] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setRecommendedId(value: String): Self = StObject.set(x, "recommendedId", value.asInstanceOf[js.Any])
    
    inline def setRecommendedIdUndefined: Self = StObject.set(x, "recommendedId", js.undefined)
  }
}
