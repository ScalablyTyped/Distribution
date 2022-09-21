package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFamilysharingUnshare
  extends StObject
     with StandardParameters {
  
  /**
    * The docid to unshare.
    */
  var docId: js.UndefOr[String] = js.undefined
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The volume to unshare.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceFamilysharingUnshare {
  
  inline def apply(): ParamsResourceFamilysharingUnshare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFamilysharingUnshare]
  }
  
  extension [Self <: ParamsResourceFamilysharingUnshare](x: Self) {
    
    inline def setDocId(value: String): Self = StObject.set(x, "docId", value.asInstanceOf[js.Any])
    
    inline def setDocIdUndefined: Self = StObject.set(x, "docId", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
