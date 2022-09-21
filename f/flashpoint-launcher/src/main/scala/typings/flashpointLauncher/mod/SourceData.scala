package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceData extends StObject {
  
  var id: Double
  
  /** SHA256 hash of this download */
  var sha256: String
  
  /** Source providing the download */
  var source: js.UndefOr[Source] = js.undefined
  
  var sourceId: Double
  
  var urlPath: String
}
object SourceData {
  
  inline def apply(id: Double, sha256: String, sourceId: Double, urlPath: String): SourceData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceData]
  }
  
  extension [Self <: SourceData](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: Double): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setUrlPath(value: String): Self = StObject.set(x, "urlPath", value.asInstanceOf[js.Any])
  }
}
