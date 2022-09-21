package typings.devtoolsProtocol.mod.Protocol.Emulation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDisabledImageTypesRequest extends StObject {
  
  /**
    * Image types to disable.
    */
  var imageTypes: js.Array[DisabledImageType]
}
object SetDisabledImageTypesRequest {
  
  inline def apply(imageTypes: js.Array[DisabledImageType]): SetDisabledImageTypesRequest = {
    val __obj = js.Dynamic.literal(imageTypes = imageTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDisabledImageTypesRequest]
  }
  
  extension [Self <: SetDisabledImageTypesRequest](x: Self) {
    
    inline def setImageTypes(value: js.Array[DisabledImageType]): Self = StObject.set(x, "imageTypes", value.asInstanceOf[js.Any])
    
    inline def setImageTypesVarargs(value: DisabledImageType*): Self = StObject.set(x, "imageTypes", js.Array(value*))
  }
}
