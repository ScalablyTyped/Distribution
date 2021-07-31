package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a request to list web apps for a given enterprise.
  */
trait SchemaListWebAppsResponse extends StObject {
  
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of web apps.
    */
  var webApps: js.UndefOr[js.Array[SchemaWebApp]] = js.undefined
}
object SchemaListWebAppsResponse {
  
  @scala.inline
  def apply(): SchemaListWebAppsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWebAppsResponse]
  }
  
  @scala.inline
  implicit class SchemaListWebAppsResponseMutableBuilder[Self <: SchemaListWebAppsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setWebApps(value: js.Array[SchemaWebApp]): Self = StObject.set(x, "webApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAppsUndefined: Self = StObject.set(x, "webApps", js.undefined)
    
    @scala.inline
    def setWebAppsVarargs(value: SchemaWebApp*): Self = StObject.set(x, "webApps", js.Array(value :_*))
  }
}
