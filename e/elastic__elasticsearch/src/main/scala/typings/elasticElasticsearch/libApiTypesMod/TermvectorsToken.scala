package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermvectorsToken extends StObject {
  
  var end_offset: js.UndefOr[integer] = js.undefined
  
  var payload: js.UndefOr[String] = js.undefined
  
  var position: integer
  
  var start_offset: js.UndefOr[integer] = js.undefined
}
object TermvectorsToken {
  
  inline def apply(position: integer): TermvectorsToken = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TermvectorsToken]
  }
  
  extension [Self <: TermvectorsToken](x: Self) {
    
    inline def setEnd_offset(value: integer): Self = StObject.set(x, "end_offset", value.asInstanceOf[js.Any])
    
    inline def setEnd_offsetUndefined: Self = StObject.set(x, "end_offset", js.undefined)
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setPosition(value: integer): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setStart_offset(value: integer): Self = StObject.set(x, "start_offset", value.asInstanceOf[js.Any])
    
    inline def setStart_offsetUndefined: Self = StObject.set(x, "start_offset", js.undefined)
  }
}
