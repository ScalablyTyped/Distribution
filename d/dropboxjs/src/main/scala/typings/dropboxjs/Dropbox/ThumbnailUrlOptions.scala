package typings.dropboxjs.Dropbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailUrlOptions extends StObject {
  
  var format: js.UndefOr[String] = js.undefined
  
  var png: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[String] = js.undefined
}
object ThumbnailUrlOptions {
  
  @scala.inline
  def apply(): ThumbnailUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailUrlOptions]
  }
  
  @scala.inline
  implicit class ThumbnailUrlOptionsMutableBuilder[Self <: ThumbnailUrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPng(value: Boolean): Self = StObject.set(x, "png", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPngUndefined: Self = StObject.set(x, "png", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
