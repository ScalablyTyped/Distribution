package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteSizeMax extends StObject {
  
  var noteResourceCountMax: js.UndefOr[Double] = js.native
  
  var noteSizeMax: js.UndefOr[Double] = js.native
  
  var resourceSizeMax: js.UndefOr[Double] = js.native
  
  var uploadLimit: js.UndefOr[Double] = js.native
  
  var uploaded: js.UndefOr[Double] = js.native
}
object NoteSizeMax {
  
  @scala.inline
  def apply(): NoteSizeMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteSizeMax]
  }
  
  @scala.inline
  implicit class NoteSizeMaxMutableBuilder[Self <: NoteSizeMax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoteResourceCountMax(value: Double): Self = StObject.set(x, "noteResourceCountMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteResourceCountMaxUndefined: Self = StObject.set(x, "noteResourceCountMax", js.undefined)
    
    @scala.inline
    def setNoteSizeMax(value: Double): Self = StObject.set(x, "noteSizeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteSizeMaxUndefined: Self = StObject.set(x, "noteSizeMax", js.undefined)
    
    @scala.inline
    def setResourceSizeMax(value: Double): Self = StObject.set(x, "resourceSizeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSizeMaxUndefined: Self = StObject.set(x, "resourceSizeMax", js.undefined)
    
    @scala.inline
    def setUploadLimit(value: Double): Self = StObject.set(x, "uploadLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadLimitUndefined: Self = StObject.set(x, "uploadLimit", js.undefined)
    
    @scala.inline
    def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadedUndefined: Self = StObject.set(x, "uploaded", js.undefined)
  }
}
