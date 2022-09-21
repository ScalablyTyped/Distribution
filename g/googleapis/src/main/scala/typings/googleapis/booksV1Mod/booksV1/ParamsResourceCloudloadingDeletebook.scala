package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCloudloadingDeletebook
  extends StObject
     with StandardParameters {
  
  /**
    * The id of the book to be removed.
    */
  var volumeId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCloudloadingDeletebook {
  
  inline def apply(): ParamsResourceCloudloadingDeletebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCloudloadingDeletebook]
  }
  
  extension [Self <: ParamsResourceCloudloadingDeletebook](x: Self) {
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "volumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "volumeId", js.undefined)
  }
}
