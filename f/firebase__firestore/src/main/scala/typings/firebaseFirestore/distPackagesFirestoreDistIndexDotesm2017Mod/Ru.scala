package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the online state for all clients participating in
  * multi-tab. The online state is only written to by the primary client, and
  * used in secondary clients to update their query views.
  */ trait Ru extends StObject {
  
  var clientId: Any
  
  var onlineState: Any
}
object Ru {
  
  inline def apply(clientId: Any, onlineState: Any): Ru = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], onlineState = onlineState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ru]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ru] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: Any): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setOnlineState(value: Any): Self = StObject.set(x, "onlineState", value.asInstanceOf[js.Any])
  }
}
