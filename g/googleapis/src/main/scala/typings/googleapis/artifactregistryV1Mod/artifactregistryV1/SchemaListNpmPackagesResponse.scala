package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListNpmPackagesResponse extends StObject {
  
  /**
    * The token to retrieve the next page of artifacts, or empty if there are no more artifacts to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The npm packages returned.
    */
  var npmPackages: js.UndefOr[js.Array[SchemaNpmPackage]] = js.undefined
}
object SchemaListNpmPackagesResponse {
  
  inline def apply(): SchemaListNpmPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNpmPackagesResponse]
  }
  
  extension [Self <: SchemaListNpmPackagesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNpmPackages(value: js.Array[SchemaNpmPackage]): Self = StObject.set(x, "npmPackages", value.asInstanceOf[js.Any])
    
    inline def setNpmPackagesUndefined: Self = StObject.set(x, "npmPackages", js.undefined)
    
    inline def setNpmPackagesVarargs(value: SchemaNpmPackage*): Self = StObject.set(x, "npmPackages", js.Array(value*))
  }
}
