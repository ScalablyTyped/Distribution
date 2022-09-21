package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeleteVersionsMetadata extends StObject {
  
  /**
    * The versions the operation failed to delete.
    */
  var failedVersions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaBatchDeleteVersionsMetadata {
  
  inline def apply(): SchemaBatchDeleteVersionsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeleteVersionsMetadata]
  }
  
  extension [Self <: SchemaBatchDeleteVersionsMetadata](x: Self) {
    
    inline def setFailedVersions(value: js.Array[String]): Self = StObject.set(x, "failedVersions", value.asInstanceOf[js.Any])
    
    inline def setFailedVersionsNull: Self = StObject.set(x, "failedVersions", null)
    
    inline def setFailedVersionsUndefined: Self = StObject.set(x, "failedVersions", js.undefined)
    
    inline def setFailedVersionsVarargs(value: String*): Self = StObject.set(x, "failedVersions", js.Array(value*))
  }
}
