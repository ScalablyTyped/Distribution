package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexableText extends StObject {
  
  var indexableText: js.UndefOr[String] = js.native
  
  var thumbnail: js.UndefOr[MimeType] = js.native
}
object IndexableText {
  
  @scala.inline
  def apply(): IndexableText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexableText]
  }
  
  @scala.inline
  implicit class IndexableTextMutableBuilder[Self <: IndexableText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexableText(value: String): Self = StObject.set(x, "indexableText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexableTextUndefined: Self = StObject.set(x, "indexableText", js.undefined)
    
    @scala.inline
    def setThumbnail(value: MimeType): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
