package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexableText extends StObject {
  
  var indexableText: js.UndefOr[String] = js.undefined
  
  var thumbnail: js.UndefOr[MimeType] = js.undefined
}
object IndexableText {
  
  inline def apply(): IndexableText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexableText]
  }
  
  extension [Self <: IndexableText](x: Self) {
    
    inline def setIndexableText(value: String): Self = StObject.set(x, "indexableText", value.asInstanceOf[js.Any])
    
    inline def setIndexableTextUndefined: Self = StObject.set(x, "indexableText", js.undefined)
    
    inline def setThumbnail(value: MimeType): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
