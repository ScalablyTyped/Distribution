package typings.evernote.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoteSizeMax extends StObject {
  
  var noteResourceCountMax: js.UndefOr[Double] = js.undefined
  
  var noteSizeMax: js.UndefOr[Double] = js.undefined
  
  var resourceSizeMax: js.UndefOr[Double] = js.undefined
  
  var uploadLimit: js.UndefOr[Double] = js.undefined
  
  var uploaded: js.UndefOr[Double] = js.undefined
}
object NoteSizeMax {
  
  inline def apply(): NoteSizeMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteSizeMax]
  }
  
  extension [Self <: NoteSizeMax](x: Self) {
    
    inline def setNoteResourceCountMax(value: Double): Self = StObject.set(x, "noteResourceCountMax", value.asInstanceOf[js.Any])
    
    inline def setNoteResourceCountMaxUndefined: Self = StObject.set(x, "noteResourceCountMax", js.undefined)
    
    inline def setNoteSizeMax(value: Double): Self = StObject.set(x, "noteSizeMax", value.asInstanceOf[js.Any])
    
    inline def setNoteSizeMaxUndefined: Self = StObject.set(x, "noteSizeMax", js.undefined)
    
    inline def setResourceSizeMax(value: Double): Self = StObject.set(x, "resourceSizeMax", value.asInstanceOf[js.Any])
    
    inline def setResourceSizeMaxUndefined: Self = StObject.set(x, "resourceSizeMax", js.undefined)
    
    inline def setUploadLimit(value: Double): Self = StObject.set(x, "uploadLimit", value.asInstanceOf[js.Any])
    
    inline def setUploadLimitUndefined: Self = StObject.set(x, "uploadLimit", js.undefined)
    
    inline def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
    
    inline def setUploadedUndefined: Self = StObject.set(x, "uploaded", js.undefined)
  }
}
