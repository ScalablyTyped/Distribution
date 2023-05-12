package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the immutable ClientState for a client read from
  * WebStorage, containing the list of active query targets.
  */ trait Au extends StObject {
  
  var activeTargetIds: Any
  
  var clientId: Any
}
object Au {
  
  inline def apply(activeTargetIds: Any, clientId: Any): Au = {
    val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Au]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Au] (val x: Self) extends AnyVal {
    
    inline def setActiveTargetIds(value: Any): Self = StObject.set(x, "activeTargetIds", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: Any): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
  }
}
