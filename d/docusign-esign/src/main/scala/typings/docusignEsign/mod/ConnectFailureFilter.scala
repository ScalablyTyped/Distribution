package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectFailureFilter extends StObject {
  
  var envelopeIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var synchronous: js.UndefOr[String] = js.undefined
}
object ConnectFailureFilter {
  
  inline def apply(): ConnectFailureFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectFailureFilter]
  }
  
  extension [Self <: ConnectFailureFilter](x: Self) {
    
    inline def setEnvelopeIds(value: js.Array[String]): Self = StObject.set(x, "envelopeIds", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdsUndefined: Self = StObject.set(x, "envelopeIds", js.undefined)
    
    inline def setEnvelopeIdsVarargs(value: String*): Self = StObject.set(x, "envelopeIds", js.Array(value*))
    
    inline def setSynchronous(value: String): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
    
    inline def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
  }
}
