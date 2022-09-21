package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCloudloadingUpdatebook
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBooksCloudloadingResource] = js.undefined
}
object ParamsResourceCloudloadingUpdatebook {
  
  inline def apply(): ParamsResourceCloudloadingUpdatebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCloudloadingUpdatebook]
  }
  
  extension [Self <: ParamsResourceCloudloadingUpdatebook](x: Self) {
    
    inline def setRequestBody(value: SchemaBooksCloudloadingResource): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
