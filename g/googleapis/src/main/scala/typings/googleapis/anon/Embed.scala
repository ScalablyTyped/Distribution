package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Embed extends StObject {
  
  var content: js.UndefOr[String] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var embed: js.UndefOr[TypeUrl] = js.undefined
  
  var fullImage: js.UndefOr[HeightType] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[HeightType] = js.undefined
  
  var objectType: js.UndefOr[String] = js.undefined
  
  var previewThumbnails: js.UndefOr[js.Array[Url]] = js.undefined
  
  var thumbnails: js.UndefOr[js.Array[DescriptionImage]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Embed {
  
  inline def apply(): Embed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Embed]
  }
  
  extension [Self <: Embed](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmbed(value: TypeUrl): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    inline def setEmbedUndefined: Self = StObject.set(x, "embed", js.undefined)
    
    inline def setFullImage(value: HeightType): Self = StObject.set(x, "fullImage", value.asInstanceOf[js.Any])
    
    inline def setFullImageUndefined: Self = StObject.set(x, "fullImage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: HeightType): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setPreviewThumbnails(value: js.Array[Url]): Self = StObject.set(x, "previewThumbnails", value.asInstanceOf[js.Any])
    
    inline def setPreviewThumbnailsUndefined: Self = StObject.set(x, "previewThumbnails", js.undefined)
    
    inline def setPreviewThumbnailsVarargs(value: Url*): Self = StObject.set(x, "previewThumbnails", js.Array(value :_*))
    
    inline def setThumbnails(value: js.Array[DescriptionImage]): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
    
    inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    
    inline def setThumbnailsVarargs(value: DescriptionImage*): Self = StObject.set(x, "thumbnails", js.Array(value :_*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
