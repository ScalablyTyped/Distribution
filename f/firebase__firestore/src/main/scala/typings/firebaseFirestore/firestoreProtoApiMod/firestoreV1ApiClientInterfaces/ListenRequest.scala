package typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typings.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenRequest extends StObject {
  
  var addTarget: js.UndefOr[Target] = js.undefined
  
  var labels: js.UndefOr[ApiClientObjectMap[String]] = js.undefined
  
  var removeTarget: js.UndefOr[Double] = js.undefined
}
object ListenRequest {
  
  inline def apply(): ListenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenRequest]
  }
  
  extension [Self <: ListenRequest](x: Self) {
    
    inline def setAddTarget(value: Target): Self = StObject.set(x, "addTarget", value.asInstanceOf[js.Any])
    
    inline def setAddTargetUndefined: Self = StObject.set(x, "addTarget", js.undefined)
    
    inline def setLabels(value: ApiClientObjectMap[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setRemoveTarget(value: Double): Self = StObject.set(x, "removeTarget", value.asInstanceOf[js.Any])
    
    inline def setRemoveTargetUndefined: Self = StObject.set(x, "removeTarget", js.undefined)
  }
}
