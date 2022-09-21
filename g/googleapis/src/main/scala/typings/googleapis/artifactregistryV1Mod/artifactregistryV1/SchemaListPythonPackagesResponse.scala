package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPythonPackagesResponse extends StObject {
  
  /**
    * The token to retrieve the next page of artifacts, or empty if there are no more artifacts to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The python packages returned.
    */
  var pythonPackages: js.UndefOr[js.Array[SchemaPythonPackage]] = js.undefined
}
object SchemaListPythonPackagesResponse {
  
  inline def apply(): SchemaListPythonPackagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPythonPackagesResponse]
  }
  
  extension [Self <: SchemaListPythonPackagesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPythonPackages(value: js.Array[SchemaPythonPackage]): Self = StObject.set(x, "pythonPackages", value.asInstanceOf[js.Any])
    
    inline def setPythonPackagesUndefined: Self = StObject.set(x, "pythonPackages", js.undefined)
    
    inline def setPythonPackagesVarargs(value: SchemaPythonPackage*): Self = StObject.set(x, "pythonPackages", js.Array(value*))
  }
}
