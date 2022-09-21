package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOriginTrialsResponse extends StObject {
  
  var originTrials: js.Array[OriginTrial]
}
object GetOriginTrialsResponse {
  
  inline def apply(originTrials: js.Array[OriginTrial]): GetOriginTrialsResponse = {
    val __obj = js.Dynamic.literal(originTrials = originTrials.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOriginTrialsResponse]
  }
  
  extension [Self <: GetOriginTrialsResponse](x: Self) {
    
    inline def setOriginTrials(value: js.Array[OriginTrial]): Self = StObject.set(x, "originTrials", value.asInstanceOf[js.Any])
    
    inline def setOriginTrialsVarargs(value: OriginTrial*): Self = StObject.set(x, "originTrials", js.Array(value*))
  }
}
