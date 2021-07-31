package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The web app details for an enterprise.
  */
trait SchemaWebAppsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#webAppsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The manifest describing a web app.
    */
  var webApp: js.UndefOr[js.Array[SchemaWebApp]] = js.undefined
}
object SchemaWebAppsListResponse {
  
  @scala.inline
  def apply(): SchemaWebAppsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebAppsListResponse]
  }
  
  @scala.inline
  implicit class SchemaWebAppsListResponseMutableBuilder[Self <: SchemaWebAppsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setWebApp(value: js.Array[SchemaWebApp]): Self = StObject.set(x, "webApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAppUndefined: Self = StObject.set(x, "webApp", js.undefined)
    
    @scala.inline
    def setWebAppVarargs(value: SchemaWebApp*): Self = StObject.set(x, "webApp", js.Array(value :_*))
  }
}
