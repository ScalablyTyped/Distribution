package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMylibraryBookshelvesAddvolume
  extends StObject
     with StandardParameters {
  
  /**
    * The reason for which the book is added to the library.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * ID of bookshelf to which to add a volume.
    */
  var shelf: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * ID of volume to add.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMylibraryBookshelvesAddvolume {
  
  inline def apply(): ParamsResourceMylibraryBookshelvesAddvolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryBookshelvesAddvolume]
  }
  
  extension [Self <: ParamsResourceMylibraryBookshelvesAddvolume](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setShelf(value: String): Self = StObject.set(x, "shelf", value.asInstanceOf[js.Any])
    
    inline def setShelfUndefined: Self = StObject.set(x, "shelf", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
