package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBooksCloudloadingResource extends StObject {
  
  var author: js.UndefOr[String | Null] = js.undefined
  
  var processingState: js.UndefOr[String | Null] = js.undefined
  
  var title: js.UndefOr[String | Null] = js.undefined
  
  var volumeId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBooksCloudloadingResource {
  
  inline def apply(): SchemaBooksCloudloadingResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBooksCloudloadingResource]
  }
  
  extension [Self <: SchemaBooksCloudloadingResource](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setProcessingState(value: String): Self = StObject.set(x, "processingState", value.asInstanceOf[js.Any])
    
    inline def setProcessingStateNull: Self = StObject.set(x, "processingState", null)
    
    inline def setProcessingStateUndefined: Self = StObject.set(x, "processingState", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdNull: Self = StObject.set(x, "volumeId", null)
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
