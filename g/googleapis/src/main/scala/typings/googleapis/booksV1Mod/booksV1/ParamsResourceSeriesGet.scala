package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSeriesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * String that identifies the series
    */
  var series_id: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceSeriesGet {
  
  inline def apply(): ParamsResourceSeriesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSeriesGet]
  }
  
  extension [Self <: ParamsResourceSeriesGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setSeries_id(value: js.Array[String]): Self = StObject.set(x, "series_id", value.asInstanceOf[js.Any])
    
    inline def setSeries_idUndefined: Self = StObject.set(x, "series_id", js.undefined)
    
    inline def setSeries_idVarargs(value: String*): Self = StObject.set(x, "series_id", js.Array(value :_*))
  }
}
